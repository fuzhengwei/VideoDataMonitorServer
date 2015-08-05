package com.icss.vdms.scan.dao;

import com.icss.vdms.scan.bean.SBarcodeInfoBean;
import com.icss.vdms.scan.bean.SPalletInfoBean;

public interface SBarcodeInfoDao {
    int deleteByPrimaryKey(Long biId);

    /**
     * 根据单据UUID删除托盘信息 
     * @param biBillUuid
     * @return
     */
    int deleteBarcodeByBillUuid(String biBillUuid);
    
    int deleteBarcodeInfoByBarcode(String biBarcode);
    
    int insert(SBarcodeInfoBean record);

    int insertSelective(SBarcodeInfoBean record);

    int selectByBiBarcode(String biBarcode);
    
    SBarcodeInfoBean selectByPrimaryKey(Long biId);

    int updateByPrimaryKeySelective(SBarcodeInfoBean record);

    int updateByPrimaryKey(SBarcodeInfoBean record);
}