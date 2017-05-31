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
.z_ywgl li a:hover {
	background: url("../../ImgVedio/image/z_hover.png") no-repeat;
	display: block;
	color: #000;
}
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
		<script type="text/javascript" src="../../js/hosCulture/jquery.js">
</script>
		<script type="text/javascript" src="../../js/allenPh.js">
</script>
		<script type="text/javascript" src="../../js/jqueryslidemenu.js">
</script>
		<script type="text/javascript" src="../../js/tryine.js">
</script>
		<script type="text/javascript" src="../../js/saved_resource.js">
</script>
		<script type="text/javascript" src="../../js/header.js">
</script>
		<script type="text/javascript" src="../../js/bckToTop.js">
</script>
		<link rel="stylesheet" href="../../css/jqueryslidemenu.css"
			type="text/css"></link>
		<link rel="stylesheet" href="../../css/z_css.css" type="text/css"></link>
		<script type="text/javascript"
			src="../../js/Dropdown/jquery-1.7.2.min.js">
</script>
	</head>

	<body>

		<div>
			<jsp:forward page="/hospitalPro/WebRoot/top.jsp"></jsp:forward>
		</div>

		<div class="z_spcon"
			style="background: url('../../ImgVedio/image/z_leftbt.gif') no-repeat left bottom;">
			<!--人物风采 left-->
			<div class="z_rw_l">
				<div class="z_rw_con"
					style="background: url('../../ImgVedio/image/z_lbg.jpg') repeat-y center;">
					<div class="z_rw_top"
						style="background: url('../../ImgVedio/image/z_top.jpg') no-repeat top;">
						<h2>
							医院管理
						</h2>
						<ul class="z_ywgl">
							<li>
								<a href="manageIndex.jsp" title="医院简介" class="navH">医院简介</a>
							</li>
							<li>
								<a href="xrld.jsp" title="现任领导">现任领导</a>
							</li>
							<li>
								<a href="jgsz.jsp" title="机构设置">机构设置</a>
							</li>
							<li>
								<a href="gzzd.jsp" title="规章制度">规章制度</a>
							</li>
							<li>
								<a href="hosMessage.jsp" title="医院信息">医院信息</a>
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
						医院简介
					</h3>
					<span>当前位置：<a href="../../index.htm">首页</a> &gt; 医院管理&gt; <a
						href="index.htm">医院简介</a> </span>
				</div>
				<div class="clear"></div>
				<div class="nyContent">
					中南大学湘雅三医院座落在古城长沙，湘江西岸，是一所国家卫生和计划生育委员会直管的三级甲等大型综合性教学医院。经原卫生部批准，医院作为“八五”期间部省共建的重点建设项目，1989年11月28日破土奠基；1992年12月8日门诊楼建成，医院试运行；1996年9月三大主体工程相继落成，两年后通过原卫生部“三甲”达标验收，医院全面开院；2013年顺利通过三级综合医院等级复评。
					“湘雅”是中国高水平医学教育、医学研究和医疗服务的百年品牌，中南大学湘雅三医院是“湘雅”这棵百年老树上洋溢着生机与活力的蓬勃新枝。在建设“特色型、服务型、效率型”医院的发展思路以及建设国家优质医院的战略目标指导下，医院以“湘雅”这一百年品牌为历史传承，以国内一流大学为学科依托，成为了一所集医疗、教学、科研、预防、保健、康复于一体，提供高质量医疗服务、培养高层次医学人才、进行高水平科学研究，特色鲜明、服务一流、管理规范的现代综合医院。目前，医院占地面积223亩，医疗区建筑面积15万余平方米；开放床位1874张（编制床位2200张），拥有49个临床医技科室，60个护理单元；全院职工2800多人，其中高级职称279人，专业技术人员2000多人，含国家“千人计划”3人、“长江学者”1人、“国家杰青”1人、“国家优青”1人。医院形成了移植医学、微创医学、健康管理三大医疗技术品牌。移植医学以肝脏、肾脏等大器官移植和胰岛细胞移植治疗糖尿病为主要特色，2008年，国际异种移植临床研究规范《长沙宣言》在我院发布；腔镜、介入技术广泛深入应用于普外科、耳鼻喉科、妇产科、骨科、泌尿外科、心血管内科、放射科、超声科等临床医技科室，完成国内首例国产机器人手术和省内首例“达芬奇”机器人手术；健康管理处于省内领先、国内先进行列，是全国首批健康管理示范基地之一；同时普外科、内分泌科、消化内科、烧伤科、神经内科、儿科、心血管内科也开展了大批特色医疗项目。普通外科学、影像医学、临床药学、消化内科学和临床护理学入选国家临床重点专科建设项目。医院建立了从本科到博士后及留学生的完整的医学人才培养体系，在院医学生、住院/全科医师、实习进修人员2000多人。拥有国家级的临床技能实验教学示范中心、大学生课外实践基地、住院医师规范化培训基地、全科医师培训基地、一级学科博士点等，以及《内科学》、《临床技能实验学》、《文献信息检索》等3门国家精品课程。组队代表中南大学参加第四届全国高等医学院校大学生临床技能竞赛获特等奖。医院拥有卫生部移植医学工程技术研究中心等16个部省级科研平台和国家“十二五”重大新药创制临床研究（GCP）建设平台。近年来承担国内外包括国家
					973、国自重大、国自重大研究计划等科研课题1000余项，获各类成果奖近60项，专利近200余项。医院勇担社会大型公立医院职能，表现出“国家队”大医院应有的社会担当。在抗击“非典”、抗洪救灾、抗冰救灾、抗震救灾以及扶贫支边、援疆援藏援非等任务中，赢得社会和政府的高度评价。建立“三位一体”、“上下联动”区域协同医疗网络平台，直接帮扶和指导近60家基层医疗机构，影响和带动基层卫生服务机构近千家。近年来，医院获得了“全国卫生系统先进集体”、“全国卫生系统改革创新奖”、“全国百姓放心示范医院”、“全国医德建设先进集体”、“全国五四红旗团委
					”、“全国卫生系统思想政治工作先进单位”、“全国青年文明号”、“全国医院文化建设先进单位”、“湖南省先进基层党组织”、“湖南省先进学习型党组织
					”、“湖南省花园式医院”等荣誉称号。（2015年10月）
				</div>

				<div class="clear"></div>

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
