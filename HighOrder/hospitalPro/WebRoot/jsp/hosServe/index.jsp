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
		
			<meta name="keywords" content="{tryine:common_key}" />
		<meta name="description" content="{tryine:common_des}" />
	 
	</head>
	<body >
		 <%@ include file="../../top.jsp" %>
		 
		  
			
	 
		<div class="box" style="padding-left: 150px; padding-right: 150px;">
						 
				<div class="clear"></div>
				<!--<div class="ggw"><script src="/Plug/GG.asp?id=1" language="javascript"></script></div>-->
				<!--=S 科室分类、就医服务、联系我们 -->
				<div class="h_ksfl">
					<!--=S 科室分类-->
					<div class="t_title">
						<span>科室分类与医师介绍</span>
					</div>
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
							<span><h3>
									<a id="menu1" onmouseover="setTab(1,6)">湘雅名医</a>
								</h3>
							</span>
						</div>
						<div class="sidelist">
							<span><h3>
									<a id="menu2" onmouseover="setTab(2,6)">大内科简介</a>
								</h3>
							</span>
							<div class="i-list">
								<ul>


									<li>
										<a href="dnk/xnk/" title="心内科">心内科</a>
									</li>






									<li>
										<a href="dnk/xhnk/" title="消化内科">消化内科</a>
									</li>






									<li>
										<a href="dnk/nfmk/" title="内分泌科">内分泌科</a>
									</li>






									<li>
										<a href="dnk/xynk/" title="血液内科">血液内科</a>
									</li>






									<li>
										<a href="dnk/sznk/" title="肾脏内科">肾脏内科</a>
									</li>






									<li>
										<a href="dnk/zlnk/" title="肿瘤内科">肿瘤内科</a>
									</li>






									<li>
										<a href="dnk/sjnk/" title="神经内科">神经内科</a>
									</li>






									<li>
										<a href="dnk/pfk/" title="皮肤科">皮肤科</a>
									</li>






									<li>
										<a href="dnk/zyk/" title="中医科">中医科</a>
									</li>






									<li>
										<a href="dnk/lcxlk/" title="临床心理科">临床心理科</a>
									</li>






									<li>
										<a href="dnk/qkyxk/" title="全科医学科">全科医学科</a>
									</li>






									<li>
										<a href="dnk/lnbk/" title="老年病科（干部医疗中心）">老年病科（干部医疗中心）</a>
									</li>






									<li>
										<a href="yingyank/" title="营养科">营养科</a>
									</li>






									<li>
										<a href="dnk/xyjhzx2/" title="血液净化中心">血液净化中心</a>
									</li>






									<li>
										<a href="kfyxk/" title="康复医学科">康复医学科</a>
									</li>


								</ul>
							</div>



						</div>
						<div class="sidelist">
							<span><h3>
									<a id="menu3" onmouseover="setTab(3,6)">大外科简介</a>
								</h3>
							</span>



							<div class="i-list">
								<ul>






									<li>
										<a href="dwk/pwek/" title="普外二科">普外二科</a>
									</li>






									<li>
										<a href="dwk/pwsk/" title="普外三科">普外三科</a>
									</li>






									<li>
										<a href="dwk/gk/" title="骨科">骨科</a>
									</li>






									<li>
										<a href="dwk/yzzk/" title="移植专科">移植专科</a>
									</li>






									<li>
										<a href="dwk/mnwk/" title="泌尿外科">泌尿外科</a>
									</li>






									<li>
										<a href="dwk/sszx/" title="烧伤整形">烧伤整形</a>
									</li>






									<li>
										<a href="dwk/sjwk/" title="神经外科">神经外科</a>
									</li>






									<li>
										<a href="dwk/xxwk/" title="心胸外科">心胸外科</a>
									</li>






									<li>
										<a href="dwk/ebhk/" title="耳鼻喉科">耳鼻喉科</a>
									</li>






									<li>
										<a href="dwk/yk/" title="眼科">眼科</a>
									</li>






									<li>
										<a href="dwk/kqk/" title="口腔科">口腔科</a>
									</li>






									<li>
										<a href="dwk/mzk/" title="麻醉科">麻醉科</a>
									</li>






									<li>
										<a href="dwk/ttk/" title="疼痛科">疼痛科</a>
									</li>


								</ul>
							</div>



						</div>
						<div class="sidelist">
							<span><h3>
									<a id="menu4" onmouseover="setTab(4,6)">妇科、产科、儿科</a>
								</h3>
							</span>



							<div class="i-list">
								<ul>






									<li>
										<a href="fkekgrk/ck/" title="产科">产科</a>
									</li>






									<li>
										<a href="fkekgrk/ek/" title="儿科">儿科</a>
									</li>






									<li>
										<a href="fkekgrk/xsek/" title="新生儿科">新生儿科</a>
									</li>






									<li>
										<a href="fkekgrk/grk/" title="感染科">感染科</a>
									</li>


								</ul>
							</div>



						</div>
						<div class="sidelist">
							<span><h3>
									<a id="menu5" onmouseover="setTab(5,6)">危急重症中心简介</a>
								</h3>
							</span>
							<div class="i-list">
								<ul>
									<li>
										<a href="qtks/jzk/" title="急诊科">急诊科</a>
									</li>
								</ul>
							</div>



						</div>
						<div class="sidelist">
							<span><h3>
									<a id="menu6" onmouseover="setTab(6,6)">医技科室其它科室简介</a>
								</h3>
							</span>
							<div class="i-list">
								<ul>






									<li>
										<a href="yjks/jyk/" title="检验科">检验科</a>
									</li>






									<li>
										<a href="yjks/csk/" title="超声科">超声科</a>
									</li>






									<li>
										<a href="yjks/blk/" title="病理科">病理科</a>
									</li>






									<li>
										<a href="yjks/sxzx/" title="输血科">输血科</a>
									</li>






									<li>
										<a href="yjks/hyx/" title="核医学科">核医学科</a>
									</li>






									<li>
										<a href="yjks/yjk/" title="药剂科">药剂科</a>
									</li>






									<li>
										<a href="yjks/qjzx/" title="腔镜中心">腔镜中心</a>
									</li>






									<li>
										<a href="yjks/hkgl/" title="健康管理中心">健康管理中心</a>
									</li>






									<li>
										<a href="yjks/etbj/" title="儿童保健中心">儿童保健中心</a>
									</li>






									<li>
										<a href="yjks/lcyl/" title="临床药理中心">临床药理中心</a>
									</li>






									<li>
										<a href="yjks/yxsy/" title="医学实验中心">医学实验中心</a>
									</li>


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
								<div class="box">
									<a href="/xymy/412.html" title="陈方平" target="_blank"> <img
											src="../../ImgVedio/image/ZJ_image/2013070472309801.jpg"></img>
									</a><a href="/xymy/412.html" target="_blank" title="陈方平">陈方平[湘雅名医]</a>
								</div>

								<div class="box">
									<a href="/xymy/424.html" title="黄飞舟" target="_blank"><img
											src="../../ImgVedio/image/ZJ_image/2013070472331065.jpg"></img>
									</a><a href="/xymy/424.html" target="_blank" title="黄飞舟">黄飞舟[湘雅名医]</a>
								</div>

								<div class="box">
									<a href="/xymy/423.html" title="朱晒红" target="_blank"><img
											src="../../ImgVedio/image/ZJ_image/2013070471150657.jpg"></img>
									</a><a href="/xymy/423.html" target="_blank" title="朱晒红">朱晒红[湘雅名医]</a>
								</div>

								<div class="box" id="norig">
									<a href="/xymy/413.html" title="袁洪" target="_blank">
									 <img src="../../ImgVedio/image/ZJ_image/2013070471184217.jpg"></img></a><a href="/xymy/413.html" target="_blank" title="袁洪">袁洪[湘雅名医]</a>
								</div>

								<div class="box">
									<a href="/xymy/425.html" title="赵玲玲" target="_blank"><img src="../../ImgVedio/image/ZJ_image/2013070470826049.jpg"></img> </a><a href="/xymy/425.html" target="_blank" title="赵玲玲">赵玲玲[湘雅名医]</a>
								</div>

								<div class="box"><a href="/xymy/414.html" title="叶启发" target="_blank"><img src="../../ImgVedio/image/ZJ_image/2013070470943505.jpg"></img>
									</a><a href="/xymy/414.html" target="_blank" title="叶启发">叶启发[湘雅名医]</a>
									
								</div>

								<div class="box">
									<a href="/xymy/415.html" title="王维" target="_blank"><img src="../../ImgVedio/image/ZJ_image/2013070471081033.jpg"></img> </a><a href="/xymy/415.html" target="_blank" title="王维">王维[湘雅名医]</a>
								</div>

								<div class="box" id="norig">
									<a href="/xymy/416.html" title="薛敏" target="_blank"><img src="../../ImgVedio/image/ZJ_image/2013070471262609.jpg"></img></a><a href="/xymy/416.html" target="_blank" title="薛敏">薛敏[湘雅名医]</a>
								</div>

								<div class="clear"></div>
								<!-- 图片列表 end -->
							</div>
							<div id="List2_1"></div>
						</div>
					</div>
					<div class="Cont" id="Cont_2" style="display: none">
						<div class="ScrCont">
							<div id="List1_1">
								<!-- 图片列表 begin -->
								<div class="box">
									<a href="/dnk/xyjhzx2/130.html" title="伍锟" target="_blank"><img
											src="/Upfile/201237/2012030742608361.jpg" alt="伍锟">
									</a><a href="/dnk/xyjhzx2/130.html" target="_blank" title="伍锟">伍锟[血液净化中心]</a>
								</div>

								<div class="box">
									<a href="/dnk/hxnk/3.html" title="孙圣华" target="_blank"><img
											src="/Upfile/201237/2012030732113407.jpg" alt="孙圣华">
									</a><a href="/dnk/hxnk/3.html" target="_blank" title="孙圣华">孙圣华[呼吸内科]</a>
								</div>

								<div class="box">
									<a href="/dnk/xynk/30.html" title="陈方平" target="_blank"><img
											src="/Upfile/201237/2012030737702125.jpg" alt="陈方平">
									</a><a href="/dnk/xynk/30.html" target="_blank" title="陈方平">陈方平[血液内科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/dnk/xynk/206.html" title="刘竞" target="_blank"><img
											src="/Upfile/2012511/2012051140202781.jpg" alt="刘竞">
									</a><a href="/dnk/xynk/206.html" target="_blank" title="刘竞">刘竞[血液内科]</a>
								</div>

								<div class="box">
									<a href="/dnk/xynk/461.html" title="吕奔" target="_blank"><img
											src="" alt="吕奔">
									</a><a href="/dnk/xynk/461.html" target="_blank" title="吕奔">吕奔[血液内科]</a>
								</div>

								<div class="box">
									<a href="/dnk/xynk/29.html" title="范自力" target="_blank"><img
											src="/Upfile/201237/2012030737624533.jpg" alt="范自力">
									</a><a href="/dnk/xynk/29.html" target="_blank" title="范自力">范自力[血液内科]</a>
								</div>

								<div class="box">
									<a href="/dnk/xynk/204.html" title="蒋铁斌" target="_blank"><img
											src="/Upfile/2012511/2012051139938017.JPG" alt="蒋铁斌">
									</a><a href="/dnk/xynk/204.html" target="_blank" title="蒋铁斌">蒋铁斌[血液内科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/yingyank/185.html" title="刘敏" target="_blank"><img
											src="/Upfile/2012613/2012061355020593.JPG" alt="刘敏">
									</a><a href="/yingyank/185.html" target="_blank" title="刘敏">刘敏[营养科]</a>
								</div>

								<div class="clear"></div>
								<!-- 图片列表 end -->
							</div>
							<div id="List2_1"></div>
						</div>
					</div>
					<div class="Cont" id="Cont_3" style="display: none">
						<div class="ScrCont">
							<div id="List1_1">
								<!-- 图片列表 begin -->
								<div class="box">
									<a href="/dwk/mnwk/84.html" title="蒋先镇" target="_blank"><img
											src="/Upfile/201237/2012030740431657.jpg" alt="蒋先镇">
									</a><a href="/dwk/mnwk/84.html" target="_blank" title="蒋先镇">蒋先镇[泌尿外科]</a>
								</div>

								<div class="box">
									<a href="/dwk/ttk/454.html" title="黄东" target="_blank"><img
											src="/Upfile/11/9/2015/2015110941041065.jpg" alt="黄东">
									</a><a href="/dwk/ttk/454.html" target="_blank" title="黄东">黄东[疼痛科]</a>
								</div>

								<div class="box">
									<a href="/dwk/yk/109.html" title="唐仁泓" target="_blank"><img
											src="/Upfile/201237/2012030741596421.jpg" alt="唐仁泓">
									</a><a href="/dwk/yk/109.html" target="_blank" title="唐仁泓">唐仁泓[眼科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/dwk/yzzk/52.html" title="叶啟发" target="_blank"><img
											src="/Upfile/201237/2012030739101781.jpg" alt="叶啟发">
									</a><a href="/dwk/yzzk/52.html" target="_blank" title="叶啟发">叶啟发[移植专科]</a>
								</div>

								<div class="box">
									<a href="/dwk/ebhk/106.html" title="谭国林" target="_blank"><img
											src="/Upfile/201237/2012030741475141.jpg" alt="谭国林">
									</a><a href="/dwk/ebhk/106.html" target="_blank" title="谭国林">谭国林[耳鼻喉科]</a>
								</div>

								<div class="box">
									<a href="/dwk/pwyk/25.html" title="刘浔阳" target="_blank"><img
											src="/Upfile/201237/2012030737410565.jpg" alt="刘浔阳">
									</a><a href="/dwk/pwyk/25.html" target="_blank" title="刘浔阳">刘浔阳[普外一科]</a>
								</div>

								<div class="box">
									<a href="/dwk/pwyk/21.html" title="黄飞舟" target="_blank"><img
											src="/Upfile/201237/2012030737175174.jpg" alt="黄飞舟">
									</a><a href="/dwk/pwyk/21.html" target="_blank" title="黄飞舟">黄飞舟[普外一科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/dwk/yzzk/400.html" title="黄祖发" target="_blank"><img
											src="/Upfile/2013722/2013072258742017.jpg" alt="黄祖发">
									</a><a href="/dwk/yzzk/400.html" target="_blank" title="黄祖发">黄祖发[移植专科]</a>
								</div>

								<div class="clear"></div>
								<!-- 图片列表 end -->
							</div>
							<div id="List2_1"></div>
						</div>
					</div>
					<div class="Cont" id="Cont_4" style="display: none">
						<div class="ScrCont">
							<div id="List1_1">
								<!-- 图片列表 begin -->
								<div class="box">
									<a href="/fck/149.html" title="薛敏" target="_blank"><img
											src="/Upfile/201237/2012030752492893.jpg" alt="薛敏">
									</a><a href="/fck/149.html" target="_blank" title="薛敏">薛敏[妇科]</a>
								</div>

								<div class="box">
									<a href="/fck/145.html" title="万亚军" target="_blank"><img
											src="/Upfile/201237/2012030752272877.jpg" alt="万亚军">
									</a><a href="/fck/145.html" target="_blank" title="万亚军">万亚军[妇科]</a>
								</div>

								<div class="box">
									<a href="/fkekgrk/grk/97.html" title="万克清" target="_blank"><img
											src="/Upfile/201237/2012030741074221.jpg" alt="万克清">
									</a><a href="/fkekgrk/grk/97.html" target="_blank" title="万克清">万克清[感染科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/fkekgrk/grk/96.html" title="龚环宇" target="_blank"><img
											src="/Upfile/201237/2012030741024937.jpg" alt="龚环宇">
									</a><a href="/fkekgrk/grk/96.html" target="_blank" title="龚环宇">龚环宇[感染科]</a>
								</div>

								<div class="box">
									<a href="/fkekgrk/xsek/94.html" title="黑明燕" target="_blank"><img
											src="/Upfile/201237/2012030740937125.jpg" alt="黑明燕">
									</a><a href="/fkekgrk/xsek/94.html" target="_blank" title="黑明燕">黑明燕[新生儿科]</a>
								</div>

								<div class="box">
									<a href="/fck/147.html" title="邓新粮" target="_blank"><img
											src="/Upfile/201237/2012030752376721.jpg" alt="邓新粮">
									</a><a href="/fck/147.html" target="_blank" title="邓新粮">邓新粮[妇科]</a>
								</div>

								<div class="box">
									<a href="/fkekgrk/ck/150.html" title="周昌菊" target="_blank"><img
											src="/Upfile/201237/2012030752551453.jpg" alt="周昌菊">
									</a><a href="/fkekgrk/ck/150.html" target="_blank" title="周昌菊">周昌菊[产科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/fkekgrk/ck/148.html" title="夏爱斌" target="_blank"><img
											src="/Upfile/201237/2012030752454421.jpg" alt="夏爱斌">
									</a><a href="/fkekgrk/ck/148.html" target="_blank" title="夏爱斌">夏爱斌[产科]</a>
								</div>

								<div class="clear"></div>
								<!-- 图片列表 end -->
							</div>
							<div id="List2_1"></div>
						</div>
					</div>
					<div class="Cont" id="Cont_5" style="display: none">
						<div class="ScrCont">
							<div id="List1_1">
								<!-- 图片列表 begin -->
								<div class="box">
									<a href="/qtks/jzk/313.html" title="杨明施" target="_blank"><img
											src="/Upfile/2012517/2012051741490377.JPG" alt="杨明施">
									</a><a href="/qtks/jzk/313.html" target="_blank" title="杨明施">杨明施[急诊科]</a>
								</div>

								<div class="box">
									<a href="/qtks/jzk/312.html" title="杨季" target="_blank"><img
											src="/Upfile/2012517/2012051741444549.JPG" alt="杨季">
									</a><a href="/qtks/jzk/312.html" target="_blank" title="杨季">杨季[急诊科]</a>
								</div>

								<div class="box">
									<a href="/qtks/jzk/103.html" title="唐国茂" target="_blank"><img
											src="/Upfile/201237/2012030741342533.jpg" alt="唐国茂">
									</a><a href="/qtks/jzk/103.html" target="_blank" title="唐国茂">唐国茂[急诊科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/qtks/jzk/311.html" title="肖雪飞" target="_blank"><img
											src="/Upfile/2012517/2012051741396657.JPG" alt="肖雪飞">
									</a><a href="/qtks/jzk/311.html" target="_blank" title="肖雪飞">肖雪飞[急诊科]</a>
								</div>

								<div class="box">
									<a href="/qtks/ICU/101.html" title="杨明施" target="_blank"><img
											src="/Upfile/201237/2012030741255937.jpg" alt="杨明施">
									</a><a href="/qtks/ICU/101.html" target="_blank" title="杨明施">杨明施[ICU]</a>
								</div>

								<div class="box">
									<a href="/qtks/ICU/301.html" title="杨季" target="_blank"><img
											src="/Upfile/2012517/2012051738692109.JPG" alt="杨季">
									</a><a href="/qtks/ICU/301.html" target="_blank" title="杨季">杨季[ICU]</a>
								</div>

								<div class="clear"></div>
								<!-- 图片列表 end -->
							</div>
							<div id="List2_1"></div>
						</div>
					</div>
					<div class="Cont" id="Cont_6" style="display: none">
						<div class="ScrCont">
							<div id="List1_1">
								<!-- 图片列表 begin -->
								<div class="box">
									<a href="/yjks/fsk/105.html" title="王维" target="_blank"><img
											src="/Upfile/201237/2012030741413001.jpg" alt="王维">
									</a><a href="/yjks/fsk/105.html" target="_blank" title="王维">王维[放射科]</a>
								</div>

								<div class="box">
									<a href="/yjks/yjk/374.html" title="刘世坤" target="_blank"><img
											src="/Upfile/2012523/2012052332569439.jpg" alt="刘世坤">
									</a><a href="/yjks/yjk/374.html" target="_blank" title="刘世坤">刘世坤[药剂科]</a>
								</div>

								<div class="box">
									<a href="/yjks/fsk/403.html" title="刘晟" target="_blank"><img
											src="/Upfile/2013815/2013081532524501.JPG" alt="刘晟">
									</a><a href="/yjks/fsk/403.html" target="_blank" title="刘晟">刘晟[放射科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/yjks/fsk/404.html" title="于德玲" target="_blank"><img
											src="/Upfile/2013815/2013081533915237.jpg" alt="于德玲">
									</a><a href="/yjks/fsk/404.html" target="_blank" title="于德玲">于德玲[放射科]</a>
								</div>

								<div class="box">
									<a href="/yjks/fsk/405.html" title="叶斌" target="_blank"><img
											src="/Upfile/2013815/2013081534036109.jpg" alt="叶斌">
									</a><a href="/yjks/fsk/405.html" target="_blank" title="叶斌">叶斌[放射科]</a>
								</div>

								<div class="box">
									<a href="/yjks/fsk/407.html" title="罗贤明" target="_blank"><img
											src="/Upfile/2013815/2013081534300953.jpg" alt="罗贤明">
									</a><a href="/yjks/fsk/407.html" target="_blank" title="罗贤明">罗贤明[放射科]</a>
								</div>

								<div class="box">
									<a href="/yjks/jyk/139.html" title="伍勇" target="_blank"><img
											src="/Upfile/201237/2012030743135533.jpg" alt="伍勇">
									</a><a href="/yjks/jyk/139.html" target="_blank" title="伍勇">伍勇[检验科]</a>
								</div>

								<div class="box" id="norig">
									<a href="/yjks/sxzx/107.html" title="刘竞" target="_blank"><img
											src="/Upfile/201237/2012030741491189.jpg" alt="刘竞">
									</a><a href="/yjks/sxzx/107.html" target="_blank" title="刘竞">刘竞[输血科]</a>
								</div>

								<div class="clear"></div>
								<!-- 图片列表 end -->
							</div>
							<div id="List2_1"></div>
						</div>
					</div>

					<!--roll end-->
					<div style="clear: both;"></div>
				</div>
			</div>
			 
<div>
 <%@ include file="../../end.jsp" %>
</div> 
	</body>
</html>
