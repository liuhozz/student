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
<sql:query var="result" sql="select * from Img_Vedio" />
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

	</head>

	<body>
	<center>
		<table  >
			<caption>
				图片视频信息
			</caption>
			<tr>
				<th>
					编号
				</th>
				<th>
					类型
				</th>
				<th>
					作者
				</th>
				<th>
					名字
				</th>
				<th>
					路径
				</th>
				<th>
					日期
				</th>
				<th>
					操&nbsp;&nbsp;&nbsp;&nbsp;作
				</th>
			</tr>
			<!--<s:iterator value="listiv" var="IV">
		 <tr>
			 <td><s:property value="#IV.iv_id" /></td>
			 <td><s:property value="#IV.iV_type" /></td>
			 <td><s:property value="#IV.Vd_author" /></td>
			 <td><s:property value="#IV.iV_name" /></td>
			 <td><s:property value="#IV.iV_path" /></td>
			 <td><s:property value="#IV.iV_date" /></td>
        <td><a href="hos/delete.action?id=<s:property value="#IV.iv_id"/>">删除</a></td>
        </tr>
		</s:iterator>
		-->
			<c:forEach items="${result.rows}" var="IV">
				<tr>
					<td>
						<c:out value="${IV.iv_id}" />
					</td>
					<td>
						<c:out value="${IV.iV_type}" />
					</td>
					<td>
						<c:out value="${IV.Vd_author}" />
					</td>
					<td>
						<c:out value="${IV.iV_name}" />
					</td>
					<td>
						<c:out value="${IV.iV_path}" />
					</td>
					<td>
						<c:out value="${IV.iV_date}" />
					</td>
					<td>
						<a href="index.jsp?">编辑</a>&nbsp;&nbsp;
						<a href="hos/delete.action?id=${IV.iv_id}">删除</a>
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
