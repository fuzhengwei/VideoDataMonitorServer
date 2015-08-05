package com.icss.vdms.sys.dao;

import java.util.List;

import com.icss.vdms.sys.bean.VdmsClientBean;

public interface VdmsClientDao {

	int deleteByPrimaryKey(Long cId);

    int insertSelective(VdmsClientBean record);

    int insertClient(VdmsClientBean vdmsClientBean);
    
    int selectModelCount();
    
    List<VdmsClientBean> selectModelList();
    
    VdmsClientBean selectByPrimaryKey(Long cId);

    int updateByPrimaryKeySelective(VdmsClientBean record);

    int updateByPrimaryKey(VdmsClientBean record);
}