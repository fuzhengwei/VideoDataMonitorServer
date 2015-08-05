package com.icss.vdms.scan.dao;

import com.icss.vdms.scan.bean.SPalletInfoBean;

public interface SPalletInfoDao {
    int deleteByPrimaryKey(Long piId);

    /**
     * 根据单据uuid删除对应
     * @param piBillUuid
     * @return
     */
    int deletePalletInfoByBillUuid(String piBillUuid);
    
    int deletePalletInfoBypiPalletId(String piPalletId);
    
    int deleteBarcodeInfoByPalletCode(SPalletInfoBean record);
    
    int insert(SPalletInfoBean record);

    int insertSelective(SPalletInfoBean record);

    SPalletInfoBean selectByPrimaryKey(Long piId);

    int updateByPrimaryKeySelective(SPalletInfoBean record);

    int updateByPrimaryKey(SPalletInfoBean record);
}