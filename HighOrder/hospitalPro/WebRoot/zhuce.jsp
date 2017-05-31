<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	
		<link rel="stylesheet" href="css/z_css.css" type="text/css"></link>
		<link rel="stylesheet" href="css/jqueryslidemenu.css" type="text/css"></link>
		<link rel="stylesheet" href="css/style.css" type="text/css"></link>
		<script type="text/javascript">
		function a(){
		  alert("注册成功！")
		}
		</script>
		</head>
         
		<body>
			<div>
				<center>
					<font size="12px;" style="font-family: 楷体" color="blue"><Strong>欢迎进入医院信息管理系统</Strong>
					</font>
				</center>
			</div>
			<hr width="150%" color="blue">
			
					
						<center>
							<s:form action="hos/zhuce.action">
								<table>
									<caption style="color: red;">
										<s:actionmessage />
									</caption>
									<tr>
										<td>
											用&nbsp;户&nbsp;名：
										</td>
										<td>
											<input type="text" name="username" />
										</td>
									</tr>
									<tr>
										<td>
											密&nbsp;&nbsp;&nbsp;&nbsp;码：
										</td>
										<td>
											<input type="password" name="password" />
										</td>

									</tr>
									<tr>
										<td>
											&nbsp;&nbsp;&nbsp;
										</td>
										<td>
											&nbsp;
											<input type="submit" value="用户注册" onclick="a();"/>

										</td>
									</tr>
								</table>
							</s:form>
						</center>
					


			


		</body>
</html>
