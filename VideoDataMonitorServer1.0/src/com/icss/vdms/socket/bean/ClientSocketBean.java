package com.icss.vdms.socket.bean;

import io.netty.channel.Channel;

/**
 * 
 * 客户端连接SocketBean
 * 
 * @author FUZHENGWEI
 * 
 */
public class ClientSocketBean {

	// 连接者IP
	private String ip;
	// 连接者端口
	private int port;
	// 链接者Channel
	private Channel channel;
	// 链接开启时间
	private String openDate;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

}
