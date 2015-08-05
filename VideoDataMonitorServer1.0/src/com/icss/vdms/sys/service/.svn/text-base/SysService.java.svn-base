package com.icss.vdms.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.sys.bean.VdmsClientBean;
import com.icss.vdms.sys.bean.VdmsClientCameraBean;
import com.icss.vdms.sys.dao.VdmsClientCameraDao;
import com.icss.vdms.sys.dao.VdmsClientDao;

@Service("sysService")
public class SysService {

	// vdmsClientDao
	private VdmsClientDao vdmsClientDao;
	// vdmsClientCameraDao
	private VdmsClientCameraDao vdmsClientCameraDao;

	public VdmsClientBean doSelectByPrimaryKey(Long cId) {

		return vdmsClientDao.selectByPrimaryKey(cId);

	}

	/**
	 * 获取表数据总量
	 * 
	 * @return
	 */
	public int doSelectModelCount() {
		return vdmsClientDao.selectModelCount();
	}
	
	/**
	 * 根据UUID获取客户端视频编号
	 * @param ccUuid
	 * @return
	 */
	public List<VdmsClientCameraBean> doSelectClientCameraList(String ccUuid){
		return vdmsClientCameraDao.selectClientCameraByUUID(ccUuid);
	}
	
	/**
	 * 获取客户端注册列表
	 */
	public List<VdmsClientBean> doSelectModelList() {
		return vdmsClientDao.selectModelList();
	}
	
	/**
	 * 插入客户端信息
	 * @param vdmsClientBean
	 * @return
	 */
	public int doInsertClient(VdmsClientBean vdmsClientBean){
		return vdmsClientDao.insertClient(vdmsClientBean);
	}

	/**
	 * 插入客户端摄像头信息
	 * @param vdmsClientCameraBean
	 * @return
	 */
	public int doInsertClientCamera(VdmsClientCameraBean vdmsClientCameraBean){
		return vdmsClientCameraDao.insertClientCamera(vdmsClientCameraBean);
	}
	
	/**
	 * spring 自动注入DAO
	 * 
	 * @return
	 */
	public VdmsClientDao getVdmsClientDao() {
		return vdmsClientDao;
	}

	@Autowired
	public void setVdmsClientDao(VdmsClientDao vdmsClientDao) {
		this.vdmsClientDao = vdmsClientDao;
	}

	public VdmsClientCameraDao getVdmsClientCameraDao() {
		return vdmsClientCameraDao;
	}

	@Autowired
	public void setVdmsClientCameraDao(VdmsClientCameraDao vdmsClientCameraDao) {
		this.vdmsClientCameraDao = vdmsClientCameraDao;
	}

}
