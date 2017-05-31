<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>

<table border="1" width="700">
	<tr>
		<td>
			姓名
		</td>
		<td>
			用户名
		</td>
		<td>
			密码
		</td>
		<td>
			电话
		</td>
		<td>
			操作
		</td>
	</tr>
<c:forEach items="${list}" var="u">

	<tr>
		<td><c:out value="${u.name}"/></td>
		<td><c:out value="${u.usename}"/></td>
		<td><c:out value="${u.password}"/></td>
		<td><c:out value="${u.phone}"/></td>
		<%-- <jsp:param name="" value="" /> --%>
		<td><a href="modify.jsp?id=${u.id}">修改</a>|<a href="/LJ/Delete_ser?usename=${u.usename}">删除</a></td>
	</tr>
</c:forEach>
<%-- <jsp:useBean id=""></jsp:useBean> --%>
</table>
<a href="DonwLoad_ser?filename=aa.png">下载图片</a><span>下载次数<%=request.getServletContext().getAttribute("aa.png")%></span>
<a href="DonwLoad_ser?filename=bb.txt">下载文本</a><span>下载次数<%=request.getServletContext().getAttribute("bb.txt")%></span>
<a href="DonwLoad_ser?filename=cc.zip">下载文件</a><span>下载次数<%=request.getServletContext().getAttribute("cc.zip")%></span>
<a href="DonwLoad_ser?filename=MySql.bat">下载批处理命令</a><span>下载次数<%=request.getServletContext().getAttribute("MySql.bat")%></span>
</body>
</html>