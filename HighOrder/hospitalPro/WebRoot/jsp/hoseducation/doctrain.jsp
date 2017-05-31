<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
window.onerror=function(){return true;}</script>
<!--[if IE 6]>
<script type="text/javascript" src="../../js/hosCulture/png.js"></script>
<![endif]-->
<script type="text/javascript" src="../../js/hosCulture/jquery.js"></script>
<script type="text/javascript" src="../../js/hosCulture/saved_resource.js"></script>
<script type="text/javascript" src="../../js/hosCulture/header.js"></script>
<script type="text/javascript" src="../../js/hosCulture/bckToTop.js"></script>
<script>TMall.BackTop.init();</script>
<script>var webdir="/";</script>
<script type="text/javascript" src="../../js/hosCulture/tryine.js"></script>
<link rel="stylesheet" href="../../css/hosCulture/jqueryslidemenu.css" type="text/css"></link>
<script type="text/javascript" src="../../js/hosCulture/jqueryslidemenu.js"></script>
<link rel="stylesheet" href="../../css/hosCulture/z_css.css" type="text/css"></link>
  </head>
  
  <body>
    <script type="text/javascript" src="../js/allenPh.js" tppabs="http://www.xy3yy.com/js/allenPh.js"></script>
<!--top begin-->
<div class="z_top">
  <div class="z_topcon">
    <span><font id="datetime"></font><font id="ggtxt" color="red" style="font-size:14px; font-weight:bold"></font></span>
    <p>
        <a href="javascript:if(confirm('http://mail.xy3yy.com/extmail/cgi/index.cgi  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://mail.xy3yy.com/extmail/cgi/index.cgi'" tppabs="http://mail.xy3yy.com/extmail/cgi/index.cgi" title="邮箱登录" target="_blank">邮箱登录</a> |         <a href="../mailbox/index.htm" tppabs="http://www.xy3yy.com/mailbox/" title="院长信箱" target="_blank">院长信箱</a> |         <a href="javascript:if(confirm('http://en.xy3yy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://en.xy3yy.com/'" tppabs="http://en.xy3yy.com/" title="English" target="_blank">English</a> |         <a href="../tg/index.htm" tppabs="http://www.xy3yy.com/tg/" title="投稿专线" target="_blank">投稿专线</a>    
  </div>
</div>
<!--top end-->
<!--head begin-->
<div class="z_head">
  <div class="z_head_logo"><img src="../../ImgVedio/image/z_logo.jpg" width="172" height="66"/>&#160;<img src="../../ImgVedio/image/2013071536077001.jpg" width="283" height="66" />
  <img src="../../ImgVedio/image/z_tel.jpg" width="253" height="66"/> </div>
  <div class="z_tel">
  <form id="form1" name="form1" method="post" action="-keyword=请输入关键词！&boardid=.htm" tppabs="http://www.xy3yy.com/search/?keyword=请输入关键词！&boardid=">
    <input class="search_key" value="请输入关键词！" onfocus="this.value=''" name="keyword" id="keyword">
    <input class="search_button" value="" type="submit" />
    <input type="hidden" name="boardid" value="0" />
  </form>
  </div>
</div>
<!--head end-->
<!--nav begin-->
<div class="z_nav">
  <div class="z_navcon">
  <div class="jqueryslidemenu" id="myslidemenu">
    <ul>
      <li><a href="../index.htm" tppabs="http://www.xy3yy.com/">首页</a></li>
            	<li >                        	<a href="../yygl/yyjj/index.htm" tppabs="http://www.xy3yy.com/yygl/yyjj/" title="医院管理1">医院管理</a><ul><li><a href="../yygl/yyjj/index.htm" tppabs="http://www.xy3yy.com/yygl/yyjj/" title="医院简介1">医院简介</a></li>                    <li><a href="../yygl/xrld/index.htm" tppabs="http://www.xy3yy.com/yygl/xrld/" title="现任领导1">现任领导</a></li><li><a href="../yygl/jgsz/index.htm" tppabs="http://www.xy3yy.com/yygl/jgsz/" title="机构设置1">机构设置</a></li>                    <li><a href="../yygl/gzzd/index.htm" tppabs="http://www.xy3yy.com/yygl/gzzd/" title="规章制度1">规章制度</a></li>                    <li><a href="../itc/itc.html" tppabs="http://www.xy3yy.com/itc/itc.html" title="医院信息1">医院信息</a></li>                    <li><a href="javascript:if(confirm('http://ycyl.xy3yy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://ycyl.xy3yy.com/'" tppabs="http://ycyl.xy3yy.com/" title="远程医疗1">远程医疗</a></li>                   </ul>         </li>            	<li >                    <a href="javascript:if(confirm('http://shfw.xy3yy.com/yhhd/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yhhd/'" tppabs="http://shfw.xy3yy.com/yhhd/" title="医疗服务1">医疗服务</a>                          <ul>                      <li><a href="javascript:if(confirm('http://shfw.xy3yy.com/yhhd/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yhhd/'" tppabs="http://shfw.xy3yy.com/yhhd/" title="科室导航1">科室导航</a></li>                    <li><a href="javascript:if(confirm('http://shfw.xy3yy.com/yhhd/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yhhd/'" tppabs="http://shfw.xy3yy.com/yhhd/" title="特约专家1">特约专家</a></li>                    <li><a href="javascript:if(confirm('http://www.xy3yyfpz.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xy3yyfpz.com/'" tppabs="http://www.xy3yyfpz.com/" title="肥胖代谢病外科1">肥胖代谢病外科</a></li>                   </ul>         </li>            	<li >                    <a href="javascript:if(confirm('http://shfw.xy3yy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/'" tppabs="http://shfw.xy3yy.com/" title="就医指南1">就医指南</a>                          <ul>                </ul>         </li>            	<li >                        	<a href="../hlfc/hlgk/index.htm" tppabs="http://www.xy3yy.com/hlfc/hlgk/" title="护理风采1">护理风采</a>                                  <ul>                      <li><a href="../hlfc/hlgk/index.htm" tppabs="http://www.xy3yy.com/hlfc/hlgk/" title="护理概况1">护理概况</a></li>                    <li><a href="../hlfc/hlgl/index.htm" tppabs="http://www.xy3yy.com/hlfc/hlgl/" title="护理管理1">护理管理</a></li>                    <li><a href="../hlfc/hlxk/index.htm" tppabs="http://www.xy3yy.com/hlfc/hlxk/" title="护理学科1">护理学科</a></li>                    <li><a href="../hlfc/jxjyh/index.htm" tppabs="http://www.xy3yy.com/hlfc/jxjyh/" title="继续教育1">继续教育</a></li>                    <li><a href="../hlfc/hsfc/index.htm" tppabs="http://www.xy3yy.com/hlfc/hsfc/" title="护士风采1">护士风采</a></li>                    <li><a href="../hlfc/hlxz/index.htm" tppabs="http://www.xy3yy.com/hlfc/hlxz/" title="护理下载1">护理下载</a></li>                    <li><a href="javascript:if(confirm('http://www.xy3yy.com/hlfc/hlxw1/  \n\n该文件无法用 Teleport Ultra 下载, 因为 服务器报告发生错误, 阻止了下载。  \n\n你想在服务器上打开它?'))window.location='http://www.xy3yy.com/hlfc/hlxw1/'" tppabs="http://www.xy3yy.com/hlfc/hlxw1/" title="护理新闻1">护理新闻</a></li>                   </ul>         </li>            	<ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><ul><li>                    <a href="#" title="医学教育1">医学教育</a>                          <ul>                      <li><a href="javascript:if(confirm('http://yjsb.xy3yy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://yjsb.xy3yy.com/'" tppabs="http://yjsb.xy3yy.com/" title="研究生教育网1">研究生教育网</a></li>                    <li><a href="../yxjy/zyys/index.htm" tppabs="http://www.xy3yy.com/yxjy/zyys/" title="医师培训1">医师培训</a></li>                   </ul>         </li></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul></ul>            	<li >                    <a href="javascript:if(confirm('http://www.xy3yykyb.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xy3yykyb.com/'" tppabs="http://www.xy3yykyb.com/" title="科学研究1">科学研究</a>                          <ul>                      <li><a href="javascript:if(confirm('http://xy3irb.xy3yy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://xy3irb.xy3yy.com/'" tppabs="http://xy3irb.xy3yy.com/" title="伦理委员会1">伦理委员会</a></li>                    <li><a href="javascript:if(confirm('http://gcp.xy3yy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://gcp.xy3yy.com/'" tppabs="http://gcp.xy3yy.com/" title="临床试验机构1">临床试验机构</a></li>                   </ul>         </li>            	<li >                    <a href="../djqt/index.htm" tppabs="http://www.xy3yy.com/djqt/" title="党建群团1">党建群团</a>                          <ul>            <li><a target="_blank" href="../djqt/index.htm" tppabs="http://www.xy3yy.com/djqt/" title="党建网">党建网</a></li>      <li><a target="_blank" href="javascript:if(confirm('http://172.30.3.81/project  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://172.30.3.81/project'" tppabs="http://172.30.3.81/project" title="纪检监察网">纪检监察网</a></li>      <li><a target="_blank" href="../zgzj/index.htm" tppabs="http://www.xy3yy.com/zgzj/" title="工会">工会</a></li>     <li><a target="_blank" href="../tw/index.htm" tppabs="http://www.xy3yy.com/tw/" title="团委">团委</a></li>              </ul>         </li>            	<li >                        	<a href="../culture/jsln/index.htm" tppabs="http://www.xy3yy.com/culture/jsln/" title="医院文化1">医院文化</a>                                  <ul>                      <li><a href="../culture/jsln/index.htm" tppabs="http://www.xy3yy.com/culture/jsln/" title="精神理念1">精神理念</a></li> <li><a href="../culture/yyxx/index.htm" tppabs="http://www.xy3yy.com/culture/yyxx/" title="医院形象1">医院形象</a></li>                    <li><a href="../culture/yyry/index.htm" tppabs="http://www.xy3yy.com/culture/yyry/" title="医院荣誉1">医院荣誉</a></li>                    <li><a href="../culture/jzwh/index.htm" tppabs="http://www.xy3yy.com/culture/jzwh/" title="建筑文化1">建筑文化</a></li>                    <li><a href="../culture/yylc/index.htm" tppabs="http://www.xy3yy.com/culture/yylc/" title="医院历程1">医院历程</a></li>                    <li><a href="../culture/hdjy/index.htm" tppabs="http://www.xy3yy.com/culture/hdjy/" title="活动剪影1">活动剪影</a></li>                    <li><a href="../culture/picture/index.htm" tppabs="http://www.xy3yy.com/culture/picture/" title="经典图片1">经典图片</a></li>                    <li><a href="../culture/whys/index.htm" tppabs="http://www.xy3yy.com/culture/whys/" title="文化元素1">文化元素</a></li>                   </ul>         </li>            	<li id="nobg">                    <a href="javascript:window.open('http://'+'xy3oa.xy3yy.com/login.htm','_blank')" title="办公系统1">办公系统</a> <ul> </ul> </li>      
    </ul>
  </div>
  </div>
</div>
<!--nav end-->


<div class="z_spcon">
<!--人物风采 left-->
<div class="z_rw_l">
<div class="z_rw_con">
<div class="z_rw_top">
<h2>医院文化</h2><ul class="z_ywgl"><li><a href="../yygl/yyjj/index.htm" tppabs="http://www.xy3yy.com/yygl/yyjj/" title="医师培训" >医师培训</a></li>  
</div>
<div class="z_rw_bt"></div>
</div>
<div class="clear"></div>
<div class="z_lx">
<div class="z_tg">
  <h3><a href="javascript:if(confirm('http://www.xy3yy-shfw.com/jyservice/daymz/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xy3yy-shfw.com/jyservice/daymz/'" tppabs="http://www.xy3yy-shfw.com/jyservice/daymz/" target="_blank">每日门诊</a></h3></div>
<div class="z_wb">
  <h3><a href="javascript:if(confirm('http://www.xykbs.com/happy/onlinebook.asp  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xykbs.com/happy/onlinebook.asp'" tppabs="http://www.xykbs.com/happy/onlinebook.asp" target="_blank">预约体检</a></h3></div>
<div class="z_jd">
  <h3><a href="../tg/index.htm" tppabs="http://www.xy3yy.com/tg/" target="_blank">投稿专线</a></h3></div>
<div class="z_jd">
  <h3><a href="../newsph/index.htm" tppabs="http://www.xy3yy.com/newsph/" target="_blank">热门点击</a></h3></div>
<div class="z_jd2">
  <h3><a href="../news/index.htm" tppabs="http://www.xy3yy.com/news/" target="_blank">医院新闻</a></h3></div>
</div>
</div>
<div class="z_rw_r">
<div class="z_title">
<h3><font color='red'>请输入关键词！</font></h3>
<span>当前位置：<a href="../index.htm" tppabs="http://www.xy3yy.com/">首页</a>>  <font color='red'>请输入关键词！</font>- 搜索结果如下：</span>
</div>
<ul class="z_newlist">
<li>暂时没有找到相关资料</li>
</ul>

<div class="clear"></div>
<div class="quotes"></div>
</div>

</div>
<div class="z_foot">
  <div class="z_link">
    <h3>友情链接</h3>
    <p>
        <a href="javascript:if(confirm('http://www.people.com.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.people.com.cn/'" tppabs="http://www.people.com.cn/" title="人民网">人民网</a> |         <a href="javascript:if(confirm('http://www.xinhuanet.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xinhuanet.com/'" tppabs="http://www.xinhuanet.com/" title="新华网">新华网</a> |         <a href="javascript:if(confirm('http://www.chinanews.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.chinanews.com/'" tppabs="http://www.chinanews.com/" title="中新网">中新网</a> |         <a href="javascript:if(confirm('http://www.nhfpc.gov.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.nhfpc.gov.cn/'" tppabs="http://www.nhfpc.gov.cn/" title="卫计委">卫计委</a> |         <a href="javascript:if(confirm('http://www.moe.gov.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.moe.gov.cn/'" tppabs="http://www.moe.gov.cn/" title="教育部">教育部</a> |         <a href="javascript:if(confirm('http://www.hunan.gov.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.hunan.gov.cn/'" tppabs="http://www.hunan.gov.cn/" title="湖南省政府">湖南省政府</a> |         <a href="javascript:if(confirm('http://www.rednet.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.rednet.cn/'" tppabs="http://www.rednet.cn/" title="红网">红网</a> |         <a href="javascript:if(confirm('http://www.hunanwst.gov.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.hunanwst.gov.cn/'" tppabs="http://www.hunanwst.gov.cn/" title="省卫生计生委">省卫生计生委</a> |         <a href="javascript:if(confirm('http://gov.hnedu.cn/index.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://gov.hnedu.cn/index.html'" tppabs="http://gov.hnedu.cn/index.html" title="湖南省教育厅">湖南省教育厅</a> |         <a href="javascript:if(confirm('http://www.csu.edu.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.csu.edu.cn/'" tppabs="http://www.csu.edu.cn/" title="中南大学">中南大学</a> |         <a href="javascript:if(confirm('http://www.xysm.csu.edu.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xysm.csu.edu.cn/'" tppabs="http://www.xysm.csu.edu.cn/" title="湘雅医学院">湘雅医学院</a> |         <a href="javascript:if(confirm('http://www.xiangya.com.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xiangya.com.cn/'" tppabs="http://www.xiangya.com.cn/" title="湘雅医院">湘雅医院</a> |         <a href="javascript:if(confirm('http://www.xyeyy.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xyeyy.com/'" tppabs="http://www.xyeyy.com/" title="湘雅二医院">湘雅二医院</a> |         <a href="javascript:if(confirm('http://www.pumch.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.pumch.cn/'" tppabs="http://www.pumch.cn/" title="协和医院">协和医院</a> |         <a href="javascript:if(confirm('http://www.cd120.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.cd120.com/'" tppabs="http://www.cd120.com/" title="华西医院">华西医院</a> |         <a href="javascript:if(confirm('http://xjwww.fmmu.edu.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://xjwww.fmmu.edu.cn/'" tppabs="http://xjwww.fmmu.edu.cn/" title="西京医院">西京医院</a> |         <a href="javascript:if(confirm('http://www.rjh.com.cn/pages/index.shtml  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.rjh.com.cn/pages/index.shtml'" tppabs="http://www.rjh.com.cn/pages/index.shtml" title="瑞金医院">瑞金医院</a> |         <a href="javascript:if(confirm('http://www.zs-hospital.sh.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.zs-hospital.sh.cn/'" tppabs="http://www.zs-hospital.sh.cn/" title="复旦中山医院">复旦中山医院</a> |         <a href="javascript:if(confirm('http://www.tjh.com.cn/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.tjh.com.cn/'" tppabs="http://www.tjh.com.cn/" title="武汉同济医院">武汉同济医院</a> |         <a href="javascript:if(confirm('http://www.gzsums.net/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.gzsums.net/'" tppabs="http://www.gzsums.net/" title="中山医院">中山医院</a>    
    </p>
  </div>
  <div class="z_gh">预约挂号：0731-88618577&nbsp;&nbsp;&nbsp;急救电话：0731-88618120&nbsp;&nbsp;&nbsp;总值班：0731-88618508</div>
  <div class="z_info">
    <div class="z_info_l">
      <p>医院地址：湖南省长沙市河西岳麓区桐梓坡路138号    中南大学湘雅三医院 版权所有 </p>
      <p>湘教QS3-200505-000574 备案序号：湘ICP备05001139号 今日访问人数：3273 总访问人数：14083500</p>
      <p>技术支持：<a href="javascript:if(confirm('http://www.tryine.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.tryine.com/'" tppabs="http://www.tryine.com/" title="长沙网站建设">长沙网站建设</a>-<a href="javascript:if(confirm('http://www.tryine.com/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.tryine.com/'" tppabs="http://www.tryine.com/" title="长沙网站建设">创研科技</a></p>
      <!-- Baidu Button BEGIN -->
      <div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare" style=" position:absolute; left:360px; bottom:-2px;">
       <span class="bds_more">分享到：</span> <a class="bds_tsina"></a> <a class="bds_qzone"></a> <a class="bds_tqq"></a> <a class="bds_renren"></a> <a class="shareCount"></a> </div>
      <script type="text/javascript" id="bdshare_js" data="type=tools&uid=0" ></script>
      <script type="text/javascript" id="bdshell_js"></script>
      <script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000)
</script>
      <!-- Baidu Button END -->
      </p>
    </div>
    <div class="z_info_r">
    <img src="../../ImgVedio/image/z_ewm.jpg.png" width="77" height="77"/></div>
<div class="xxx"><script type="text/javascript">document.write(unescape("%3Cspan id='_ideConac' %3E%3C/span%3E%3Cscript src='../../dcs.conac.cn/js/33/000/0000/60497944/CA330000000604979440004.js'/*tpa=http://dcs.conac.cn/js/33/000/0000/60497944/CA330000000604979440004.js*/ type='text/javascript'%3E%3C/script%3E"));</script></div>
  </div>
</div>
  </body>
</html>
