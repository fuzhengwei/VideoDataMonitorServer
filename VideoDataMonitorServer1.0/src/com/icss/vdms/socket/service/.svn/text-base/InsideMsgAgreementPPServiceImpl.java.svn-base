package com.icss.vdms.socket.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.icss.vdms.pp.bean.PPArrangeBean;
import com.icss.vdms.pp.bean.PPCigInfoBean;
import com.icss.vdms.pp.service.PPService;
import com.icss.vdms.socket.agreement.MsgAgreement;
import com.icss.vdms.socket.agreement.MsgCategoryEnum;
import com.icss.vdms.socket.agreement.MsgFeedBack;
import com.icss.vdms.socket.agreement.MsgPPEnum;
import com.icss.vdms.socket.intfc.IMsgAgreementService;
import com.icss.vdms.util.spring.ApplicationContextHelper;

/**
 * MsgAgreementBPService
 * 
 * 工业打码
 * 
 * 消息协议处理服务
 * 
 * @author FUZHENGWEI 2015年4月21日 11:48:49
 * 
 */
public class InsideMsgAgreementPPServiceImpl implements IMsgAgreementService {

	// 计划是否存在Map集合
	private Map<String, Boolean> isExitArrangeMap = null;

	// 工业打码PPService
	private PPService ppService;

	// 反馈集合 基础数据
	private List<MsgFeedBack> msgFeedBackList;

	// 封装反馈消息
	private MsgAgreement msgAgreementFeedBack = null;

	// 计划新增
	private List<PPArrangeBean> arrangeAddList = null;

	// 计划更新
	private List<PPArrangeBean> arrangeUpdateList = null;

	public InsideMsgAgreementPPServiceImpl() {
		// 构造注入
		this.ppService = ApplicationContextHelper.getBean("ppService",
				PPService.class);

		// 实例化计划是否存在Map集合
		isExitArrangeMap = new HashMap<String, Boolean>();

		// 反馈集合
		msgFeedBackList = new ArrayList<MsgFeedBack>();

		// 实例化反馈消息协议
		msgAgreementFeedBack = new MsgAgreement();

		// 默认设置为商业打码消息协议
		msgAgreementFeedBack
				.setMsgCategoryEnum(MsgCategoryEnum.BARCODEPRINTER_PP);

		// 计划新增
		arrangeAddList = new ArrayList<PPArrangeBean>();
		// 计划更新
		arrangeUpdateList = new ArrayList<PPArrangeBean>();
	}

	/**
	 * 处理消息协议
	 * 
	 * @param msg
	 * @return
	 */
	public MsgAgreement doChannelReadMsgAgreement(MsgAgreement msg) {

		// C2S_ARRANGEBASEINFO 客户端向服务端传递_计划基础信息
		if (MsgPPEnum.C2S_ARRANGEBASEINFO.equals(msg.getMsgPPEnum())) {

			msgFeedBackList = doInsertOrUpdateArrangeList(msg
					.getMsgBodyPPArrangeList());
			msgAgreementFeedBack.setMsgPPEnum(MsgPPEnum.S2C_ARRANGEBASEFEED);
			msgAgreementFeedBack.setMsgFeedBackList(msgFeedBackList);

		}
		// C2S_CIGINFOBASEINFO 客户端向服务端传递_条码基础信息
		else if (MsgPPEnum.C2S_CIGINFOBASEINFO.equals(msg.getMsgPPEnum())) {

			msgFeedBackList = doInsertOrUpdateCigInfoList(msg
					.getMsgBodyPPCigInfoList());
			msgAgreementFeedBack.setMsgPPEnum(MsgPPEnum.S2C_CIGINFOBASEFEED);
			msgAgreementFeedBack.setMsgFeedBackList(msgFeedBackList);

		}
		// C2S_CIGINFOCODEINFO 客户端向服务端传递_条码打码状态
		else if (MsgPPEnum.C2S_CIGINFOCODEINFO.equals(msg.getMsgPPEnum())) {
			
			msgFeedBackList = doUpdateCigInfoPrintStatus(msg
					.getMsgBodyPPCigInfoList());
			msgAgreementFeedBack.setMsgPPEnum(MsgPPEnum.S2C_CIGINFOCODEFEED);
			msgAgreementFeedBack.setMsgFeedBackList(msgFeedBackList);
			
		}
		// C2S_CIGINFOBACKINFO 客户端向服务端传递_条码发送信息
		else if (MsgPPEnum.C2S_CIGINFOBACKINFO.equals(msg.getMsgPPEnum())) {
			
			msgFeedBackList = doUpdateCigInfoSendbackflag(msg
					.getMsgBodyPPCigInfoList());
			msgAgreementFeedBack.setMsgPPEnum(MsgPPEnum.S2C_CIGINFOBACKFEED);
			msgAgreementFeedBack.setMsgFeedBackList(msgFeedBackList);
			
		}

		return msgAgreementFeedBack;
	}

	/**
	 * 更新订单中码段回送状态【SENDBACKFLAG】
	 * 
	 * @param msgBodyBPOrderCodeInfoList
	 * @return
	 */
	private List<MsgFeedBack> doUpdateCigInfoSendbackflag(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {
		msgFeedBackList.clear();

		msgFeedBackList.addAll(ppService
				.doUpdateCigInfoSendbackflagByPPId(msgBodyPPCigInfoList));

		return msgFeedBackList;
	}

	/**
	 * 更新订单中打码状态【字段PRINTSTATUS】
	 * 
	 * @param msgBodyPPCigInfoList
	 * @return
	 */
	private List<MsgFeedBack> doUpdateCigInfoPrintStatus(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {

		// 集合清空
		msgFeedBackList.clear();

		msgFeedBackList.addAll(ppService
				.doUpdateCigInfoPrintStatusByPPId(msgBodyPPCigInfoList));

		return msgFeedBackList;
	}

	/**
	 * 新增条码或更新条码信息
	 * 
	 * 集合里面第一对象数据中oiBaseFeedState为0则新增，为2则更新
	 * 
	 * @param msgBodyPPCigInfoList
	 * @return
	 */
	private List<MsgFeedBack> doInsertOrUpdateCigInfoList(
			List<PPCigInfoBean> msgBodyPPCigInfoList) {

		// 集合清空
		msgFeedBackList.clear();

		// 0：新增
		if (msgBodyPPCigInfoList.get(0).getOiBaseFeedState().equals("0")) {
			msgFeedBackList.addAll(ppService
					.doInsertCigInfoList(msgBodyPPCigInfoList));
		}
		// 2：更新
		else if (msgBodyPPCigInfoList.get(0).getOiBaseFeedState().equals("2")) {
			msgFeedBackList.addAll(ppService
					.doUpdateCigInfoBalUUIDById(msgBodyPPCigInfoList));
		}

		return msgFeedBackList;
	}

	/**
	 * 新增或者更新计划信息
	 * 
	 * @param msgBodyPPArrangeList
	 * @return
	 */
	private List<MsgFeedBack> doInsertOrUpdateArrangeList(
			List<PPArrangeBean> msgBodyPPArrangeList) {

		// 集合清空
		msgFeedBackList.clear();
		arrangeAddList.clear();
		arrangeUpdateList.clear();

		// 数据验证
		for (PPArrangeBean ppArrangeBean : msgBodyPPArrangeList) {
			if (ppArrangeBean.getType() == 1) {
				arrangeAddList.add(ppArrangeBean);
			} else if (ppArrangeBean.getType() == 2) {
				arrangeUpdateList.add(ppArrangeBean);
			}
		}

		// 新增
		if (arrangeAddList.size() > 0) {
			msgFeedBackList.addAll(ppService
					.doInsertArrangeList(arrangeAddList));
		}

		// 修改
		if (arrangeUpdateList.size() > 0) {
			msgFeedBackList.addAll(ppService
					.doUpdateArrangeList(arrangeAddList));
		}

		return msgFeedBackList;
	}

}
