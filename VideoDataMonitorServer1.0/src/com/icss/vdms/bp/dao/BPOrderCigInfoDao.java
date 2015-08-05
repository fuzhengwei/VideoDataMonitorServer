package com.icss.vdms.bp.dao;

import com.icss.vdms.bp.bean.BPOrderCigInfoBean;

public interface BPOrderCigInfoDao {


    int deleteByPrimaryKey(Long ociId);

    int insert(BPOrderCigInfoBean record);

    int insertSelective(BPOrderCigInfoBean record);

    BPOrderCigInfoBean selectByPrimaryKey(Long ociId);

    int updateByPrimaryKeySelective(BPOrderCigInfoBean record);

    int updateByPrimaryKey(BPOrderCigInfoBean record);
}