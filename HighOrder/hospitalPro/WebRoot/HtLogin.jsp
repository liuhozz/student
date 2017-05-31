<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>后台登录</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="js/jquery.js"></script>
<script src="js/verificationNumbers.js"></script>
<script src="js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
  //验证码
  createCode();
  //测试提交，对接程序删除即可
  $(".submit_btn").click(function(){
	  location.href="index.html";
	  });
});
</script>
</head>
<body>
<dl class="admin_login">
 <dt>
  <strong>站点后台管理系统</strong>
  <em>Management System</em>
 </dt>
 
 <s:form action="hos/login.action">
 <dd class="user_icon">
  <input type="text" name="username" placeholder="账号" class="login_txtbx"/>
 </dd>
 <dd class="pwd_icon">
  <input type="password" name="password" placeholder="密码" class="login_txtbx"/>
 </dd>
 <dd>
   <input type="submit" value="立即登陆" class="submit_btn"/>
 </dd>
 </s:form>
 
 <dd>
 <caption style="color: red;">
							<s:actionmessage />
						</caption>
  <p>© 2015-2016 DeathGhost 版权所有</p>
  
 </dd>
</dl>
</body>
</html>
