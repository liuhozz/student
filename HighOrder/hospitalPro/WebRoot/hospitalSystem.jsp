<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="html"%>
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

		<title>管理员登录</title>

		<link rel="stylesheet" href="css/z_css.css" type="text/css"></link>
		<link rel="stylesheet" href="css/jqueryslidemenu.css" type="text/css"></link>
		<link rel="stylesheet" href="css/style.css" type="text/css"></link>
	</head>

	<body>
		<div>
			<center>
				<font size="12px;" style="font-family: 楷体" color="blue"><Strong>欢迎进入医院信息管理系统</Strong>
				</font>
			</center>
		</div>
		<hr width="150%" color="blue">
		<div class="z_spcon">
			<!--人物风采 left-->
			<div class="z_rw_l">
				<div class="z_rw_con">
					<div id="menu">
						<ul>
							<h2 style="font-family: 楷体">
								医院管理
							</h2>
							<li>
								<a href="HtOffice.jsp">科室信息录入</a>
							</li>
							<li>
								<a href="hos/findks.action">科室信息查询</a>
							</li>
							<li>
								<a href="HtSpecialist.jsp">专家信息录入</a>
							</li>
							<li>
								<a href="hos/findSE.action">专家信息查询</a>
							</li>
							<li>
								<a href="ImgVedioUp.jsp">图片视频上传</a>
							</li>
							<li>
								<a href="hos/find.action">图片视频查询</a>
							</li>

							<li>
								<a href="HtLogin.jsp">退出/返回登录</a>
							</li>
						</ul>

					</div>
					<div class="z_rw_bt"
						style="background: url('../../ImgVedio/image/z_lbt.jpg') no-repeat bottom;"></div>
				</div>
				<div class="clear"></div>

			</div>
			<div class="z_rw_r">

				<div class="nyContent" style="margin-top: 100px">

				</div>


			</div>
		</div>




	</body>
</html>
