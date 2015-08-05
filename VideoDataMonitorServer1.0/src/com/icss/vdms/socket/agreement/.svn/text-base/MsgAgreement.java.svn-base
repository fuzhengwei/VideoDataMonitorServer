package com.icss.vdms.socket.agreement;

import java.util.List;

import com.icss.vdms.bp.bean.BPOrderInfoBean;
import com.icss.vdms.bp.bean.VOrderCodeStateBean;
import com.icss.vdms.pp.bean.PPArrangeBean;
import com.icss.vdms.pp.bean.PPCigInfoBean;

public class MsgAgreement {

	/**
	 * MsgCategoryEnum 消息类别[商业打码软件、工业打码软件、扫描软件]
	 */
	private MsgCategoryEnum msgCategoryEnum;

	// 商业打码-START

	/**
	 * MsgBarCodePrinterEnum 商业打码软件消息类型
	 */
	private MsgBPEnum msgBPEnum;

	/**
	 * msgBodyBPOrderBaseInfo 商业打码_基础信息消息体
	 */
	private List<BPOrderInfoBean> msgBodyBPOrderBaseInfoList;

	/**
	 * msgBodyBPOrderCodeInfo 商业打码_打码信息消息体
	 */
	private List<VOrderCodeStateBean> msgBodyBPOrderCodeInfoList;

	// 商业打码-END

	// 工业打码-START

	/**
	 * msgPPEnum 工业打码消息类型
	 */
	private MsgPPEnum msgPPEnum;

	/**
	 * 工业打码计划消息体
	 */
	private List<PPArrangeBean> msgBodyPPArrangeList;

	/**
	 * 工业打码条码消息体
	 */
	private List<PPCigInfoBean> msgBodyPPCigInfoList;

	// 工业打码-END

	/**
	 * 反馈信息
	 */
	private List<MsgFeedBack> msgFeedBackList;

	public MsgCategoryEnum getMsgCategoryEnum() {
		return msgCategoryEnum;
	}

	public void setMsgCategoryEnum(MsgCategoryEnum msgCategoryEnum) {
		this.msgCategoryEnum = msgCategoryEnum;
	}

	public MsgBPEnum getMsgBPEnum() {
		return msgBPEnum;
	}

	public void setMsgBPEnum(MsgBPEnum msgBPEnum) {
		this.msgBPEnum = msgBPEnum;
	}

	public List<BPOrderInfoBean> getMsgBodyBPOrderBaseInfoList() {
		return msgBodyBPOrderBaseInfoList;
	}

	public void setMsgBodyBPOrderBaseInfoList(
			List<BPOrderInfoBean> msgBodyBPOrderBaseInfoList) {
		this.msgBodyBPOrderBaseInfoList = msgBodyBPOrderBaseInfoList;
	}

	public List<VOrderCodeStateBean> getMsgBodyBPOrderCodeInfoList() {
		return msgBodyBPOrderCodeInfoList;
	}

	public void setMsgBodyBPOrderCodeInfoList(
			List<VOrderCodeStateBean> msgBodyBPOrderCodeInfoList) {
		this.msgBodyBPOrderCodeInfoList = msgBodyBPOrderCodeInfoList;
	}

	public MsgPPEnum getMsgPPEnum() {
		return msgPPEnum;
	}

	public void setMsgPPEnum(MsgPPEnum msgPPEnum) {
		this.msgPPEnum = msgPPEnum;
	}

	public List<PPArrangeBean> getMsgBodyPPArrangeList() {
		return msgBodyPPArrangeList;
	}

	public void setMsgBodyPPArrangeList(List<PPArrangeBean> msgBodyPPArrangeList) {
		this.msgBodyPPArrangeList = msgBodyPPArrangeList;
	}

	public List<PPCigInfoBean> getMsgBodyPPCigInfoList() {
		return msgBodyPPCigInfoList;
	}

	public void setMsgBodyPPCigInfoList(List<PPCigInfoBean> msgBodyPPCigInfoList) {
		this.msgBodyPPCigInfoList = msgBodyPPCigInfoList;
	}

	public List<MsgFeedBack> getMsgFeedBackList() {
		return msgFeedBackList;
	}

	public void setMsgFeedBackList(List<MsgFeedBack> msgFeedBackList) {
		this.msgFeedBackList = msgFeedBackList;
	}

}
