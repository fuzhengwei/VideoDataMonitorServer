package com.icss.vdms.webservice.scan.insidewebservice.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.xfire.transport.http.XFireServletController;

import com.icss.vdms.util.log.LogBean;
import com.icss.vdms.webservice.scan.control.InsideWebServiceScanHandleControl;
import com.icss.vdms.webservice.scan.insidewebservice.IScanDataService;

public class ScanDataService implements IScanDataService {

	// 日志
	private Logger log = Logger.getLogger("SCAN");
	// 日志bean
	private LogBean logBean = new LogBean();
	
	private InsideWebServiceScanHandleControl scanHandleControl;
	// 客户机IP
	private String clientIp;
	
	public ScanDataService(){
		
		try {
			HttpServletRequest request = XFireServletController.getRequest();
			clientIp = request.getRemoteAddr();
		} catch (Exception e) {
		}
		
		scanHandleControl = new InsideWebServiceScanHandleControl();
	
		logBean.setOperation("扫描客户端链接:"+clientIp);
		logBean.setImpClass("ScanDataService");
		logBean.setImpMethod("构造函数");
		logBean.setOperationResults("Xfire WebService 链接完成");
		
		log.info(logBean);
	}
	
	public String WMSBillService(String strJson) {
		return scanHandleControl.doChannelReadInfo(strJson);
	}

}
