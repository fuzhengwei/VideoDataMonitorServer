package com.icss.vdms.webservice.dsa.bean;

import java.util.List;

/**
 * 
 * 工业打码码段明细
 * 
 * @author Administrator
 * 
 */
public class DsaPPDetailBean {

	// 排产计划表UUID[没有计划不能却分夸计划]
	private String baluuid = "";
	// 序号
	private String id = "";
	// 打码机编码
	private String printerid = "";
	// 打码机名称
	private String printername = "";
	// 规格编码
	private String cigbrandcode = "";
	// 规格名称
	private String cigbrand = "";
	// 计划量[排产量]
	private String arrangenum = "";
	// 打码量P1[打印量]
	private String printnum1 = "";
	// 打码量P2
	private String printnum2 = "";
	// 起始时间
	private String searchStartTime = "";
	// 截止时间
	private String searchEndTime = "";
	// 条码集合
	public List<DsaPPDetailBarCodeBean> dsaPPDetailBarCodeList;
	
	public String getBaluuid() {
		return baluuid;
	}

	public void setBaluuid(String baluuid) {
		this.baluuid = baluuid == null ? null : baluuid.trim();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPrinterid() {
		return printerid;
	}

	public void setPrinterid(String printerid) {
		this.printerid = printerid == null ? null : printerid.trim();
	}

	public String getPrintername() {
		try {
			return printerid.substring(printerid.indexOf(".")-1,printerid.indexOf("."))+"号打码机";
		} catch (Exception e) {
			return printername;
		}
	}

	public void setPrintername(String printername) {
		this.printername = printername == null ? null : printername.trim();
	}

	public String getCigbrandcode() {
		return cigbrandcode;
	}

	public void setCigbrandcode(String cigbrandcode) {
		this.cigbrandcode = cigbrandcode == null ? null : cigbrandcode.trim();
	}

	public String getCigbrand() {
		return cigbrand;
	}

	public void setCigbrand(String cigbrand) {
		this.cigbrand = cigbrand == null ? null : cigbrand.trim();
	}

	public String getArrangenum() {
		return arrangenum;
	}

	public void setArrangenum(String arrangenum) {
		this.arrangenum = arrangenum == null ? null : arrangenum.trim();
	}

	public String getPrintnum1() {
		return printnum1;
	}

	public void setPrintnum1(String printnum1) {
		this.printnum1 = printnum1 == null ? null : printnum1.trim();
	}

	public String getPrintnum2() {
		return printnum2;
	}

	public void setPrintnum2(String printnum2) {
		this.printnum2 = printnum2 == null ? null : printnum2.trim();
	}

	public String getSearchStartTime() {
		return searchStartTime;
	}

	public void setSearchStartTime(String searchStartTime) {
		this.searchStartTime = searchStartTime == null ? null : searchStartTime.trim();
	}

	public String getSearchEndTime() {
		return searchEndTime;
	}

	public void setSearchEndTime(String searchEndTime) {
		this.searchEndTime = searchEndTime == null ? null : searchEndTime.trim();
	}

	public List<DsaPPDetailBarCodeBean> getDsaPPDetailBarCodeList() {
		return dsaPPDetailBarCodeList;
	}

	public void setDsaPPDetailBarCodeList(
			List<DsaPPDetailBarCodeBean> dsaPPDetailBarCodeList) {
		this.dsaPPDetailBarCodeList = dsaPPDetailBarCodeList;
	}
	
}
