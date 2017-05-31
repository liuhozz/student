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


		 
		<link rel="stylesheet" href="../../css/z_css.css" type="text/css"></link>		
	<link rel="stylesheet" href="../../css/hosServe/jqueryslidemenu.css" type="text/css"></link> 
	 
	<link rel="stylesheet" href="../../css/t_css.css" type="text/css"></link></head>
	<body>
		<!--top begin-->
		<div class="z_top">
			<div class="z_topcon">
				<span><font id="datetime"></font><font id="ggtxt" color="red"
					style="font-size: 14px; font-weight: bold"></font> </span>
				<p>
					<a href="#" title="邮箱登录" target="_blank">邮箱登录</a> |
					<a href="../mailbox/index.htm" title="院长信箱" target="_blank">院长信箱</a>|
					<a href="#" title="English" target="_blank">English</a> |
					<a href="../tg/index.htm" title="投稿专线" target="_blank">投稿专线</a>
			</div>
		</div>
		<!--top end-->
		<!--head begin-->
		<div class="z_head">
			<div class="z_head_logo">
				<img src="../../ImgVedio/image/z_logo.jpg" width="172" height="66" />
				&#160;
				<img src="../../ImgVedio/image/2013071536077001.jpg" width="283"
					height="66" />
				<img src="../../ImgVedio/image/z_tel.jpg" width="253" height="66" />
			</div>
		 
		</div>
		<!--head end-->
		<!--nav begin-->
		<div class="z_nav">
			<div class="z_navcon">
				<div class="jqueryslidemenu" id="myslidemenu">
					<ul>
						<li>
							<a href="../index.htm">首页</a>
						</li>
						<li>
							<a href="../yygl/yyjj/index.htm" title="服务动态1">服务动态</a>
							<ul>
								<li>
									<a href="../yygl/yyjj/index.htm" title="医院简介1">专家风采</a>
								</li>
								<li>
									<a href="../yygl/xrld/index.htm" title="现任领导1">现任领导</a>
								</li>
								<li>
									<a href="../yygl/jgsz/index.htm" title="机构设置1">机构设置</a>
								</li>
								<li>
									<a href="../yygl/gzzd/index.htm" title="规章制度1">规章制度</a>
								</li>
								<li>
									<a href="../itc/itc.html" title="医院信息1">医院信息</a>
								</li>
								<li>
									<a href="#" title="远程医疗1">远程医疗</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" title="医疗服务1">专家风采</a>
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
							<a href="#" title="就医指南1">就医服务</a>
							<ul>
							</ul>
						</li>
						<li>
							<a href="../hlfc/hlgk/index.htm" title="护理风采1">区域医疗合作</a>
							<ul>
								<li>
									<a href="../hlfc/hlgk/index.htm" title="护理概况1">护理概况</a>
								</li>
								<li>
									<a href="../hlfc/hlgl/index.htm" title="护理管理1">护理管理</a>
								</li>
								<li>
									<a href="../hlfc/hlxk/index.htm" title="护理学科1">护理学科</a>
								</li>
								<li>
									<a href="../hlfc/jxjyh/index.htm" title="继续教育1">继续教育</a>
								</li>
								<li>
									<a href="../hlfc/hsfc/index.htm" title="护士风采1">护士风采</a>
								</li>
								<li>
									<a href="../hlfc/hlxz/index.htm" title="护理下载1">护理下载</a>
								</li>
								<li>
									<a href="#" title="护理新闻1">护理新闻</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" title="医学教育1">健康教育培训</a>
							<ul>
								<li>
									<a href="#" title="研究生教育网1">研究生教育网</a>
								</li>
								<li>
									<a href="../yxjy/zyys/index.htm" title="医师培训1">医师培训</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" title="科学研究1">服务电话</a>
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
							<a href="../djqt/index.htm" title="党建群团1">远程服务</a>
							<ul>
								<li>
									<a target="_blank" href="../djqt/index.htm" title="党建网">党建网</a>
								</li>
								<li>
									<a href="#" title="纪检监察网">纪检监察网</a>
								</li>
								<li>
									<a target="_blank" href="../zgzj/index.htm" title="工会">工会</a>
								</li>
								<li>
									<a target="_blank" href="../tw/index.htm" title="团委">团委</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="../culture/jsln/index.htm" title="医院文化1">医院文化</a>
							<ul>
								<li>
									<a href="../culture/jsln/index.htm" title="精神理念1">精神理念</a>
								</li>
								<li>
									<a href="../culture/yyxx/index.htm" title="医院形象1">医院形象</a>
								</li>
								<li>
									<a href="../culture/yyry/index.htm" title="医院荣誉1">医院荣誉</a>
								</li>
								<li>
									<a href="../culture/jzwh/index.htm" title="建筑文化1">建筑文化</a>
								</li>
								<li>
									<a href="../culture/yylc/index.htm" title="医院历程1">医院历程</a>
								</li>
								<li>
									<a href="../culture/hdjy/index.htm" title="活动剪影1">活动剪影</a>
								</li>
								<li>
									<a href="../culture/picture/index.htm" title="经典图片1">经典图片</a>
								</li>
								<li>
									<a href="../culture/whys/index.htm">文化元素</a>
								</li>
							</ul>
						</li>
						<li id="nobg">
							<a
								href="javascript:window.open('http://'+'xy3oa.xy3yy.com/login.htm','_blank')"
								title="办公系统1">办公系统</a>
							<ul>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!--nav end-->
 <!--=S 搜索 -->
  <div class="search"><form action="/search/index.asp" method="get" onsubmit="return checkform()"><span><strong>问题搜索</strong>
     <input name="keyword" type="text" class="ss_k"/>
    <input name="input" type="image" src="/images/search_1.jpg" align="middle" />
    <img src="/images/search_2.jpg"  style="cursor:pointer" onclick="location.href='/yhhd/';" align="middle" />    </span></form>
    <p><b>关键词：</b><a href="/dnk/hxnk/" title="呼吸内科" target="_self">呼吸内科</a><a href="/dnk/xnk/" title="心内科" target="_self">心内科</a><a href="/dwk/sszx/" title="烧伤整形" target="_self">烧伤整形</a><a href="/dwk/sjwk/" title="神经外科" target="_self">神经外科</a><a href="/fkekgrk/ek/" title="儿科" target="_self">儿科</a><a href="/fkekgrk/xsek/" title="新生儿科" target="_self">新生儿科</a><a href="/fkekgrk/grk/" title="感染科" target="_self">感染科</a></p>
  </div>
  <!--=S 搜索 -->
<div class="con">
  <div class="news_ggw">
    <!--=S 社会服务动态 --> 
    <div class="h_news">
      <!--=S 标题 --> 
      <div class="t_title"><a href="shservice/" title="更多" class="more">更多&gt;&gt;</a><span>服务动态</span></div>
      <!--=E 标题 -->
      <div class="h_news_nr"><span><p><script type="text/javascript">
 
imgUrl1="/Upfile/6/7/2016/2016060754384085.jpg";
//imgtext=
imgLink1=escape("/shservice/Introduction/587.html");

imgUrl2="/Upfile/6/2/2016/2016060260646605.jpg";
//imgtext=
imgLink2=escape("/shservice/Introduction/585.html");

imgUrl3="/Upfile/6/2/2016/2016060260612629.jpg";
//imgtext=
imgLink3=escape("/shservice/news/584.html");

imgUrl4="/Upfile/6/1/2016/2016060130380101.jpg";
//imgtext=
imgLink4=escape("/shservice/news/581.html");

imgUrl5="/Upfile/5/31/2016/2016053129195749.jpg";
//imgtext=
imgLink5=escape("/shservice/news/580.html");


 var focus_width=180;
 var focus_height=118;
 var text_height=0;
 var swf_height = focus_height+text_height;
 
 var pics=imgUrl1+"|"+imgUrl2+"|"+imgUrl3+"|"+imgUrl4+"|"+imgUrl5;
 var links=imgLink1+"|"+imgLink2+"|"+imgLink3+"|"+imgLink4+"|"+imgLink5;
 //var texts=imgtext1+"|"+imgtext2+"|"+imgtext3+"|"+imgtext4+"|"+imgtext5
 
 document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');
 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="images/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F5F5F5">');
 document.write('<param name="menu" value="false"><param name=wmode value="opaque">');
 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
 document.write('</object>');
</script><object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="180" height="118"><param name="allowScriptAccess" value="sameDomain"><param name="movie" value="images/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F5F5F5"><param name="menu" value="false"><param name="wmode" value="opaque"><param name="FlashVars" value="pics=/Upfile/6/7/2016/2016060754384085.jpg|/Upfile/6/2/2016/2016060260646605.jpg|/Upfile/6/2/2016/2016060260612629.jpg|/Upfile/6/1/2016/2016060130380101.jpg|/Upfile/5/31/2016/2016053129195749.jpg&amp;links=/shservice/Introduction/587.html|/shservice/Introduction/585.html|/shservice/news/584.html|/shservice/news/581.html|/shservice/news/580.html&amp;borderwidth=180&amp;borderheight=118&amp;textheight=0"></object></p>
 

<b><a href="/shservice/Introduction/587.html" title="“国家临床执业医师资格分阶段考试试点”第一阶段临床基本技能考试工作圆满完成">“国家临床执业医师资格分阶段考试试点”第一阶段临床基本技能考试工作圆满完成</a></b><a href="/shservice/Introduction/587.html" title="“国家临床执业医师资格分阶段考试试点”第一阶段临床基本技能考试工作圆满完成">6月4日至5日，“国家临床执业医师资格分阶段考试试点”第一阶段临床基本技能考试在我院临床技能中心顺利举行。6月5日上午，在中南大学本科生院医...</a></span><a href="/shservice/Introduction/587.html" title="“国家临床执业医师资格分阶段考试试点”第一阶段临床基本技能考试工作圆满完成" class="red">查看详情&gt;&gt;</a></div>
      <!-- -->
      <ul>
        <li><span class="time">(2016-06-02)</span><a href="/shservice/Introduction/585.html" title="湘雅三医院开展“医+E信息服务到您‘家’”全院巡查活动">湘雅三医院开展“医+E信息服务到您‘家’”...</a></li>
        <li><span class="time">(2016-06-02)</span><a href="/shservice/news/584.html" title="“保护儿童，我们在行动”——记我院六一儿童节活动">“保护儿童，我们在行动”——记我院六一儿...</a></li>
        <li><span class="time">(2016-06-01)</span><a href="/shservice/news/581.html" title="妇科成功主办第二届妇科“热点问题湘雅论坛”">妇科成功主办第二届妇科“热点问题湘雅论坛...</a></li>
        <li><span class="time">(2016-05-31)</span><a href="/shservice/news/580.html" title="丁四清主任喜获“全国优秀护理部主任”称号">丁四清主任喜获“全国优秀护理部主任”称号...</a></li>
        <li><span class="time">(2016-05-31)</span><a href="/shservice/news/579.html" title="丁四清主任喜获“全国优秀护理部主任”称号">丁四清主任喜获“全国优秀护理部主任”称号...</a></li>
        <li><span class="time">(2016-05-31)</span><a href="/shservice/news/578.html" title="我院为高校辅导员开展急救技能知识培训">我院为高校辅导员开展急救技能知识培训...</a></li>
        <li><span class="time">(2016-05-26)</span><a href="/shservice/news/575.html" title="患者欲跳楼，瘦小护士一把将其抓住">患者欲跳楼，瘦小护士一把将其抓住...</a></li>
      </ul>
    </div>
    <!--=S 健康教育-->
    <div class="h_news jkjy">
      <!--=S 标题 -->
      <div class="t_title"><a href="Cooperation/hzdt/" title="更多" class="more">更多&gt;&gt;</a><span>区域医疗合作动态</span></div>
      <!--=E 标题 -->
      <div class="h_news_nr">
      <span><p><script type="text/javascript">
 
imgUrl1="/Upfile/6/6/2016/2016060658096393.jpg";
//imgtext=
imgLink1=escape("/Cooperation/hzdt/586.html");

imgUrl2="/Upfile/6/1/2016/2016060130457025.jpg";
//imgtext=
imgLink2=escape("/Cooperation/hzdt/583.html");

imgUrl3="/Upfile/6/1/2016/2016060130427245.jpg";
//imgtext=
imgLink3=escape("/Cooperation/hzdt/582.html");

imgUrl4="/Upfile/5/31/2016/2016053129132053.jpg";
//imgtext=
imgLink4=escape("/Cooperation/hzdt/577.html");

imgUrl5="/Upfile/5/31/2016/2016053129086877.jpg";
//imgtext=
imgLink5=escape("/Cooperation/hzdt/576.html");

 var focus_width=180;
 var focus_height=118;
 var text_height=0;
 var swf_height = focus_height+text_height;
 
 var pics=imgUrl1+"|"+imgUrl2+"|"+imgUrl3+"|"+imgUrl4+"|"+imgUrl5;
 var links=imgLink1+"|"+imgLink2+"|"+imgLink3+"|"+imgLink4+"|"+imgLink5;
 //var texts=imgtext1+"|"+imgtext2+"|"+imgtext3+"|"+imgtext4+"|"+imgtext5
 
 document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');
 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="images/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F5F5F5">');
 document.write('<param name="menu" value="false"><param name=wmode value="opaque">');
 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
 document.write('</object>');
</script><object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="180" height="118"><param name="allowScriptAccess" value="sameDomain"><param name="movie" value="images/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F5F5F5"><param name="menu" value="false"><param name="wmode" value="opaque"><param name="FlashVars" value="pics=/Upfile/6/6/2016/2016060658096393.jpg|/Upfile/6/1/2016/2016060130457025.jpg|/Upfile/6/1/2016/2016060130427245.jpg|/Upfile/5/31/2016/2016053129132053.jpg|/Upfile/5/31/2016/2016053129086877.jpg&amp;links=/Cooperation/hzdt/586.html|/Cooperation/hzdt/583.html|/Cooperation/hzdt/582.html|/Cooperation/hzdt/577.html|/Cooperation/hzdt/576.html&amp;borderwidth=180&amp;borderheight=118&amp;textheight=0"></object></p>
      
      
      <b><a href="/Cooperation/hzdt/586.html" title="湘雅三医院探索“三位一体”精准帮扶新模式">湘雅三医院探索“三位一体”精准帮扶新模式</a></b><a href="/Cooperation/hzdt/586.html" title="湘雅三医院探索“三位一体”精准帮扶新模式">6月4日，国家卫生计生委直管医院——中南大学湘雅三医院和贵州省黔东南州中医医院帮扶签约仪式暨“新湘雅第十届基层医院院长论坛”在贵州省凯里...</a></span><a href="/Cooperation/hzdt/586.html" title="湘雅三医院探索“三位一体”精准帮扶新模式" class="red">查看详情&gt;&gt;</a></div>
      <!-- -->
      <ul>
        <li><span class="time">(2016-06-01)</span><a href="/Cooperation/hzdt/583.html" title="我院对口帮扶学校回赠我院感谢牌匾">我院对口帮扶学校回赠我院感谢牌匾...</a></li>
        <li><span class="time">(2016-06-01)</span><a href="/Cooperation/hzdt/582.html" title="我院顺利完成“万名医师支援农村卫生工程”2016新化人民医院对口支援工作">我院顺利完成“万名医师支援农村卫生...</a></li>
        <li><span class="time">(2016-05-31)</span><a href="/Cooperation/hzdt/577.html" title="新湘雅基层大讲堂暨疼痛、康复、中医理论及实用技术培训班成功举办">新湘雅基层大讲堂暨疼痛、康复、中医...</a></li>
        <li><span class="time">(2016-05-31)</span><a href="/Cooperation/hzdt/576.html" title="湘雅三医院承办全国药物不良反应与合理用药新进展培训班">湘雅三医院承办全国药物不良反应与合...</a></li>
        <li><span class="time">(2016-05-26)</span><a href="/Cooperation/hzdt/572.html" title="我院护理感控实践案例参加湖南省案例竞赛创佳绩">我院护理感控实践案例参加湖南省案例...</a></li>
        <li><span class="time">(2016-05-24)</span><a href="/Cooperation/hzdt/570.html" title="泌尿外科成功举办中南泌尿男科新进展论坛">泌尿外科成功举办中南泌尿男科新进展...</a></li>
        <li><span class="time">(2016-05-23)</span><a href="/Cooperation/hzdt/567.html" title="肾内科举办“关爱肾脏日”肾友会">肾内科举办“关爱肾脏日”肾友会...</a></li>
      </ul>
    </div>
    <div class="clear"></div>
  <!--<div class="ggw"><script src="/Plug/GG.asp?id=1" language="javascript"></script></div>-->
    <!--=S 科室分类、就医服务、联系我们 -->
    <div class="h_ksfl">
      <!--=S 科室分类-->
      <div class="t_title"><span>科室分类与医师介绍</span></div>
      <!-- 
      <ul>
        <li>湘雅名医</li>
        <li>大内科简介</li>
        <li>大外科简介</li>
        <li>妇科、产科、儿科、感染科简介</li>
        <li>危急重症中心简介</li>
        <li>医技科室及其它科室简介</li>
      </ul>-->      
    <div id="sidebar">
    <!-- -->
    <div class="sidelist">
      <span><h3><a id="menu1" onmouseover="setTab(1,6)">湘雅名医</a></h3></span>
        	
    </div>
    <div class="sidelist">
      <span><h3><a id="menu2" onmouseover="setTab(2,6)">大内科简介</a></h3></span>
        
        
        
        <div class="i-list">
        <ul>
        
        
        
          
        
        
          <li><a href="dnk/xnk/" title="心内科">心内科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/xhnk/" title="消化内科">消化内科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/nfmk/" title="内分泌科">内分泌科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/xynk/" title="血液内科">血液内科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/sznk/" title="肾脏内科">肾脏内科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/zlnk/" title="肿瘤内科">肿瘤内科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/sjnk/" title="神经内科">神经内科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/pfk/" title="皮肤科">皮肤科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/zyk/" title="中医科">中医科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/lcxlk/" title="临床心理科">临床心理科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/qkyxk/" title="全科医学科">全科医学科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/lnbk/" title="老年病科（干部医疗中心）">老年病科（干部医疗中心）</a></li>
        
        
        
          
        
        
          <li><a href="yingyank/" title="营养科">营养科</a></li>
        
        
        
          
        
        
          <li><a href="dnk/xyjhzx2/" title="血液净化中心">血液净化中心</a></li>
        
        
        
          
        
        
          <li><a href="kfyxk/" title="康复医学科">康复医学科</a></li>
        
        
        </ul>
        </div>
        
        
          	
    </div>
    <div class="sidelist">
      <span><h3><a id="menu3" onmouseover="setTab(3,6)">大外科简介</a></h3></span>
        
        
        
        <div class="i-list">
        <ul>
        
        
        
          
        
        
          <li><a href="dwk/pwek/" title="普外二科">普外二科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/pwsk/" title="普外三科">普外三科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/gk/" title="骨科">骨科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/yzzk/" title="移植专科">移植专科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/mnwk/" title="泌尿外科">泌尿外科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/sszx/" title="烧伤整形">烧伤整形</a></li>
        
        
        
          
        
        
          <li><a href="dwk/sjwk/" title="神经外科">神经外科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/xxwk/" title="心胸外科">心胸外科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/ebhk/" title="耳鼻喉科">耳鼻喉科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/yk/" title="眼科">眼科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/kqk/" title="口腔科">口腔科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/mzk/" title="麻醉科">麻醉科</a></li>
        
        
        
          
        
        
          <li><a href="dwk/ttk/" title="疼痛科">疼痛科</a></li>
        
        
        </ul>
        </div>
        
        
          	
    </div>
    <div class="sidelist">
      <span><h3><a id="menu4" onmouseover="setTab(4,6)">妇科、产科、儿科、感染科简介</a></h3></span>
        
        
        
        <div class="i-list">
        <ul>
        
        
        
          
        
        
          <li><a href="fkekgrk/ck/" title="产科">产科</a></li>
        
        
        
          
        
        
          <li><a href="fkekgrk/ek/" title="儿科">儿科</a></li>
        
        
        
          
        
        
          <li><a href="fkekgrk/xsek/" title="新生儿科">新生儿科</a></li>
        
        
        
          
        
        
          <li><a href="fkekgrk/grk/" title="感染科">感染科</a></li>
        
        
        </ul>
        </div>
        
        
          	
    </div>
    <div class="sidelist">
      <span><h3><a id="menu5" onmouseover="setTab(5,6)">危急重症中心简介</a></h3></span>
        
        
        
        <div class="i-list">
        <ul>
        
        
        
          
        
        
          <li><a href="qtks/jzk/" title="急诊科">急诊科</a></li>
        
        
        </ul>
        </div>
        
        
          	
    </div>
    <div class="sidelist">
      <span><h3><a id="menu6" onmouseover="setTab(6,6)">医技科室及其它科室简介</a></h3></span>
        
        
        
        <div class="i-list">
        <ul>
        
        
        
          
        
        
          <li><a href="yjks/jyk/" title="检验科">检验科</a></li>
        
        
        
          
        
        
          <li><a href="yjks/csk/" title="超声科">超声科</a></li>
        
        
        
          
        
        
          <li><a href="yjks/blk/" title="病理科">病理科</a></li>
        
        
        
          
        
        
          <li><a href="yjks/sxzx/" title="输血科">输血科</a></li>
        
        
        
          
        
        
          <li><a href="yjks/hyx/" title="核医学科">核医学科</a></li>
        
        
        
          
        
        
          <li><a href="yjks/yjk/" title="药剂科">药剂科</a></li>
        
        
        
          
        
        
          <li><a href="yjks/qjzx/" title="腔镜中心">腔镜中心</a></li>
        
        
        
          
        
        
          <li><a href="yjks/hkgl/" title="健康管理中心">健康管理中心</a></li>
        
        
        
          
        
        
          <li><a href="yjks/etbj/" title="儿童保健中心">儿童保健中心</a></li>
        
        
        
          
        
        
          <li><a href="yjks/lcyl/" title="临床药理中心">临床药理中心</a></li>
        
        
        
          
        
        
          <li><a href="yjks/yxsy/" title="医学实验中心">医学实验中心</a></li>
        
        
        </ul>
        </div>
        
        
          	
    </div>
      </div>
    </div>
    <!--=E 科室分类-->
    <div class="h_pic">
        <!--roll-->
        
        <div class="Cont" id="Cont_1">
          <div class="ScrCont">
            <div id="List1_1">
              <!-- 图片列表 begin -->
              <div class="box"><a href="/xymy/412.html" title="陈方平" target="_blank"><img src="/Upfile/2013929/2013092933205783.jpg" alt="陈方平"></a><a href="/xymy/412.html" target="_blank" title="陈方平">陈方平[湘雅名医]</a></div>
             
              <div class="box"><a href="/xymy/424.html" title="黄飞舟" target="_blank"><img src="/Upfile/20141216/2014121636602725.jpg" alt="黄飞舟"></a><a href="/xymy/424.html" target="_blank" title="黄飞舟">黄飞舟[湘雅名医]</a></div>
             
              <div class="box"><a href="/xymy/423.html" title="朱晒红" target="_blank"><img src="/Upfile/20141216/2014121636565565.jpg" alt="朱晒红"></a><a href="/xymy/423.html" target="_blank" title="朱晒红">朱晒红[湘雅名医]</a></div>
             
              <div class="box" id="norig"><a href="/xymy/413.html" title="袁洪" target="_blank"><img src="/Upfile/2013929/2013092933219985.jpg" alt="袁洪"></a><a href="/xymy/413.html" target="_blank" title="袁洪">袁洪[湘雅名医]</a></div>
             
              <div class="box"><a href="/xymy/425.html" title="赵玲玲" target="_blank"><img src="/Upfile/20141216/2014121636789861.jpg" alt="赵玲玲"></a><a href="/xymy/425.html" target="_blank" title="赵玲玲">赵玲玲[湘雅名医]</a></div>
             
              <div class="box"><a href="/xymy/414.html" title="叶启发" target="_blank"><img src="/Upfile/2013929/2013092933442579.jpg" alt="叶启发"></a><a href="/xymy/414.html" target="_blank" title="叶启发">叶启发[湘雅名医]</a></div>
             
              <div class="box"><a href="/xymy/415.html" title="王维" target="_blank"><img src="/Upfile/2013926/2013092655572753.jpg" alt="王维"></a><a href="/xymy/415.html" target="_blank" title="王维">王维[湘雅名医]</a></div>
             
              <div class="box" id="norig"><a href="/xymy/416.html" title="薛敏" target="_blank"><img src="/Upfile/2013926/2013092655775221.jpg" alt="薛敏"></a><a href="/xymy/416.html" target="_blank" title="薛敏">薛敏[湘雅名医]</a></div>
             
              <div class="clear"></div>
              <!-- 图片列表 end -->
            </div>
            <div id="List2_1"></div>
          </div>
        </div>
        <div class="Cont" id="Cont_2" style="display:none">
          <div class="ScrCont">
            <div id="List1_1">
              <!-- 图片列表 begin -->
              <div class="box"><a href="/dnk/xyjhzx2/130.html" title="伍锟" target="_blank"><img src="/Upfile/201237/2012030742608361.jpg" alt="伍锟"></a><a href="/dnk/xyjhzx2/130.html" target="_blank" title="伍锟">伍锟[血液净化中心]</a></div>
             
              <div class="box"><a href="/dnk/hxnk/3.html" title="孙圣华" target="_blank"><img src="/Upfile/201237/2012030732113407.jpg" alt="孙圣华"></a><a href="/dnk/hxnk/3.html" target="_blank" title="孙圣华">孙圣华[呼吸内科]</a></div>
             
              <div class="box"><a href="/dnk/xynk/30.html" title="陈方平" target="_blank"><img src="/Upfile/201237/2012030737702125.jpg" alt="陈方平"></a><a href="/dnk/xynk/30.html" target="_blank" title="陈方平">陈方平[血液内科]</a></div>
             
              <div class="box" id="norig"><a href="/dnk/xynk/206.html" title="刘竞" target="_blank"><img src="/Upfile/2012511/2012051140202781.jpg" alt="刘竞"></a><a href="/dnk/xynk/206.html" target="_blank" title="刘竞">刘竞[血液内科]</a></div>
             
              <div class="box"><a href="/dnk/xynk/461.html" title="吕奔" target="_blank"><img src="" alt="吕奔"></a><a href="/dnk/xynk/461.html" target="_blank" title="吕奔">吕奔[血液内科]</a></div>
             
              <div class="box"><a href="/dnk/xynk/29.html" title="范自力" target="_blank"><img src="/Upfile/201237/2012030737624533.jpg" alt="范自力"></a><a href="/dnk/xynk/29.html" target="_blank" title="范自力">范自力[血液内科]</a></div>
             
              <div class="box"><a href="/dnk/xynk/204.html" title="蒋铁斌" target="_blank"><img src="/Upfile/2012511/2012051139938017.JPG" alt="蒋铁斌"></a><a href="/dnk/xynk/204.html" target="_blank" title="蒋铁斌">蒋铁斌[血液内科]</a></div>
             
              <div class="box" id="norig"><a href="/yingyank/185.html" title="刘敏" target="_blank"><img src="/Upfile/2012613/2012061355020593.JPG" alt="刘敏"></a><a href="/yingyank/185.html" target="_blank" title="刘敏">刘敏[营养科]</a></div>
             
              <div class="clear"></div>
              <!-- 图片列表 end -->
            </div>
            <div id="List2_1"></div>
          </div>
        </div>
        <div class="Cont" id="Cont_3" style="display:none">
          <div class="ScrCont">
            <div id="List1_1">
              <!-- 图片列表 begin -->
              <div class="box"><a href="/dwk/mnwk/84.html" title="蒋先镇" target="_blank"><img src="/Upfile/201237/2012030740431657.jpg" alt="蒋先镇"></a><a href="/dwk/mnwk/84.html" target="_blank" title="蒋先镇">蒋先镇[泌尿外科]</a></div>
             
              <div class="box"><a href="/dwk/ttk/454.html" title="黄东" target="_blank"><img src="/Upfile/11/9/2015/2015110941041065.jpg" alt="黄东"></a><a href="/dwk/ttk/454.html" target="_blank" title="黄东">黄东[疼痛科]</a></div>
             
              <div class="box"><a href="/dwk/yk/109.html" title="唐仁泓" target="_blank"><img src="/Upfile/201237/2012030741596421.jpg" alt="唐仁泓"></a><a href="/dwk/yk/109.html" target="_blank" title="唐仁泓">唐仁泓[眼科]</a></div>
             
              <div class="box" id="norig"><a href="/dwk/yzzk/52.html" title="叶啟发" target="_blank"><img src="/Upfile/201237/2012030739101781.jpg" alt="叶啟发"></a><a href="/dwk/yzzk/52.html" target="_blank" title="叶啟发">叶啟发[移植专科]</a></div>
             
              <div class="box"><a href="/dwk/ebhk/106.html" title="谭国林" target="_blank"><img src="/Upfile/201237/2012030741475141.jpg" alt="谭国林"></a><a href="/dwk/ebhk/106.html" target="_blank" title="谭国林">谭国林[耳鼻喉科]</a></div>
             
              <div class="box"><a href="/dwk/pwyk/25.html" title="刘浔阳" target="_blank"><img src="/Upfile/201237/2012030737410565.jpg" alt="刘浔阳"></a><a href="/dwk/pwyk/25.html" target="_blank" title="刘浔阳">刘浔阳[普外一科]</a></div>
             
              <div class="box"><a href="/dwk/pwyk/21.html" title="黄飞舟" target="_blank"><img src="/Upfile/201237/2012030737175174.jpg" alt="黄飞舟"></a><a href="/dwk/pwyk/21.html" target="_blank" title="黄飞舟">黄飞舟[普外一科]</a></div>
             
              <div class="box" id="norig"><a href="/dwk/yzzk/400.html" title="黄祖发" target="_blank"><img src="/Upfile/2013722/2013072258742017.jpg" alt="黄祖发"></a><a href="/dwk/yzzk/400.html" target="_blank" title="黄祖发">黄祖发[移植专科]</a></div>
             
              <div class="clear"></div>
              <!-- 图片列表 end -->
            </div>
            <div id="List2_1"></div>
          </div>
        </div>
        <div class="Cont" id="Cont_4" style="display:none">
          <div class="ScrCont">
            <div id="List1_1">
              <!-- 图片列表 begin -->
              <div class="box"><a href="/fck/149.html" title="薛敏" target="_blank"><img src="/Upfile/201237/2012030752492893.jpg" alt="薛敏"></a><a href="/fck/149.html" target="_blank" title="薛敏">薛敏[妇科]</a></div>
             
              <div class="box"><a href="/fck/145.html" title="万亚军" target="_blank"><img src="/Upfile/201237/2012030752272877.jpg" alt="万亚军"></a><a href="/fck/145.html" target="_blank" title="万亚军">万亚军[妇科]</a></div>
             
              <div class="box"><a href="/fkekgrk/grk/97.html" title="万克清" target="_blank"><img src="/Upfile/201237/2012030741074221.jpg" alt="万克清"></a><a href="/fkekgrk/grk/97.html" target="_blank" title="万克清">万克清[感染科]</a></div>
             
              <div class="box" id="norig"><a href="/fkekgrk/grk/96.html" title="龚环宇" target="_blank"><img src="/Upfile/201237/2012030741024937.jpg" alt="龚环宇"></a><a href="/fkekgrk/grk/96.html" target="_blank" title="龚环宇">龚环宇[感染科]</a></div>
             
              <div class="box"><a href="/fkekgrk/xsek/94.html" title="黑明燕" target="_blank"><img src="/Upfile/201237/2012030740937125.jpg" alt="黑明燕"></a><a href="/fkekgrk/xsek/94.html" target="_blank" title="黑明燕">黑明燕[新生儿科]</a></div>
             
              <div class="box"><a href="/fck/147.html" title="邓新粮" target="_blank"><img src="/Upfile/201237/2012030752376721.jpg" alt="邓新粮"></a><a href="/fck/147.html" target="_blank" title="邓新粮">邓新粮[妇科]</a></div>
             
              <div class="box"><a href="/fkekgrk/ck/150.html" title="周昌菊" target="_blank"><img src="/Upfile/201237/2012030752551453.jpg" alt="周昌菊"></a><a href="/fkekgrk/ck/150.html" target="_blank" title="周昌菊">周昌菊[产科]</a></div>
             
              <div class="box" id="norig"><a href="/fkekgrk/ck/148.html" title="夏爱斌" target="_blank"><img src="/Upfile/201237/2012030752454421.jpg" alt="夏爱斌"></a><a href="/fkekgrk/ck/148.html" target="_blank" title="夏爱斌">夏爱斌[产科]</a></div>
             
              <div class="clear"></div>
              <!-- 图片列表 end -->
            </div>
            <div id="List2_1"></div>
          </div>
        </div>
        <div class="Cont" id="Cont_5" style="display:none">
          <div class="ScrCont">
            <div id="List1_1">
              <!-- 图片列表 begin -->
              <div class="box"><a href="/qtks/jzk/313.html" title="杨明施" target="_blank"><img src="/Upfile/2012517/2012051741490377.JPG" alt="杨明施"></a><a href="/qtks/jzk/313.html" target="_blank" title="杨明施">杨明施[急诊科]</a></div>
             
              <div class="box"><a href="/qtks/jzk/312.html" title="杨季" target="_blank"><img src="/Upfile/2012517/2012051741444549.JPG" alt="杨季"></a><a href="/qtks/jzk/312.html" target="_blank" title="杨季">杨季[急诊科]</a></div>
             
              <div class="box"><a href="/qtks/jzk/103.html" title="唐国茂" target="_blank"><img src="/Upfile/201237/2012030741342533.jpg" alt="唐国茂"></a><a href="/qtks/jzk/103.html" target="_blank" title="唐国茂">唐国茂[急诊科]</a></div>
             
              <div class="box" id="norig"><a href="/qtks/jzk/311.html" title="肖雪飞" target="_blank"><img src="/Upfile/2012517/2012051741396657.JPG" alt="肖雪飞"></a><a href="/qtks/jzk/311.html" target="_blank" title="肖雪飞">肖雪飞[急诊科]</a></div>
             
              <div class="box"><a href="/qtks/ICU/101.html" title="杨明施" target="_blank"><img src="/Upfile/201237/2012030741255937.jpg" alt="杨明施"></a><a href="/qtks/ICU/101.html" target="_blank" title="杨明施">杨明施[ICU]</a></div>
             
              <div class="box"><a href="/qtks/ICU/301.html" title="杨季" target="_blank"><img src="/Upfile/2012517/2012051738692109.JPG" alt="杨季"></a><a href="/qtks/ICU/301.html" target="_blank" title="杨季">杨季[ICU]</a></div>
             
              <div class="clear"></div>
              <!-- 图片列表 end -->
            </div>
            <div id="List2_1"></div>
          </div>
        </div>
        <div class="Cont" id="Cont_6" style="display:none">
          <div class="ScrCont">
            <div id="List1_1">
              <!-- 图片列表 begin -->
              <div class="box"><a href="/yjks/fsk/105.html" title="王维" target="_blank"><img src="/Upfile/201237/2012030741413001.jpg" alt="王维"></a><a href="/yjks/fsk/105.html" target="_blank" title="王维">王维[放射科]</a></div>
             
              <div class="box"><a href="/yjks/yjk/374.html" title="刘世坤" target="_blank"><img src="/Upfile/2012523/2012052332569439.jpg" alt="刘世坤"></a><a href="/yjks/yjk/374.html" target="_blank" title="刘世坤">刘世坤[药剂科]</a></div>
             
              <div class="box"><a href="/yjks/fsk/403.html" title="刘晟" target="_blank"><img src="/Upfile/2013815/2013081532524501.JPG" alt="刘晟"></a><a href="/yjks/fsk/403.html" target="_blank" title="刘晟">刘晟[放射科]</a></div>
             
              <div class="box" id="norig"><a href="/yjks/fsk/404.html" title="于德玲" target="_blank"><img src="/Upfile/2013815/2013081533915237.jpg" alt="于德玲"></a><a href="/yjks/fsk/404.html" target="_blank" title="于德玲">于德玲[放射科]</a></div>
             
              <div class="box"><a href="/yjks/fsk/405.html" title="叶斌" target="_blank"><img src="/Upfile/2013815/2013081534036109.jpg" alt="叶斌"></a><a href="/yjks/fsk/405.html" target="_blank" title="叶斌">叶斌[放射科]</a></div>
             
              <div class="box"><a href="/yjks/fsk/407.html" title="罗贤明" target="_blank"><img src="/Upfile/2013815/2013081534300953.jpg" alt="罗贤明"></a><a href="/yjks/fsk/407.html" target="_blank" title="罗贤明">罗贤明[放射科]</a></div>
             
              <div class="box"><a href="/yjks/jyk/139.html" title="伍勇" target="_blank"><img src="/Upfile/201237/2012030743135533.jpg" alt="伍勇"></a><a href="/yjks/jyk/139.html" target="_blank" title="伍勇">伍勇[检验科]</a></div>
             
              <div class="box" id="norig"><a href="/yjks/sxzx/107.html" title="刘竞" target="_blank"><img src="/Upfile/201237/2012030741491189.jpg" alt="刘竞"></a><a href="/yjks/sxzx/107.html" target="_blank" title="刘竞">刘竞[输血科]</a></div>
             
              <div class="clear"></div>
              <!-- 图片列表 end -->
            </div>
            <div id="List2_1"></div>
          </div>
        </div>
 
        <!--roll end-->
        <div style="clear:both;"></div>
      </div>
</div>
  <!--=S 就医服务 -->
<div class="jy_sev">
  <b><img src="images/h_fw.jpg" alt="就医服务"></b>
    <p>
      <!-- -->
      <span><a href="/jyservice/daymz/" title="每日门诊"><img src="images/fw_10.jpg" class="zx_1"></a><a href="/jyservice/daymz/" title="每日门诊">每日门诊</a></span> 
      <span><a href="/jyservice/zjmz/" title="知名专家门诊"><img src="images/fw_4.jpg" class="zx_1"></a><a href="/jyservice/zjmz/" title="知名专家门诊">知名专家门诊</a></span> 
      <span><a href="/jyservice/yygh/" title="预约挂号"><img src="images/fw_8.jpg" class="zx_1"></a><a href="/jyservice/yygh/" title="预约挂号">预约挂号</a></span>
 <span><a href="/plug/sxzz_book.asp" title="双向转诊" target="_blank"><img src="images/fw_1.jpg" class="zx_1"></a><a href="/plug/sxzz_book.asp" title="双向转诊" target="_blank">双向转诊</a></span>
  <span><a href="/jyservice/tsjcsx/" title="特殊检查事项"><img src="images/fw_5.jpg" class="zx_1"></a><a href="/jyservice/tsjcsx/" title="特殊检查事项">特殊检查事项</a></span>
 <span><a href="/jyservice/yylcdh/" title="医院楼层导航"><img src="images/fw_9.jpg" class="zx_1"></a><a href="/jyservice/yylcdh/" title="医院楼层导航">医院楼层导航</a></span>
<span><a href="jyservice/gbylbj/" title="干部医疗保健"><img src="images/fw_7.jpg" class="zx_1" alt="干部医疗保健"></a><a href="jyservice/gbylbj/">干部医疗保健</a></span>
 <span><a href="jyservice/wsbj/" title="外商保健"><img src="images/fw_6.jpg" class="zx_1" alt="外商保健"></a><a href="jyservice/wsbj/" title="外商保健"> &nbsp; 外商保健 &nbsp; </a></span>
<span><a href="/jyservice/ybzl/" title="医保专栏"><img src="images/fw_3.jpg" class="zx_1"></a><a href="/jyservice/ybzl/" title="医保专栏">医保专栏</a></span> 
<span><a href="/plug/myddc.asp" title="满意度调查"><img src="images/fw_2.jpg" class="zx_1"></a><a href="/plug/myddc.asp" title="满意度调查">满意度调查</a></span>

 
<!---->
 </p>
        <b><a href="/contact" title="联系我们"><img src="images/h_lx.jpg" alt="联系我们"></a></b>
  </div>
    <div class="cx">
      <a href="http://www.xykbs.com/query/" title="体检查询" target="_blank"><img src="images/cx_3.jpg" alt="体检查询"></a>
      <a href="http://xy3yy.jk725.com/disease/disease_GetDiseaseInfoList.action" title="疾病查询" target="_blank"><img src="images/cx_1.jpg" alt="疾病查询"></a>
      <a href="http://jc.xtata.com/" title="化验查询" target="_blank"><img src="images/cx_2.jpg" alt="化验查询"></a>
      <a href="http://health.sohu.com/health/drugsearch.htm" title="药物查询" target="_blank"><img src="images/cx_4.jpg" align="药物查询"></a>
      <a href="http://tools.2345.com/" title="实用查询" target="_blank"><img src="images/cx_5.jpg" align="实用查询"></a>
    </div>
	<div class="t_ns">
      <div class="t_title t_tit3"><a href="/plug/book.asp?action=show" class="more">更多&gt;&gt;</a><span>投诉与建议</span></div>
      <ul>
        <li><em>2015-11-24</em><a href="/jy.asp?id=167" title="夫妻双方孕前检查挂什么科">夫妻双方孕前检查挂什么科</a></li>
        <li><em>2015-09-19</em><a href="/jy.asp?id=163" title="看病付款以后退药诊疗卡没有退给我">看病付款以后退药诊疗卡没有退...</a></li>
        <li><em>2015-09-12</em><a href="/jy.asp?id=162" title="怎么写个感谢信这么难勒">怎么写个感谢信这么难勒</a></li>
        <li><em>2014-12-11</em><a href="/jy.asp?id=145" title="0-14岁先天性心脏病农村户口患儿，可以免费接受治疗">0-14岁先天性心脏病农村户口患...</a></li>
        <li><em>2014-11-02</em><a href="/jy.asp?id=144" title="无痛肠镜">无痛肠镜</a></li>
        <li><em>2014-08-06</em><a href="/jy.asp?id=141" title="入职体检">入职体检</a></li>
      </ul>
      <div class="clear"></div>
      <b><a href="/plug/book.asp?action=show"><img src="images/h_jy2.jpg" class="h_jy"></a></b>
    </div>

    <!--=S 看病经验 -->
  <div class="hosatt">
    <div class="t_title t_tit3"><a href="/kbjy.asp" class="more">更多&gt;&gt;</a><span>看病经验</span></div>
    <ul>
      <!-- -->
     
      
       <li>
        <p><span>就诊医生：</span><font><a href="/kbjy_show.asp?id=5447">陈方平</a></font></p>
        <p><em>2016-03-02</em><span>所患疾病：</span>生育</p>
        <p><span>看病过程：</span>结婚一年没生育男的来检查要提前预约挂科吗挂什么科？检查……
        <b><a href="kbjy_show.asp?id=5447">看详情&gt;&gt;</a></b></p>
      </li>   
      
       <li id="none">
        <p><span>就诊医生：</span><font><a href="/kbjy_show.asp?id=5446">陈方平</a></font></p>
        <p><em>2016-03-02</em><span>所患疾病：</span>痔疮</p>
        <p><span>看病过程：</span>产后痔疮手术什么时候可以做，影响喂奶吗？可以不用住院吗……
        <b><a href="kbjy_show.asp?id=5446">看详情&gt;&gt;</a></b></p>
      </li>   
      <!-- -->
      <a href="/kbjy_i.asp"><img src="images/h_jy.jpg" class="h_jy"></a>
    </ul>
</div>
    <!--=E 看病经验 -->
    <!--=S 感谢信 -->
  <div class="gxx">
    <div class="t_title t_tit3"><a href="/letter.asp" title="更多" class="more">更多&gt;&gt;</a><span>感谢信</span></div>
    
      
    <div class="gxx_nr">
    <b><em>2016-04-19</em><a href="letter_show.asp?id=5537" title="陈方平">感谢陈方平医生</a></b>
    <p>谢谢回复!…<a href="letter_show.asp?id=5537" title="陈方平">看详情&gt;&gt;</a></p>
    </div>
      
    <div class="gxx_nr">
    <b><em>2016-04-15</em><a href="letter_show.asp?id=5533" title="万克清">感谢万克清医生</a></b>
    <p>万教授谢谢您，没有您就没有现在的我，没有我现在完整的家…<a href="letter_show.asp?id=5533" title="万克清">看详情&gt;&gt;</a></p>
    </div> 
    <a href="/gxx.asp" title="更多"><img src="images/h_jy1.jpg" class="h_jy1"></a>
  </div>
    <!--=E 感谢信 -->
    <div class="clear"></div>
  <div class="ggw2"><script src="/Plug/GG.asp?id=2" language="javascript"></script><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="980" height="90"><param name="movie" value="/Upfile/201239/2012030940064593.swf"><param name="wmode" value="transparent"><embed src="/Upfile/201239/2012030940064593.swf" quality="high" wmode="transparent" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="980" height="90"></object></div>
    <!--=S 学术会议 -->
  <div class="xs_news">
      <div class="t_title t_tit2"><a href="education/meeting/" class="more" title="学术会议">更多&gt;&gt;</a><span>学术会议</span></div>
        <ul>
          <li><span class="time">(2016-04-15)</span><a href="/education/meeting/549.html" title="“新湘雅人才成长讲坛”举行开讲仪式暨讲坛首讲">“新湘雅人才成长讲坛”举行开讲仪式暨讲坛...</a></li>
          <li><span class="time">(2016-04-07)</span><a href="/education/meeting/540.html" title="医院举行“病历书写常见缺陷”专题系列讲座">医院举行“病历书写常见缺陷”专题系列讲座...</a></li>
          <li><span class="time">(2016-03-30)</span><a href="/education/meeting/530.html" title="湘雅三医院成功举办第三届全国激光消融高级研讨班">湘雅三医院成功举办第三届全国激光消融高级...</a></li>
          <li><span class="time">(2016-03-28)</span><a href="/education/meeting/528.html" title="青科协举办“基于定量蛋白组学的精准生物标记物研究”讲座">青科协举办“基于定量蛋白组学的精准生物标...</a></li>
          <li><span class="time">(2016-03-22)</span><a href="/education/meeting/526.html" title="湖南省医学会男科学专业委员会第七次学术年会暨第五届中南前列腺疾病高峰论坛第一轮通知">湖南省医学会男科学专业委员会第七次学术年...</a></li>
          <li><span class="time">(2015-12-29)</span><a href="/education/meeting/492.html" title="湖南省前列腺癌合作联盟暨MDT第六次会议顺利召开">湖南省前列腺癌合作联盟暨MDT第六次会议顺利...</a></li>
          <li><span class="time">(2015-12-02)</span><a href="/education/meeting/471.html" title="我院成功举办2015年湖南省癫痫学术年会">我院成功举办2015年湖南省癫痫学术年会...</a></li>
        </ul>
  </div>
  
  <!--=E 学术会议 -->
    <!--=S 区域医疗合作 -->
    <div class="xs_news qy_link">
      <div class="t_title t_tit2"><a href="education/jkjy/" class="more" title="更多">更多&gt;&gt;</a><span>健康教育</span></div>
        <ul>
          <li><span class="time">(2016-05-24)</span><a href="/education/jkjy/571.html" title="平衡膳食，回家吃饭——医院举行“全民营养周”健康宣教活动">平衡膳食，回家吃饭——医院举行“全民营养...</a></li>
          <li><span class="time">(2016-05-12)</span><a href="/education/jkjy/562.html" title="迎接“全民营养周”——相约湘雅三医院营养科">迎接“全民营养周”——相约湘雅三医院营养...</a></li>
          <li><span class="time">(2016-04-21)</span><a href="/education/jkjy/560.html" title="传国粹之经典，铸体魄之健康">传国粹之经典，铸体魄之健康...</a></li>
          <li><span class="time">(2015-09-16)</span><a href="/education/jkjy/415.html" title="产科开展出生缺陷预防宣传周活动">产科开展出生缺陷预防宣传周活动...</a></li>
          <li><span class="time">(2015-06-17)</span><a href="/education/jkjy/374.html" title="康复医学科举行第一届健康教育比赛">康复医学科举行第一届健康教育比赛...</a></li>
          <li><span class="time">(2014-02-17)</span><a href="/education/jkjy/323.html" title="2014年全年湘雅三医院健康教育讲座安排表">2014年全年湘雅三医院健康教育讲座安排表...</a></li>
          <li><span class="time">(2012-11-19)</span><a href="/education/jkjy/261.html" title="湘雅三医院开展糖尿病日宣传活动">湘雅三医院开展糖尿病日宣传活动...</a></li>
        </ul>
  </div>
    <!--=E 区域医疗合作 -->
    <!--=S 图标 -->
    <div class="tb">
    <a href="http://www.xysm.csu.edu.cn" target="_blank" title="湘雅医学院"><img src="/Upfile/2012217/2012021757295017.jpg" alt="湘雅医学院"></a>
    
    <a href="http://www.csu.edu.cn" target="_blank" title="中南大学"><img src="/Upfile/2012217/2012021757264049.jpg" alt="中南大学"></a>
    
    <a href="http://www.moh.gov.cn/publicfiles/business/htmlfiles/wsb/index.htm" target="_blank" title="中南卫生部"><img src="/Upfile/2012217/2012021757166673.jpg" alt="中南卫生部"></a>
    
    <a href="http://www.21hospital.com" target="_blank" title="湖南卫生厅" style="margin-bottom:0;"><img src="/Upfile/2012217/2012021757230845.jpg" alt="湖南卫生厅"></a>
    
    </div>
    <!--=E 图标 -->
</div>









		<div class="z_foot">
			<div class="z_link">
				<h3>
					友情链接
				</h3>
				<p>
					<a href="#" title="人民网">人民网</a> |
					<a href="#" title="新华网">新华网</a> |
					<a href="#" title="中新网">中新网</a> |
					<a href="#" title="卫计委">卫计委</a> |
					<a href="#" title="教育部">教育部</a> |
					<a href="#" title="湖南省政府">湖南省政府</a> |
					<a href="#" title="红网">红网</a> |
					<a href="#" title="省卫生计生委">省卫生计生委</a> |
					<a href="#" title="湖南省教育厅">湖南省教育厅</a> |
					<a href="#" title="中南大学">中南大学</a> |
					<a href="#" title="湘雅医学院">湘雅医学院</a> |
					<a href="#" title="湘雅医院">湘雅医院</a> |
					<a href="#" title="湘雅二医院">湘雅二医院</a> |
					<a href="#" title="协和医院">协和医院</a> |
					<a href="#" title="华西医院">华西医院</a> |
					<a href="#" title="西京医院">西京医院</a> |
					<a href="#" title="瑞金医院">瑞金医院</a> |
					<a href="#" title="复旦中山医院">复旦中山医院</a> |
					<a href="#" title="武汉同济医院">武汉同济医院</a> |
					<a href="#" title="中山医院">中山医院</a>
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
						<a href="#" title="长沙网站建设">长沙网站建设</a>-
						<a href="#" title="长沙网站建设">创研科技</a>
					</p>
					<!-- Baidu Button BEGIN -->
					<div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare"
						style="position: absolute; left: 360px; bottom: -2px;">
						<span class="bds_more"> 分享到：</span>
						<a class="bds_tsina"></a>
						<a class="bds_qzone"></a>
						<a class="bds_tqq"></a>
						<a class="bds_renren"></a>
						<a class="shareCount"></a>
					</div>


					<!-- Baidu Button END -->

				</div>
				<div class="z_info_r">
					<img src="../../ImgVedio/image/z_ewm.jpg.png" width="77"
						height="77" />
				</div>

			</div>
		</div>
	</body>
</html>
