<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%ResourceBundle res = ResourceBundle.getBundle("sqlStr"); %>  
<%
    String user = res.getString("user");
    String password = res.getString("password");
%>
<sql:setDataSource
	url="jdbc:sqlserver://localhost:1433;DatabaseName=hospital_db"
	driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
	 password="<%=password%>"
	user="<%=user%>"/>
<sql:query var="result" sql="select * from Specialist_Expert" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		 

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
		<table  ">
			 <tr>
				<th>
					专家名字
				</th>
				 
			</tr>
			<c:forEach items="${result.rows}" var="SE">
				<tr>
					<td>
						<a href="hos/showSE.action?SEid=${SE.sE_id}"><c:out value="${SE.sE_name}" /></a>
					</td>
					 </tr>
			</c:forEach>
			 
		</table>
</center>
	 
		 <!-- head begin -->
    <div> <%@ include file="end.jsp" %></div>
     <!-- head end -->
	</body>
</html>
