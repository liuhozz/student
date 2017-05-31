<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<title>信息搜索 - 中南大学湘雅三医院</title>
		<meta name="keywords" content="{tryine:common_key}" />
		<meta name="description" content="{tryine:common_des}" />
		<script>
window.onerror = function() {
	return true;
}</script>
		<!--[if IE 6]>
<script type="text/javascript" src="../../js/hosCulture/png.js"></script>
<![endif]-->

		<script>
TMall.BackTop.init();</script>
		<script>
var webdir = "/";</script>


		<link rel="stylesheet" href="../../css/jqueryslidemenu.css"
			type="text/css"></link>
		<link rel="stylesheet" href="../../css/z_css.css" type="text/css"></link>
	</head>
	<body>		 
		<!--top end-->
		<!--head begin-->
		<div>
		<%@ include file="../../top.jsp" %>
		</div>
		 
		<!--head end-->
		 
<div class="" style="width: auto; height: 800px;">
	研究所介绍，
</div>










		<div>
		 <%@ include file="../../end.jsp" %>
		</div>
	</body>
</html>
