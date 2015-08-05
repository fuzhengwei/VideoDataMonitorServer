package com.icss.vdms.webservice.scan.service;

import com.icss.vdms.scan.service.ScanService;
import com.icss.vdms.util.spring.ApplicationContextHelper;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanAgreement;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanFeedBack;

public class InsideScanService {

	private ScanService scanService;
	
	public InsideScanService(){
		
		try {
			// 构造注入
			this.scanService = ApplicationContextHelper.getBean("scanService", ScanService.class);
		} catch (Exception e) {
		}
	}
	
	/**
	 * 件烟扫描信息（除RFID设备扫描的）
	 * doScanBarcodeResult
	 * @param msg
	 */
	public VedioMonitorMsgScanFeedBack doScanBarcodeResult(VedioMonitorMsgScanAgreement msg) throws Exception{
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			
			// 插入条码[插入前判断重复]
			int InsertBarcodeInfoListCount = scanService.doInsertBarcodeInfoList(msg.getsBarcodeList());
			
			// 更新单据
			int UpdateBillBaseByScanBarcodeResultCount = scanService.doUpdateBillBaseByScanBarcodeResult(msg.getsBillBase());
			
			// 更新单据明细
			int UpdateBillDetailByScanBarcodeResultCount = scanService.doUpdateBillDetailByScanBarcodeResult(msg.getsBillDetialList().get(0));
			
			// 添加日志
			feedBack.setMessage("ScanBarcodeResult is ok from vdms："+"InsertBarcodeInfoListCount "+InsertBarcodeInfoListCount+",UpdateBillBaseByScanBarcodeResultCount "+UpdateBillBaseByScanBarcodeResultCount + "UpdateBillDetailByScanBarcodeResultCount "+UpdateBillDetailByScanBarcodeResultCount);
			
		} catch (Exception e) {
			feedBack.setMessage("ScanBarcodeResult is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		return feedBack;
	}
	
	/**
	 * 删除条码
	 * 单据更新，单据明细更新
	 * doDeleteBarcode
	 * @param msg
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doDeleteBarcode(VedioMonitorMsgScanAgreement msg) throws Exception{
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			//删除条码
			int DeleteBarcodeInfoByBarcodeCount = scanService.doDeleteBarcodeInfoByBarcodeList(msg.getsBarcodeList());
			
			// 更新单据
			int UpdateBillBaseByScanBarcodeResultCount = scanService.doUpdateBillBaseByScanBarcodeResult(msg.getsBillBase());
			
			// 更新单据明细
			int UpdateBillDetailByScanBarcodeResultCount = scanService.doUpdateBillDetailByScanBarcodeResult(msg.getsBillDetialList().get(0));
			
			// 添加日志
			feedBack.setMessage("ScanBarcodeResult is ok from vdms："+"DeleteBarcodeInfoByBarcodeCount "+DeleteBarcodeInfoByBarcodeCount+",UpdateBillBaseByScanBarcodeResultCount "+UpdateBillBaseByScanBarcodeResultCount + "UpdateBillDetailByScanBarcodeResultCount "+UpdateBillDetailByScanBarcodeResultCount);

			
		} catch (Exception e) {
			feedBack.setMessage("DeleteBarcode is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
		
	}

	/**
	 * 单据创建信息
	 * BillCreate
	 * @param msgScanAgreement
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doBillCreate(VedioMonitorMsgScanAgreement msg) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			// true已经存在 false不存在
			if(!scanService.doSelectIsExitBillBaseByUuid(msg.getsBillBase())){
				// 存入单据信息
				int BillBaseSuccessCount = scanService.doInsertBillBase(msg.getsBillBase());
				// 存入明细信息
				int BillDetailSuccessCount = scanService.doInsertBillDetailList(msg.getsBillDetialList());
				// 添加日志
				feedBack.setMessage("BillCreate is ok from vdms："+"BillBaseSuccessCount "+BillBaseSuccessCount+",BillDetailSuccessCount "+BillDetailSuccessCount);
			}else{
				// 添加日志
				feedBack.setMessage("BillCreate is ok from vdms："+"BillBaseSuccessCount 1"+",BillDetailSuccessCount "+msg.getsBillDetialList().size());
			}
		} catch (Exception e) {
			feedBack.setMessage("BillCreate is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}

	/**
	 * 单据修改
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doBillModify(
			VedioMonitorMsgScanAgreement msg) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			// 根据UUID修改单据
			int updateBillBaseCount = scanService.doUpdateBillBaseByUUID(msg.getsBillBase());
			int billDetailSuccessCount = 0;
			/* 验证单据修改
			 * 1、如果单据明细数量超过1时，则删除原有数据库 中单据明细信息
			 * 2、如果单据明细数量不超过1，则修改原有数据库中单据明细信息
			 */
			if(msg.getsBillDetialList().size() > 1){
				//先删除
				scanService.doDeleteBillDetailByUUID(msg.getsBillBase().getBbUuid());
				//再新增
				//存入明细信息
			    billDetailSuccessCount = scanService.doInsertBillDetailList(msg.getsBillDetialList());
			}else{
				//存在则修改
				billDetailSuccessCount = scanService.doUpdateBillDetailByBdBbUuid(msg.getsBillDetialList().get(0));
			}
			
			feedBack.setMessage("BillModify is ok from vdms："+"updateBillBaseCount "+updateBillBaseCount+" billDetailSuccessCount "+billDetailSuccessCount);
			
		} catch (Exception e) {
			feedBack.setMessage("BillModify is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		
		return feedBack;
	}

	/**
	 * 单据删除信息
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doBillDelete(
			VedioMonitorMsgScanAgreement msgScanAgreement) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			// 删除单据，逻辑删除，修改状态
			int doBillDeleteCount = scanService.updateBillBaseByUuidUseToDelete(msgScanAgreement.getsBillBase());
			
			feedBack.setMessage("BillDelete is ok from vdms："+"doBillDeleteCount "+doBillDeleteCount);
			
		} catch (Exception e) {
			feedBack.setMessage("BillDelete is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}

	/**
	 * 单据启动信息
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doBillState(
			VedioMonitorMsgScanAgreement msgScanAgreement) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			
			int doBillStateCount = scanService.updateBillBaseStateByUuid(msgScanAgreement.getsBillBase());
			// 此单据不存在在数据库中
			if(0 == doBillStateCount){
				// 存入单据信息
				int BillBaseSuccessCount = scanService.doInsertBillBase(msgScanAgreement.getsBillBase());
				// 存入明细信息
				int BillDetailSuccessCount = scanService.doInsertBillDetailList(msgScanAgreement.getsBillDetialList());
				feedBack.setMessage("BillState is ok from vdms："+"BillBaseSuccessCount  "+BillBaseSuccessCount+" BillDetailSuccessCount "+BillDetailSuccessCount);
			}else{
				feedBack.setMessage("BillState is ok from vdms："+"doBillStateCount "+doBillStateCount);
			}
			
		} catch (Exception e) {
			
			feedBack.setMessage("BillState is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}

	
	/**
	 * 单据确认信息
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doBillConfirm(
			VedioMonitorMsgScanAgreement msgScanAgreement) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			int doBillConfirmCount = scanService.updateBillBaseStateByUuidUseToBillConfirm(msgScanAgreement.getsBillBase());
			feedBack.setMessage("BillConfirm is ok from vdms："+"doBillConfirmCount "+doBillConfirmCount);
		} catch (Exception e) {
			feedBack.setMessage("BillConfirm is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}

	/**
	 * 托盘信息 
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doPalletInfo(
			VedioMonitorMsgScanAgreement msg) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			
			// 更新单据[如果更新单据为0则直接反馈异常]
			int UpdateBillBaseByScanBarcodeResultCount = scanService.doUpdateBillBaseByScanBarcodeResult(msg.getsBillBase());
			
			// 更新单据明细
			int UpdateBillDetailByScanBarcodeResultCount = scanService.doUpdateBillDetailByScanBarcodeResult(msg.getsBillDetialList().get(0));
			
			// 插入条码[插入前判断重复]
			int InsertBarcodeInfoListCount = scanService.doInsertBarcodeInfoList(msg.getsBarcodeList());

			// 新增托盘
			int InsertSelectivePalletInfoCount = scanService.doInsertSelectivePalletInfo(msg.getsPalletInfo());
			
			// 添加日志
			feedBack.setMessage("PalletInfo is ok from vdms："+",UpdateBillBaseByScanBarcodeResultCount "+UpdateBillBaseByScanBarcodeResultCount + "UpdateBillDetailByScanBarcodeResultCount "+UpdateBillDetailByScanBarcodeResultCount+"InsertBarcodeInfoListCount "+InsertBarcodeInfoListCount+"InsertSelectivePalletInfoCount "+InsertSelectivePalletInfoCount);

		} catch (Exception e) {
			feedBack.setMessage("PalletInfo is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}

	/**
	 * 删除托盘信息
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doDeletePalletInfo(
			VedioMonitorMsgScanAgreement msg) throws Exception {

		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			// 删除条码
			int DeleteBarcodeInfoByBarcodeCount = scanService.doDeleteBarcodeInfoByPalletCode(msg.getsPalletInfo());

			// 删除托盘
			int DeletePalletInfoBypiPalletIdCount = scanService.doDeletePalletInfoBypiPalletId(msg.getsPalletInfo());
			
			// 添加日志
			feedBack.setMessage("DeletePalletInfo is ok from vdms："+"DeleteBarcodeInfoByBarcodeCount "+DeleteBarcodeInfoByBarcodeCount+"DeletePalletInfoBypiPalletIdCount "+DeletePalletInfoBypiPalletIdCount);
			
		} catch (Exception e) {
			feedBack.setMessage("DeletePalletInfo is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}

	/**
	 * 清除单据附带下所有条码[视频监控效率提升新增]
	 * ClearBillInfo
	 * 
	 * @param msgScanAgreement
	 * @return
	 * @throws Exception 
	 */
	public VedioMonitorMsgScanFeedBack doClearBillInfo(
			VedioMonitorMsgScanAgreement msgScanAgreement) throws Exception {
		
		VedioMonitorMsgScanFeedBack feedBack = new VedioMonitorMsgScanFeedBack(true);
		
		try {
			
			// 清除单据下所对应的条码
			int doDeleteBarcodeByBillUuidCount = scanService.doDeleteBarcodeByBillUuid(msgScanAgreement.getsBillBase().getBbUuid());
			
			// 删除托盘信息
			int doDeletePalletInfoByBillUuidCount = scanService.doDeletePalletInfoByBillUuid(msgScanAgreement.getsBillBase().getBbUuid());
			
			// 添加日志
			feedBack.setMessage("ClearBillInfo is ok from vdms："+",doDeleteBarcodeByBillUuidCount "+doDeleteBarcodeByBillUuidCount + " doDeletePalletInfoByBillUuidCount "+doDeletePalletInfoByBillUuidCount+"DeletePalletInfoBypiPalletIdCount "+doDeletePalletInfoByBillUuidCount);

		} catch (Exception e) {
			feedBack.setMessage("ClearBillInfo is error from vdms："+e.getMessage());
			feedBack.setState(false);
			
			throw e;
		}
		
		return feedBack;
	}
	
}
