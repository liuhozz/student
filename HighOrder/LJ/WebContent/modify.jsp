<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>

<%

	int id=Integer.parseInt(request.getParameter("id"));
	pageContext.setAttribute("id", id);
	session.getAttribute("list"); 
	
%>



<form action="/LJ/Update_ser" method="post">
<c:forEach items="${list }" var="l">
<c:if test="${l.id eq id }" >
账号:<input type="text" name="usename"  value="${l.usename }"/><br>
密码:<input type="text" name="password"  value="${l.password}"/><br>
姓名:<input type="text" name="name" value="${l.name}"/><br>
电话<input type="text" name="phone"  value="${l.phone}"/><br>
<input type="submit" value="提交"/>
</c:if>

</c:forEach>

</form>





</body>
</html>