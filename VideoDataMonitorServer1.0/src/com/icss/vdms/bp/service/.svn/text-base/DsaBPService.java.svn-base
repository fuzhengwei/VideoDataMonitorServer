package com.icss.vdms.bp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.bp.dao.DsaBPDao;
import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaBPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaBPInfoBean;

@Service("dsaBPService")
public class DsaBPService {

	// 商业打码数据库操作
	private DsaBPDao dsaBPDao;

	/**
	 * 汇总商业打码机信息
	 * @param searchEndTime
	 * @return
	 */
	public List<DsaBPInfoBean> doSelectDsaBPInfoList(String searchEndTime){
		return dsaBPDao.selectDsaBPInfoList(searchEndTime);
	}
	
	/**
	 * 汇总商业打码指定打码机指定时间内打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	public List<DsaBPDetailBean> doSelectDsaBPDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement){
		return dsaBPDao.selectDsaBPDetailList(dsaSearchMsgAgreement);
	}
	
	public DsaBPDao getDsaBPDao() {
		return dsaBPDao;
	}

	@Autowired
	public void setDsaBPDao(DsaBPDao dsaBPDao) {
		this.dsaBPDao = dsaBPDao;
	}
	
}
