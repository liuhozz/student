$(function(){
	
	var url = 'returnorders_listByPage';
	
	var btnText = "";
	var inoutTitle = "";
	if(Request['oper']=='myreturnorders'){
		if(Request['type']*1 == 1){
			url = "returnorders_myListByPage?t1.type=1";
			document.title="我的采购退货订单";
			btnText = "采购退货订单录入";
			//显示供应商
			$('#addOrdersSupplier').html('供应商');
		}
		if(Request['type']*1 == 2){
			url = "returnorders_myListByPage?t1.type=2&t1.state=0";
			document.title="我的销售退货订单";
			btnText = "销售退货订单录入";
			//显示客户
			$('#addOrdersSupplier').html('客户');
		}
		
	}


	
	if(Request['oper'] == 'returnOrdersCheck'){
		if(Request['type']*1 == 1){
			url +="?t1.type=1&t1.state=0";
			document.title="采购退货订单审核";
		}
		if(Request['type']*1 == 2){
			url +="?t1.type=2&t1.state=0";
			document.title="销售退货订单审核";
		}
	}

	


	
	if(Request['oper'] == 'doOutStore'){
		url += "?t1.type=1&t1.state=1";
		document.title="采购退货订单出库";
		inoutTitle = "出库";
	}

	
	if(Request['oper'] == 'doInStore'){
		url += "?t1.type=2&t1.state=1";
		document.title="销售退货订单入库";
		inoutTitle = "入库";
	}
	
	
	//添加退货审核按钮
	var toolbar = new Array();
	if(Request['oper'] == 'returnOrdersCheck'){
		
		toolbar.push({
			text:'退货审核',
			iconCls:'icon-search',
			handler:returnOrdersCheck
		});
	}
	
	$('#grid').datagrid({
		url: url,
		columns:getColumns(),
		singleSelect:true,
		pagination:true,
		fitColumns:true,
		onDblClickRow:function(rowIndex, rowData){
			//显示详情
			$('#uuid').html(rowData.uuid);
			//运单号
			$('#waybillsn').html(rowData.waybillsn);
			
			$('#suppliername').html(rowData.supplierName);
			$('#state').html(getState(rowData.state));
			$('#creater').html(rowData.createrName);
			$('#checker').html(rowData.checkerName);
			$('#starter').html(rowData.starterName);
			$('#ender').html(rowData.enderName);
			$('#createtime').html(formatDate(rowData.createtime));
			$('#checktime').html(formatDate(rowData.checktime));
			$('#starttime').html(formatDate(rowData.starttime));
			$('#endtime').html(formatDate(rowData.endtime));
			
			//销售订单已经出库
			var options = $('#ordersDlg').dialog('options');
			var toolbar = options.toolbar;
			var t = new Array();
			t.push(toolbar[0]);
			if(toolbar.length > 0){
				if(rowData.state*1 == 1 && rowData.type * 1 == 2){
					//添加详情的按钮
					t.push({
						text:'运单详情',
						iconCls:'icon-search',
						handler:function(){
							$('#waybillDlg').dialog('open');
							$('#waybillgrid').datagrid({
								url: 'returnorders_waybilldetailList?waybillsn=' + $('#waybillsn').html(),
								columns:[[
									{field:'exedate',title:'执行日期',width:100},
									{field:'exetime',title:'执行时间',width:100},
									{field:'info',title:'执行信息',width:100}
								]],
								rownumbers:true
							});
						}
					});
				}
			}
			//重新渲染工具栏
			$('#ordersDlg').dialog({
				toolbar:t
			});
			
			//打开窗口
			$('#ordersDlg').dialog('open');
			
			//加载明细列表
			$('#itemgrid').datagrid('loadData',rowData.returnorderdetail);
		}
	});
	
	//明细表格
	$('#itemgrid').datagrid({
		columns:[[
            {field:'uuid',title:'编号',width:100},
  		    {field:'goodsuuid',title:'商品编号',width:100},
  		    {field:'goodsname',title:'商品名称',width:100},
  		    {field:'price',title:'价格',width:100},
  		    {field:'num',title:'数量',width:100},
  		    {field:'money',title:'金额',width:100},
  		    {field:'state',title:'状态',width:100,formatter:getDetailState}
		]],
		fitColumns:true,
		singleSelect:true
	});
	
	
		//添加导出按钮
	
	
	
	
	//添加导出按钮
	toolbar.push({
		text:'导出',
		iconCls:'icon-excel',
		handler:doExport
	});
	$('#ordersDlg').dialog({
		toolbar:toolbar
	});
	//添加双击事件
	if(Request['oper'] == 'doInStore' ||  Request['oper'] == 'doOutStore'){
		$('#itemgrid').datagrid({
			onDblClickRow:function(rowIndex, rowData){
				//显示数据
				$('#itemuuid').val(rowData.uuid);
				$('#goodsuuid').html(rowData.goodsuuid);
				$('#goodsname').html(rowData.goodsname);
				$('#goodsnum').html(rowData.num);
				//打开出入库窗口
				$('#itemDlg').dialog('open');
			}
		});
	}
	//添加采购退货申请按钮
	if(Request['oper'] == 'myreturnorders'){
		$('#grid').datagrid({
			toolbar:[{
				   text:btnText,
				   iconCls:'icon-add',
				   handler:function(){
					   $('#addOrdersDlg').dialog('open');
				   }
			   }]
		});
	}
		
	//出入库窗口
	$('#itemDlg').dialog({
		width:300,
		height:200,
		title:inoutTitle,
		modal:true,
		closed:true,
		buttons:[
		   {
			   text:inoutTitle,
			   iconCls:'icon-save',
			   handler:doInOutStore
		   }
		]
	});
	
	//增加订单的窗口
	$('#addOrdersDlg').dialog({
		title:'增加退货订单',
		width:700,
		height:400,
		modal:true,
		closed:true
	});	
});

/**
 * 日期格式化器
 * @param value
 * @returns
 */
function formatDate(value){
	if(value==null){
		return "";
	}
	return new Date(value).Format('yyyy-MM-dd');
}

/**
 * 获取订单的状态
 * @param value
 * @returns
 * 采购: 0:未审核 1:已审核, 2:已入库
 * 销售：0：未出库，1：已出库
 */
function getState(value){
	if(Request['type'] * 1 == 1){
		switch(value * 1){
			case 0:return '未审核';
			case 1:return '已审核';
			case 2:return '已出库';
			default: return '';
		}
	}
	if(Request['type'] * 1 == 2){
		switch(value * 1){
			case 1:return '未入库';
			case 3:return '已入库';
			default: return '';
		}
	}
}

/**
 * 获取订单明细的状态
 * 0=未入库，1=已入库
 * @param value
 */
function getDetailState(value){
	if(Request['type'] * 1 == 1){
		switch(value * 1){
			case 0:return '未出库';
			case 1:return '已出库';
			default: return '';
		}
	}
	if(Request['type'] * 1 == 2){
		switch(value * 1){
			case 0:return '未入库';
			case 1:return '已入库';
			default: return '';
		}
	}
}

/**
 * 审核      returnOrdersCheck
 */
function returnOrdersCheck(){
	$.messager.confirm('确定','确定要审核吗？', function(yes){
		if(yes){
		    $.ajax({
		    	url: 'returnorders_returnOrdersCheck?id=' + $('#uuid').html(),
		    	dataType: 'json',
		    	type: 'post',
		    	success:function(rtn){
		    		$.messager.alert('提示',rtn.message,'info',function(){
		    			if(rtn.success){
		    				//关闭窗口
		    				$('#ordersDlg').dialog('close');
		    				//刷新表格
		    				$('#grid').datagrid('reload');
		    			}
		    		});
		    	}
		    });  
		}
	});
}



/**
 * 出入库
 */
function doInOutStore(){
	var message = "";
	var url = "";
	if(Request['type'] * 1 == 1){
		message = "确认要出库吗？";
		
		url = "returnorderdetail_doreturnOutStore";
	}
	if(Request['type'] * 1 == 2){
		message = "确认要入库吗？";
		
		url = "returnorderdetail_doreturnInStore";
	}
	var formdata = $('#itemForm').serializeJSON();
	if(formdata.storeuuid == ''){
		$.messager.alert('提示','请选择仓库!','info');
		return;
	}
	$.messager.confirm("确认",message,function(yes){
		if(yes){
			$.ajax({
				url: url,
				data: formdata,
				dataType: 'json',
				type: 'post',
				success:function(rtn){
					$.messager.alert('提示',rtn.message,'info',function(){
						if(rtn.success){
							//关闭入库窗口
							$('#itemDlg').dialog('close');
							//设置明细的状态
							$('#itemgrid').datagrid('getSelected').state = "1";
							//刷新明细列
							var data = $('#itemgrid').datagrid('getData');
							$('#itemgrid').datagrid('loadData',data);
							//如果所有明细都 入库了，应该关闭订单详情，并且刷新订单列表
							var allIn = true;
							$.each(data.rows,function(i,row){
								if(row.state * 1 == 0){
									allIn = false;
									//跳出循环
									return false;
								}
							});
							if(allIn == true){
								//关闭详情窗口
								$('#ordersDlg').dialog('close');
								//刷新订单列表
								$('#grid').datagrid('reload');
							}
						}
					});
				}
			});
		}
	});
}

/**
 * 根据订单类型，获取不同的列
 */
function getColumns(){
	if(Request['type'] * 1 == 1){
		return [[
		            {field:'uuid',title:'编号',width:100},
		  		    {field:'createtime',title:'生成日期',width:100,formatter:formatDate},
		  		    {field:'checktime',title:'审核日期',width:100,formatter:formatDate},
		  		    {field:'starttime',title:'确认日期',width:100,formatter:formatDate},
		  		    {field:'endtime',title:'入库日期',width:100,formatter:formatDate},
		  		    {field:'createrName',title:'下单员',width:100},
		  		    {field:'checkerName',title:'审核员',width:100},
		  		    {field:'starterName',title:'采购员',width:100},
		  		    {field:'enderName',title:'库管员',width:100},
		  		    {field:'supplierName',title:'供应商',width:100},
		  		    {field:'totalmoney',title:'合计金额',width:100},
		  		    {field:'state',title:'状态',width:100,formatter:getState},
		  		    {field:'waybillsn',title:'运单号',width:100}
				]];
	}
	if(Request['type'] * 1 == 2){
		return [[
		            {field:'uuid',title:'编号',width:100},
		  		    {field:'createtime',title:'生成日期',width:100,formatter:formatDate},
		  		    {field:'checktime',title:'审核日期',width:100,formatter:formatDate},
		  		    {field:'starttime',title:'确认日期',width:100,formatter:formatDate},
		  		    {field:'endtime',title:'入库日期',width:100,formatter:formatDate},
		  		    {field:'createrName',title:'下单员',width:100},
		  		    {field:'checkerName',title:'审核员',width:100},
		  		    {field:'starterName',title:'采购员',width:100},
		  		    {field:'enderName',title:'库管员',width:100},
		  		    {field:'supplierName',title:'客户',width:100},
		  		    {field:'totalmoney',title:'合计金额',width:100},
		  		    {field:'state',title:'状态',width:100,formatter:getState},
		  		    {field:'waybillsn',title:'运单号',width:100}
				]];
	}
}

function doExport(){
	$.download("orders_export",{"id":$('#uuid').html()});
}
	