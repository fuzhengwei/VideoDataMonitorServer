package com.icss.vdms.socket.insidesocket;

import java.net.InetSocketAddress;

import com.icss.vdms.socket.bean.ClientSocketBean;
import com.icss.vdms.socket.control.InsideMsgAgreementHandleControl;
import com.icss.vdms.util.common.SocketInfoGloble;
import com.icss.vdms.util.date.DateUtil;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class VdmsInsideServerHanlder extends ChannelHandlerAdapter {

	private InsideMsgAgreementHandleControl msgAgreementHandleControl;
	
	public VdmsInsideServerHanlder(InsideMsgAgreementHandleControl msgAgreementHandleControl){
		this.msgAgreementHandleControl = msgAgreementHandleControl;
	}
	
	/*
	 * channelAction
	 * 
	 * channel 通道 action 活跃的
	 * 
	 * 当客户端主动链接服务端的链接后，这个通道就是活跃的了。也就是客户端与服务端建立了通信通道并且可以传输数据
	 */
	public void channelActive(ChannelHandlerContext ctx) throws Exception {

		// 获取IP&PORT
		InetSocketAddress insocket = (InetSocketAddress) ctx.channel()
				.remoteAddress();
		
		// 封装客户端Bean对象
		ClientSocketBean clientSocket = new ClientSocketBean();
		clientSocket.setIp(insocket.getAddress().getHostAddress());
		clientSocket.setPort(insocket.getPort());
		clientSocket.setOpenDate(DateUtil.getNow(DateUtil.FORMAT_ONE));
		clientSocket.setChannel(ctx.channel());

		//填充到键值对集合
		SocketInfoGloble.userSocketMap.put(ctx.channel().id().toString(), clientSocket);
		
	}

	/*
	 * channelInactive
	 * 
	 * channel 通道 Inactive 不活跃的
	 * 
	 * 当客户端主动断开服务端的链接后，这个通道就是不活跃的。也就是说客户端与服务端的关闭了通信通道并且不可以传输数据
	 */
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		// 捕获关闭
		ctx.close();
		// 从channelGroup中移除，当有客户端退出后，移除channel。
		SocketInfoGloble.userSocketMap.remove(ctx.channel().id().toString());
	}

	/*
	 * channelRead
	 * 
	 * channel 通道 Read 读
	 * 
	 * 简而言之就是从通道中读取数据，也就是服务端接收客户端发来的数据 但是这个数据在不进行解码时它是ByteBuf类型的后面例子我们在介绍
	 */
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		
		//消息转发给控制层用于消息分发处理
		msgAgreementHandleControl.doChannelRead(ctx, msg);
		
	}

	/*
	 * channelReadComplete
	 * 
	 * channel 通道 Read 读取 Complete 完成
	 * 
	 * 在通道读取完成后会在这个方法里通知，对应可以做刷新操作 ctx.flush()
	 */
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	/*
	 * exceptionCaught
	 * 
	 * exception 异常 Caught 抓住
	 * 
	 * 抓住异常，当发生异常的时候，可以做一些相应的处理，比如打印日志、关闭链接
	 */
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		ctx.close();
		// 从channelGroup中移除，当有客户端退出后，移除channel。
		SocketInfoGloble.userSocketMap.remove(ctx.channel().id().toString());
	}

}
