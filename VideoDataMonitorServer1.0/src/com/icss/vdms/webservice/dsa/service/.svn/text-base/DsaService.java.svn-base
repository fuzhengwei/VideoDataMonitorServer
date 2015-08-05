package com.icss.vdms.webservice.dsa.service;

import java.util.List;

import com.icss.vdms.bp.service.DsaBPService;
import com.icss.vdms.pp.service.DsaPPService;
import com.icss.vdms.scan.service.DsaScanService;
import com.icss.vdms.util.spring.ApplicationContextHelper;
import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaBPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaBPInfoBean;
import com.icss.vdms.webservice.dsa.bean.DsaPPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaPPInfoBean;
import com.icss.vdms.webservice.dsa.bean.DsaScanDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaScanInfoBean;

public class DsaService {

	// 商业打码
	private DsaBPService bpService;
	
	// 工业打码
	private DsaPPService ppService;
	
	// 工商业扫描
	private DsaScanService scanService;
	
	public DsaService(){
		
		try {
			// 构造注入 商业打码
			this.bpService = ApplicationContextHelper.getBean("dsaBPService", DsaBPService.class);
			// 构造注入 工业打码
			this.ppService = ApplicationContextHelper.getBean("dsaPPService", DsaPPService.class);
			// 构造注入工商业扫描
			this.scanService = ApplicationContextHelper.getBean("dsaScanService", DsaScanService.class);
			
		} catch (Exception e) {
		}
	}
	
	/**
	 * 汇总商业打码机信息
	 * @param searchEndTime
	 * @return
	 */
	public List<DsaBPInfoBean> doSelectDsaBPInfoList(String searchEndTime) throws Exception{
		return bpService.doSelectDsaBPInfoList(searchEndTime);
	}
	
	
	/**
	 * 汇总商业打码指定打码机指定时间内打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	public List<DsaBPDetailBean> doSelectDsaBPDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement){
		return bpService.doSelectDsaBPDetailList(dsaSearchMsgAgreement);
	}
	
	
	/**
	 * 汇总工业打码打码机信息以及打码量
	 * @param searchEndTime
	 * @return
	 */
	public List<DsaPPInfoBean> doSelectDsaPPInfoList(String searchEndTime) throws Exception{
		return ppService.doSelectDsaPPInfoList(searchEndTime);
	}
	
	/**
	 * 汇总工业打码指定打码机指定时间内打码量
	 * @param dsaSearchMsgAgreement
	 * @return
	 */
	public List<DsaPPDetailBean> doSelectDsaPPDetailList(DsaSearchMsgAgreement dsaSearchMsgAgreement) throws Exception{
		return ppService.doSelectDsaPPDetailList(dsaSearchMsgAgreement);
	}

	/**
	 * 工商业扫描详情
	 * @param dsaSearchaMsgAgreement
	 * @return
	 * @throws Exception 
	 */
	public List<DsaScanDetailBean> doSelectDsaScanDetailList(
			DsaSearchMsgAgreement dsaSearchaMsgAgreement) throws Exception {
		return scanService.doSelectDsaScanDetailList(dsaSearchaMsgAgreement);
	}

	/**
	 * 工商业扫描基础
	 * @param searchEndTime
	 * @return
	 * @throws Exception 
	 */
	public List<DsaScanInfoBean> doSelectDsaScanInfoList(String searchEndTime) throws Exception {
		return scanService.doSelectDsaScanInfoList(searchEndTime);
	}

	
}
