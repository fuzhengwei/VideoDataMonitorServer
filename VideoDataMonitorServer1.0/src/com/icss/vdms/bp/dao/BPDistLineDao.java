package com.icss.vdms.bp.dao;

import com.icss.vdms.bp.bean.BPDistLineBean;

public interface BPDistLineDao {

	
    int deleteByPrimaryKey(Long dlId);

    int insert(BPDistLineBean record);

    int insertSelective(BPDistLineBean record);

    BPDistLineBean selectByPrimaryKey(Long dlId);

    int updateByPrimaryKeySelective(BPDistLineBean record);

    int updateByPrimaryKey(BPDistLineBean record);
}