package com.icss.vdms.pp.dao;

import java.util.List;

import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaPPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaPPInfoBean;

public interface DsaPPDao {

	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param searchEndTime
	 * @return
	 */
	public List<DsaPPInfoBean> selectDsaPPInfoList(String searchEndTime);
	
	/**
	 * 汇总工业打码指定打码机指定时间内打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	public List<DsaPPDetailBean> selectDsaPPDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement);
	
}
