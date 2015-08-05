package com.icss.vdms.scan.bean;

import java.math.BigDecimal;
import java.util.Date;

public class SBillBaseBean {
    private Long bbId;

    private String bbUuid;

    private String bbWsCode;

    private String bbBtCode;

    private String bbTicketNo;

    private String bbScanNo;

    private String bbTruckNo;

    private String bbFlowCode;

    private String bbFlowName;

    private String bbFlowType;

    private Date bbInputDate;

    private String bbInputPerson;

    private Date bbOperDate;

    private String bbBpCode;

    private String bbSpCodes;

    private String bbType;

    private String bbCigType;

    private Integer bbNotRecogniseAllPnum;

    private String bbMoveType;

    private String bbMoveIdUser;

    private String bbOppositeMoveUuid;

    private String bbMoveEndFlag;

    private Integer bbTotalPnum;

    private Integer bbTotalBnum;

    private Integer bbTotalAllBnum;

    private Integer bbTotalZnum;

    private BigDecimal bbTotalAllNum1;

    private Integer bbTotalScanPnum;

    private Integer bbTotalScanBnum;

    private Integer bbTotalAllScanBnum;

    private BigDecimal bbTotalAllScanNum1;

    private Integer bbTotalFixedPnum;

    private Integer bbTotalFixedBnum;

    private Integer bbTotalFixedAllBnum;

    private BigDecimal bbTotalFixedAllNum1;

    private BigDecimal bbTotalPrice;

    private String bbState;

    private Date bbReportTime;

    private String bbReportState;

    private Date bbSelfUpdateTime;

    private Integer bbFeedbackLive;

    private Date bbFeedbackLiveTime;

    private Date bbSubUpdateTime;

    private String bbFilePath;

    private String bbIsDeleted;

    private Date bbSendTime;

    private String bbSendState;

    private String bbCommerceCollectFlag;

    private String bbIndustryCollectFlag;

    private String bbCommerceCode;

    private String bbNoscanFlag;

    private String bbDischargePortSn;

    private String bbDischargePortName;

    private String bbContactNo;

    private String bbRelateContractNo;

    private String bbReason;

    private String bbGroupSign;

    private String bbSrc;

    private String bbInputCode;

    private String bbSrcWhCode;

    private String bbExt1;

    private String bbExt2;

    private String bbNumSyncFlag;

    private String bbSumSyncFlag;

    private String bbBarSyncFlag;

    private String bbBarNosyncReason;

    private String bbDriver;

    private String bbDriverPhone;

    private String bbWmsUuid;

    private String bbHzFlag;

    private String bbPermId;

    private Date bbHzTime;

    private String bbIsRetainedFlag;

    private String bbMemo;

    private Date bbCqTime;

    private String bbCqpcIp;

    private String bbHzpcIp;

    private String bbCqFlag;

    private String bbBackWarehourceFlag;

    private Date bbBackWarehourceTime;

    private String bbBackupFlag;

    private Date bbBackupTime;

    private String bbSendBmFlag;

    private Date bbSendBmTime;

    private String bbOrderMark;

    private String bbPrintFlag;

    private Date bbPrintTime;

    private String bbUpdateServerStateFlag;

    private String bbBillMonitorStatus;

    private String bbStandardTimeType;

    private Date bbStandardTime;

    private Date bbLocalTime;

    public Long getBbId() {
        return bbId;
    }

    public void setBbId(Long bbId) {
        this.bbId = bbId;
    }

    public String getBbUuid() {
        return bbUuid;
    }

    public void setBbUuid(String bbUuid) {
        this.bbUuid = bbUuid == null ? null : bbUuid.trim();
    }

    public String getBbWsCode() {
        return bbWsCode;
    }

    public void setBbWsCode(String bbWsCode) {
        this.bbWsCode = bbWsCode == null ? null : bbWsCode.trim();
    }

    public String getBbBtCode() {
        return bbBtCode;
    }

    public void setBbBtCode(String bbBtCode) {
        this.bbBtCode = bbBtCode == null ? null : bbBtCode.trim();
    }

    public String getBbTicketNo() {
        return bbTicketNo;
    }

    public void setBbTicketNo(String bbTicketNo) {
        this.bbTicketNo = bbTicketNo == null ? null : bbTicketNo.trim();
    }

    public String getBbScanNo() {
        return bbScanNo;
    }

    public void setBbScanNo(String bbScanNo) {
        this.bbScanNo = bbScanNo == null ? null : bbScanNo.trim();
    }

    public String getBbTruckNo() {
        return bbTruckNo;
    }

    public void setBbTruckNo(String bbTruckNo) {
        this.bbTruckNo = bbTruckNo == null ? null : bbTruckNo.trim();
    }

    public String getBbFlowCode() {
        return bbFlowCode;
    }

    public void setBbFlowCode(String bbFlowCode) {
        this.bbFlowCode = bbFlowCode == null ? null : bbFlowCode.trim();
    }

    public String getBbFlowName() {
        return bbFlowName;
    }

    public void setBbFlowName(String bbFlowName) {
        this.bbFlowName = bbFlowName == null ? null : bbFlowName.trim();
    }

    public String getBbFlowType() {
        return bbFlowType;
    }

    public void setBbFlowType(String bbFlowType) {
        this.bbFlowType = bbFlowType == null ? null : bbFlowType.trim();
    }

    public Date getBbInputDate() {
        return bbInputDate;
    }

    public void setBbInputDate(Date bbInputDate) {
        this.bbInputDate = bbInputDate;
    }

    public String getBbInputPerson() {
        return bbInputPerson;
    }

    public void setBbInputPerson(String bbInputPerson) {
        this.bbInputPerson = bbInputPerson == null ? null : bbInputPerson.trim();
    }

    public Date getBbOperDate() {
        return bbOperDate;
    }

    public void setBbOperDate(Date bbOperDate) {
        this.bbOperDate = bbOperDate;
    }

    public String getBbBpCode() {
        return bbBpCode;
    }

    public void setBbBpCode(String bbBpCode) {
        this.bbBpCode = bbBpCode == null ? null : bbBpCode.trim();
    }

    public String getBbSpCodes() {
        return bbSpCodes;
    }

    public void setBbSpCodes(String bbSpCodes) {
        this.bbSpCodes = bbSpCodes == null ? null : bbSpCodes.trim();
    }

    public String getBbType() {
        return bbType;
    }

    public void setBbType(String bbType) {
        this.bbType = bbType == null ? null : bbType.trim();
    }

    public String getBbCigType() {
        return bbCigType;
    }

    public void setBbCigType(String bbCigType) {
        this.bbCigType = bbCigType == null ? null : bbCigType.trim();
    }

    public Integer getBbNotRecogniseAllPnum() {
        return bbNotRecogniseAllPnum;
    }

    public void setBbNotRecogniseAllPnum(Integer bbNotRecogniseAllPnum) {
        this.bbNotRecogniseAllPnum = bbNotRecogniseAllPnum;
    }

    public String getBbMoveType() {
        return bbMoveType;
    }

    public void setBbMoveType(String bbMoveType) {
        this.bbMoveType = bbMoveType == null ? null : bbMoveType.trim();
    }

    public String getBbMoveIdUser() {
        return bbMoveIdUser;
    }

    public void setBbMoveIdUser(String bbMoveIdUser) {
        this.bbMoveIdUser = bbMoveIdUser == null ? null : bbMoveIdUser.trim();
    }

    public String getBbOppositeMoveUuid() {
        return bbOppositeMoveUuid;
    }

    public void setBbOppositeMoveUuid(String bbOppositeMoveUuid) {
        this.bbOppositeMoveUuid = bbOppositeMoveUuid == null ? null : bbOppositeMoveUuid.trim();
    }

    public String getBbMoveEndFlag() {
        return bbMoveEndFlag;
    }

    public void setBbMoveEndFlag(String bbMoveEndFlag) {
        this.bbMoveEndFlag = bbMoveEndFlag == null ? null : bbMoveEndFlag.trim();
    }

    public Integer getBbTotalPnum() {
        return bbTotalPnum;
    }

    public void setBbTotalPnum(Integer bbTotalPnum) {
        this.bbTotalPnum = bbTotalPnum;
    }

    public Integer getBbTotalBnum() {
        return bbTotalBnum;
    }

    public void setBbTotalBnum(Integer bbTotalBnum) {
        this.bbTotalBnum = bbTotalBnum;
    }

    public Integer getBbTotalAllBnum() {
        return bbTotalAllBnum;
    }

    public void setBbTotalAllBnum(Integer bbTotalAllBnum) {
        this.bbTotalAllBnum = bbTotalAllBnum;
    }

    public Integer getBbTotalZnum() {
        return bbTotalZnum;
    }

    public void setBbTotalZnum(Integer bbTotalZnum) {
        this.bbTotalZnum = bbTotalZnum;
    }

    public BigDecimal getBbTotalAllNum1() {
        return bbTotalAllNum1;
    }

    public void setBbTotalAllNum1(BigDecimal bbTotalAllNum1) {
        this.bbTotalAllNum1 = bbTotalAllNum1;
    }

    public Integer getBbTotalScanPnum() {
        return bbTotalScanPnum;
    }

    public void setBbTotalScanPnum(Integer bbTotalScanPnum) {
        this.bbTotalScanPnum = bbTotalScanPnum;
    }

    public Integer getBbTotalScanBnum() {
        return bbTotalScanBnum;
    }

    public void setBbTotalScanBnum(Integer bbTotalScanBnum) {
        this.bbTotalScanBnum = bbTotalScanBnum;
    }

    public Integer getBbTotalAllScanBnum() {
        return bbTotalAllScanBnum;
    }

    public void setBbTotalAllScanBnum(Integer bbTotalAllScanBnum) {
        this.bbTotalAllScanBnum = bbTotalAllScanBnum;
    }

    public BigDecimal getBbTotalAllScanNum1() {
        return bbTotalAllScanNum1;
    }

    public void setBbTotalAllScanNum1(BigDecimal bbTotalAllScanNum1) {
        this.bbTotalAllScanNum1 = bbTotalAllScanNum1;
    }

    public Integer getBbTotalFixedPnum() {
        return bbTotalFixedPnum;
    }

    public void setBbTotalFixedPnum(Integer bbTotalFixedPnum) {
        this.bbTotalFixedPnum = bbTotalFixedPnum;
    }

    public Integer getBbTotalFixedBnum() {
        return bbTotalFixedBnum;
    }

    public void setBbTotalFixedBnum(Integer bbTotalFixedBnum) {
        this.bbTotalFixedBnum = bbTotalFixedBnum;
    }

    public Integer getBbTotalFixedAllBnum() {
        return bbTotalFixedAllBnum;
    }

    public void setBbTotalFixedAllBnum(Integer bbTotalFixedAllBnum) {
        this.bbTotalFixedAllBnum = bbTotalFixedAllBnum;
    }

    public BigDecimal getBbTotalFixedAllNum1() {
        return bbTotalFixedAllNum1;
    }

    public void setBbTotalFixedAllNum1(BigDecimal bbTotalFixedAllNum1) {
        this.bbTotalFixedAllNum1 = bbTotalFixedAllNum1;
    }

    public BigDecimal getBbTotalPrice() {
        return bbTotalPrice;
    }

    public void setBbTotalPrice(BigDecimal bbTotalPrice) {
        this.bbTotalPrice = bbTotalPrice;
    }

    public String getBbState() {
        return bbState;
    }

    public void setBbState(String bbState) {
        this.bbState = bbState == null ? null : bbState.trim();
    }

    public Date getBbReportTime() {
        return bbReportTime;
    }

    public void setBbReportTime(Date bbReportTime) {
        this.bbReportTime = bbReportTime;
    }

    public String getBbReportState() {
        return bbReportState;
    }

    public void setBbReportState(String bbReportState) {
        this.bbReportState = bbReportState == null ? null : bbReportState.trim();
    }

    public Date getBbSelfUpdateTime() {
        return bbSelfUpdateTime;
    }

    public void setBbSelfUpdateTime(Date bbSelfUpdateTime) {
        this.bbSelfUpdateTime = bbSelfUpdateTime;
    }

    public Integer getBbFeedbackLive() {
        return bbFeedbackLive;
    }

    public void setBbFeedbackLive(Integer bbFeedbackLive) {
        this.bbFeedbackLive = bbFeedbackLive;
    }

    public Date getBbFeedbackLiveTime() {
        return bbFeedbackLiveTime;
    }

    public void setBbFeedbackLiveTime(Date bbFeedbackLiveTime) {
        this.bbFeedbackLiveTime = bbFeedbackLiveTime;
    }

    public Date getBbSubUpdateTime() {
        return bbSubUpdateTime;
    }

    public void setBbSubUpdateTime(Date bbSubUpdateTime) {
        this.bbSubUpdateTime = bbSubUpdateTime;
    }

    public String getBbFilePath() {
        return bbFilePath;
    }

    public void setBbFilePath(String bbFilePath) {
        this.bbFilePath = bbFilePath == null ? null : bbFilePath.trim();
    }

    public String getBbIsDeleted() {
        return bbIsDeleted;
    }

    public void setBbIsDeleted(String bbIsDeleted) {
        this.bbIsDeleted = bbIsDeleted == null ? null : bbIsDeleted.trim();
    }

    public Date getBbSendTime() {
        return bbSendTime;
    }

    public void setBbSendTime(Date bbSendTime) {
        this.bbSendTime = bbSendTime;
    }

    public String getBbSendState() {
        return bbSendState;
    }

    public void setBbSendState(String bbSendState) {
        this.bbSendState = bbSendState == null ? null : bbSendState.trim();
    }

    public String getBbCommerceCollectFlag() {
        return bbCommerceCollectFlag;
    }

    public void setBbCommerceCollectFlag(String bbCommerceCollectFlag) {
        this.bbCommerceCollectFlag = bbCommerceCollectFlag == null ? null : bbCommerceCollectFlag.trim();
    }

    public String getBbIndustryCollectFlag() {
        return bbIndustryCollectFlag;
    }

    public void setBbIndustryCollectFlag(String bbIndustryCollectFlag) {
        this.bbIndustryCollectFlag = bbIndustryCollectFlag == null ? null : bbIndustryCollectFlag.trim();
    }

    public String getBbCommerceCode() {
        return bbCommerceCode;
    }

    public void setBbCommerceCode(String bbCommerceCode) {
        this.bbCommerceCode = bbCommerceCode == null ? null : bbCommerceCode.trim();
    }

    public String getBbNoscanFlag() {
        return bbNoscanFlag;
    }

    public void setBbNoscanFlag(String bbNoscanFlag) {
        this.bbNoscanFlag = bbNoscanFlag == null ? null : bbNoscanFlag.trim();
    }

    public String getBbDischargePortSn() {
        return bbDischargePortSn;
    }

    public void setBbDischargePortSn(String bbDischargePortSn) {
        this.bbDischargePortSn = bbDischargePortSn == null ? null : bbDischargePortSn.trim();
    }

    public String getBbDischargePortName() {
        return bbDischargePortName;
    }

    public void setBbDischargePortName(String bbDischargePortName) {
        this.bbDischargePortName = bbDischargePortName == null ? null : bbDischargePortName.trim();
    }

    public String getBbContactNo() {
        return bbContactNo;
    }

    public void setBbContactNo(String bbContactNo) {
        this.bbContactNo = bbContactNo == null ? null : bbContactNo.trim();
    }

    public String getBbRelateContractNo() {
        return bbRelateContractNo;
    }

    public void setBbRelateContractNo(String bbRelateContractNo) {
        this.bbRelateContractNo = bbRelateContractNo == null ? null : bbRelateContractNo.trim();
    }

    public String getBbReason() {
        return bbReason;
    }

    public void setBbReason(String bbReason) {
        this.bbReason = bbReason == null ? null : bbReason.trim();
    }

    public String getBbGroupSign() {
        return bbGroupSign;
    }

    public void setBbGroupSign(String bbGroupSign) {
        this.bbGroupSign = bbGroupSign == null ? null : bbGroupSign.trim();
    }

    public String getBbSrc() {
        return bbSrc;
    }

    public void setBbSrc(String bbSrc) {
        this.bbSrc = bbSrc == null ? null : bbSrc.trim();
    }

    public String getBbInputCode() {
        return bbInputCode;
    }

    public void setBbInputCode(String bbInputCode) {
        this.bbInputCode = bbInputCode == null ? null : bbInputCode.trim();
    }

    public String getBbSrcWhCode() {
        return bbSrcWhCode;
    }

    public void setBbSrcWhCode(String bbSrcWhCode) {
        this.bbSrcWhCode = bbSrcWhCode == null ? null : bbSrcWhCode.trim();
    }

    public String getBbExt1() {
        return bbExt1;
    }

    public void setBbExt1(String bbExt1) {
        this.bbExt1 = bbExt1 == null ? null : bbExt1.trim();
    }

    public String getBbExt2() {
        return bbExt2;
    }

    public void setBbExt2(String bbExt2) {
        this.bbExt2 = bbExt2 == null ? null : bbExt2.trim();
    }

    public String getBbNumSyncFlag() {
        return bbNumSyncFlag;
    }

    public void setBbNumSyncFlag(String bbNumSyncFlag) {
        this.bbNumSyncFlag = bbNumSyncFlag == null ? null : bbNumSyncFlag.trim();
    }

    public String getBbSumSyncFlag() {
        return bbSumSyncFlag;
    }

    public void setBbSumSyncFlag(String bbSumSyncFlag) {
        this.bbSumSyncFlag = bbSumSyncFlag == null ? null : bbSumSyncFlag.trim();
    }

    public String getBbBarSyncFlag() {
        return bbBarSyncFlag;
    }

    public void setBbBarSyncFlag(String bbBarSyncFlag) {
        this.bbBarSyncFlag = bbBarSyncFlag == null ? null : bbBarSyncFlag.trim();
    }

    public String getBbBarNosyncReason() {
        return bbBarNosyncReason;
    }

    public void setBbBarNosyncReason(String bbBarNosyncReason) {
        this.bbBarNosyncReason = bbBarNosyncReason == null ? null : bbBarNosyncReason.trim();
    }

    public String getBbDriver() {
        return bbDriver;
    }

    public void setBbDriver(String bbDriver) {
        this.bbDriver = bbDriver == null ? null : bbDriver.trim();
    }

    public String getBbDriverPhone() {
        return bbDriverPhone;
    }

    public void setBbDriverPhone(String bbDriverPhone) {
        this.bbDriverPhone = bbDriverPhone == null ? null : bbDriverPhone.trim();
    }

    public String getBbWmsUuid() {
        return bbWmsUuid;
    }

    public void setBbWmsUuid(String bbWmsUuid) {
        this.bbWmsUuid = bbWmsUuid == null ? null : bbWmsUuid.trim();
    }

    public String getBbHzFlag() {
        return bbHzFlag;
    }

    public void setBbHzFlag(String bbHzFlag) {
        this.bbHzFlag = bbHzFlag == null ? null : bbHzFlag.trim();
    }

    public String getBbPermId() {
        return bbPermId;
    }

    public void setBbPermId(String bbPermId) {
        this.bbPermId = bbPermId == null ? null : bbPermId.trim();
    }

    public Date getBbHzTime() {
        return bbHzTime;
    }

    public void setBbHzTime(Date bbHzTime) {
        this.bbHzTime = bbHzTime;
    }

    public String getBbIsRetainedFlag() {
        return bbIsRetainedFlag;
    }

    public void setBbIsRetainedFlag(String bbIsRetainedFlag) {
        this.bbIsRetainedFlag = bbIsRetainedFlag == null ? null : bbIsRetainedFlag.trim();
    }

    public String getBbMemo() {
        return bbMemo;
    }

    public void setBbMemo(String bbMemo) {
        this.bbMemo = bbMemo == null ? null : bbMemo.trim();
    }

    public Date getBbCqTime() {
        return bbCqTime;
    }

    public void setBbCqTime(Date bbCqTime) {
        this.bbCqTime = bbCqTime;
    }

    public String getBbCqpcIp() {
        return bbCqpcIp;
    }

    public void setBbCqpcIp(String bbCqpcIp) {
        this.bbCqpcIp = bbCqpcIp == null ? null : bbCqpcIp.trim();
    }

    public String getBbHzpcIp() {
        return bbHzpcIp;
    }

    public void setBbHzpcIp(String bbHzpcIp) {
        this.bbHzpcIp = bbHzpcIp == null ? null : bbHzpcIp.trim();
    }

    public String getBbCqFlag() {
        return bbCqFlag;
    }

    public void setBbCqFlag(String bbCqFlag) {
        this.bbCqFlag = bbCqFlag == null ? null : bbCqFlag.trim();
    }

    public String getBbBackWarehourceFlag() {
        return bbBackWarehourceFlag;
    }

    public void setBbBackWarehourceFlag(String bbBackWarehourceFlag) {
        this.bbBackWarehourceFlag = bbBackWarehourceFlag == null ? null : bbBackWarehourceFlag.trim();
    }

    public Date getBbBackWarehourceTime() {
        return bbBackWarehourceTime;
    }

    public void setBbBackWarehourceTime(Date bbBackWarehourceTime) {
        this.bbBackWarehourceTime = bbBackWarehourceTime;
    }

    public String getBbBackupFlag() {
        return bbBackupFlag;
    }

    public void setBbBackupFlag(String bbBackupFlag) {
        this.bbBackupFlag = bbBackupFlag == null ? null : bbBackupFlag.trim();
    }

    public Date getBbBackupTime() {
        return bbBackupTime;
    }

    public void setBbBackupTime(Date bbBackupTime) {
        this.bbBackupTime = bbBackupTime;
    }

    public String getBbSendBmFlag() {
        return bbSendBmFlag;
    }

    public void setBbSendBmFlag(String bbSendBmFlag) {
        this.bbSendBmFlag = bbSendBmFlag == null ? null : bbSendBmFlag.trim();
    }

    public Date getBbSendBmTime() {
        return bbSendBmTime;
    }

    public void setBbSendBmTime(Date bbSendBmTime) {
        this.bbSendBmTime = bbSendBmTime;
    }

    public String getBbOrderMark() {
        return bbOrderMark;
    }

    public void setBbOrderMark(String bbOrderMark) {
        this.bbOrderMark = bbOrderMark == null ? null : bbOrderMark.trim();
    }

    public String getBbPrintFlag() {
        return bbPrintFlag;
    }

    public void setBbPrintFlag(String bbPrintFlag) {
        this.bbPrintFlag = bbPrintFlag == null ? null : bbPrintFlag.trim();
    }

    public Date getBbPrintTime() {
        return bbPrintTime;
    }

    public void setBbPrintTime(Date bbPrintTime) {
        this.bbPrintTime = bbPrintTime;
    }

    public String getBbUpdateServerStateFlag() {
        return bbUpdateServerStateFlag;
    }

    public void setBbUpdateServerStateFlag(String bbUpdateServerStateFlag) {
        this.bbUpdateServerStateFlag = bbUpdateServerStateFlag == null ? null : bbUpdateServerStateFlag.trim();
    }

    public String getBbBillMonitorStatus() {
        return bbBillMonitorStatus;
    }

    public void setBbBillMonitorStatus(String bbBillMonitorStatus) {
        this.bbBillMonitorStatus = bbBillMonitorStatus == null ? null : bbBillMonitorStatus.trim();
    }

    public String getBbStandardTimeType() {
        return bbStandardTimeType;
    }

    public void setBbStandardTimeType(String bbStandardTimeType) {
        this.bbStandardTimeType = bbStandardTimeType == null ? null : bbStandardTimeType.trim();
    }

    public Date getBbStandardTime() {
        return bbStandardTime;
    }

    public void setBbStandardTime(Date bbStandardTime) {
        this.bbStandardTime = bbStandardTime;
    }

    public Date getBbLocalTime() {
        return bbLocalTime;
    }

    public void setBbLocalTime(Date bbLocalTime) {
        this.bbLocalTime = bbLocalTime;
    }
}