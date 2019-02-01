<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品信息</title>
<script type="text/javascript" src="../easyui/jquery.min.js"></script>
<script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="../easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../easyui/themes/icon.css">
<script type="text/javascript" src="index.js"></script>
</head>

<body>
	<div id="tb" style="width: 100%">
		<div style="color:#333">
			<table id="filterdiv" style='font-size:12px;width:1100px'></table>
		</div>
		<div id="buttons" style="padding-left:7px; color:#333">
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">添加</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">删除</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">取消</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="refresh()">刷新</a>
		</div>
	</div>
	<div class="easyui-panel" data-options="border:false">
	 	<table id="datagrid" class="easyui-datagrid" style="width:90%;height:auto" 
	 		data-options="url:'/product/easyui/query/productQuery',onClickCell: onClickCell,iconCls: 'icon-edit'"
	 		toolbar="#buttons" idField="id" rownumbers="true" fitColumns="true" singleSelect="true">
	 	<thead>
	        <tr>
	            <th field="id" width=100 editor="{type:'textbox',options:{required:true}}">商品编号</th>
	            <th data-options="field:'name',width:200" editor="{type:'textbox',options:{required:true}}">商品名称</th>
	            <th data-options="field:'price',width:100" editor="{type:'numberbox',options:{required:true}}" align="right">价格</th>
	            <th data-options="field:'unit',width:100" editor="text">单位</th>
	            <th data-options="field:'supplierId',width:300,formatter:supplierFormatter" 
	             editor="{type:'combobox',options:{
                                valueField:'id',
                                textField:'name',
                                method:'get',
                                url:'/supplier/get/supplierService/listOfSupplier',
                                required:false
                            }}">供应商</th>
	            <th data-options="field:'classify',width:200" editor="text">商品分类</th>
	        </tr>
	    </thead>
	 	</table>
	</div>
</body>
</html>