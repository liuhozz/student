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
				<font size="12px;" style="font-family: ����" color="blue"><Strong>��ӭ����ҽԺ��Ϣ����ϵͳ</Strong>
				</font>
			</center>
		</div>
		<hr width="150%" color="blue">
		<div class="z_spcon">
			<!--������ left-->
			<div class="z_rw_l">
				<div class="z_rw_con">
					<div id="menu">
						<ul>
							<h2 style="font-family: ����">
								ҽԺ����
							</h2>
							<li>
								<a href="HtOffice.jsp">������Ϣ¼��</a>
							</li>
							<li>
								<a href="hos/findks.action">������Ϣ��ѯ</a>
							</li>
							<li>
								<a href="HtSpecialist.jsp">ר����Ϣ¼��</a>
							</li>
							<li>
								<a href="hos/findSE.action">ר����Ϣ��ѯ</a>
							</li>
							<li>
								<a href="ImgVedioUp.jsp">ͼƬ��Ƶ�ϴ�</a>
							</li>
							<li>
								<a href="hos/find.action">ͼƬ��Ƶ��ѯ</a>
							</li>
							<li>
								<a href="HtLogin.jsp">�˳�/���ص�¼</a>
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
						ͼƬ��Ƶ¼��
					</caption>
					<tr>
						<td>
							��&nbsp;&nbsp;&nbsp;&nbsp;��
						</td>
						<td>
							<input type="text" name="a" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							��&nbsp;&nbsp;&nbsp;&nbsp;�ߣ�
						</td>
						<td>
							<input type="text" name="b" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							��&nbsp;&nbsp;&nbsp;&nbsp;�ƣ�
						</td>
						<td>
							<input type="text" name="c" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							·&nbsp;&nbsp;&nbsp;&nbsp;����
						</td>
						<td>
							<input type="text" name="d" />
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							�ϴ����ڣ�
						</td>
						<td>
							<input type="text" name="e" />
						</td>
					</tr>

					<tr>
						<td>
							&nbsp;&nbsp;
							<a href="hospitalSystem.jsp">����</a>
						</td>
						<td>
							&nbsp;&nbsp;&nbsp;
							<input type="submit" value="ͼƬ��Ƶ�ϴ�" />
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
