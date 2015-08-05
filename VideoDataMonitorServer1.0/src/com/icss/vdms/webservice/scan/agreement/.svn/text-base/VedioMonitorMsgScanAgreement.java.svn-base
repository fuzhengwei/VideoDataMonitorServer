package com.icss.vdms.webservice.scan.agreement;

import java.util.List;

import com.icss.vdms.scan.bean.SBarcodeInfoBean;
import com.icss.vdms.scan.bean.SBillBaseBean;
import com.icss.vdms.scan.bean.SBillDetailBean;
import com.icss.vdms.scan.bean.SPalletInfoBean;

/**
 * 
 * 扫描端消息协议
 * 
 * @author Administrator
 * 
 */
public class VedioMonitorMsgScanAgreement {

	// 信息头
	private VedioMonitorMsgScanEnum vedioMonitorMsgScanEnum;

	// 1.单据
	private SBillBaseBean sBillBase;

	// 2.明细
	private List<SBillDetailBean> sBillDetialList;

	// 3.条码
	private List<SBarcodeInfoBean> sBarcodeList;

	// 4.托盘
	private SPalletInfoBean sPalletInfo;

	public VedioMonitorMsgScanEnum getVedioMonitorMsgScanEnum() {
		return vedioMonitorMsgScanEnum;
	}

	public void setVedioMonitorMsgScanEnum(
			VedioMonitorMsgScanEnum vedioMonitorMsgScanEnum) {
		this.vedioMonitorMsgScanEnum = vedioMonitorMsgScanEnum;
	}

	public List<SBarcodeInfoBean> getsBarcodeList() {
		return sBarcodeList;
	}

	public void setsBarcodeList(List<SBarcodeInfoBean> sBarcodeList) {
		this.sBarcodeList = sBarcodeList;
	}

	public SBillBaseBean getsBillBase() {
		return sBillBase;
	}

	public void setsBillBase(SBillBaseBean sBillBase) {
		this.sBillBase = sBillBase;
	}

	public List<SBillDetailBean> getsBillDetialList() {
		return sBillDetialList;
	}

	public void setsBillDetialList(List<SBillDetailBean> sBillDetialList) {
		this.sBillDetialList = sBillDetialList;
	}

	public SPalletInfoBean getsPalletInfo() {
		return sPalletInfo;
	}

	public void setsPalletInfo(SPalletInfoBean sPalletInfo) {
		this.sPalletInfo = sPalletInfo;
	}

	@Override
	public String toString() {
		return "VedioMonitorMsgScanAgreement [sBarcodeList=" + sBarcodeList
				+ ", sBillBase=" + sBillBase + ", sBillDetialList="
				+ sBillDetialList + ", sPalletInfo=" + sPalletInfo
				+ ", vedioMonitorMsgScanEnum=" + vedioMonitorMsgScanEnum + "]";
	}

}
