package com.icss.vdms.scan.dao;

import com.icss.vdms.scan.bean.SBillBaseBean;

public interface SBillBaseDao {
    int deleteByPrimaryKey(Long bbId);

    int insert(SBillBaseBean record);

    int insertSelective(SBillBaseBean record);

    SBillBaseBean selectByPrimaryKey(Long bbId);

    int updateByPrimaryKeySelective(SBillBaseBean record);

    int updateByPrimaryKey(SBillBaseBean record);
    
    // 根据单据UUID查询单据是否存在
    int selectIsExitBillBaseByUuid(SBillBaseBean record);
    
    //删除单据，逻辑删除，状态修改IS_DELETE
    int updateBillBaseByUuidUseToDelete(SBillBaseBean record);
    
    //单据启动，状态修改BB_STATE
    int updateBillBaseStateByUuidUseToBillStart(SBillBaseBean record);
    
    //单据确认信息，状态修改BB_STATE
    int updateBillBaseStateByUuidUseToBillConfirm(SBillBaseBean record);
    
    //在新增条码时修改单据变化字段
    int updateBillBaseByScanBarcodeResult(SBillBaseBean record);
}