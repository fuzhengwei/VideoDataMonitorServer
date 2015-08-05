package com.icss.vdms.scan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.scan.dao.DsaScanDao;
import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaScanDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaScanInfoBean;

@Service("dsaScanService")
public class DsaScanService {

	
	private DsaScanDao dsaScanDao;

	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param searchEndTime
	 * @return
	 * @throws Exception
	 */
	public List<DsaScanInfoBean> doSelectDsaScanInfoList(String searchEndTime) throws Exception{
		return dsaScanDao.selectDsaScanInfoList(searchEndTime);
	}
	
	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 * @throws Exception
	 */
	public List<DsaScanDetailBean> doSelectDsaScanDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement) throws Exception{
		return dsaScanDao.selectDsaScanDetailList(dsaSearchMsgAgreement);
	}
	
	public DsaScanDao getDsaScanDao() {
		return dsaScanDao;
	}

	@Autowired
	public void setDsaScanDao(DsaScanDao dsaScanDao) {
		this.dsaScanDao = dsaScanDao;
	}
	
	
}
