package com.icss.vdms.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.pp.dao.DsaPPDao;
import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaPPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaPPInfoBean;

@Service("dsaPPService")
public class DsaPPService {

	
	private DsaPPDao dsaPPDao;

	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param searchEndTime
	 * @return
	 */
	public List<DsaPPInfoBean> doSelectDsaPPInfoList(String searchEndTime){
		return dsaPPDao.selectDsaPPInfoList(searchEndTime);
	}
	
	/**
	 * 汇总工业打码指定打码机指定时间内打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	public List<DsaPPDetailBean> doSelectDsaPPDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement){
		return dsaPPDao.selectDsaPPDetailList(dsaSearchMsgAgreement);
	}
	
	
	public DsaPPDao getDsaPPDao() {
		return dsaPPDao;
	}

	@Autowired
	public void setDsaPPDao(DsaPPDao dsaPPDao) {
		this.dsaPPDao = dsaPPDao;
	}
	
	
	
	
}
