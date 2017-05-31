<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
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
			<form action="hos/list.action" method="get">
				<table>
					<caption>
						图片视频录入
					</caption>
					<tr>
						<td>
							类&nbsp;&nbsp;&nbsp;&nbsp;别：
						</td>
						<td>
							<input type="text" name="a" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							作&nbsp;&nbsp;&nbsp;&nbsp;者：
						</td>
						<td>
							<input type="text" name="b" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							名&nbsp;&nbsp;&nbsp;&nbsp;称：
						</td>
						<td>
							<input type="text" name="c" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							路&nbsp;&nbsp;&nbsp;&nbsp;径：
						</td>
						<td>
							<input type="text" name="d" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							上传日期：
						</td>
						<td>
							<input type="text" name="e" />
						</td>
					</tr>

					<tr>
						<td>
							&nbsp;&nbsp;
							<a href="hospitalSystem.jsp">返回</a>
						</td>
						<td>
							&nbsp;&nbsp;&nbsp;
							<input type="submit" value="图片视频上传" />
						</td>
					</tr>
				</table>
			</form>
		</center>
				</div>


			</div>
		</div>


		
	</body>
</html>
