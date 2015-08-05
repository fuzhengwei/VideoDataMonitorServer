<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/view/res_head.jsp"%>
<html>
  <head>
    <title>Socket服务端使用状态</title>
	<%@ include file="/view/res_easyui.jsp"%>
  </head>
  
  <body>
    <table>
    	<tr>
    		<td colspan="2">ServerSocket 服务端开启状态</td>
    	</tr>
    	<tr>
    		<td>IP：</td>
    		<td>${ serverSocketInfo.serverSocketIP }</td>
    	</tr>
    	<tr>
    		<td>Port：</td>
    		<td>${ serverSocketInfo.serverSocketPort }</td>
    	</tr>
    	<tr>
    		<td>当前状态：</td>
    		<td>${ serverSocketInfo.serverSocketIsActive ? "开启":"关闭" }</td>
    	</tr>
    	<tr>
    		<td>链接数量：</td>
    		<td>${ serverSocketInfo.serverSocketCollectCount } 个</td>
    	</tr>
    	<tr>
    		<td>开启时间：</td>
    		<td>${ serverSocketInfo.serverSocketOpenDate }</td>
    	</tr>
    </table>
    
    <table id="dg" title="Socket 用户链接列表" class="easyui-datagrid" style="width:100%;"
			url="insideServerSocketControl/doGetClientSocketList.do"
			rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
			<th field="ip" width="50">IP</th>
			<th field="port" width="50">Port</th>
			<th field="openDate" width="50">开启时间</th>
			</tr>
		</thead>
	</table>
  </body>
</html>
