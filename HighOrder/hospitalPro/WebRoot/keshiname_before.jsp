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
	 <!-- head begin -->
    <div> <%@ include file="top.jsp" %></div>
     <!-- head end -->
	<center>
		<table  >		
			<tr>
				 
				<th>
					科室名字
				</th>			 
			</tr>

			<s:iterator value="list" var="list">
				<tr>

					<td width="100px;">
						<a href="hos/showKS.action?KSid=<s:property value="#list.Ks_id"/>" style="color:gray"><s:property value="#list.Ks_name"/></a>
					</td>

				</tr>
			</s:iterator>
		</table>
		</center>
		 <!-- head begin -->
    <div> <%@ include file="end.jsp" %></div>
     <!-- head end -->
	</body>
</html>
