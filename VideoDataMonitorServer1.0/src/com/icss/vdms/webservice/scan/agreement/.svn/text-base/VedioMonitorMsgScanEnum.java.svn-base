package com.icss.vdms.webservice.scan.agreement;

public enum VedioMonitorMsgScanEnum {

	/**
	 * 单据启动信息
	 */
	BillStart("BillStart",0),

	/**
	 * 单据确认信息
	 */
	BillConfirm("BillConfirm",1),

	/**
	 * 托盘信息 2015.01.23 limemg modify 将吉林长春使用的SendPalletInfo改回原来的PalletInfo
	 */
	PalletInfo("PalletInfo",2),

	/**
	 * 条码包信息
	 */
	PackInfo("PackInfo",3),

	/**
	 * 安徽模式WebService信息
	 */
	AnhuiWebService("AnhuiWebService",4),

	/**
	 * 单据创建信息
	 */
	BillCreate("BillCreate",5),

	/**
	 * 单据修改信息
	 */
	BillModify("BillModify",6),

	/**
	 * 单据删除信息
	 */
	BillDelete("BillDelete",7),

	/**
	 * 确认托盘信息发仓库
	 */
	ConfirmPalletInfo("ConfirmPalletInfo",8),

	/**
	 * 删除托盘信息
	 */
	DeletePalletInfo("DeletePalletInfo",9),

	/**
	 * 报警信息发送WMS
	 */
	SendScanAlertInfo("SendScanAlertInfo",10),

	/**
	 * 件烟扫描信息（除RFID设备扫描的）
	 */
	ScanBarcodeResult("ScanBarcodeResult",11),

	/**
	 * 删除件码
	 */
	DeleteBarcode("DeleteBarcode",12),

	/**
	 * 2012.2.16 yanglx add 湖北物权转移
	 */
	SendPalletResult("SendPalletResult",13),

	/**
	 * 扫描中信息
	 */
	BillScan("BillScan",14),

	/**
	 * 2012.7.2 yanglx add 销售出厂单据退库
	 */
	BillBack("BillBack",15),

	/**
	 * 吉林现场托盘到位信息,发送昆船使用
	 */
	SendPalletInfo("SendPalletInfo",16),

	/**
	 * 清除单据附带下所有条码[视频监控效率提升新增]
	 */
	ClearBillInfo("ClearBillInfo",17),
	
	/**
	 * 未知类型
	 */
	UNKnown("UNKnown",18);

	// 成员变量
    private String name;
    private int index;
    
    // 构造方法
    private VedioMonitorMsgScanEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    
    // 普通方法
    public static String getName(int index) {
        for (VedioMonitorMsgScanEnum c : VedioMonitorMsgScanEnum.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
