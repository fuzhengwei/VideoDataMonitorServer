package com.icss.vdms.bp.dao;

import com.icss.vdms.bp.bean.BPOrderInfoBean;
import com.icss.vdms.bp.bean.VOrderCodeStateBean;

public interface BPOrderInfoDao {
	
	int deleteByPrimaryKey(Long oiId);

	int insert(BPOrderInfoBean record);

	int insertSelective(BPOrderInfoBean record);

	BPOrderInfoBean selectByPrimaryKey(Long oiId);

	int updateOrderStateByUUID(VOrderCodeStateBean record);
	
	int updateByPrimaryKeySelective(BPOrderInfoBean record);

	int updateByPrimaryKey(BPOrderInfoBean record);

}