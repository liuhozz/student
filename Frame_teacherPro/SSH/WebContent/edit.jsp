<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="${pageContext.request.contextPath}/bootstrap2.3.2/css/bootstrap.min.css" rel="stylesheet"/>
<title>修改页面</title>
<style type="text/css">
.td{border:solid #add9c0; border-width:0px 1px 1px 0px; padding:10px 0px;}
.table{border:solid #add9c0; border-width:1px 0px 0px 1px;}
</style>
<script type="text/javascript">
	function submit(){
		document.getElementById("form").submit();
	}
</script>
</head>
<body>
<br/><br/>
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">修改客户</h3>
            </div>
            <br/><br/><br/>
            <form id="form" name="customerForm" action="${pageContext.request.contextPath}/customer_update.action" class="form-horizontal" method="post">
           	<input type="hidden" name="cid" value="${cid}">
            <table border="1" class="table">
            	<tr>
            		
            		<td class="td" >
            			 <label  for="cust_name">客户名称</label>
            		</td>
            		<td class="td">
            			 <input type="text" id="cust_name" name="cust_name" placeholder="客户名称" value="<s:property value="cust_name"/>">
            		</td>
            	</tr>
            	<tr>
            		
            		<td class="td">
            			<label  for="cust_type">客户类型</label>
            		</td >
            		<td class="td">
            			<input type="text" id="cust_type" name="cust_type" placeholder="客户类型" value="<s:property value="cust_type"/>">
            		</td>
            	</tr>
            	<tr>
            		
            		<td class="td">
            			 <label for="cust_phone">联系电话</label>
            		</td>
            		<td class="td">
            			 <input type="text" id="cust_phone" name="cust_phone" placeholder="联系电话" value = "<s:property value="cust_phone"/>">
            		</td>
            	</tr>
            	<tr>
            		
            		<td class="td">
            			  <label  for="cust_address">联系地址</label>
            		</td>
            		<td class="td">
            			 <input type="text" id="cust_address" name="cust_address" placeholder="联系地址" value = "<s:property value="cust_address"/>">
            		</td>
            	</tr>
            	<tr>
            		
            		<td class="td" >
            			 <label for="uList">所属员工</label>
            		</td>
            		<td class="td">
            		<s:select name="user.uid" list="list" headerKey="" headerValue="--请选择--" listKey="uid" listValue="username"></s:select>
            		</td>
            	</tr>
            	<tr>
            		<td class="td" colspan="2" align="center">
            			<button class="btn btn-primary" onclick="submitForm();">修改</button>
            			<button class="btn" onclick="javascript:history.back();return false;">返回</button>
            		</td>
            	</tr>
            </table>
            </form>
            
</body>
</html>