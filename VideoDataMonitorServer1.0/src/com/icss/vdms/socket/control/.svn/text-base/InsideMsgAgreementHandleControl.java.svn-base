package com.icss.vdms.socket.control;

import java.net.InetSocketAddress;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.xfire.transport.http.XFireServletController;

import com.icss.vdms.socket.agreement.MsgAgreement;
import com.icss.vdms.socket.agreement.MsgCategoryEnum;
import com.icss.vdms.socket.intfc.IMsgAgreementService;
import com.icss.vdms.socket.service.InsideMsgAgreementBPServiceImpl;
import com.icss.vdms.socket.service.InsideMsgAgreementPPServiceImpl;
import com.icss.vdms.util.common.SocketInfoGloble;
import com.icss.vdms.util.json.MyJsonUtil;
import com.icss.vdms.util.log.LogBean;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanFeedBack;

import io.netty.channel.ChannelHandlerContext;

/**
 * 
 * 消息协议处理控制
 * 
 * 原型模式
 * 
 * @author FUZHENGWEI
 * 
 */
public class InsideMsgAgreementHandleControl {

	// 日志
	private Logger log = Logger.getLogger("VDMS");
	// 日志bean
	private LogBean logBean = new LogBean();
	
	// 处理消息协议
	private IMsgAgreementService msgAgreementService;

	// 客户机IP
	private String clientIp = "";
	
	/**
	 * 处理消息
	 * 
	 * @param ctx
	 * @param msg
	 */
	public void doChannelRead(ChannelHandlerContext ctx, Object msg) {

		if(log.isInfoEnabled()){
			
			if("".equals(clientIp)){
				clientIp = ((InetSocketAddress) ctx.channel().remoteAddress()).getAddress().getHostAddress();
			}
				
			logBean.setClientIp(clientIp);
			logBean.setOperation("从Socket获得打码数据");
			logBean.setImpClass("InsideMsgAgreementHandleControl");
			logBean.setImpMethod("doChannelRead");
			logBean.setOperationResults(msg.toString());
			logBean.setErrMsg(msg == null ? "接收到空字符串":"");
			log.info(logBean);
		}
		
		try {
			// 1、字符串转对象
			MsgAgreement msgAgreement = MyJsonUtil.json2Entity(msg);

			// 2、根据业务类型实例化Service
			instantiationMsgAgreementServiceByMsgCategory(msgAgreement
					.getMsgCategoryEnum());

			// 3、消息处理并获得反馈信息
			MsgAgreement msgAgreementFeedBack = msgAgreementService
					.doChannelReadMsgAgreement(msgAgreement);

			// 4、反馈对象序列化JSON
			String json = MyJsonUtil.entity2Json(msgAgreementFeedBack);

			// 5、通过Channel发送JSON到客户端
			ctx.writeAndFlush(json);
			
			if(log.isInfoEnabled()){
				logBean.setClientIp(clientIp);
				logBean.setOperation("从Socket反馈打码数据");
				logBean.setImpClass("InsideMsgAgreementHandleControl");
				logBean.setImpMethod("doChannelRead");
				logBean.setOperationResults(json);
				logBean.setErrMsg(msg == null ? "接收到空字符串":"");
				log.info(logBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			if("".equals(clientIp)){
				clientIp = ((InetSocketAddress) ctx.channel().remoteAddress()).getAddress().getHostAddress();
			}
			
			logBean.setClientIp(clientIp);
			logBean.setOperation("从Socket获得打码数据");
			logBean.setImpClass("InsideMsgAgreementHandleControl");
			logBean.setImpMethod("doChannelReadInfo");
			logBean.setOperationResults("接收扫描接口数据报错");
			logBean.setErrMsg(e.getMessage());
			
			log.error(logBean);
			
			// 发生异常主动关闭客户端
			ctx.close();
		}
	}

	// 根据消息类型实例化对应Service处理服务
	private void instantiationMsgAgreementServiceByMsgCategory(
			MsgCategoryEnum msgCategory) {
		
		// 如果为null则进行实例化
		if (null == msgAgreementService) {

			// 商业打码
			if (MsgCategoryEnum.BARCODEPRINTER_BP.equals(msgCategory)) {
				msgAgreementService = new InsideMsgAgreementBPServiceImpl();
			}
			// 工业打码
			else if (MsgCategoryEnum.BARCODEPRINTER_PP.equals(msgCategory)) {
				msgAgreementService = new InsideMsgAgreementPPServiceImpl();
			}

		}

	}

}
