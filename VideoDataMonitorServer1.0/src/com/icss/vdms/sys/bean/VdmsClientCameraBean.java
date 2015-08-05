package com.icss.vdms.sys.bean;

public class VdmsClientCameraBean {

	private Long ccId; // ID

	private String ccUuid;// 唯一标识

	private String ccCameraNumber;// 摄像头编号

	private String ccCameraPosition; // 位置描述

	private String ccCAcmeraSnum; // 摄像头特定编号【给扫描用】

	public Long getCcId() {
		return ccId;
	}

	public void setCcId(Long ccId) {
		this.ccId = ccId;
	}

	public String getCcUuid() {
		return ccUuid;
	}

	public void setCcUuid(String ccUuid) {
		this.ccUuid = ccUuid == null ? null : ccUuid.trim();
	}

	public String getCcCameraNumber() {
		return ccCameraNumber;
	}

	public void setCcCameraNumber(String ccCameraNumber) {
		this.ccCameraNumber = ccCameraNumber == null ? null : ccCameraNumber
				.trim();
	}

	public String getCcCameraPosition() {
		return ccCameraPosition;
	}

	public void setCcCameraPosition(String ccCameraPosition) {
		this.ccCameraPosition = ccCameraPosition;
	}

	public String getCcCAcmeraSnum() {
		return ccCAcmeraSnum;
	}

	public void setCcCAcmeraSnum(String ccCAcmeraSnum) {
		this.ccCAcmeraSnum = ccCAcmeraSnum;
	}

	@Override
	public String toString() {
		return "VdmsClientCameraBean [ccCAcmeraSnum=" + ccCAcmeraSnum
				+ ", ccCameraNumber=" + ccCameraNumber + ", ccCameraPosition="
				+ ccCameraPosition + ", ccId=" + ccId + ", ccUuid=" + ccUuid
				+ "]";
	}

}