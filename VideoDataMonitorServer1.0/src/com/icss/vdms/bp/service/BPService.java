package com.icss.vdms.bp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.bp.bean.BPOrderBarcodeBean;
import com.icss.vdms.bp.bean.BPOrderCigInfoBean;
import com.icss.vdms.bp.bean.BPOrderInfoBean;
import com.icss.vdms.bp.bean.VOrderCodeStateBean;
import com.icss.vdms.bp.dao.BPBatchDao;
import com.icss.vdms.bp.dao.BPDistLineDao;
import com.icss.vdms.bp.dao.BPOrderBarcodeDao;
import com.icss.vdms.bp.dao.BPOrderCigInfoDao;
import com.icss.vdms.bp.dao.BPOrderInfoDao;
import com.icss.vdms.socket.agreement.MsgFeedBack;

@Service("bPService")
public class BPService {

	// 批次数据库操作
	private BPBatchDao bPBatchDao;
	// 线路数据库操作
	private BPDistLineDao bPDistLineDao;
	// 订单数据库操作
	private BPOrderInfoDao bPOrderInfoDao;
	// 订单明细数据库操作
	private BPOrderCigInfoDao bPOrderCigInfoDao;
	// 订单条码数据库操作
	private BPOrderBarcodeDao bPOrderBarcodeDao;

	// 反馈集合 基础数据
	private List<MsgFeedBack> msgFeedBackListBase;
	// 反馈集合 打码状态
	private List<MsgFeedBack> msgFeedBackListCode;

	public BPService() {

		msgFeedBackListBase = new ArrayList<MsgFeedBack>();

		msgFeedBackListCode = new ArrayList<MsgFeedBack>();

	}

	/**
	 * doInsertBPModel 事务控制下插入各类信息
	 * 
	 * 插入订单信息 插入批次信息 插入线路信息 插入明细信息 插入条码信息
	 * 
	 * @param modelList
	 */
	public List<MsgFeedBack> doInsertBPModel(List<BPOrderInfoBean> modelList) {

		// 清空集合
		msgFeedBackListBase.clear();

		try {
			// 遍历集合
			for (BPOrderInfoBean bpModel : modelList) {

				// 如果批次已存在则不存数据库
				if (!bpModel.isExitBatch()) {

					// 插入批次信息
					bPBatchDao.insertSelective(bpModel.getbPBatchBean());

					// 插入线路信息
					bPDistLineDao.insertSelective(bpModel.getbPDistLineBean());
				}

				// 插入订单信息
				bPOrderInfoDao.insertSelective(bpModel);

				// 插入订单明细
				for (BPOrderCigInfoBean bpOrderCigBean : bpModel
						.getBpOrderCigInfoList()) {
					bPOrderCigInfoDao.insertSelective(bpOrderCigBean);
				}

				// 插入订单条码
				for (BPOrderBarcodeBean bpOrderBarcodeBean : bpModel
						.getBpOrderBarcodeList()) {
					bPOrderBarcodeDao.insertSelective(bpOrderBarcodeBean);
				}

				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(bpModel.getOiUuid());
				msgFeedBack.setState(true);

				msgFeedBackListBase.add(msgFeedBack);
			}
		} catch (Exception e) {

			msgFeedBackListBase.clear();

			MsgFeedBack msgFeedBack = new MsgFeedBack();
			msgFeedBack.setState(false);
			msgFeedBack.setInfo(e.getMessage());

			msgFeedBackListBase.add(msgFeedBack);
		}

		return msgFeedBackListBase;
	}

	/**
	 * 事务控制下批量更新打码状态
	 * 
	 * @param list
	 * @return
	 */
	public List<MsgFeedBack> doUpdateBPModel(List<VOrderCodeStateBean> list) {

		msgFeedBackListCode.clear();

		try {
			for (VOrderCodeStateBean vOrderCodeStateBean : list) {

				bPOrderInfoDao.updateOrderStateByUUID(vOrderCodeStateBean);

				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(vOrderCodeStateBean.getOiUuid());
				msgFeedBack.setState(true);

				msgFeedBackListCode.add(msgFeedBack);

			}
		} catch (Exception e) {

			msgFeedBackListCode.clear();

			MsgFeedBack msgFeedBack = new MsgFeedBack();
			msgFeedBack.setState(false);
			msgFeedBack.setInfo(e.getMessage());

			msgFeedBackListCode.add(msgFeedBack);
		}

		return msgFeedBackListCode;

	}

	public BPBatchDao getbPBatchDao() {
		return bPBatchDao;
	}

	@Autowired
	public void setbPBatchDao(BPBatchDao bPBatchDao) {
		this.bPBatchDao = bPBatchDao;
	}

	public BPDistLineDao getbPDistLineDao() {
		return bPDistLineDao;
	}

	@Autowired
	public void setbPDistLineDao(BPDistLineDao bPDistLineDao) {
		this.bPDistLineDao = bPDistLineDao;
	}

	public BPOrderInfoDao getbPOrderInfoDao() {
		return bPOrderInfoDao;
	}

	@Autowired
	public void setbPOrderInfoDao(BPOrderInfoDao bPOrderInfoDao) {
		this.bPOrderInfoDao = bPOrderInfoDao;
	}

	public BPOrderCigInfoDao getbPOrderCigInfoDao() {
		return bPOrderCigInfoDao;
	}

	@Autowired
	public void setbPOrderCigInfoDao(BPOrderCigInfoDao bPOrderCigInfoDao) {
		this.bPOrderCigInfoDao = bPOrderCigInfoDao;
	}

	public BPOrderBarcodeDao getbPOrderBarcodeDao() {
		return bPOrderBarcodeDao;
	}

	@Autowired
	public void setbPOrderBarcodeDao(BPOrderBarcodeDao bPOrderBarcodeDao) {
		this.bPOrderBarcodeDao = bPOrderBarcodeDao;
	}

}
