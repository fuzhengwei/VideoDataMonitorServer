package com.icss.vdms.scan.dao;

import com.icss.vdms.scan.bean.SBillDetailBean;

public interface SBillDetailDao {
    int deleteByPrimaryKey(Long bdId);

    int insert(SBillDetailBean record);

    int insertSelective(SBillDetailBean record);

    int selectBybdBbUuid(SBillDetailBean record);
    
    SBillDetailBean selectByPrimaryKey(Long bdId);

    int updateByPrimaryKeySelective(SBillDetailBean record);

    int updateByPrimaryKey(SBillDetailBean record);
    
    //根据单据UUID删除单据明细信息
    int deleteBillDetailByUUID(String bdBbUuid);
    
    //新增条码时修改单据明细 
    int updateBillDetailByScanBarcodeResult(SBillDetailBean record);
}