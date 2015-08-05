package com.icss.vdms.webservice.dsa.control;

import java.util.List;

import org.apache.log4j.Logger;

import com.icss.vdms.util.json.MyJsonDsaUtil;
import com.icss.vdms.util.log.LogBean;
import com.icss.vdms.webservice.dsa.agreement.DsaMsgAgreement;
import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;
import com.icss.vdms.webservice.dsa.bean.DsaBPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaBPInfoBean;
import com.icss.vdms.webservice.dsa.bean.DsaPPDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaPPInfoBean;
import com.icss.vdms.webservice.dsa.bean.DsaScanDetailBean;
import com.icss.vdms.webservice.dsa.bean.DsaScanInfoBean;
import com.icss.vdms.webservice.dsa.service.DsaService;

/**
 * 
 * DSA WebService 消息控制类
 * 
 * @author Administrator
 * 
 */
public class DsaWebServiceHandleControl {

	// 日志
	private Logger log = Logger.getLogger("VDMS");
	// 日志bean
	private LogBean logBean = new LogBean();
	
	private DsaService dsaService;

	// 消息请求协议
	private DsaSearchMsgAgreement dsaSearchaMsgAgreement;

	public DsaWebServiceHandleControl() {
		dsaService = new DsaService();
	}

	/**
	 * DsaPBInfo 商业打码基础
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChannelRead_DsaBPInfo(String strJson) {

		String feedBackJson = "";

		if(log.isInfoEnabled()){
			logBean.setOperation("商业打码基础：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChannelRead_DsaBPInfo");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		try {
			// 1、JSON转对象
		    dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);

			// 2、获取数据
			List<DsaBPInfoBean> dsaBpInfoList = dsaService
					.doSelectDsaBPInfoList(dsaSearchaMsgAgreement.getSearchEndTime());

			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaBpInfoList(dsaBpInfoList);

			// 4、对象转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);

		} catch (Exception e) {
			feedBackJson = "";
			
			logBean.setOperation("商业打码基础：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChannelRead_DsaBPInfo");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
			
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("商业打码基础：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChannelRead_DsaBPInfo");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

	/**
	 * DsaPBDetail 商业打码详情
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChnnelRead_DsaBPDetail(String strJson) {

		if(log.isInfoEnabled()){
			logBean.setOperation("商业打码详情：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBPDetail");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";

		try {

			// 1、JSON转对象
			dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);

			// 2、获取数据
			List<DsaBPDetailBean> dsaBpDetailList = dsaService
					.doSelectDsaBPDetailList(dsaSearchaMsgAgreement);

			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaBpDetailList(dsaBpDetailList);

			// 4、对象转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);

		} catch (Exception e) {
			feedBackJson = "";
			
			logBean.setOperation("商业打码详情：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBPDetail");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("商业打码详情：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBPDetail");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

	/**
	 * 工业打码基础
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChannelRead_DsaPPInfo(String strJson) {
		
		if(log.isInfoEnabled()){
			logBean.setOperation("工业打码基础：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChannelRead_DsaPPInfo");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";
		try {

			// 1、JSON转对象
		    dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);

			// 2、获取数据
			List<DsaPPInfoBean> dsaPpInfoList = dsaService
					.doSelectDsaPPInfoList(dsaSearchaMsgAgreement.getSearchEndTime());

			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaPpInfoList(dsaPpInfoList);

			// 4、转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);

		} catch (Exception e) {
			feedBackJson = "";
			
			logBean.setOperation("工业打码基础：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChannelRead_DsaPPInfo");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("工业打码基础：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChannelRead_DsaPPInfo");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

	/**
	 * 工业打码详情
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChnnelRead_DsaPPDetail(String strJson) {

		if(log.isInfoEnabled()){
			logBean.setOperation("工业打码详情：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPPDetail");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";

		try {

			// 1、JSON转对象
			dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);

			// 2、获取数据
			List<DsaPPDetailBean> dsaPpDetailList = dsaService
					.doSelectDsaPPDetailList(dsaSearchaMsgAgreement);

			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaPpDetailList(dsaPpDetailList);

			// 4、转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);

		} catch (Exception e) {
			feedBackJson = "";
			
			logBean.setOperation("工业打码详情：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPPDetail");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("工业打码详情：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPPDetail");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

	/**
	 * 商业扫描详情
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChnnelRead_DsaBScanDetail(String strJson) {

		if(log.isInfoEnabled()){
			logBean.setOperation("商业扫描详情：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBScanDetail");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";

		try {
			// 1、JSON转对象
			 dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);
			
			// 2、获取数据
			List<DsaScanDetailBean> dsaScanDetailList = dsaService
			.doSelectDsaScanDetailList(dsaSearchaMsgAgreement);
			
			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaScanDetailList(dsaScanDetailList);
			
			// 4、转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);
			
		} catch (Exception e) {
			
			feedBackJson = "";
			
			logBean.setOperation("商业扫描详情：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBScanDetail");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("商业扫描详情：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBScanDetail");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

	/**
	 * 商业扫描基础
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChnnelRead_DsaBScanInfo(String strJson) {

		if(log.isInfoEnabled()){
			logBean.setOperation("商业扫描基础：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBScanInfo");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";

		try {
			// 1、JSON转对象
			 dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);
			
			// 2、获取数据
			List<DsaScanInfoBean> dsaScanInfoList = dsaService
			.doSelectDsaScanInfoList(dsaSearchaMsgAgreement.getSearchEndTime());
			
			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaScanInfoList(dsaScanInfoList);
			
			// 4、转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);
			
		} catch (Exception e) {
			
			feedBackJson = "";
			
			logBean.setOperation("商业扫描基础：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBScanInfo");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}
		
		if(log.isInfoEnabled()){
			logBean.setOperation("商业扫描基础：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaBScanInfo");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}

		return feedBackJson;
	}

	/**
	 * 工业扫描详情
	 * @param strJson
	 * @return
	 */
	public String doChnnelRead_DsaPScanDetail(String strJson) {
		
		if(log.isInfoEnabled()){
			logBean.setOperation("工业扫描详情：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPScanDetail");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";

		try {
			// 1、JSON转对象
			 dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);
			
			// 2、获取数据
			List<DsaScanDetailBean> dsaScanDetailList = dsaService
			.doSelectDsaScanDetailList(dsaSearchaMsgAgreement);
			
			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaScanDetailList(dsaScanDetailList);
			
			// 4、转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);

		} catch (Exception e) {
			
			feedBackJson = "";
			
			logBean.setOperation("工业扫描详情：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPScanDetail");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("工业扫描详情：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPScanDetail");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

	/**
	 * 工业扫描基础
	 * @param strJson
	 * @return
	 */
	public String doChnnelRead_DsaPScanInfo(String strJson) {
		
		if(log.isInfoEnabled()){
			logBean.setOperation("工业扫描基础：接收DSA请求信息");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPScanInfo");
			logBean.setOperationResults(strJson);
			logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		String feedBackJson = "";

		try {
			// 1、JSON转对象
			 dsaSearchaMsgAgreement = MyJsonDsaUtil.json2Entity(strJson);
			
			// 2、获取数据
			List<DsaScanInfoBean> dsaScanInfoList = dsaService
			.doSelectDsaScanInfoList(dsaSearchaMsgAgreement.getSearchEndTime());
			
			// 3、封装协议数据
			DsaMsgAgreement msg = new DsaMsgAgreement();
			msg.setDsaScanInfoList(dsaScanInfoList);
			
			// 4、转JSON字符串
			feedBackJson = MyJsonDsaUtil.entity2Json(msg);

		} catch (Exception e) {
			
			feedBackJson = "";
			
			logBean.setOperation("工业扫描基础：接收DSA请求信息并返回请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPScanInfo");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		if(log.isInfoEnabled()){
			logBean.setOperation("工业扫描基础：反馈DSA请求结果");
			logBean.setImpClass("DsaWebServiceHandleControl");
			logBean.setImpMethod("doChnnelRead_DsaPScanInfo");
			logBean.setOperationResults(feedBackJson);
			log.info(logBean);
		}
		
		return feedBackJson;
	}

}
