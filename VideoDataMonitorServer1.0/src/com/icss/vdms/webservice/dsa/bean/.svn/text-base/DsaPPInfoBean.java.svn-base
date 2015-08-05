package com.icss.vdms.webservice.dsa.bean;

/**
 * 
 * 工业打码基础数据信息
 * 
 * @author Administrator
 * 
 */
public class DsaPPInfoBean {

	// 打码机编码
	private String printerid;

	// 打码机名称
	private String printername = "缺省打码机";

	// 规格编码
	private String cigbrandcode;

	// 规格名称
	private String cigbrand;

	// 打码量
	private String applynum;

	public String getPrinterid() {
		return printerid;
	}

	public void setPrinterid(String printerid) {
		this.printerid = printerid == null ? null : printerid.trim();
	}

	/**
	 * 打码机名称自动截取
	 * @return
	 */
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

	public String getApplynum() {
		return applynum;
	}

	public void setApplynum(String applynum) {
		this.applynum = applynum;
	}
}
