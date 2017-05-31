<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
	<center>
	 <table>
			<s:iterator value="list" var="list">
				<tr>
					<td width="100px;">
						<s:property value="#list.Ks_id" />
					</td>
					<td width="100px;">
						<s:property value="#list.Ks_name" />
					</td>
					<td>
						<s:property value="#list.Ks_introduce" />
					</td>
					<td>
						<s:property value="#list.News" />
					</td>
					<td width="100px;">
						<a href="editks.jsp">编辑</a>&nbsp;&nbsp;
						<a
							href="hos/deleteks.action?Ks_id=<s:property value="#list.Ks_id"/>">删除</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		</center>
	 
	</body>
</html>
