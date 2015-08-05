package com.icss.vdms.sys.dao;

import java.util.List;

import com.icss.vdms.sys.bean.VdmsClientCameraBean;

public interface VdmsClientCameraDao {


    int deleteByPrimaryKey(Long ccId);
    
    int insertSelective(VdmsClientCameraBean vdmsClientCameraBean);
    
    int insertClientCamera(VdmsClientCameraBean vdmsClientCameraBean);

    List<VdmsClientCameraBean> selectClientCameraByUUID(String ccUuid);

    int updateByPrimaryKeySelective(VdmsClientCameraBean record);

    int updateByPrimaryKey(VdmsClientCameraBean record);
}