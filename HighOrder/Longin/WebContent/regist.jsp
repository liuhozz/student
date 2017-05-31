<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#username").blur(function(){
		var username=$("#username").val();
		
		$.post("ChackUserServlet",{username:username},function(data){
			if(data=="1"){
				//已有用户名
				$("#span_1").html("<font color='red'>该用户名已被占用</font>");
			}else{
				$("#span_1").html("<font color='green'>该用户名可以使用</font>");
			}
		});
	});
	
});



</script>

</head>
<body>
	<form action="RegisterServlet" method="post">
		<table width="60%" height="60%" align="center" bgcolor="#ffffff">
			<tr>
				<td colspan="2">会员注册USER REGISTER</td>
			</tr>
			<tr>
				<td width="20%">用户名:</td>
				<td width="40%">
					<input type="text" name="username" id="username"><span id="span_1"></span>
				</td>
				<td width="40%"><span id="usename_msg"></span></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" id="password"></td>
				<td></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" id="email"></td>
				<td></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td>
					<input type="radio" name="sex" value="男">男 
					<input type="radio" name="sex" value="女">女 
				</td>
				<td></td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><input type="date" name="birthday"></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" id="sub" value="注册" /></td>
			</tr>
		</table>
	</form>
</body>
</html>