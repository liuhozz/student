<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

		<title>My JSP 'HtSpecialist.jsp' starting page</title>

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

				<div class="nyContent" style="margin-right: 250px;">
					<center>
						<form action="hos/saveSE.action" method="get">
							<table>
								<caption>
									医生信息录入
								</caption>
								<tr>
									<td>
										姓&nbsp;&nbsp;&nbsp;&nbsp;名：
									</td>
									<td>
										<input name="a" type="text" />
									</td>
								</tr>
								<tr>
									<td>
										性&nbsp;&nbsp;&nbsp;&nbsp;别：
									</td>
									<td>
										<input name="b" type="text" />
									</td>
								</tr>
								<tr>
									<td>
										年&nbsp;&nbsp;&nbsp;&nbsp;龄：
									</td>
									<td>
										<input name="c" type="text" />
									</td>
								</tr>
								<tr>
									<td>
										电&nbsp;&nbsp;&nbsp;&nbsp;话：
									</td>
									<td>
										<input name="d" type="text" />
									</td>
								</tr>
								<tr>
									<td>
										专家介绍：
									</td>
									<td>
										<textarea rows="" cols="15" name="e"></textarea>
									</td>
								</tr>
								<tr>
									<td>
										职&nbsp;&nbsp;&nbsp;&nbsp;称：
									</td>
									<td>
										<input name="f" type="text" />
									</td>
								</tr>
								<tr>
									<td>
										&nbsp;&nbsp;
										<a href="hospitalSystem.jsp">返回</a>
									</td>
									<td>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<input type="submit" value="录入">
									</td>
								</tr>
							</table>
						</form>
					</center>
				</div>


			</div>
		</div>

		<!--
     <center>
    <form action="hos/saveSE.action">
    <table>
    <caption>医生信息录入</caption>
    <tr>
    	<td>姓&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
    	<td><input type="text" name="sE_name"/></td>
    	<td></td>
    </tr>
     <tr>
    	<td>性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
    	<td><input type="text" name="sE_sex"/></td>
    	<td></td>
    </tr>
     <tr>
    	<td>年&nbsp;&nbsp;&nbsp;&nbsp;龄：</td>
    	<td><input type="text" name="sE_age"/></td>
    	<td></td>
    </tr>
     <tr>
    	<td>电&nbsp;&nbsp;&nbsp;&nbsp;话：</td>
    	<td><input type="text" name="sE_tel"/></td>
    	<td></td>
    </tr>
     <tr>
    	<td>专家介绍：</td>
    	<td><textarea cols="15" rows="" name="sE_intro"></textarea>
    </tr>
     <tr>
    	<td>职&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
    	<td><input type="text" name="sE_pos"/></td>
    	<td></td>
    </tr>
    <tr>
   		<td>&nbsp;&nbsp;&nbsp;退出</td>
    	<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"/></td>
    </tr>
    </table>
    </form>
    </center>
  -->

	</body>
</html>
