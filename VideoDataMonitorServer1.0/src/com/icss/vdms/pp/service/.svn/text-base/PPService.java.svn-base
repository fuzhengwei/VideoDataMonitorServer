package com.icss.vdms.pp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.pp.bean.PPArrangeBean;
import com.icss.vdms.pp.bean.PPCigInfoBean;
import com.icss.vdms.pp.dao.PPArrangeDao;
import com.icss.vdms.pp.dao.PPCigInfoDao;
import com.icss.vdms.socket.agreement.MsgFeedBack;

@Service("ppService")
public class PPService {

	// 打码计划数据库操作
	private PPArrangeDao ppArrangerDao;
	// 打码码段数据库操作
	private PPCigInfoDao ppCigInfoDao;

	/**
	 * 新增打码计划
	 * 
	 * @param arrangeAddList
	 * @return
	 */
	public List<MsgFeedBack> doInsertArrangeList(
			List<PPArrangeBean> arrangeAddList) {

		// 实例化反馈集合
		List<MsgFeedBack> msgFeedBackList = new ArrayList<MsgFeedBack>();

		for (PPArrangeBean ppArrangeBean : arrangeAddList) {

			if (ppArrangerDao.insertSelective(ppArrangeBean) > 0) {
				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(String.valueOf(ppArrangeBean.getPpid()));
				msgFeedBack.setState(true);

				msgFeedBackList.add(msgFeedBack);
			}

		}

		return msgFeedBackList;
	}

	/**
	 * 修改打码计划
	 * 
	 * @param arrangeAddList
	 * @return
	 */
	public List<MsgFeedBack> doUpdateArrangeList(
			List<PPArrangeBean> arrangeAddList) {

		List<MsgFeedBack> msgFeedBackList = new ArrayList<MsgFeedBack>();

		for (PPArrangeBean ppArrangeBean : arrangeAddList) {

			if (ppArrangerDao.updateByPrimaryKeySelective(ppArrangeBean) > 0) {
				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(String.valueOf(ppArrangeBean.getPpid()));
				msgFeedBack.setState(true);

				msgFeedBackList.add(msgFeedBack);
			}

		}

		return msgFeedBackList;
	}

	/**
	 * 0：新增条码
	 * 
	 * @param msgBodyPPCigInfoList
	 * @return
	 */
	public List<MsgFeedBack> doInsertCigInfoList(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {

		// 实例化反馈集合
		List<MsgFeedBack> msgFeedBackList = new ArrayList<MsgFeedBack>();

		for (PPCigInfoBean ppCigInfoBean : msgBodyPPCigInfoList) {
			
			if(ppCigInfoDao.selectCigInfoCountByPpidAndPrintId(ppCigInfoBean) > 0){
				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(ppCigInfoBean.getId().toString());
				msgFeedBack.setState(true);
				msgFeedBackList.add(msgFeedBack);
			}else{
				if (ppCigInfoDao.insertSelective(ppCigInfoBean) > 0) {
					// 收集反馈信息
					MsgFeedBack msgFeedBack = new MsgFeedBack();
					msgFeedBack.setId(ppCigInfoBean.getId().toString());
					msgFeedBack.setState(true);
					msgFeedBackList.add(msgFeedBack);
				}
			}
			
		}

		return msgFeedBackList;
	}

	/**
	 * 2：更新条码所属信息【计划UUID】
	 * 
	 * @param msgBodyPPCigInfoList
	 * @return
	 */
	public List<MsgFeedBack> doUpdateCigInfoBalUUIDById(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {

		// 实例化反馈集合
		List<MsgFeedBack> msgFeedBackList = new ArrayList<MsgFeedBack>();

		for (PPCigInfoBean ppCigInfoBean : msgBodyPPCigInfoList) {

			if (ppCigInfoDao.updateBalUUIDByPPId(ppCigInfoBean) > 0) {
				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(ppCigInfoBean.getId().toString());
				msgFeedBack.setState(true);
				msgFeedBackList.add(msgFeedBack);
			}

		}

		return msgFeedBackList;
	}

	/**
	 * 更新订单中打码状态【字段PRINTSTATUS】
	 * 
	 * @param msgBodyPPCigInfoList
	 * @return
	 */
	public List<MsgFeedBack> doUpdateCigInfoPrintStatusByPPId(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {

		// 实例化反馈集合
		List<MsgFeedBack> msgFeedBackList = new ArrayList<MsgFeedBack>();

		for (PPCigInfoBean ppCigInfoBean : msgBodyPPCigInfoList) {

			if (ppCigInfoDao.updatePrintStatusByPPIdAndPrinterId(ppCigInfoBean) > 0) {
				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(ppCigInfoBean.getId().toString());
				msgFeedBack.setState(true);
				msgFeedBackList.add(msgFeedBack);
			}
		}

		return msgFeedBackList;
	}

	/**
	 * 更新订单中码段回送状态
	 * 
	 * @param msgBodyPPCigInfoList
	 * @return
	 */
	public List<MsgFeedBack> doUpdateCigInfoSendbackflagByPPId(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {

		// 实例化反馈集合
		List<MsgFeedBack> msgFeedBackList = new ArrayList<MsgFeedBack>();

		for (PPCigInfoBean ppCigInfoBean : msgBodyPPCigInfoList) {
			if (ppCigInfoDao
					.updateSendbackflagByPPIdAndPrinterId(ppCigInfoBean) > 0) {
				
				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(ppCigInfoBean.getId().toString());
				msgFeedBack.setState(true);
				msgFeedBackList.add(msgFeedBack);
				
			}
		}

		return msgFeedBackList;
	}

	public PPArrangeDao getPpArrangerDao() {
		return ppArrangerDao;
	}

	@Autowired
	public void setPpArrangerDao(PPArrangeDao ppArrangerDao) {
		this.ppArrangerDao = ppArrangerDao;
	}

	public PPCigInfoDao getPpCigInfoDao() {
		return ppCigInfoDao;
	}

	
	@Autowired
	public void setPpCigInfoDao(PPCigInfoDao ppCigInfoDao) {
		this.ppCigInfoDao = ppCigInfoDao;
	}

}
