package com.icss.vdms.webservice.dsa.bean;

/**
 * 
 * 工业打码码段明细条码
 * 
 * @author Administrator
 * 
 */
public class DsaPPDetailBarCodeBean {

	// 码段
	private String obBcigBarcode = "";
	// 打码时间
	private String naturaldate = "";
	
	public String getObBcigBarcode() {
		return obBcigBarcode;
	}
	public void setObBcigBarcode(String obBcigBarcode) {
		this.obBcigBarcode = obBcigBarcode == null ? null:obBcigBarcode.trim();
	}
	public String getNaturaldate() {
		return naturaldate;
	}
	public void setNaturaldate(String naturaldate) {
		this.naturaldate = naturaldate == null ? null : naturaldate.trim();
	}
	
}
