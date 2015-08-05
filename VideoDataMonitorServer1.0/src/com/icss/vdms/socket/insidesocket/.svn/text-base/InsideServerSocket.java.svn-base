package com.icss.vdms.socket.insidesocket;

import com.icss.vdms.util.common.SocketInfoGloble;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * 
 * InsideServerSocket 内部Socket服务端
 * 
 * @author FUZHENGWEI
 * 
 *         2015-4-13
 * 
 */
public class InsideServerSocket implements Runnable {

	private ChannelFuture f;
	//端口号
	private int port;
	
	public InsideServerSocket(String port){
		try {
			this.port = Integer.parseInt(port);
		} catch (Exception e) {
			this.port = 53073;
		}finally{
			SocketInfoGloble.serverSocketBean.setServerSocketPort(String.valueOf(this.port));
		}
	}
	
	/**
	 * isActiveSocketServer
	 * 
	 * @return boolean
	 */
	public boolean isActiveSocketServer() {
		try {
			if (f != null) {
				return f.channel().isActive();
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 关闭Socket
	 */
	public boolean doCloseSocket() {
		try {
			if (f != null) {
				if (isActiveSocketServer()) {
					f.channel().close();
					f = null;
					// 清空
					SocketInfoGloble.userSocketMap.clear();
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void run() {

		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workGroup = new NioEventLoopGroup();

		try {
			ServerBootstrap b = new ServerBootstrap();

			b.group(bossGroup, workGroup);
			b.channel(NioServerSocketChannel.class);
			b.option(ChannelOption.SO_BACKLOG, 1024);

			b.childHandler(new MyChannelHandler());
			// 端口可配
			f = b.bind(port).sync();
			
			f.channel().closeFuture().sync();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bossGroup.shutdownGracefully();
			workGroup.shutdownGracefully();
		}

	}

}
