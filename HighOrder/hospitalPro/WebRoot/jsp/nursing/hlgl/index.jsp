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
		<title>信息搜索 - 中南大学湘雅三医院</title>
		<meta name="keywords" content="{tryine:common_key}" />
		<meta name="description" content="{tryine:common_des}" />
		<style type="text/css">
		.z_ywgl li a:hover{ background:url("../../ImgVedio/image/z_hover.png") no-repeat ; display:block; color:#000;}
		</style>
		<script>
window.onerror = function() {
	return true;
}
</script>
		<script>
TMall.BackTop.init();</script>
		<script>
var webdir = "/";</script>
		<script src="../../js/saved_resource.js" type="text/javascript">
</script>
		<script src="../../js/header.js" type="text/javascript">
</script>
		<script src="../../js/bckToTop.js" type="text/javascript">
</script>
		<script src="../../js/Dropdown/jquery-1.7.2.min.js"
			type="text/javascript">
</script>
		<script>
TMall.BackTop.init();</script>
		<script>
var webdir = "/";</script>
		<script src="../../js/tryine.js" type="text/javascript">
</script>
		
		<script type="text/javascript" src="../../js/jqueryslidemenu.js"
			type="text/javascript">
</script>
		
	<link rel="stylesheet" href="../../../css/jqueryslidemenu.css" type="text/css"></link>
	
	<link rel="stylesheet" href="../../../css/z_css.css" type="text/css"></link></head>

	<body>

		<!--top begin-->
		<div class="z_top"
			style="background: url('../ImgVedio/image/z_topbg.jpg') repeat-x;">
			<div class="z_topcon">
				<span><font id="datetime"></font><font id="ggtxt" color="red"
					style="font-size: 14px; font-weight: bold"></font> </span>
				<p>
					<a href="#" title="邮箱登录" target="_blank">邮箱登录</a> |
					<a href="../../mailbox/index.htm" title="院长信箱" target="_blank">院长信箱</a>
					|
					<a href="#" title="English" target="_blank">English</a> |
					<a href="../../tg/index.htm" title="投稿专线" target="_blank">投稿专线</a>
			</div>
		</div>
		<!--top end-->
		<!--head begin-->
		<div class="z_head">
			<div class="z_head_logo">
			<img src="../../../ImgVedio/image/z_logo.jpg"></img>
			<img src="../../../ImgVedio/image/2013071536077001.jpg"></img>
			<img src="../../../ImgVedio/image/z_tel.jpg"></img>
			</div>
			<div class="z_tel"
				style="background: url('../../ImgVedio/image/z_souch.jpg') no-repeat top right;">
				<form id="form1" name="form1" method="post"
					action="../../search/-keyword=请输入关键词！&boardid=.htm">
					<input class="search_key" value="请输入关键词！" onfocus="this.value=''"
						name="keyword" id="keyword">
					<input class="search_button" value="" type="submit"
						style="background: url('../../ImgVedio/image/z_s.jpg') no-repeat right top;" />
					<input type="hidden" name="boardid" value="0" />
				</form>
			</div>
		</div>
		<!--head end-->
		<!--nav begin-->
		<div class="z_nav"
			style="background: url('../../ImgVedio/image/z_libg.jpg') repeat-x;">
			<div class="z_navcon">
				<div class="jqueryslidemenu" id="myslidemenu">
					<ul>
						<li>
							<a href="../../index.jsp">首页</a>
						</li>
						<li>
							<a href="../../jsp/hosManage/manageIndex.jsp" title="医院管理1">医院管理</a>
							<ul>
								<li>
									<a href="../../yygl/yyjj/index.htm" title="医院简介1">医院简介</a>
								</li>
								<li>
									<a href="../../yygl/xrld/index.htm" title="现任领导1">现任领导</a>
								</li>
								<li>
									<a href="../../yygl/jgsz/index.htm" title="机构设置1">机构设置</a>
								</li>
								<li>
									<a href="../../yygl/gzzd/index.htm" title="规章制度1">规章制度</a>
								</li>
								<li>
									<a href="../../itc/itc.html" title="医院信息1">医院信息</a>
								</li>
								<li>
									<a href="#" title="远程医疗1">远程医疗</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="../../jsp/hosSever/index.jsp" title="医疗服务1">医疗服务</a>
							<ul>
								<li>
									<a href="#" title="科室导航1">科室导航</a>
								</li>
								<li>
									<a href="#" title="特约专家1">特约专家</a>
								</li>
								<li>
									<a href="#" title="肥胖代谢病外科1">肥胖代谢病外科</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="../../jsp/Employmentguide/index.jsp" title="就医指南1">就医指南</a>
						</li>
						<li>
							<a href="../../jsp/nursing/index.jsp" title="护理风采1">护理风采</a>
							<ul>
								<li>
									<a href="../../hlfc/hlgk/index.htm" title="护理概况1">护理概况</a>
								</li>
								<li>
									<a href="../../hlfc/hlgl/index.htm" title="护理管理1">护理管理</a>
								</li>
								<li>
									<a href="../../hlfc/hlxk/index.htm" title="护理学科1">护理学科</a>
								</li>
								<li>
									<a href="../../hlfc/jxjyh/index.htm" title="继续教育1">继续教育</a>
								</li>
								<li>
									<a href="../../hlfc/hsfc/index.htm" title="护士风采1">护士风采</a>
								</li>
								<li>
									<a href="../../hlfc/hlxz/index.htm" title="护理下载1">护理下载</a>
								</li>
								<li>
									<a href="#" title="护理新闻1">护理新闻</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="../../jsp/M_enducation/index.jsp" title="医学教育1">医学教育</a>
							<ul>
								<li>
									<a href="#" title="研究生教育网1">研究生教育网</a>
								</li>
								<li>
									<a href="../../yxjy/zyys/index.htm" title="医师培训1">医师培训</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="../../jsp/scientificresearch/index.jsp" title="科学研究1">科学研究</a>
							<ul>
								<li>
									<a href="#" title="伦理委员会1">伦理委员会</a>
								</li>
								<li>
									<a href="#" title="临床试验机构1">临床试验机构</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="../../partyGroup/index.jsp" title="党建群团1">党建群团</a>
							<ul>
								<li>
									<a target="_blank" href="../../djqt/index.htm" title="党建网">党建网</a>
								</li>
								<li>
									<a target="_blank" href="#" title="纪检监察网">纪检监察网</a>
								</li>
								<li>
									<a target="_blank" href="../../zgzj/index.htm" title="工会">工会</a>
								</li>
								<li>
									<a target="_blank" href="../../tw/index.htm" title="团委">团委</a>
								</li>
							</ul>

						</li>
						<li>
							<a href="../../jsp/hosCulture/index.jsp" title="医院文化1">医院文化</a>
							<ul>
								<li>
									<a href="index.htm" title="精神理念1">精神理念</a>
								</li>
								<li>
									<a href="../yyxx/index.htm" title="医院形象1">医院形象</a>
								</li>
								<li>
									<a href="../yyry/index.htm" title="医院荣誉1">医院荣誉</a>
								</li>
								<li>
									<a href="../jzwh/index.htm" title="建筑文化1">建筑文化</a>
								</li>
								<li>
									<a href="../yylc/index.htm" title="医院历程1">医院历程</a>
								</li>
								<li>
									<a href="../hdjy/index.htm" title="活动剪影1">活动剪影</a>
								</li>
								<li>
									<a href="../picture/index.htm" title="经典图片1">经典图片</a>
								</li>
								<li>
									<a href="../whys/index.htm" title="文化元素1">文化元素</a>
								</li>
							</ul>
						</li>
						<li id="nobg">
							<a href="../../jsp/OfficeSystem/index.jsp" title="办公系统1">办公系统</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!--nav end-->


		<div class="z_spcon"
			style="background: url('../../ImgVedio/image/z_leftbt.gif') no-repeat left bottom;">
			<!--人物风采 left-->
			<div class="z_rw_l">
				<div class="z_rw_con"
					style="background: url('../../ImgVedio/image/z_lbg.jpg') repeat-y center;">
					<div class="z_rw_top"
						style="background: url('../../ImgVedio/image/z_top.jpg') no-repeat top;">
						<h2>
							护理风采
						</h2>
						<ul class="z_ywgl">
						
							<li style="background:url('../../ImgVedio/image/z_dian.png') no-repeat left center;"}>
								<a href="hlgl/index.jsp" title="护理管理">护理管理</a>
							</li>
							<li style="background:url('../../ImgVedio/image/z_dian.png') no-repeat left center;"}>
								<a href="hlxk/index.jsp" title="护理学科">护理学科</a>
							</li>
							<li style="background:url('../../ImgVedio/image/z_dian.png') no-repeat left center;"}>
								<a href="jxjy/index.jsp" title="继续教育">继续教育</a>
							</li>
							<li style="background:url('../../ImgVedio/image/z_dian.png') no-repeat left center;"}>
								<a href="hsfc/index.jsp" title="护士风采">护士风采</a>
							</li>
							<li style="background:url('../../ImgVedio/image/z_dian.png') no-repeat left center;"}>
								<a href="hlxz/index.jsp" title="护理下载">护理下载</a>
							</li>
							<li style="background:url('../../ImgVedio/image/z_dian.png') no-repeat left center;"}>
								<a href="hlxw/index.jsp" title="护理新闻">护理新闻</a>
							</li>
						</ul>

					</div>
					<div class="z_rw_bt"
						style="background: url('../../ImgVedio/image/z_lbt.jpg') no-repeat bottom;"></div>
				</div>
				<div class="clear"></div>
				<div class="z_lx">
					<div class="z_tg"
						style="background: url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="#" target="_blank">每日门诊</a>
						</h3>
					</div>
					<div class="z_wb"
						style="background: url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="#" target="_blank">预约体检</a>
						</h3>
					</div>
					<div class="z_jd"
						style="background: url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="../../tg/index.htm" target="_blank">投稿专线</a>
						</h3>
					</div>
					<div class="z_jd"
						style="background: url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="../../newsph/index.htm" target="_blank">热门点击</a>
						</h3>
					</div>
					<div class="z_jd2"
						style="background: url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="../../news/index.htm" target="_blank">医院新闻</a>
						</h3>
					</div>
				</div>
			</div>
			<div class="z_rw_r">
				<div class="z_title">
					<h3>
						现任领导
					</h3>
					<span>当前位置：<a href="../../index.htm"
						tppabs="http://www.xy3yy.com/">首页</a> > 医院管理 > <a href="index.htm"
						tppabs="http://www.xy3yy.com/yygl/xrld/">现任领导</a> </span>
				</div>
				<!--    <ul class="z_ys">
      <li> <span><a href="/yygl/xrld/6488.html" title="党委书记  罗爱静"><img src="/manage/leaders/images/20100802080019.jpg" alt="党委书记  罗爱静" width="169" height="113" /></a></span>        <dl>          <dt>党委书记  罗爱静</dt>          <dd>罗爱静，女，1962年生，湖南常德人，中共党员，教授，博士生导师，中南大学湘雅三医院党委书记，享受国务院政府特殊津贴专家。中南大学第一届、第二届党委委员，2004年入选湖南省“121工程”人才。兼任湖南省...<a href="/yygl/xrld/6488.html" title="党委书记  罗爱静">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6489.html" title="院长 陈方平"><img src="/manage/leaders/images/20100730174611.jpg" alt="院长 陈方平" width="169" height="113" /></a></span>        <dl>          <dt>院长 陈方平</dt>          <dd>陈方平，男，1958年生，湖南湘乡人，中共党员，教授，博士生导师，中南大学湘雅三医院院长，享受国务院政府特殊津贴专家。先后在美国SUNYSB、美国纽约Mt.Sinai医院、法国巴黎RobertDebre医院进修学习。兼任湖...<a href="/yygl/xrld/6489.html" title="院长 陈方平">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6490.html" title="党委副书记 纪委书记 吴希林"><img src="/manage/leaders/images/20100730174740.jpg" alt="党委副书记 纪委书记 吴希林" width="169" height="113" /></a></span>        <dl>          <dt>党委副书记 纪委书记 吴希林</dt>          <dd>吴希林，男，1968年生，湖南芷江人，中共党员，副研究员，中南大学湘雅三医院党委副书记、纪委书记。1991年毕业于湖南师范大学教育系教育心理学专业，毕业后在湖南医科大学科技处、校科协从事科技管理工作；...<a href="/yygl/xrld/6490.html" title="党委副书记 纪委书记 吴希林">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6492.html" title="副院长  袁洪"><img src="/manage/leaders/images/20100730175030.jpg" alt="副院长  袁洪" width="169" height="113" /></a></span>        <dl>          <dt>副院长  袁洪</dt>          <dd>袁洪，男，1958年生，湖南长沙人，中共党员，教授，博士生导师，中南大学湘雅三医院副院长。1975年参加工作，1983年获衡阳医学院学士学位，1986年至1988年攻读湖南医学院内科学专业硕士研究生，2003年至2006...<a href="/yygl/xrld/6492.html" title="副院长  袁洪">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6493.html" title="副院长  朱晒红"><img src="/manage/leaders/images/20100730175145.jpg" alt="副院长  朱晒红" width="169" height="113" /></a></span>        <dl>          <dt>副院长  朱晒红</dt>          <dd>朱晒红，男，1964年生，湖北宜昌人，中共党员，教授，博士生导师，中南大学湘雅三医院副院长。兼任中南大学医用材料与器械研究中心副主任，湖南医学会第十二届理事会理事，湖南医师协会第一届理事会理事，中...<a href="/yygl/xrld/6493.html" title="副院长  朱晒红">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6494.html" title="副院长  黄进华"><img src="/manage/leaders/images/20100730175308.jpg" alt="副院长  黄进华" width="169" height="113" /></a></span>        <dl>          <dt>副院长  黄进华</dt>          <dd>黄进华，男，1960年生，湖南长沙人，中共党员，教授，硕士生导师，中南大学湘雅三医院副院长。1983年毕业于湘雅医学院，留校任湘雅二医院皮肤科医生。1986年至1989年攻读皮肤科专业硕士研究生，获医学硕士学...<a href="/yygl/xrld/6494.html" title="副院长  黄进华">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6495.html" title="副院长  黄飞舟"><img src="/manage/leaders/images/20100730175348.jpg" alt="副院长  黄飞舟" width="169" height="113" /></a></span>        <dl>          <dt>副院长  黄飞舟</dt>          <dd>黄飞舟，男，1961年生，湖南邵阳人，中共党员，教授，博士生导师，中南大学湘雅三医院副院长。1983年本科毕业于湖南医科大学，1996年任中南大学三医院普外科副主任，2000年晋升为外科学主任医师，2006年任中...<a href="/yygl/xrld/6495.html" title="副院长  黄飞舟">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6496.html" title="党委副书记 邓云龙"><img src="/manage/leaders/images/20110511165630.jpg" alt="党委副书记 邓云龙" width="169" height="113" /></a></span>        <dl>          <dt>党委副书记 邓云龙</dt>          <dd>邓云龙，男，1963年生，湖南浏阳人，中共党员，农工民主党员，教授，博士生导师，中南大学湘雅三医院党委副书记。湖南省首批新世纪“121”人才工程入选专家，美国华盛顿大学医学院高级访问学者。兼中南大学心...<a href="/yygl/xrld/6496.html" title="党委副书记 邓云龙">+了解详情</a></dd>        </dl>      </li>      <li> <span><a href="/yygl/xrld/6491.html" title="副院长 杨飞龙"><img src="/Upfile/20141216/2014121664637409.jpg" alt="副院长 杨飞龙" width="169" height="113" /></a></span>        <dl>          <dt>副院长 杨飞龙</dt>          <dd>杨飞龙，男，1973年8月生，湖南邵东人，汉族，中共党员，副研究员，管理学在读博士。中南大学湘雅三医院副院长。1997年毕业于湖南师范大学文学院，1996年至1997年担任湖南省学联执行主席。1999年担任湖南医科...<a href="/yygl/xrld/6491.html" title="副院长 杨飞龙">+了解详情</a></dd>        </dl>      </li>      
    </ul>-->

				<div class="z_picnr">
					<ul>
						<li>
							<a href="6488.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6488.html"
								title="党委书记  罗爱静"> <img src="../../../ImgVedio/image/ZJ_image/20100802080019.jpg"></img></a>
							<p>
								<a href="6488.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6488.html"
									title="党委书记  罗爱静">党委书记 罗爱静</a>
							</p>
						</li>
						<li>
							<a href="6489.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6489.html" title="院长 陈方平">
								<img src="../../../ImgVedio/image/ZJ_image/20100730174611.jpg"></img>
								 </a>
							<p>
								<a href="6489.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6489.html"
									title="院长 陈方平">院长 陈方平</a>
							</p>
						</li>
						<li>
							<a href="6490.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6490.html"
								title="党委副书记 纪委书记 吴希林">
								<img src="../../../ImgVedio/image/ZJ_image/20100730174740.jpg"></img>
								</a>
							<p>
								<a href="6490.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6490.html"
									title="党委副书记 纪委书记 吴希林">党委副书记 纪委书记 吴希林</a>
							</p>
						</li>
						<li>
							<a href="6492.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6492.html"
								title="副院长  袁洪"> 
								<img src="../../../ImgVedio/image/ZJ_image/20100730175030.jpg"></img>
								</a>
							<p>
								<a href="6492.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6492.html"
									title="副院长  袁洪">副院长 袁洪</a>
							</p>
						</li>
						<li>
							<a href="6493.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6493.html"
								title="副院长  朱晒红">
								<img src="../../../ImgVedio/image/ZJ_image/20100730175145.jpg"></img>
								 </a>
							<p>
								<a href="6493.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6493.html"
									title="副院长  朱晒红">副院长 朱晒红</a>
							</p>
						</li>
						<li>
							<a href="6494.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6494.html"
								title="副院长  黄进华">
								<img src="../../../ImgVedio/image/ZJ_image/20100730175308.jpg"></img>
								</a>
							<p>
								<a href="6494.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6494.html"
									title="副院长  黄进华">副院长 黄进华</a>
							</p>
						</li>
						<li>
							<a href="6495.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6495.html"
								title="副院长  黄飞舟">
								<img src="../../../ImgVedio/image/ZJ_image/20100730175348.jpg"></img>
								 </a>
							<p>
								<a href="6495.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6495.html"
									title="副院长  黄飞舟">副院长 黄飞舟</a>
							</p>
						</li>
						<li>
							<a href="6496.html"
								tppabs="http://www.xy3yy.com/yygl/xrld/6496.html"
								title="党委副书记 邓云龙">
								<img src="../../../ImgVedio/image/ZJ_image/20100802080019.jpg"></img>
								 </a>
							<p>
								<a href="6496.html"
									tppabs="http://www.xy3yy.com/yygl/xrld/6496.html"
									title="党委副书记 邓云龙">党委副书记 邓云龙</a>
							</p>
						</li>
						

					</ul>
				</div>
				<div class="clear"></div>
				<div class="quotes">
					<a> < </a><span class='current'>1</span><a> > </a><a>页次:1/1</a><a>共9篇</a>
				</div>
			</div>
		</div>
		<div class="clear"></div>
		<div class="z_foot">
			<div class="z_link">
				<h3>
					友情链接
				</h3>
				<p>
					<a href="#">人民网</a> |
					<a href="#">新华网</a> |
					<a href="#">中新网</a> |
					<a href="#">卫计委</a> |
					<a href="#">教育部</a> |
					<a href="#">湖南省政府</a> |
					<a href="#">红网</a> |
					<a href="#">省卫生计生委</a> |
					<a href="#">湖南省教育厅</a> |
					<a href="#">中南大学</a> |
					<a href="#">湘雅医学院</a> |
					<a href="#">湘雅医院</a> |
					<a href="#">湘雅二医院</a> |
					<a href="#">协和医院</a> |
					<a href="#">华西医院</a> |
					<a href="#">西京医院</a> |
					<a href="#">瑞金医院</a> |
					<a href="#">复旦中山医院</a> |
					<a href="#">武汉同济医院</a> |
					<a href="#">中山医院</a>
				</p>
			</div>
			<div class="z_gh">
				预约挂号：0731-88618577&nbsp;&nbsp;&nbsp;急救电话：0731-88618120&nbsp;&nbsp;&nbsp;总值班：0731-88618508
			</div>
			<div class="z_info">
				<div class="z_info_l">
					<p>
						医院地址：湖南省长沙市河西岳麓区桐梓坡路138号 中南大学湘雅三医院 版权所有
					</p>
					<p>
						湘教QS3-200505-000574 备案序号：湘ICP备05001139号 今日访问人数：3273 总访问人数：14083500
					</p>
					<p>
						技术支持：
						<a href="#">长沙网站建设</a>-
						<a href="#">创研科技</a>
					</p>
					<!-- Baidu Button BEGIN -->
					<div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare"
						style="position: absolute; left: 360px; bottom: -2px;">
						<span class="bds_more">分享到：</span>
						<a class="bds_tsina"></a>
						<a class="bds_qzone"></a>
						<a class="bds_tqq"></a>
						<a class="bds_renren"></a>
						<a class="shareCount"></a>
					</div>
					<script type="text/javascript" id="bdshare_js"
						data="type=tools&uid=0">
</script>
					<script type="text/javascript" id="bdshell_js">
</script>
					<script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion="
		+ Math.ceil(new Date() / 3600000)
</script>
					<!-- Baidu Button END -->
				</div>
				<div class="z_info_r">
					<img src="../../ImgVedio/image/z_ewm.jpg.png" width="77"
						height="77" />
				</div>
				<div class="xxx">
					<script type="text/javascript">
document
		.write(unescape("%3Cspan id='_ideConac' %3E%3C/span%3E%3Cscript src='../../../dcs.conac.cn/js/33/000/0000/60497944/CA330000000604979440004.js'/*tpa=http://dcs.conac.cn/js/33/000/0000/60497944/CA330000000604979440004.js*/ type='text/javascript'%3E%3C/script%3E"));</script>
				</div>
			</div>
		</div>
	</body>
</html>
