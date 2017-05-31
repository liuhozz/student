<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>

	<form action="LoginServlet" method="post">
		账号:<input type="text" name="username" id="uname" value="admin"/> <br/>
		密码:<input type="password" name="password" id="password" value="123"/><br/>
		
		 <input type="submit" value="提交" />
		 
	</form>

</body>
</html>