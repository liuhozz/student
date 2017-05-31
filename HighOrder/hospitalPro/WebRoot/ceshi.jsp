<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page contentType="text/html; charset=UTF-8" import="java.util.ResourceBundle" %>
<%ResourceBundle res = ResourceBundle.getBundle("sqlStr"); %>  
<%
    String user = res.getString("user");
    String password = res.getString("password");
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
          
	<body >
	  <form action="hos/upload.action" 
              enctype="multipart/form-data" method="post">
                              文件:<input type="file" name="image">
                <input type="submit" value="上传" />
        </form>
        
        User:<%=user %>
        Pass:<%=password %>
	</body>
</html>
