var editIndex = undefined;
function endEditing(){
    if (editIndex == undefined){return true}
    if ($('#datagrid').datagrid('validateRow', editIndex)){
        $('#datagrid').datagrid('endEdit', editIndex);
        editIndex = undefined;
        return true;
    } else {
        return false;
    }
}
function onClickCell(index, field){
    if (editIndex != index){
        if (endEditing()){
            $('#datagrid').datagrid('selectRow', index)
                    .datagrid('beginEdit', index);
            var ed = $('#datagrid').datagrid('getEditor', {index:index,field:field});
            if (ed){
                ($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
            }
            editIndex = index;
        } else {
            setTimeout(function(){
                $('#datagrid').datagrid('selectRow', editIndex);
            },0);
        }
    }
}
function append(){
    if (endEditing()){
        $('#datagrid').datagrid('appendRow');
        editIndex = $('#datagrid').datagrid('getRows').length-1;
        $('#datagrid').datagrid('selectRow', editIndex)
                .datagrid('beginEdit', editIndex);
    }
}
function removeit(){
	var row = $('#datagrid').datagrid('getSelected');
    if(!row) {
    	$.messager.alert('删除数据',"请选择要删除的数据！");
    	return;
    }
    
	$.messager.confirm('删除数据', '删除'+row.name+'，是否确定？', function(r){
		if(!r) return;
		del(row.id);
	    $('#datagrid').datagrid('cancelEdit', editIndex)
	            .datagrid('deleteRow', editIndex);
	    editIndex = undefined;
	});
}
function accept(){
    if (endEditing()){
        var rows = $('#datagrid').datagrid('getChanges');
        if(rows.length==0) return;
        $.messager.confirm('更新数据', '有'+rows.length+'条记录更新，是否确定？', function(r){
        	if(!r) return;
        	save(rows);
        	$('#datagrid').datagrid('acceptChanges');
        });
    }
}
function reject(){
    $('#datagrid').datagrid('rejectChanges');
    editIndex = undefined;
}
function save(rows){
	var row = rows[0];
	$(function() {
		$.ajax({
			type:'POST',
			url:'/product/execute/productService/saveProduct',
			data:row,
			dataType:'json',
			success: function(e){
				$.messager.alert('保存数据','数据保存成功！');
			},
			error: function(e){
				$.messager.alert('保存数据',"系统错误，操作失败");
			}
		});
	})
}
function del(id){
	var data = {arg0:id};
	//'/product/delete?id='+id;
	var url = '/product/execute/productService/deleteProduct';
	$(function() {
		$.ajax({
			type:'POST',
			url:url,
			data:data,
			dataType:'json',
			success: function(e){
				$.messager.alert('删除数据','数据删除成功！');
				refresh();
			},
			error: function(e){
				$.messager.alert('删除数据',"系统错误，操作失败");
			}
		});
	})
}
function refresh(){
	$('#datagrid').datagrid('reload');
    editIndex = undefined;
}
function supplierFormatter(value, row){
	if(row && row.supplier.name) {
		return row.supplier.name;
	}
}