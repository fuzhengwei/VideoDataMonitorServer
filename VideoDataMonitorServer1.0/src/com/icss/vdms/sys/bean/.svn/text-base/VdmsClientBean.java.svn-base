package com.icss.vdms.sys.bean;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.icss.vdms.util.date.DateSerializer;

public class VdmsClientBean {

	private Long cId; // 自增主键

	private String cUuid; // 唯一标识

	private String cIp; // 客户端IP

	private String cDataSource; // 数据来源[1、商业打码，2、工业打码、3、商业扫描]

	private String cDataDescription; // 数据描述

	private String cDataNumber;// 对应编号[P11530101001]

	private Date cCreateDate;// 创建日期

	private String cUseState;// 使用状态[开启、关闭]

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getcUuid() {
		return cUuid;
	}

	public void setcUuid(String cUuid) {
		this.cUuid = cUuid == null ? null : cUuid.trim();
	}

	public String getcIp() {
		return cIp;
	}

	public void setcIp(String cIp) {
		this.cIp = cIp == null ? null : cIp.trim();
	}

	public String getcDataSource() {
		return cDataSource;
	}

	public void setcDataSource(String cDataSource) {
		this.cDataSource = cDataSource == null ? null : cDataSource.trim();
	}

	public String getcDataDescription() {
		return cDataDescription;
	}

	public void setcDataDescription(String cDataDescription) {
		this.cDataDescription = cDataDescription;
	}

	public String getcDataNumber() {
		return cDataNumber;
	}

	public void setcDataNumber(String cDataNumber) {
		this.cDataNumber = cDataNumber == null ? null : cDataNumber.trim();
	}

	@JsonSerialize(using = DateSerializer.class)
	public Date getcCreateDate() {
		return cCreateDate;
	}

	public void setcCreateDate(Date cCreateDate) {
		this.cCreateDate = cCreateDate;
	}

	public String getcUseState() {
		return cUseState;
	}

	public void setcUseState(String cUseState) {
		this.cUseState = cUseState == null ? null : cUseState.trim();
	}

	@Override
	public String toString() {
		return "VdmsClientBean [cCreateDate=" + cCreateDate
				+ ", cDataDescription=" + cDataDescription + ", cDataNumber="
				+ cDataNumber + ", cDataSource=" + cDataSource + ", cId=" + cId
				+ ", cIp=" + cIp + ", cUseState=" + cUseState + ", cUuid="
				+ cUuid + "]";
	}

}