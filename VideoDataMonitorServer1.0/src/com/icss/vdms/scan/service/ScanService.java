package com.icss.vdms.scan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.scan.bean.SBarcodeInfoBean;
import com.icss.vdms.scan.bean.SBillBaseBean;
import com.icss.vdms.scan.bean.SBillDetailBean;
import com.icss.vdms.scan.bean.SPalletInfoBean;
import com.icss.vdms.scan.dao.SBarcodeInfoDao;
import com.icss.vdms.scan.dao.SBillBaseDao;
import com.icss.vdms.scan.dao.SBillDetailDao;
import com.icss.vdms.scan.dao.SPalletInfoDao;

@Service("scanService")
public class ScanService {

	// 扫描条码数据库操作
	private SBarcodeInfoDao sBarcodeInfoDao;

	// 单据数据库操作方法
	private SBillBaseDao sBillBaseDao;

	// 单据详情数据库操作方法
	private SBillDetailDao sBillDetailDao;

	// 托盘数据库操作方法
	private SPalletInfoDao sPalletInfoDao;
	
	/**
	 * 向数据库批量插入扫描条码
	 * 
	 * @param record
	 */
	public int doInsertBarcodeInfoList(List<SBarcodeInfoBean> sBarcodeList) throws Exception {
		int as = 0;
		for (SBarcodeInfoBean sBarcodeInfoBean : sBarcodeList) {
			as += sBarcodeInfoDao.insertSelective(sBarcodeInfoBean);
		}
		return as;
	}
	
	/**
	 * 删除条码集合
	 * @param sBarcodeList
	 * @return
	 */
	public int doDeleteBarcodeInfoByBarcodeList(List<SBarcodeInfoBean> sBarcodeList) throws Exception{
		int as = 0;
		for (SBarcodeInfoBean sBarcodeInfoBean : sBarcodeList) {
			as += sBarcodeInfoDao.deleteBarcodeInfoByBarcode(sBarcodeInfoBean.getBiBarcode());
		}
		return as;
	}

	/**
	 * 删除条码集合
	 * @param sPalletInfo
	 * @return
	 * @throws Exception
	 */
	public int doDeleteBarcodeInfoByPalletCode(SPalletInfoBean sPalletInfo) throws Exception{
		int as = 0;
		as = sPalletInfoDao.deleteBarcodeInfoByPalletCode(sPalletInfo);
		return as;
	}
	
	/**
	 * 根据单据UUID删除条码
	 * @param biBillUuid
	 * @return
	 */
	public int doDeleteBarcodeByBillUuid(String biBillUuid) throws Exception{
		int as = 0;
		as = sBarcodeInfoDao.deleteBarcodeByBillUuid(biBillUuid);
		return as;
	}
	
	/**
	 * 根据单据UUID删除托盘信息 
	 * @param piBillUuid
	 * @return
	 */
	public int doDeletePalletInfoByBillUuid(String piBillUuid) throws Exception{
		int as = 0;
		as = sPalletInfoDao.deletePalletInfoByBillUuid(piBillUuid);
		return as;
	}
	
	/**
	 * 插入单据集合
	 * 
	 * @param sBillBaseList
	 */
	public int doInsertBillBase(SBillBaseBean sBillBase) throws Exception {

		return sBillBaseDao.insertSelective(sBillBase);

	}
	
	/**
	 * 修改单据
	 * @param sBillBase
	 * @return
	 * @throws Exception
	 */
	public int doUpdateBillBaseByUUID(SBillBaseBean sBillBase) throws Exception{
		
		return sBillBaseDao.updateByPrimaryKeySelective(sBillBase);
		
	}
	
	/**
	 * 根据单据uuid查询单据是否存在
	 * @param record
	 * @return
	 * @throws Exception
	 */
	public boolean doSelectIsExitBillBaseByUuid(SBillBaseBean record) throws Exception{
		return sBillBaseDao.selectIsExitBillBaseByUuid(record) > 0;
	}
	
	/**
	 * 在新增条码时修改单据变化字段
	 * @return
	 */
	public int doUpdateBillBaseByScanBarcodeResult(SBillBaseBean sBillBase) throws Exception{
		return sBillBaseDao.updateBillBaseByScanBarcodeResult(sBillBase);
	}

	/**
	 * 插入单据明细集合
	 * 
	 * @param sBillDetailList
	 * @throws Exception
	 */
	public int doInsertBillDetailList(List<SBillDetailBean> sBillDetailList)
			throws Exception {
		int as = 0;
		for (SBillDetailBean sBillDetailBean : sBillDetailList) {
			as += sBillDetailDao.insertSelective(sBillDetailBean);
		}

		return as;

	}
	
	/**
	 * 插入单据明细
	 * @param sBillDetailBean
	 * @return
	 * @throws Exception
	 */
	public int doInsertBillDetail(SBillDetailBean sBillDetailBean) throws Exception{
		int as = 0;
		as = sBillDetailDao.insertSelective(sBillDetailBean);
		return as;
	}
	
	/**
	 * 删除单据明细
	 * @param record
	 * @return
	 * @throws Exception
	 */
	public int doDeleteBillDetailByUUID(String bdBbUuid) throws Exception{
		int as = 0;
		as = sBillDetailDao.deleteBillDetailByUUID(bdBbUuid);
		return as;
	}

	/**
	 * 修改单据明细
	 * @param sBillDetailBean
	 * @return
	 * @throws Exception
	 */
	public int doUpdateBillDetailByBdBbUuid(SBillDetailBean sBillDetailBean) throws Exception{
		int as = 0;
		as = sBillDetailDao.updateByPrimaryKeySelective(sBillDetailBean);
		return as;
	}
	
	/**
	 * 新增条码时修改单据明细 
	 * @param sBillDetailBean
	 * @return
	 * @throws Exception
	 */
	public int doUpdateBillDetailByScanBarcodeResult(SBillDetailBean sBillDetailBean) throws Exception{
		int as = 0;
		as = sBillDetailDao.updateBillDetailByScanBarcodeResult(sBillDetailBean);
		return as;
	}
	
	/**
	 * 删除单据，逻辑删除，状态修改IS_DELETE
	 * @param sBillBase
	 * @return
	 */
	public int updateBillBaseByUuidUseToDelete(SBillBaseBean sBillBase) throws Exception{
		int as = 0;
		as = sBillBaseDao.updateBillBaseByUuidUseToDelete(sBillBase);
		return as;
	}
	
	/**
	 * 启动单据，状态修改BB_STATE
	 * @param sBillBase
	 * @return
	 */
	public int updateBillBaseStateByUuid(SBillBaseBean sBillBase) throws Exception{
		int as = 0;
		as = sBillBaseDao.updateBillBaseStateByUuidUseToBillStart(sBillBase);
		return as;
	}
	
	/**
	 * 单据确认信息，状态修改BB_STATE
	 * @param sBillBase
	 * @return
	 */
	public int updateBillBaseStateByUuidUseToBillConfirm(SBillBaseBean sBillBase) throws Exception{
		int as = 0;
		as = sBillBaseDao.updateBillBaseStateByUuidUseToBillConfirm(sBillBase);
		return as;
	}
	
	/**
	 * 查询单据
	 * @param biBarcode
	 * @return
	 * @throws Exception
	 */
	public int doSelectBillDetailByBdBbUuid(SBillDetailBean record) throws Exception{
		
		return sBillDetailDao.selectBybdBbUuid(record);
	}
	
	/**
	 * 新增托盘信息
	 * @return
	 * @throws Exception
	 */
	public int doInsertSelectivePalletInfo(SPalletInfoBean sPalletInfo) throws Exception{
		int as = 0;
		as = sPalletInfoDao.insertSelective(sPalletInfo);
		return as;
	}

	/**
	 * 删除托盘信息
	 * @param sPalletInfo
	 * @return
	 * @throws Exception
	 */
	public int doDeletePalletInfoBypiPalletId(SPalletInfoBean sPalletInfo) throws Exception{
		int as = 0;
		as = sPalletInfoDao.deletePalletInfoBypiPalletId(sPalletInfo.getPiPalletId());
		return as;
	}
	
	public SBarcodeInfoDao getsBarcodeInfoDao() {
		return sBarcodeInfoDao;
	}

	@Autowired
	public void setsBarcodeInfoDao(SBarcodeInfoDao sBarcodeInfoDao) {
		this.sBarcodeInfoDao = sBarcodeInfoDao;
	}

	public SBillBaseDao getsBillBaseDao() {
		return sBillBaseDao;
	}

	@Autowired
	public void setsBillBaseDao(SBillBaseDao sBillBaseDao) {
		this.sBillBaseDao = sBillBaseDao;
	}

	public SBillDetailDao getsBillDetailDao() {
		return sBillDetailDao;
	}

	@Autowired
	public void setsBillDetailDao(SBillDetailDao sBillDetailDao) {
		this.sBillDetailDao = sBillDetailDao;
	}

	public SPalletInfoDao getsPalletInfoDao() {
		return sPalletInfoDao;
	}

	@Autowired
	public void setsPalletInfoDao(SPalletInfoDao sPalletInfoDao) {
		this.sPalletInfoDao = sPalletInfoDao;
	}

	
}
