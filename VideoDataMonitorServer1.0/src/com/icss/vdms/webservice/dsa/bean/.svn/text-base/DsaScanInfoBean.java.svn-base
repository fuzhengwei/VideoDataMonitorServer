package com.icss.vdms.webservice.dsa.bean;

/**
 * 
 * 工商业扫描基础数据信息
 * 
 * @author Administrator
 * 
 */
public class DsaScanInfoBean {
	
	// 扫描PC编号
	private String bbSpCodes = "";
	// 扫描PC名称
	private String bbSpName = "";
	// 规格编码
	private String bdPcigCode = "";
	// 规格名称
	private String bdPcigName = "";
	// 扫描量
	private String bdScanPnum = "";

	public String getBbSpCodes() {
		return bbSpCodes;
	}

	public void setBbSpCodes(String bbSpCodes) {
		this.bbSpCodes = bbSpCodes;
		
		try {
			this.bbSpName = bbSpCodes.substring(9) + "扫描设备";
		} catch (Exception e) {
			this.bbSpName = "缺省的扫描设备";
		}
	}

	public String getBbSpName() {
		return bbSpName;
	}

	public void setBbSpName(String bbSpName) {
		this.bbSpName = bbSpName;
	}

	public String getBdPcigCode() {
		return bdPcigCode;
	}

	public void setBdPcigCode(String bdPcigCode) {
		this.bdPcigCode = bdPcigCode;
	}

	public String getBdPcigName() {
		return bdPcigName;
	}

	public void setBdPcigName(String bdPcigName) {
		this.bdPcigName = bdPcigName;
	}

	public String getBdScanPnum() {
		return bdScanPnum;
	}

	public void setBdScanPnum(String bdScanPnum) {
		this.bdScanPnum = bdScanPnum;
	}

}
