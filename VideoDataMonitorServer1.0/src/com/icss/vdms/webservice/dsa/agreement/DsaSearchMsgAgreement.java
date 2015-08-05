package com.icss.vdms.webservice.dsa.agreement;

/**
 * 
 * DSA 数据请求协议
 * @author Administrator
 *
 */
public class DsaSearchMsgAgreement {

	// 搜索ID[打码机编号，扫描机编号]
	private String searchId;
	
	// 请求数据起始时间
	private String searchStartTime;
	
	// 请求数据结束时间
	private String searchEndTime;

	public String getSearchId() {
		return searchId;
	}

	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}

	public String getSearchStartTime() {
		return searchStartTime;
	}

	public void setSearchStartTime(String searchStartTime) {
		this.searchStartTime = searchStartTime;
	}

	public String getSearchEndTime() {
		return searchEndTime;
	}

	public void setSearchEndTime(String searchEndTime) {
		this.searchEndTime = searchEndTime;
	}
	
}
