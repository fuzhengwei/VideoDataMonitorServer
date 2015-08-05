package com.icss.vdms.socket.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.vdms.socket.insidesocket.InsideServerSocket;
import com.icss.vdms.util.common.SystemConfigGloble;

/**
 * 处理一些SocketServer
 * 
 * @author FUZHENGWEI
 * 
 */
@Service("insideServerSocketService")
public class InsideServerSocketService {

	// ServerSocket线程池
	private ExecutorService es;
	// 内部ServerSocket
	private InsideServerSocket serverSocket = null;
	@Autowired
	private SystemConfigGloble sys;	//系统配置信息
	/**
	 * 获得当前ServerSocket状态
	 * @return
	 */
	public boolean doGetServerSocketIsActive(){
		
		try {
			
			if(null == serverSocket){
				return false;
			}
			
			return serverSocket.isActiveSocketServer();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	/**
	 * 开启ServerSocket
	 * @return
	 */
	public boolean doOpenServerSocket() {

		try {
			if(null == serverSocket){
				// 实例化ServerSocket线程类
				serverSocket = new InsideServerSocket(sys.getServerSocketPort());
				// 休眠3毫秒
				Thread.sleep(3000);
			}
			if(null == es){
				// 开启线程池
				es = Executors.newCachedThreadPool();
				// 将ServerSocket加入线程池启动
				es.execute(serverSocket);
				// 休眠3秒
				Thread.sleep(3000);
			}

			return serverSocket.isActiveSocketServer();

		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
		}

	}
	
	/**
	 * 关闭SocketServer
	 */
	public void doCloseServerSocket(){
		
		boolean isCloseOk = serverSocket.doCloseSocket();
		// Socket关闭成功
		if(isCloseOk){
			// 关闭线程池
			if(es != null){
				if(!es.isShutdown()){
					//关闭线程池
					es.shutdown();
				}
			}
		}
	}

}
