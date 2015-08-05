package com.icss.vdms.bp.dao;

import java.util.List;

import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaBPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaBPInfoBean;

/**
 * DSA 商业打码数据库操作
 * @author Administrator
 *
 */
public interface DsaBPDao {

	/**
	 * 汇总分拣线编号，分拣线名称，在截至时间内打码量
	 * @param searchEndTime
	 * @return
	 */
	List<DsaBPInfoBean> selectDsaBPInfoList(String searchEndTime);
	
	/**
	 * 汇总商业打码指定打码机指定时间内打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	List<DsaBPDetailBean> selectDsaBPDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement);
	
}
