package com.icss.vdms.webservice.scan.control;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.xfire.transport.http.XFireServletController;

import com.icss.vdms.util.date.DateUtil;
import com.icss.vdms.util.json.MyJsonUtil;
import com.icss.vdms.util.log.LogBean;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanAgreement;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanFeedBack;
import com.icss.vdms.webservice.scan.service.InsideScanService;

public class InsideWebServiceScanHandleControl {

	// 日志
	private Logger log = Logger.getLogger("VDMS");
	// 日志bean
	private LogBean logBean = new LogBean();
	
	private InsideScanService insideScanService;

	private VedioMonitorMsgScanFeedBack feedBack;

	private String feedBackJson = "";
	
	// 客户机IP
	private String clientIp;
	
	public InsideWebServiceScanHandleControl() {
		insideScanService = new InsideScanService();
		
		try {
			HttpServletRequest request = XFireServletController.getRequest();
			clientIp = request.getRemoteAddr();
		} catch (Exception e) {
		}
	}

	/**
	 * 从WebService获得扫描条码数据
	 * 
	 * @param strJson
	 * @return
	 */
	public String doChannelReadInfo(String strJson) {

		try {
			
			// 调试日志
			if(log.isInfoEnabled()){
				
				logBean.setOperation("接收扫描接口传输过来的json字符串 IP:"+clientIp);
				logBean.setImpClass("InsideWebServiceScanHandleControl");
				logBean.setImpMethod("public String doChannelReadInfo(String strJson)");
				logBean.setOperationResults(strJson);
				logBean.setErrMsg(strJson == null ? "接收到空字符串":"");
				log.info(logBean);
			}
			
			if (null == strJson || "" == strJson) {
				feedBack = new VedioMonitorMsgScanFeedBack(false);
				feedBack.setMessage("json字符串为空");
			} else {
				// 1.JSON字符串转对象
				VedioMonitorMsgScanAgreement msgScanAgreement = MyJsonUtil
						.json2EntityScanAgreement(strJson);

				// 2.业务区分&调用存库函数将对象存入数据库
				switch (msgScanAgreement.getVedioMonitorMsgScanEnum()
						.getIndex()) {
				// 单据启动信息
				case 0:
					feedBack = insideScanService.doBillState(msgScanAgreement);
					break;
				// 单据确认信息
				case 1:
					feedBack = insideScanService.doBillConfirm(msgScanAgreement);
					break;
				// 托盘信息
				case 2:
					feedBack = insideScanService.doPalletInfo(msgScanAgreement);
					break;
				// 单据创建信息
				case 5:
					feedBack = insideScanService.doBillCreate(msgScanAgreement);
					break;
				// 单据修改信息
				case 6:
					feedBack = insideScanService.doBillModify(msgScanAgreement);
					break;
				// 单据删除信息
				case 7:
					feedBack = insideScanService.doBillDelete(msgScanAgreement);
					break;
				// 删除托盘信息
				case 9:
					feedBack = insideScanService.doDeletePalletInfo(msgScanAgreement);
					break;
				// 件烟扫描信息（除RFID设备扫描的）
				case 11:
					feedBack = insideScanService.doScanBarcodeResult(msgScanAgreement);
					break;
				// 删除件码
				case 12:
					feedBack = insideScanService.doDeleteBarcode(msgScanAgreement);
					break;
				// 清除单据[和单据无关]附带下所有条码[视频监控效率提升新增]
				case 17:
					feedBack = insideScanService.doClearBillInfo(msgScanAgreement);
					break;
				default:
					feedBack = new VedioMonitorMsgScanFeedBack(false);
					feedBack.setState(false);
					feedBack.setMessage("枚举类型异常："+msgScanAgreement.getVedioMonitorMsgScanEnum().getName());
					break;
				}

			}

		} catch (Exception e) {

			e.printStackTrace();

			feedBack = new VedioMonitorMsgScanFeedBack(false);
			logBean.setOperation("从WebService获得扫描条码数据 IP:"+clientIp);
			logBean.setImpClass("InsideWebServiceScanHandleControl");
			logBean.setImpMethod("doChannelReadInfo");
			logBean.setOperationResults("接收扫描接口数据报错");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
		}

		feedBackJson = MyJsonUtil.entity2JsonMsgScanFeedBack(feedBack);
		
		// 调试日志
		if(log.isInfoEnabled()){
			
			logBean.setOperation("反馈给扫描json字符串 IP:"+clientIp);
			logBean.setImpClass("InsideWebServiceScanHandleControl");
			logBean.setImpMethod("public String doChannelReadInfo(String strJson)");
			logBean.setOperationResults(feedBackJson);
			
			log.info(logBean);
		}
		
		return feedBackJson;

	}

}
