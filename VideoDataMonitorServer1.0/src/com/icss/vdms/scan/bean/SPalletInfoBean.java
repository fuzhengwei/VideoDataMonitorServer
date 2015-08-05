package com.icss.vdms.scan.bean;

import java.util.Date;

public class SPalletInfoBean {
    private Long piId;

    private String piPalletId;

    private String piType;

    private Integer piBarcodeNum;

    private String piBarcodes;

    private String piBrandInfo;

    private String piHandleresult;

    private Integer piOkBarcodeNum;

    private Integer piFailBarcodeNum;

    private Date piScanTime;

    private String piDemo;

    private String piBillUuid;

    private String piScannerType;

    private String piScannerCode;

    private Date piHandleStartTime;

    private Date piHandleEndTime;

    private String piHandleStatus;

    private String piBarcode1d;

    public Long getPiId() {
        return piId;
    }

    public void setPiId(Long piId) {
        this.piId = piId;
    }

    public String getPiPalletId() {
        return piPalletId;
    }

    public void setPiPalletId(String piPalletId) {
        this.piPalletId = piPalletId == null ? null : piPalletId.trim();
    }

    public String getPiType() {
        return piType;
    }

    public void setPiType(String piType) {
        this.piType = piType == null ? null : piType.trim();
    }

    public Integer getPiBarcodeNum() {
        return piBarcodeNum;
    }

    public void setPiBarcodeNum(Integer piBarcodeNum) {
        this.piBarcodeNum = piBarcodeNum;
    }

    public String getPiBarcodes() {
        return piBarcodes;
    }

    public void setPiBarcodes(String piBarcodes) {
        this.piBarcodes = piBarcodes == null ? null : piBarcodes.trim();
    }

    public String getPiBrandInfo() {
        return piBrandInfo;
    }

    public void setPiBrandInfo(String piBrandInfo) {
        this.piBrandInfo = piBrandInfo == null ? null : piBrandInfo.trim();
    }

    public String getPiHandleresult() {
        return piHandleresult;
    }

    public void setPiHandleresult(String piHandleresult) {
        this.piHandleresult = piHandleresult == null ? null : piHandleresult.trim();
    }

    public Integer getPiOkBarcodeNum() {
        return piOkBarcodeNum;
    }

    public void setPiOkBarcodeNum(Integer piOkBarcodeNum) {
        this.piOkBarcodeNum = piOkBarcodeNum;
    }

    public Integer getPiFailBarcodeNum() {
        return piFailBarcodeNum;
    }

    public void setPiFailBarcodeNum(Integer piFailBarcodeNum) {
        this.piFailBarcodeNum = piFailBarcodeNum;
    }

    public Date getPiScanTime() {
        return piScanTime;
    }

    public void setPiScanTime(Date piScanTime) {
        this.piScanTime = piScanTime;
    }

    public String getPiDemo() {
        return piDemo;
    }

    public void setPiDemo(String piDemo) {
        this.piDemo = piDemo == null ? null : piDemo.trim();
    }

    public String getPiBillUuid() {
        return piBillUuid;
    }

    public void setPiBillUuid(String piBillUuid) {
        this.piBillUuid = piBillUuid == null ? null : piBillUuid.trim();
    }

    public String getPiScannerType() {
        return piScannerType;
    }

    public void setPiScannerType(String piScannerType) {
        this.piScannerType = piScannerType == null ? null : piScannerType.trim();
    }

    public String getPiScannerCode() {
        return piScannerCode;
    }

    public void setPiScannerCode(String piScannerCode) {
        this.piScannerCode = piScannerCode == null ? null : piScannerCode.trim();
    }

    public Date getPiHandleStartTime() {
        return piHandleStartTime;
    }

    public void setPiHandleStartTime(Date piHandleStartTime) {
        this.piHandleStartTime = piHandleStartTime;
    }

    public Date getPiHandleEndTime() {
        return piHandleEndTime;
    }

    public void setPiHandleEndTime(Date piHandleEndTime) {
        this.piHandleEndTime = piHandleEndTime;
    }

    public String getPiHandleStatus() {
        return piHandleStatus;
    }

    public void setPiHandleStatus(String piHandleStatus) {
        this.piHandleStatus = piHandleStatus == null ? null : piHandleStatus.trim();
    }

    public String getPiBarcode1d() {
        return piBarcode1d;
    }

    public void setPiBarcode1d(String piBarcode1d) {
        this.piBarcode1d = piBarcode1d == null ? null : piBarcode1d.trim();
    }
}