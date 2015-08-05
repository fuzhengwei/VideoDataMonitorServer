package com.icss.vdms.socket.bean;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * 服务端SocketBean
 * 
 * @author FUZHENGWEI
 * 
 */
public class ServerSocketBean {

	// 服务端IP
	private String serverSocketIP;
	// 服务端Port
	private String serverSocketPort;
	// 服务端是否开启
	private boolean serverSocketIsActive;
	// 服务端开启时间
	private String serverSocketOpenDate;
	// 服务端链接用户数
	private int serverSocketCollectCount;

	public String getServerSocketIP() {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			serverSocketIP = addr.getHostAddress().toString();// 获得本机IP
		} catch (UnknownHostException e) {
			serverSocketIP = "127.0.0.1";
		}
		return serverSocketIP;
	}

	public String getServerSocketPort() {
		return serverSocketPort;
	}

	public void setServerSocketPort(String serverSocketPort) {
		this.serverSocketPort = serverSocketPort;
	}

	public boolean isServerSocketIsActive() {
		return serverSocketIsActive;
	}

	public void setServerSocketIsActive(boolean serverSocketIsActive) {
		this.serverSocketIsActive = serverSocketIsActive;
	}

	public String getServerSocketOpenDate() {
		return serverSocketOpenDate;
	}

	public void setServerSocketOpenDate(String serverSocketOpenDate) {
		this.serverSocketOpenDate = serverSocketOpenDate;
	}

	public int getServerSocketCollectCount() {
		return serverSocketCollectCount;
	}

	public void setServerSocketCollectCount(int serverSocketCollectCount) {
		this.serverSocketCollectCount = serverSocketCollectCount;
	}

}
