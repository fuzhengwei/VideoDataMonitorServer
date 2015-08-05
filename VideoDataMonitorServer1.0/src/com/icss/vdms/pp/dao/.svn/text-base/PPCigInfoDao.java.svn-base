package com.icss.vdms.pp.dao;

import com.icss.vdms.pp.bean.PPCigInfoBean;

public interface PPCigInfoDao {
	
    int deleteByPrimaryKey(Long id);

    int insertSelective(PPCigInfoBean record);

    PPCigInfoBean selectByPrimaryKey(Long id);

    /**
     * 根据打码机ID与客户端唯一标识查询是否存在
     * @param record
     * @return
     */
    int selectCigInfoCountByPpidAndPrintId(PPCigInfoBean record);
    
    /**
     * 更新码【计划结转后更新】
     * @param record
     * @return
     */
    int updateBalUUIDByPPId(PPCigInfoBean record);
    
    /**
     * 更新打码状态 [打码机ID，客户端唯一自动生成id]
     * @param record
     * @return
     */
    int updatePrintStatusByPPIdAndPrinterId(PPCigInfoBean record);
    
    /**
     * 更新回送状态 [打码机ID，客户端唯一自动生成id]
     * @param record
     * @return
     */
    int updateSendbackflagByPPIdAndPrinterId(PPCigInfoBean record);
    
    int updateByPrimaryKeySelective(PPCigInfoBean record);

    int updateByPrimaryKey(PPCigInfoBean record);
}