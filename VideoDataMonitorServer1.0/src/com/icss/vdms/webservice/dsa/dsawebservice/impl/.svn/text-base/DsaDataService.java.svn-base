package com.icss.vdms.webservice.dsa.dsawebservice.impl;

import com.icss.vdms.webservice.dsa.control.DsaWebServiceHandleControl;
import com.icss.vdms.webservice.dsa.dsawebservice.IDsaDataService;

public class DsaDataService implements IDsaDataService{

	private DsaWebServiceHandleControl dsaWebServiceHandleControl;
	
	public DsaDataService(){
		dsaWebServiceHandleControl = new DsaWebServiceHandleControl();
	}
	
	/**
	 * 商业扫描详情
	 * @param strJson
	 * @return
	 */
	public String DsaBScanDetail(String strJson) {
		return dsaWebServiceHandleControl.doChnnelRead_DsaBScanDetail(strJson);
	}

	/**
	 * 商业扫描基础
	 * @param strJson
	 * @return
	 */
	public String DsaBScanInfo(String strJson) {
		return dsaWebServiceHandleControl.doChnnelRead_DsaBScanInfo(strJson);
	}

	/**
	 * DsaPBDetail
	 * 商业打码详情
	 * @param strJson
	 * @return
	 */
	public String DsaBPDetail(String strJson) {
		return dsaWebServiceHandleControl.doChnnelRead_DsaBPDetail(strJson);
	}

	/**
	 * DsaPBInfo
	 * 商业打码基础
	 * @param strJson
	 * @return
	 */
	public String DsaBPInfo(String strJson) {
		return dsaWebServiceHandleControl.doChannelRead_DsaBPInfo(strJson);
	}

	/**
	 * 工业打码详情
	 * @param strJson
	 * @return
	 */
	public String DsaPPDetail(String strJson) {
		return dsaWebServiceHandleControl.doChnnelRead_DsaPPDetail(strJson);
	}

	/**
	 * 工业打码基础
	 * @param strJson
	 * @return
	 */
	public String DsaPPInfo(String strJson) {
		return dsaWebServiceHandleControl.doChannelRead_DsaPPInfo(strJson);
	}

	/**
	 * 工业扫描详情
	 * @param strJson
	 * @return
	 */
	public String DsaPScanDetail(String strJson) {
		return dsaWebServiceHandleControl.doChnnelRead_DsaPScanDetail(strJson);
	}

	/**
	 * 工业扫描基础
	 * @param strJson
	 * @return
	 */
	public String DsaPScanInfo(String strJson) {
		return dsaWebServiceHandleControl.doChnnelRead_DsaPScanInfo(strJson);
	}

}
