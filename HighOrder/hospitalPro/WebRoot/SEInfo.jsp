<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
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
	</head>

	<body>
		<!--
  
    <s:iterator value="listSE" var="SE">
    <s:property value="#SE.sE_name"/>
    <s:property value="#SE.sE_sex"/>
    <s:property value="#SE.sE_age"/>
    <s:property value="#SE.sE_tel"/>
    <s:property value="#SE.sE_intro"/>
    <s:property value="#SE.sE_pos"/>
    
    </s:iterator>
    
    -->
    <!-- head begin -->
   
     <!-- head end -->
     <center>
     
		<table>
			<caption>
				专家信息介绍
				 
			</caption>
			<tr>

				<th>
					名字
				</th>
				<th>
					性别
				</th>
				<th>
					年龄
				</th>
				<th>
					电话
				</th>
				<th>
					介绍
				</th>
				<th>
					职称
				</th>
				<th>
					操&nbsp;&nbsp;&nbsp;&nbsp;作
				</th>
			</tr>
			<c:forEach items="${result.rows}" var="SE">
				<tr>
					<td>
						<c:out value="${SE.sE_name}" />
					</td>
					<td>
						<c:out value="${SE.sE_sex}" />
					</td>
					<td>
						<c:out value="${SE.sE_age}" />
					</td>
					<td>
						<c:out value="${SE.sE_tel}" />
					</td>
					<td>
						<c:out value="${SE.sE_intro}" />
					</td>
					<td>
						<c:out value="${SE.sE_pos}" />
					</td>
					<td>
						<a href="editSE.jsp">编辑</a>&nbsp;&nbsp;
						<a href="hos/deleteSE.action?s_id=${SE.sE_id}">删除</a>
					</td>
				</tr>

			</c:forEach>
			<tr>
				<td style="text-align: right;">
					共
					<c:out value="${result.rowCount}"></c:out>
					条记录

				</td>
				<td>
					&nbsp;&nbsp;
					<a href="hospitalSystem.jsp">返回</a>
				</td>
			</tr>
		</table>
</center>

	</body>
</html>
