package com.icss.vdms.socket.control;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icss.vdms.socket.bean.ClientSocketBean;
import com.icss.vdms.socket.bean.ServerSocketBean;
import com.icss.vdms.socket.service.InsideServerSocketService;
import com.icss.vdms.util.common.SocketInfoGloble;
import com.icss.vdms.util.date.DateUtil;
import com.icss.vdms.util.log.LogBean;

@Controller("insideServerSocketControl")
@RequestMapping("/insideServerSocketControl/")
public class InsideServerSocketControl {

	// 日志
	private Logger log = Logger.getLogger("VDMS");
	// 日志bean
	private LogBean logBean = new LogBean();
	
	private InsideServerSocketService insideServerSocketService = null;

	/**
	 * 构造函数
	 */
	@Autowired
	public InsideServerSocketControl(InsideServerSocketService insideServerSocketService){
		
		//注入
		this.insideServerSocketService = insideServerSocketService;
		
		try {
			
			if(log.isInfoEnabled()){
				log.info("================ SERVER SOCKET INIT START ================");
			}
			
			// 判断当前ServerSocket状态后，开启ServerSocket
			if(!insideServerSocketService.doGetServerSocketIsActive()){
				boolean isOpenOk = insideServerSocketService.doOpenServerSocket();
				
				if(log.isInfoEnabled()){
					if(isOpenOk){
						log.info("================ SERVER SOCKET INIT OK ================");
					}else{
						log.info("================ SERVER SOCKET INIT ERROR ================");
					}
				}
			}
			
			if(log.isInfoEnabled()){
				log.info("================ SERVER SOCKET INIT END ================");
			}
			
			// 设置ServerSocket启动时间
			SocketInfoGloble.serverSocketBean.setServerSocketOpenDate(DateUtil.getNow(DateUtil.FORMAT_ONE));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping("doGetServerSocketIsActive")
	@ResponseBody
	public boolean doGetServerSocketIsActive(){
		return insideServerSocketService.doGetServerSocketIsActive();
	}
	
	
	@RequestMapping("doGetServerSocketState")
	public ModelAndView doGetServerSocketState(){
		
		ModelAndView mv = new ModelAndView();
		
		ServerSocketBean serverSocket = SocketInfoGloble.serverSocketBean;
		
		serverSocket.setServerSocketIsActive(insideServerSocketService.doGetServerSocketIsActive());
		serverSocket.setServerSocketCollectCount(SocketInfoGloble.userSocketMap.size());
		
		mv.addObject("serverSocketInfo", SocketInfoGloble.serverSocketBean);
		mv.setViewName("view/socket/VdmsServerSocketList");
		
		return mv;
		
	}
	
	
	@RequestMapping("doGetClientSocketList")
	@ResponseBody
	public Map<String, Object> doGetClientSocketList(){
		
		Collection<ClientSocketBean> clientSocketList = SocketInfoGloble.userSocketMap.values();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", clientSocketList.size());
		map.put("rows", clientSocketList);
		
		return map;
	}
}
