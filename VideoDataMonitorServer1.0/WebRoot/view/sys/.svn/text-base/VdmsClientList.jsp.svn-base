<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/view/res_head.jsp"%>
<html>
	<head>
		<title>客户端注册列表</title>
		<%@ include file="/view/res_easyui.jsp"%>
	</head>
	<body>
		<table id="dg" style="width:100%;height:450px"
            toolbar="#toolbar"
            singleSelect="true" 
            fitColumns="true"
            data-options="
            rownumbers:true,
            singleSelect:true,pagination:true,
            url:'Sys/getClientList.do',
            method:'get'" >
        <thead>
            <tr>
                <th data-options="field:'cDataSource',
                				  formatter: function(value,row,index){
										if(1 == value){
											return '商业打码';
										}else if(2 == value){
											return '工业打码';
										}else if(3 == value){
											return '商业扫描';
										}else{
											return '约定值错误';
										}
									}
                				 " align="center">数据来源</th>
                <th field="cDataDescription" width="100" align="center">数据描述</th>
                <th field="cDataNumber" width="100" align="center">数据编号</th>
                <th field="cIp" width="100" align="center">客户端IP</th>
                <th field="cCreateDate" width="100" align="center">创建日期</th>
                <th data-options="field:'cUseState',
                				  formatter: function(value,row,index){
										if(0 == value){
											return '开启';
										}else if(1 == value){
											return '关闭';
										}else{
											return '约定值错误';
										}
									}
                				" width="50" align="center">使用状态</th>
            </tr>
        </thead>
    </table>
    
    <!-- 工具栏 -->
    <div id="toolbar">
    	<input class="easyui-searchbox" data-options="prompt:'请输入检索的雇员姓名',searcher:doSearch" style="width:300px;"/>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addClient()">添加客户端信息</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editClient()">修改客户端信息</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyClient()">移除客户端信息</a>
        |
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addClientCamera()">添加摄像头信息</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editClientCamera()">修改摄像头信息</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyClientCamera()">移除摄像头信息</a>
    </div>
    
    <!-- 客户端注册 -->
    <div id="dlgClient" class="easyui-dialog"
			style="width: 400px; height: 280px; padding: 10px 20px" closed="true"
			buttons="#dlg-buttons-client">
			<div class="ftitle">
				客户端信息
			</div>
		<form id="fmClient" method="post" novalidate>
			<div class="fitem">
				<label>
					数据来源:
				</label>
				<select class="easyui-combobox" id="cDataSource" name="cDataSource" style="width: 90px;" data-options="editable:false,required:true,panelHeight:'auto'">
					<option value="1">商业打码</option>
					<option value="2">工业打码</option>
					<option value="3">商业扫描</option>
				</select>
			</div>
			<div class="fitem">
				<label>
					数据描述:
				</label>
				<input name="cDataDescription" type="text" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>
					数据编号:
				</label>
				<input name="cDataNumber" type="text" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>
					客户端IP:
				</label>
				<input name="cIp" type="text" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>
					使用状态:
				</label>
				<select class="easyui-combobox" id="cUseState" name="cUseState" style="width: 90px;" data-options="editable:false,required:true,panelHeight:'auto'">
					<option value="0" >开启</option>
					<option value="1" >关闭</option>
				</select>
			</div>
			<div id="dlg-buttons-client">
				<a href="javascript:void(0)" class="easyui-linkbutton c6"
					iconCls="icon-ok" onclick="saveClient()";style="width: 90px">Save</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-cancel" onclick="javascript: $('#dlgClient').dialog('close')";style="width: 90px">Cancel</a>
			</div>
		</form>
	</div>
    
    <!-- 客户端摄像头注册 -->
    <div id="dlgClientCamera" class="easyui-dialog"
			style="width: 400px; height: 280px; padding: 10px 20px" closed="true"
			buttons="#dlg-buttons-clientCamera">
			<div class="ftitle">
				摄像头信息
			</div>
		<form id="fmClientCamera" method="post" novalidate>
			<input type="hidden" id="ccUuid" name="ccUuid"/>
			<div class="fitem">
				<label>
					客户端:
				</label>
				<input id="ccClientDescription" type="text" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>
					位置描述:
				</label>
				<input name="ccCameraPosition" type="text" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>
					摄像头编号:
				</label>
				<input name="ccCameraNumber" type="text" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>
					扫描指定编号:
				</label>
				<input name="ccCAcmeraSnum" type="text" class="easyui-textbox" required="true">
			</div>
			<div id="dlg-buttons-clientCamera">
				<a href="javascript:void(0)" class="easyui-linkbutton c6"
					iconCls="icon-ok" onclick="saveClientCamera()";style="width: 90px">Save</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-cancel" onclick="javascript: $('#dlgClientCamera').dialog('close')";style="width: 90px">Cancel</a>
			</div>
		</form>
	</div>
    
    <script type="text/javascript">
		
	    function doSearch(value){
			$('#dg').datagrid({
				url:'emp/doGetEmpListBySearch.do',
				queryParams:{empName:value}
			});  
		}

	    var urlClient;
	    //添加客户端信息
		function addClient() {
			$('#dlgClient').dialog('open').dialog('setTitle', '添加客户端信息');
			$('#fmClient').form('clear');
			$("#cDataSource").combobox("setValue","1");
			$("#cUseState").combobox("setValue","1");		
			urlClient = 'Sys/doSaveClient.do';
		}

		function saveClient() {
			$('#fmClient').form('submit', {
				url : urlClient,
				onSubmit : function() {
					return $(this).form('validate');
				},
				success : function(result) {
					var result = eval('(' + result + ')');
					if (result.errorMsg) {
						$.messager.show( {
							title : 'Error',
							msg : result.errorMsg
						});
					} else {
						$('#dlgClient').dialog('close'); // close the dialog
					    $('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}

		//摄像头信息
		
		//添加摄像头信息
		var urlClientCamera;
		function addClientCamera(){

			var model = $('#dg').datagrid('getSelected');
			if(null == model){
				$.messager.alert('警告','未选中客户端'); 
				return;
			}
			
			$('#dlgClientCamera').dialog('open').dialog('setTitle', '添加客户端摄像头信息');
			$("#ccClientDescription").textbox("setValue",model.cDataNumber);
			$("#ccUuid").val(model.cUuid);

			urlClientCamera = "Sys/doSaveClientCamera.do";
			
		}

		function saveClientCamera() {
			$('#fmClientCamera').form('submit', {
				url : urlClientCamera,
				onSubmit : function() {
					return $(this).form('validate');
				},
				success : function(result) {
					var result = eval('(' + result + ')');
					if (result.errorMsg) {
						$.messager.show( {
							title : 'Error',
							msg : result.errorMsg
						});
					} else {
						$('#dlgClientCamera').dialog('close'); // close the dialog
					    $('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
	    
        $(function(){
            $('#dg').datagrid({
                view: detailview,
                detailFormatter:function(index,row){
                    return '<div style="padding:2px"><table class="ddv"></table></div>';
                },
                onExpandRow: function(index,row){
                    var ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');
                    ddv.datagrid({
                        url:'Sys/getClientCameraList.do?ccUuid='+row.cUuid,
                        fitColumns:true,
                        singleSelect:true,
                        rownumbers:true,
                        loadMsg:'',
                        height:'auto',
                        columns:[[
                            {field:'ccCameraPosition',title:'摄像头位置描述',width:200},
                            {field:'ccCameraNumber',title:'拥有摄像头编号',width:200},
                            {field:'ccCAcmeraSnum',title:'摄像头扫描指定编号',width:200}
                        ]],
                        onResize:function(){
                            $('#dg').datagrid('fixDetailRowHeight',index);
                        },
                        onLoadSuccess:function(){
                            setTimeout(function(){
                                $('#dg').datagrid('fixDetailRowHeight',index);
                            },0);
                        }
                    });
                    $('#dg').datagrid('fixDetailRowHeight',index);
                }
            });
        });
    </script>
<style type="text/css">
#fm {
	margin: 0;
	padding: 10px 30px;
}
.ftitle {
	font-size: 14px;
	font-weight: bold;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}
.fitem {
	margin-bottom: 5px;
}
.fitem label {
	display: inline-block;
	width: 80px;
}
.fitem input {
	width: 160px;
}
</style>
	</body>
</html>
