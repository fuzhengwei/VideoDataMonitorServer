package com.icss.vdms.bp.dao;

import com.icss.vdms.bp.bean.BPOrderBarcodeBean;

public interface BPOrderBarcodeDao {


    int deleteByPrimaryKey(Long obId);

    int insert(BPOrderBarcodeBean record);

    int insertSelective(BPOrderBarcodeBean record);

    BPOrderBarcodeBean selectByPrimaryKey(Long obId);

    int updateByPrimaryKeySelective(BPOrderBarcodeBean record);

    int updateByPrimaryKey(BPOrderBarcodeBean record);
}