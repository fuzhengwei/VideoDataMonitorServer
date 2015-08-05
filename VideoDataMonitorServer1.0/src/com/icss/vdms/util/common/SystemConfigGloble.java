package com.icss.vdms.util.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SystemConfigGloble")
public class SystemConfigGloble {

	@Value("${ServerSocketPort}")
	private String ServerSocketPort;

	public String getServerSocketPort() {
		return ServerSocketPort;
	}

	public void setServerSocketPort(String serverSocketPort) {
		ServerSocketPort = serverSocketPort;
	}
	
}
