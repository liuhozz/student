<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%ResourceBundle res = ResourceBundle.getBundle("sqlStr"); %>  
<%
    String user = res.getString("user");
    String password = res.getString("password");
%>
<sql:setDataSource
	url="jdbc:sqlserver://localhost:1433;DatabaseName=hospital_db"
	driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
	 password="<%=password%>"
	user="<%=user%>"/>
<sql:query var="result"
	sql="select  top 1 iV_path  from Img_Vedio where iV_type='专家讲座' order by iv_id desc" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<!--
		-->
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link rel="stylesheet" href="css/2011/css/z_css.css" type="text/css"></link>
		<link rel="stylesheet" href="css/css/z_css.css" type="text/css"></link>
		<link rel="stylesheet" href="css/css/jqueryslidemenu.css"
			type="text/css"></link>
		<link href="css/video-js.min.css" rel="stylesheet">
		<!--<script src="js/video.min.js">
</script>-->
		<script type="text/javascript" src="css/backtop/saved_resource.js">
</script>

		<script type="text/javascript" src="css/backtop/header.js">
</script>


		<script type="text/javascript" src="css/backtop/bckToTop.js">
</script>
		<script>
TMall.BackTop.init();</script>
		<script>
var webdir = "/";</script>
		<script type="text/javascript" src="js/tab.js">
</script>
		<script type="text/javascript" src="js/jqueryslidemenu.js">
</script>
		<script type="text/javascript" src="js/jquery-1.7.2.min.js">
</script>
		<script type="text/javascript" src="js/1.js">
</script>

		<script type="text/javascript" src="js/changimages.js">
</script>
		<script type="text/javascript" src="js/jquery-1.7.2.min.js">
</script>

		<link rel="stylesheet" href="css/css/ad.css" type="text/css"></link>
	</head>

	<body>

		<div>
			<%@ include file="top.jsp"%>
		</div>
		<!--nav end-->
		<!--banner begin-->
		<div class="z_banner">
			<img src="ImgVedio/image/2013071163967533.jpg"></img>
		</div>
		<!--banner end-->
		<!-- content begin-->
		<div class="z_content">
			<div class="z_left">
				<ul class="h_ns">
					<li id="h_ns1" class="hover" onmouseover="setTab('h_ns',1,3)"
						onclick="window.location.href='news/index.htm'/*tpa=http://www.xy3yy.com/news/*/">
						医院新闻
					</li>
					<li id="h_ns2" onmouseover="setTab('h_ns',2,3)"
						onclick="window.location.href='news/mtjj/index.htm'/*tpa=http://www.xy3yy.com/news/mtjj/*/">
						媒体聚焦
					</li>
					<li id="h_ns3" onmouseover="setTab('h_ns',3,3)"
						onclick="window.location.href='Topic/index.htm'/*tpa=http://www.xy3yy.com/Topic/*/">
						专题新闻
					</li>
				</ul>
				<div class="z_nr2" id="con_h_ns_1">
					<ul>
						<li>
							<span>2016-04-14</span><a
								href="javascript:if(confirm('http://news.csu.edu.cn/info/1002/127015.htm  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://news.csu.edu.cn/info/1002/127015.htm'"
								tppabs="http://news.csu.edu.cn/info/1002/127015.htm"
								title="【特别报道】走近“中南大学综合改革”" target="_blank"
								style="color: #ff0000">【特别报道】走近“中南大学综合改革”</a>
						</li>
						<li>
							<span>2016-06-01</span><a href="news/zhxw/11189.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11189.html"
								title="中南大学湘雅三医院举行消防实战演习" target="_blank" style="color: #000000">中南大学湘雅三医院举行消防实战演习</a>
						</li>
						<li>
							<span>2016-05-31</span><a href="news/zhxw/11187.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11187.html"
								title="魅力形象训练营开营了——医院开展礼仪系列培训" target="_blank" style="color: ">魅力形象训练营开营了——医院开展礼...</a>
						</li>
						<li>
							<span>2016-05-31</span><a href="news/zhxw/11186.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11186.html"
								title="第二、第十党支部联合开展“两学一做”专题教育活动" target="_blank" style="color: ">第二、第十党支部联合开展“两学一做...</a>
						</li>
						<li>
							<span>2016-05-31</span><a href="news/zhxw/11185.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11185.html"
								title="我院对口帮扶学校回赠我院感谢牌匾" target="_blank" style="color: ">我院对口帮扶学校回赠我院感谢牌匾</a>
						</li>
						<li>
							<span>2016-05-30</span><a href="news/zhxw/11184.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11184.html"
								title="我院顺利完成“万名医师支援农村卫生工程”2016新化人民医院对口支援工作" target="_blank"
								style="color: ">我院顺利完成“万名医师支援农村卫生...</a>
						</li>
						<li>
							<span>2016-05-30</span><a href="news/zhxw/11182.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11182.html"
								title="我院为高校辅导员开展急救技能知识培训" target="_blank" style="color: ">我院为高校辅导员开展急救技能知识培训</a>
						</li>
						<li>
							<span>2016-05-30</span><a href="news/zhxw/11177.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11177.html"
								title="第七、第十一党支部联合开展“两学一做”专题教育活动" target="_blank"
								style="color: ">第七、第十一党支部联合开展“两学一...</a>
						</li>
						<li>
							<span>2016-05-30</span><a href="news/zhxw/11183.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11183.html"
								title="新湘雅基层大讲堂暨疼痛、康复、中医理论及实用技术培训班成功举办" target="_blank"
								style="color: #000000">新湘雅基层大讲堂暨疼痛、康复、中医...</a>
						</li>
						<li>
							<span>2016-05-29</span><a href="news/zhxw/11176.html"
								tppabs="http://www.xy3yy.com/news/zhxw/11176.html"
								title="妇科成功主办第二届妇科“热点问题湘雅论坛”" target="_blank" style="color: ">妇科成功主办第二届妇科“热点问题湘...</a>
						</li>
					</ul>
				</div>
				<div class="z_nr2 dis" id="con_h_ns_2">
					<ul>
						<li>
							<span>2016-05-24</span><a
								href="javascript:if(confirm('http://moment.rednet.cn/rednetcms/news/20160524/486966.html?from=timeline&isappinstalled=0  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://moment.rednet.cn/rednetcms/news/20160524/486966.html?from=timeline&isappinstalled=0'"
								tppabs="http://moment.rednet.cn/rednetcms/news/20160524/486966.html?from=timeline&isappinstalled=0"
								title="红网：湘雅三医院采用“红激光”治疗泌尿系统疾病" target="_blank"
								style="color: #000000">红网：湘雅三医院采用“红激光”治疗...</a>
						</li>
						<li>
							<span>2016-05-23</span><a
								href="javascript:if(confirm('http://hn.people.com.cn/n2/2016/0522/c356337-28378430.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://hn.people.com.cn/n2/2016/0522/c356337-28378430.html'"
								tppabs="http://hn.people.com.cn/n2/2016/0522/c356337-28378430.html"
								title="人民网：中南大学湘雅三医院省内率先采用“红激光”治疗泌尿系统疾病" target="_blank"
								style="color: #000000">人民网：中南大学湘雅三医院省内率...</a>
						</li>
						<li>
							<span>2016-05-23</span><a
								href="javascript:if(confirm('http://www.hn.chinanews.com/news/0521/kjww/2016/268945.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.hn.chinanews.com/news/0521/kjww/2016/268945.html'"
								tppabs="http://www.hn.chinanews.com/news/0521/kjww/2016/268945.html"
								title="中新网：湖南首套红激光手术系统落户中南大学湘雅三医院" target="_blank"
								style="color: #000000">中新网：湖南首套红激光手术系统落户...</a>
						</li>
						<li>
							<span>2016-04-26</span><a
								href="javascript:if(confirm('http://jrnb.fengone.com/new/Html/2016-04-26/8130.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://jrnb.fengone.com/new/Html/2016-04-26/8130.html'"
								tppabs="http://jrnb.fengone.com/new/Html/2016-04-26/8130.html"
								title="今日女报：名医薛敏——湖南达芬奇机器人手术第一人" target="_blank"
								style="color: #000000">今日女报：名医薛敏——湖南达芬奇...</a>
						</li>
						<li>
							<span>2016-04-18</span><a
								href="javascript:if(confirm('http://tv.sohu.com/20160416/n444481393.shtml  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://tv.sohu.com/20160416/n444481393.shtml'"
								tppabs="http://tv.sohu.com/20160416/n444481393.shtml"
								title="东方卫视：中国异种移植取得重大突破 3名患者成功接受猪胰岛移植" target="_blank"
								style="color: #000000">东方卫视：中国异种移植取得重大突破&nbsp;3...</a>
						</li>
						<li>
							<span>2016-04-18</span><a
								href="javascript:if(confirm('http://www.mgtv.com/v/5/340/c/3114226.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.mgtv.com/v/5/340/c/3114226.html'"
								tppabs="http://www.mgtv.com/v/5/340/c/3114226.html"
								title="湖南新闻联播：医生辟谣：“低钠盐是送命盐”说法不靠谱" target="_blank"
								style="color: #000000">湖南新闻联播：医生辟谣：“低钠盐是...</a>
						</li>
						<li>
							<span>2016-04-18</span><a
								href="javascript:if(confirm('http://www.chinanews.com/m/sh/shipin/2016/04-15/news641271.shtml  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.chinanews.com/m/sh/shipin/2016/04-15/news641271.shtml'"
								tppabs="http://www.chinanews.com/m/sh/shipin/2016/04-15/news641271.shtml"
								title="中新网：中国异种移植重大突破 3名患者成功接受猪胰岛移植" target="_blank"
								style="color: #000000">中新网：中国异种移植重大突破&nbsp;3名...</a>
						</li>
						<li>
							<span>2016-04-18</span><a
								href="javascript:if(confirm('http://hunan.ifeng.com/a/20160415/4461670_0.shtml?from=singlemessage&isappinstalled=0  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://hunan.ifeng.com/a/20160415/4461670_0.shtml?from=singlemessage&isappinstalled=0'"
								tppabs="http://hunan.ifeng.com/a/20160415/4461670_0.shtml?from=singlemessage&isappinstalled=0"
								title="凤凰网：“五星级猪”胰岛移植治疗Ⅰ型糖尿病疗效居世界之冠" target="_blank"
								style="color: #000000">凤凰网：“五星级猪”胰岛移植治疗...</a>
						</li>
						<li>
							<span>2016-04-18</span><a
								href="javascript:if(confirm('http://moment.rednet.cn/rednetcms/news/jiankang/20160415/449885.html?from=groupmessage&isappinstalled=1  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://moment.rednet.cn/rednetcms/news/jiankang/20160415/449885.html?from=groupmessage&isappinstalled=1'"
								tppabs="http://moment.rednet.cn/rednetcms/news/jiankang/20160415/449885.html?from=groupmessage&isappinstalled=1"
								title="红网：“五星级猪”做供体 异种胰岛移植拯救糖尿病人" target="_blank"
								style="color: #000000">红网：“五星级猪”做供体&nbsp;异种胰岛移...</a>
						</li>
						<li>
							<span>2016-04-18</span><a
								href="javascript:if(confirm('http://m.voc.com.cn/wxhn/article/201604/201604151700406098.html?from=singlemessage&isappinstalled=0  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://m.voc.com.cn/wxhn/article/201604/201604151700406098.html?from=singlemessage&isappinstalled=0'"
								tppabs="http://m.voc.com.cn/wxhn/article/201604/201604151700406098.html?from=singlemessage&isappinstalled=0"
								title="新湖南：湖南“五星级猪”可治糖尿病！3位患者成功移植猪胰岛" target="_blank"
								style="color: #000000">新湖南：湖南“五星级猪”可治糖尿病！...</a>
						</li>
					</ul>
				</div>
				<div class="z_nr2 dis" id="con_h_ns_3">
					<ul>
						<li>
							<span>2013-08-22</span><a href="xymy/Index.html"
								tppabs="http://www.xy3yy.com/xymy/Index.html"
								title="湘雅名医  最美护士专题" target="_blank"
								style="color: rgb(255, 0, 0)">湘雅名医&nbsp;&nbsp;最美护士专题</a>
						</li>
						<li>
							<span>2016-05-31</span><a
								href="javascript:if(confirm('http://index.html/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://index.html/'"
								tppabs="http://index.html/" title="“两学一做”专题系列活动" target="_blank"
								style="">“两学一做”专题系列活动</a>
						</li>
						<li>
							<span>2016-02-29</span><a href="sdh2016/shouye.html"
								tppabs="http://www.xy3yy.com/sdh2016/shouye.html"
								title="2016年职代会、工代会、医院工作会议专题" target="_blank" style="">2016年职代会、工代会、医院工作会议专题</a>
						</li>
						<li>
							<span>2015-10-19</span><a href="lzwhj3/Index.html"
								tppabs="http://www.xy3yy.com/lzwhj3/Index.html" title="第三届廉政文化节"
								target="_blank" style="">第三届廉政文化节</a>
						</li>
						<li>
							<span>2015-04-28</span><a href="tdh/default.html"
								tppabs="http://www.xy3yy.com/tdh/default.html"
								title="共青团中南大学湘雅三医院第三次代表大会专题" target="_blank" style="">共青团中南大学湘雅三医院第三次代表...</a>
						</li>
						<li>
							<span>2015-02-11</span><a href="sdh2015/shouye.html"
								tppabs="http://www.xy3yy.com/sdh2015/shouye.html"
								title="2015年职代会、工代会、医院工作会议专题" target="_blank" style="">2015年职代会、工代会、医院工作会议专题</a>
						</li>
						<li>
							<span>2015-02-02</span><a href="xy3xxgk/Index.html"
								tppabs="http://www.xy3yy.com/xy3xxgk/Index.html" title="信息公开"
								target="_blank" style="">信息公开</a>
						</li>
						<li>
							<span>2014-09-15</span><a href="ddh2014/shouye.html"
								tppabs="http://www.xy3yy.com/ddh2014/shouye.html"
								title="中共中南大学湘雅三医院第三次代表大会" target="_blank" style="">中共中南大学湘雅三医院第三次代表大会</a>
						</li>
						<li>
							<span>2014-02-21</span><a href="sdh2014/shouye.html"
								tppabs="http://www.xy3yy.com/sdh2014/shouye.html"
								title="2014年职代会、工代会、医院工作会议专题" target="_blank" style="">2014年职代会、工代会、医院工作会议专题</a>
						</li>
						<li>
							<span>2013-11-04</span><a href="jkztc/Index.html"
								tppabs="http://www.xy3yy.com/jkztc/Index.html"
								title="爱心1+1健康直通车" target="_blank" style="">爱心1+1健康直通车</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="z_center"
				style="margin-top: 30px; background-color: green; padding-top: -100px; padding-right: 15px;">
				<c:forEach items="${result.rows}" var="IV">
					<embed src="<c:out value="${IV.iV_path}" />" allowFullScreen="true"
						quality="high" width="350" height="350" align="middle"
						allowScriptAccess="always" type="application/x-shockwave-flash"></embed>
				</c:forEach>
				<!-- http://player.youku.com/player.php/sid/XMzc5NjkwNDg0/v.swf -->

			</div>
			<div class="z_right">
				<ul class="h_ns">
					<li id="page1" class="hover" onmouseover="setTab('page',1,3)"
						onclick="location.href='notice/index.htm'/*tpa=http://www.xy3yy.com/notice/*/">
						通知公告
					</li>
					<li id="page2" onmouseover="setTab('page',2,3)"
						onclick="location.href='xsxx/index.htm'/*tpa=http://www.xy3yy.com/xsxx/*/">
						学术信息
					</li>
					<li id="page3" onmouseover="setTab('page',3,3)"
						onclick="location.href='jkjz/index.htm'/*tpa=http://www.xy3yy.com/jkjz/*/">
						健康讲座
					</li>
					<!--     <li id="page2" onmouseover="setTab('page',2,3)">学术信息</li>
      <li id="page3" onmouseover="setTab('page',3,3)">健康讲座</li>-->
				</ul>
				<div class="z_nr2" id="con_page_1">
					<ul>
						<li>
							<span>2016-06-01</span><a href="notice/11192.html"
								tppabs="http://www.xy3yy.com/notice/11192.html"
								title="转发中南大学《关于做好2016年度“长江学者奖励计划”人选推荐工作的通知》" target="_blank"
								style="color: rgb(255, 0, 0)">转发中南大学《关于做好2016年度...</a>
						</li>
						<li>
							<span>2016-05-30</span><a href="notice/11180.html"
								tppabs="http://www.xy3yy.com/notice/11180.html"
								title="关于做好2016年拟申报其他系列高级职务送审的通知" target="_blank"
								style="color: #000000">关于做好2016年拟申报其他系列高级...</a>
						</li>
						<li>
							<span>2016-05-24</span><a href="notice/11164.html"
								tppabs="http://www.xy3yy.com/notice/11164.html"
								title="转发关于2015年度湖南省科技计划项目绩效评价暨监督检查工作的通知" target="_blank"
								style="color: #000000">转发关于2015年度湖南省科技计划项目...</a>
						</li>
						<li>
							<span>2016-05-18</span><a href="notice/11152.html"
								tppabs="http://www.xy3yy.com/notice/11152.html"
								title="门诊楼、健康管理中心电缆敷设工程招标公告" target="_blank"
								style="color: #000000">门诊楼、健康管理中心电缆敷设工程...</a>
						</li>
						<li>
							<span>2016-05-17</span><a href="notice/11149.html"
								tppabs="http://www.xy3yy.com/notice/11149.html"
								title="医疗耗材SPD供应链管理试点项目邀标公告" target="_blank"
								style="color: #000000">医疗耗材SPD供应链管理试点项目邀标</a>
						</li>
						<li>
							<span>2016-05-17</span><a href="notice/11148.html"
								tppabs="http://www.xy3yy.com/notice/11148.html"
								title="关于大数据采集前置平台建设的招标公告" target="_blank"
								style="color: #000000">关于大数据采集前置平台建设的招标</a>
						</li>
						<li>
							<span>2016-05-17</span><a href="notice/11147.html"
								tppabs="http://www.xy3yy.com/notice/11147.html"
								title="关于2016年湖南省和中南大学教育教学改革研究项目实施工作的通知" target="_blank"
								style="color: #000000">关于2016年湖南省和中南大学教育教学...</a>
						</li>
						<li>
							<span>2016-05-16</span><a href="notice/11146.html"
								tppabs="http://www.xy3yy.com/notice/11146.html"
								title="2016年度中南大学湘雅三医院住院医师规范化培训招生简章" target="_blank"
								style="color: #000000">2016年度中南大学湘雅三医院住院医师...</a>
						</li>
						<li>
							<span>2016-05-13</span><a href="notice/11138.html"
								tppabs="http://www.xy3yy.com/notice/11138.html"
								title="湘雅三医院“雅荷”礼仪队招募令" target="_blank" style="color: #000000">湘雅三医院“雅荷”礼仪队招募令</a>
						</li>
						<li>
							<span>2016-05-12</span><a href="notice/11137.html"
								tppabs="http://www.xy3yy.com/notice/11137.html"
								title="2016年中南大学湘雅三医院博士研究生拟录取名单公示" target="_blank"
								style="color: #000000">2016年中南大学湘雅三医院博士研究生...</a>
						</li>
					</ul>
				</div>
				<div class="z_nr2 dis" id="con_page_2">
					<ul>
						<li>
							<span>2016-05-24</span><a href="xsxx/11167.html"
								tppabs="http://www.xy3yy.com/xsxx/11167.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
						<li>
							<span>2016-04-25</span><a href="xsxx/11074.html"
								tppabs="http://www.xy3yy.com/xsxx/11074.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
						<li>
							<span>2016-04-19</span><a href="xsxx/11058.html"
								tppabs="http://www.xy3yy.com/xsxx/11058.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
						<li>
							<span>2016-03-22</span><a href="xsxx/10908.html"
								tppabs="http://www.xy3yy.com/xsxx/10908.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
						<li>
							<span>2016-02-29</span><a href="xsxx/10816.html"
								tppabs="http://www.xy3yy.com/xsxx/10816.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
						<li>
							<span>2016-01-14</span><a href="xsxx/10727.html"
								tppabs="http://www.xy3yy.com/xsxx/10727.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
						<li>
							<span>2015-12-19</span><a href="xsxx/10650.html"
								tppabs="http://www.xy3yy.com/xsxx/10650.html"
								title="学术讲座—大数据分析与运用" target="_blank" style="color: #000000">学术讲座—大数据分析与运用</a>
						</li>
						<li>
							<span>2015-12-17</span><a href="xsxx/10637.html"
								tppabs="http://www.xy3yy.com/xsxx/10637.html"
								title="大内科临床病例讨论会议" target="_blank" style="color: #000000">大内科临床病例讨论会议</a>
						</li>
						<li>
							<span>2015-11-23</span><a href="xsxx/10514.html"
								tppabs="http://www.xy3yy.com/xsxx/10514.html"
								title="大内科临床病例讨论会议" target="_blank" style="color: #000000">大内科临床病例讨论会议</a>
						</li>
						<li>
							<span>2015-10-26</span><a href="xsxx/10410.html"
								tppabs="http://www.xy3yy.com/xsxx/10410.html" title="大内科临床病例讨论会"
								target="_blank" style="color: #000000">大内科临床病例讨论会</a>
						</li>
					</ul>
				</div>
				<div class="z_nr2 dis" id="con_page_3">
					<ul>
						<li>
							<span>2016-05-11</span><a href="jkjz/11132.html"
								tppabs="http://www.xy3yy.com/jkjz/11132.html"
								title="营养科：迎接“全民营养周”——相约湘雅三医院营养科" target="_blank"
								style="color: #000000">营养科：迎接“全民营养周”——相...</a>
						</li>
						<li>
							<span>2015-09-11</span><a href="jkjz/10187.html"
								tppabs="http://www.xy3yy.com/jkjz/10187.html"
								title="营养周一见：“糖人”饮食五大注意" target="_blank" style="color: #000000">营养周一见：“糖人”饮食五大注意</a>
						</li>
						<li>
							<span>2015-10-21</span><a href="jkjz/10386.html"
								tppabs="http://www.xy3yy.com/jkjz/10386.html"
								title="营养周一见：讲讲痛风饮食那点事" target="_blank" style="color: #000000">营养周一见：讲讲痛风饮食那点事</a>
						</li>
						<li>
							<span>2014-12-24</span><a href="jkjz/9194.html"
								tppabs="http://www.xy3yy.com/jkjz/9194.html" title="营养科：年终营养知识会"
								target="_blank" style="color: #000000">营养科：年终营养知识会</a>
						</li>
						<li>
							<span>2014-11-14</span><a href="jkjz/9017.html"
								tppabs="http://www.xy3yy.com/jkjz/9017.html"
								title="营养科：健康宣教课程预告" target="_blank" style="color: #000000">营养科：健康宣教课程预告</a>
						</li>
						<li>
							<span>2014-09-12</span><a href="jkjz/8785.html"
								tppabs="http://www.xy3yy.com/jkjz/8785.html"
								title="营养科：儿童与青少年饮食指导" target="_blank" style="color: #000000">营养科：儿童与青少年饮食指导</a>
						</li>
						<li>
							<span>2014-07-29</span><a href="jkjz/8616.html"
								tppabs="http://www.xy3yy.com/jkjz/8616.html" title="营养科：怎样健康减肥"
								target="_blank" style="color: #000000">营养科：怎样健康减肥</a>
						</li>
						<li>
							<span>2014-06-23</span><a href="jkjz/8467.html"
								tppabs="http://www.xy3yy.com/jkjz/8467.html" title="营养科：肾病营养那点事"
								target="_blank" style="color: #000000">营养科：肾病营养那点事</a>
						</li>
						<li>
							<span>2014-04-30</span><a href="jkjz/8137.html"
								tppabs="http://www.xy3yy.com/jkjz/8137.html" title="营养科：准妈妈们的营养"
								target="_blank" style="color: #000000">营养科：准妈妈们的营养</a>
						</li>
						<li>
							<span>2014-04-11</span><a href="jkjz/8046.html"
								tppabs="http://www.xy3yy.com/jkjz/8046.html"
								title="营养科：痛风患者如何饮食？" target="_blank" style="color: #000000">营养科：痛风患者如何饮食？</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- content end-->
		<div class="z_banner2" id="imgADPlayer">
		<script type="text/javascript">
		var arr2=['2016053171917097.jpg','2013071536077001.jpg','2013071163967533.jpg'];   
		var srcStr='ImgVedio/image/';
var counter=0;
window.onload=function run()    
{   
	setInterval(cycle, 2000);
	 
}

function cycle()
{
	counter++;	
	if(counter == arr2.length) counter = 0;
 	var obj=document.getElementById("img");
	obj.src =srcStr+arr2[counter];
}
	
		</script>
			<img src="ImgVedio/image/2016053171917097.jpg" id="img"></img>
		</div>
		<div class="z_pic">
			<div class="z_jyfw">
				<h3>
					就医服务
				</h3>
				<ul>
					<li>
						<a
							href="javascript:if(confirm('http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action'"
							tppabs="http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action"
							title="疾病查询" target="_blank"> <img
								src="ImgVedio/image/2013062938358705.jpg"></img> </a>
						<dl>
							<dt>
								疾病查询
							</dt>
							<dd>
								健康725，湖南预约挂号就医咨询平台，为您提供全面的疾病查询图谱...
								<a
									href="javascript:if(confirm('http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action'"
									tppabs="http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action"
									title="疾病查询" target="_blank">[查看详情]</a>
							</dd>
						</dl>
					</li>
					<li>
						<a
							href="javascript:if(confirm('http://shfw.xy3yy.com/zx.asp  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/zx.asp'"
							tppabs="http://shfw.xy3yy.com/zx.asp" title="健康咨询"
							target="_blank"><img
								src="ImgVedio/image/2013062941229157.jpg"></img> </a>
						<dl>
							<dt>
								健康咨询
							</dt>
							<dd>
								请问新生婴儿头部、脸部长皮肤癣后出现脓包是怎么回事
								<a
									href="javascript:if(confirm('http://shfw.xy3yy.com/zx.asp  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/zx.asp'"
									tppabs="http://shfw.xy3yy.com/zx.asp" title="健康咨询"
									target="_blank">[查看详情]</a>
							</dd>
						</dl>
					</li>
					<li>
						<a
							href="javascript:if(confirm('http://shfw.xy3yy.com/yhhd/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yhhd/'"
							tppabs="http://shfw.xy3yy.com/yhhd/" title="医患园地" target="_blank">
							<img src="ImgVedio/image/2013062941241049.jpg"></img> </a>
						<dl>
							<dt>
								医患园地
							</dt>
							<dd>
								[感谢信]刘飞医生您好，非常感谢住院期间您对我的细心照料和关怀...
								<a
									href="javascript:if(confirm('http://shfw.xy3yy.com/yhhd/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yhhd/'"
									tppabs="http://shfw.xy3yy.com/yhhd/" title="医患园地"
									target="_blank">[查看详情]</a>
							</dd>
						</dl>
					</li>
					<li>
						<a
							href="javascript:if(confirm('http://shfw.xy3yy.com/jyservice/ybzl/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/jyservice/ybzl/'"
							tppabs="http://shfw.xy3yy.com/jyservice/ybzl/" title="医保专栏"
							target="_blank"> <img
								src="ImgVedio/image/2013062941255345.jpg"></img> </a>
						<dl>
							<dt>
								医保专栏
							</dt>
							<dd>
								什么是起付标准？是指基本医疗保险统筹基金开始支付的标准三级医...
								<a
									href="javascript:if(confirm('http://shfw.xy3yy.com/jyservice/ybzl/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/jyservice/ybzl/'"
									tppabs="http://shfw.xy3yy.com/jyservice/ybzl/" title="医保专栏"
									target="_blank">[查看详情]</a>
							</dd>
						</dl>
					</li>
					<div class="clear">
					</div>
				</ul>
			</div>
			<div class="clear">
			</div>
			<div class="z_zjfc">
				<h3>
					特约专家
					<b><a
						href="javascript:if(confirm('http://www.xy3yy-shfw.com/yhhd/  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://www.xy3yy-shfw.com/yhhd/'"
						tppabs="http://www.xy3yy-shfw.com/yhhd/" target="_blank">更多>></a>
					</b>
				</h3>
				<div id="scrollDiv1">
					<ul>
						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/dnk/xnk/8.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/dnk/xnk/8.html'"
								tppabs="http://shfw.xy3yy.com/dnk/xnk/8.html" title="张梦玺 教授"
								target="_blank"><img
									src="ImgVedio/image/ZJ_image/2013070469683657.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/dnk/xnk/8.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/dnk/xnk/8.html'"
								tppabs="http://shfw.xy3yy.com/dnk/xnk/8.html" title="张梦玺 教授"
								target="_blank">张梦玺 教授</a> </span>
						</li>



						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/5.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/5.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/5.html" title="连乃文 教授"
								target="_blank"> <img
									src="ImgVedio/image/ZJ_image/2013070471081033.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/5.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/5.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/5.html" title="连乃文 教授"
								target="_blank">连乃文 教授</a> </span>
						</li>

						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/5.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/5.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/5.html" title="连乃文 教授"
								target="_blank"> <img
									src="ImgVedio/image/ZJ_image/2013070470727097.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/5.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/5.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/5.html" title="连乃文 教授"
								target="_blank">连乃文 教授</a> </span>
						</li>
						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/92.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/92.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/92.html" title="杨作成 教授"
								target="_blank"> <img
									src="ImgVedio/image/ZJ_image/2013070470770609.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/92.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/92.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/92.html" title="杨作成 教授"
								target="_blank">杨作成 教授</a> </span>
						</li>
						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/91.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/91.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/91.html" title="赵玲玲 教授"
								target="_blank"> <img
									src="ImgVedio/image/ZJ_image/2013070470826049.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/fkekgrk/ek/91.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/fkekgrk/ek/91.html'"
								tppabs="http://shfw.xy3yy.com/fkekgrk/ek/91.html" title="赵玲玲 教授"
								target="_blank">赵玲玲 教授</a> </span>
						</li>
						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/dnk/pfk/44.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/dnk/pfk/44.html'"
								tppabs="http://shfw.xy3yy.com/dnk/pfk/44.html" title="杨培明 教授"
								target="_blank"> <img
									src="ImgVedio/image/ZJ_image/2013070470943505.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/dnk/pfk/44.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/dnk/pfk/44.html'"
								tppabs="http://shfw.xy3yy.com/dnk/pfk/44.html" title="杨培明 教授"
								target="_blank">杨培明 教授</a> </span>
						</li>


						<li>
							&nbsp;
							<a
								href="javascript:if(confirm('http://shfw.xy3yy.com/yjks/fsk/105.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yjks/fsk/105.html'"
								tppabs="http://shfw.xy3yy.com/yjks/fsk/105.html" title="王维 教授"
								target="_blank"> <img
									src="ImgVedio/image/ZJ_image/2013070471011857.jpg"></img> </a><span><a
								href="javascript:if(confirm('http://shfw.xy3yy.com/yjks/fsk/105.html  \n\n该文件无法用 Teleport Ultra 下载, 因为 它是一个域或路径外部被设置为它的启始地址的地址。  \n\n你想在服务器上打开它?'))window.location='http://shfw.xy3yy.com/yjks/fsk/105.html'"
								tppabs="http://shfw.xy3yy.com/yjks/fsk/105.html" title="王维 教授"
								target="_blank">王维 教授</a> </span>
						</li>
					</ul>
					<div class="clear">
					</div>
					<!--<script type="text/javascript"> 
     var speed=20 
         marquePic2.innerHTML=marquePic1.innerHTML 
function Marquee()
{ 
       if(demo.scrollLeft>=marquePic1.scrollWidth)
	     { 
             demo.scrollLeft=0 
         }
		 else
		 { 
             demo.scrollLeft++ 
         } 
} 
     var MyMar=setInterval(Marquee,speed) 
     demo.onmouseover=function() {clearInterval(MyMar)} 
     demo.onmouseout=function() {MyMar=setInterval(Marquee,speed)} 
</script>-->
				</div>
			</div>
			<div class="clear">
			</div>
		</div>
		<div>
			<%@ include file="end.jsp"%>
		</div>

	</body>
	<!--
-->
</html>
