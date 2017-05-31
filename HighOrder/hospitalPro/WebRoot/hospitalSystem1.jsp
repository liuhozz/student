<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="html"%>
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
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery.js"></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
<script>
	(function($){
		$(window).load(function(){
			
			$("a[rel='load-content']").click(function(e){
				e.preventDefault();
				var url=$(this).attr("href");
				$.get(url,function(data){
					$(".content .mCSB_container").append(data); //load new content inside .mCSB_container
					//scroll-to appended content 
					$(".content").mCustomScrollbar("scrollTo","h2:last");
				});
			});
			
			$(".content").delegate("a[href='top']","click",function(e){
				e.preventDefault();
				$(".content").mCustomScrollbar("scrollTo",$(this).attr("href"));
			});
			
		});
	})(jQuery);
</script>
</head>
<body>
<!--header-->
<header>
 <h1><img src="images/admin_logo.png"/></h1>
 <ul class="rt_nav">
  <li><a href="index.jsp" target="_blank" class="website_icon">站点首页</a></li>
  
  
  <li><a href="HtLogin.jsp" class="quit_icon">安全退出</a></li>
 </ul>
</header>

<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="">首页</a></h2>
 <ul>
  <li>
   <dl>
    <dt>医院管理</dt>
    <!--当前链接则添加class:active-->
    <dd><a href="HtOffice.jsp" >科室信息录入</a></dd>
    <dd><a href="hos/findks.action">科室信息查询</a></dd>
    <dd><a href="HtSpecialist.jsp">专家信息录入</a></dd>
    <dd><a href="hos/findSE.action">专家信息查询</a></dd>
   </dl>
  </li>
  <li>
   <dl>
     <dd><a href="ImgVedioUp.jsp">图片视频上传</a></dd>
    <dd><a href="hos/find.action">图片视频查询</a></dd>
    <dd><a href="HtLogin.jsp">安全退出</a></dd>
   </dl>
  </li>
  <li>
   <dl>
   </dl>
  </li>
  <li>
   <dl>
    <dt>待添加</dt>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>待添加</dt>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>待添加</dt>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>待添加</dt>
    <dd><a href="#">待添加</a></dd>
    <dd><a href="#">待添加</a></dd>
   </dl>
  </li>
  <li>
   <p class="btm_infor">© 连浩钦 版权所有</p>
  </li>
 </ul>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
 
  <h1 style="color:red;font-size:50px;font-weight:bold;text-align:center;">后台管理中心</h1>
     <p style="color:red;font-size:16px;font-weight:bold;text-align:center;">感谢 <a href="http://www.cdwei.cn">连浩钦</a> </p>
     
 </div>
</section>
</body>
</html>
