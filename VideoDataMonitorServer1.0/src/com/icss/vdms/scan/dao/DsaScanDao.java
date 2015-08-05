package com.icss.vdms.scan.dao;

import java.util.List;

import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaScanDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaScanInfoBean;

public interface DsaScanDao {

	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param searchEndTime
	 * @return
	 */
	public List<DsaScanInfoBean> selectDsaScanInfoList(String searchEndTime);
	
	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	public List<DsaScanDetailBean> selectDsaScanDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement);
	
}
