package com.icss.vdms.socket.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.icss.vdms.bp.bean.BPOrderInfoBean;
import com.icss.vdms.bp.bean.VOrderCodeStateBean;
import com.icss.vdms.bp.service.BPService;
import com.icss.vdms.socket.agreement.MsgAgreement;
import com.icss.vdms.socket.agreement.MsgBPEnum;
import com.icss.vdms.socket.agreement.MsgCategoryEnum;
import com.icss.vdms.socket.agreement.MsgFeedBack;
import com.icss.vdms.socket.intfc.IMsgAgreementService;
import com.icss.vdms.util.spring.ApplicationContextHelper;

/**
 * MsgAgreementBPService
 * 
 * 商业打码
 * 
 * 消息协议处理服务
 * 
 * @author FUZHENGWEI 2015年4月14日 10:11:19
 * 
 */
public class InsideMsgAgreementBPServiceImpl implements IMsgAgreementService{

	// 验证订单是否存在Map集合
	private Map<String, Boolean> isExitOrder = null;
	// 验证批次是否存在Map集合
	private Map<String, Boolean> isExitBatch = null;
	// 反馈集合 基础数据
	private List<MsgFeedBack> msgFeedBackListBase;
	// 反馈集合 打码状态
	private List<MsgFeedBack> msgFeedBackListCode;
	// 商业打码BPService
	private BPService bPService;
	
	// 封装反馈消息
	private MsgAgreement msgAgreementFeedBack = null;

	// 构造函数
	public InsideMsgAgreementBPServiceImpl() {
		try {

			// 构造注入
			this.bPService = ApplicationContextHelper.getBean("bPService",
					BPService.class);

			// 将来可从数据库取出
			isExitOrder = new HashMap<String, Boolean>();
			isExitBatch = new HashMap<String, Boolean>();
			
			// 实例化基础数据反馈集合
			msgFeedBackListBase = new ArrayList<MsgFeedBack>();
			// 实例化打码数据反馈集合
			msgFeedBackListCode = new ArrayList<MsgFeedBack>();
			
			// 实例化反馈消息协议
			msgAgreementFeedBack = new MsgAgreement();
			// 默认设置为商业打码消息协议
			msgAgreementFeedBack.setMsgCategoryEnum(MsgCategoryEnum.BARCODEPRINTER_BP);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 处理消息协议
	 * @param msg
	 * @return
	 */
	public MsgAgreement doChannelReadMsgAgreement(MsgAgreement msg) {

		//C2S_BASEORDERINFO 客户端向服务端传递_基础订单信息
		if(MsgBPEnum.C2S_ORDERBASEINFO.equals(msg.getMsgBPEnum())){
			// 基础数据存库
			msgFeedBackListBase = doInsertOrderList(msg.getMsgBodyBPOrderBaseInfoList());
			msgAgreementFeedBack.setMsgBPEnum(MsgBPEnum.S2C_ORDERBASEFEED);
			msgAgreementFeedBack.setMsgFeedBackList(msgFeedBackListBase);
		}else if(MsgBPEnum.C2S_ORDERCODEINFO.equals(msg.getMsgBPEnum())){
			// 打码状态存库
			msgFeedBackListCode = doUpdateOrderStateList(msg.getMsgBodyBPOrderCodeInfoList());
			msgAgreementFeedBack.setMsgBPEnum(MsgBPEnum.S2C_ORDERCODEFEED);
			msgAgreementFeedBack.setMsgFeedBackList(msgFeedBackListCode);
		}
		
		return msgAgreementFeedBack;
	}
	
	/**
	 * 批量插入OrderList
	 * 
	 * @param list
	 */
	private List<MsgFeedBack> doInsertOrderList(List<BPOrderInfoBean> list) {

		// 集合清空
		msgFeedBackListBase.clear();

		// 数据验证
		for (BPOrderInfoBean bpOrderInfoBean : list) {

			// 验证批次
			if (null == isExitBatch.get(bpOrderInfoBean.getbPBatchBean()
					.getbUuid())) {
				isExitBatch.put(bpOrderInfoBean.getbPBatchBean().getbUuid(),
						true);
			} else {
				bpOrderInfoBean.setExitBatch(true);
			}

			// 验证集合
			if (null == isExitOrder.get(bpOrderInfoBean.getOiUuid())) {
				// 如果不存在则放入比对队列中
				isExitOrder.put(bpOrderInfoBean.getOiUuid(), true);
			} else {

				// 收集反馈信息
				MsgFeedBack msgFeedBack = new MsgFeedBack();
				msgFeedBack.setId(bpOrderInfoBean.getOiUuid());
				msgFeedBack.setState(true);
				msgFeedBackListBase.add(msgFeedBack);

				// 如果已经存在则从待插入数据库集合中剔除
				list.remove(bpOrderInfoBean);
			}
		}

		// 执行插入数据库并收集反馈结果
		msgFeedBackListBase.addAll(bPService.doInsertBPModel(list));

		System.out
				.println("msgFeedBackListBase size:" + msgFeedBackListBase.size());

		// 反馈
		return msgFeedBackListBase;
	}

	/**
	 * 批量更新打码状态集合
	 * @param list
	 * @return
	 */
	private List<MsgFeedBack> doUpdateOrderStateList(
			List<VOrderCodeStateBean> list) {
		
		msgFeedBackListCode.clear();
		
		msgFeedBackListCode.addAll(bPService.doUpdateBPModel(list));

		return msgFeedBackListCode;

	}

}
