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
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
		<title>信息概况</title>
		<meta name="keywords" content="信息概况" />
		<meta name="description" content="中南大学湘雅三医院信息中心介绍" />
		<link href="skins/2009/css/sdcms.css"
			tppabs="http://www.xy3yy.com/itc/skins/2009/css/sdcms.css"
			rel="stylesheet" type="text/css" />
		<script>
var webdir = "/itc/";</script>
		<script src="editor/jquery.js"
			tppabs="http://www.xy3yy.com/itc/editor/jquery.js"
			language="javascript">
</script>
		<script src="skins/2009/js/sdcms.js"
			tppabs="http://www.xy3yy.com/itc/skins/2009/js/sdcms.js"
			language="javascript">
</script>
		<!--[if lt IE 7]><script type="text/javascript" src="skins/2009/js/minmax.js" tppabs="http://www.xy3yy.com/itc/skins/2009/js/minmax.js"></script><![endif]-->
	</head>
	<body>
		<div class="width">
			<div id="top_logo">
				<div id="top_other">
					<dl>
						<form onSubmit="return checksearch(this);">
							<dt>
								<input name="key" type="text" class="input" value="请输入关键字"
									onFocus="if (value =='请输入关键字'){value =''}"
									onBlur="if (value ==''){value='请输入关键字'}" />
							</dt>
							<dt>
								<input type="submit" class="bnt" value="搜 索" />
							</dt>
						</form>
					</dl>
				</div>
			</div>
			<!--<div id="top_ad"><a href="www.xy3yy.com/" target="_blank"><img src="/itc/skins/2009/images/gg.jpg" alt="SDCMS数据中心" border="0" /></a></div>-->
		</div>
		<div id="menu" class="c">
			<ul class="menu">
				<dt class="l"></dt>
				<dt>
					<a href="itc.html" tppabs="http://www.xy3yy.com/itc/itc.html"
						onfocus="this.blur()">信息概况</a>
				</dt>
				<dt class="m"></dt>
				<dt>
					<a href="html/xxzd/index.htm"
						tppabs="http://www.xy3yy.com/itc/html/xxzd/" onfocus="this.blur()">信息制度</a>
				</dt>
				<dt class="m"></dt>
				<dt>
					<a href="html/gzfw/index.htm"
						tppabs="http://www.xy3yy.com/itc/html/gzfw/" onfocus="this.blur()">工作范围</a>
				</dt>
				<dt class="m"></dt>
				<dt>
					<a href="html/xgzs/index.htm"
						tppabs="http://www.xy3yy.com/itc/html/xgzs/" onfocus="this.blur()">效果展示</a>
				</dt>
				<dt class="m"></dt>
				<dt>
					<a href="html/bgxz/index.htm"
						tppabs="http://www.xy3yy.com/itc/html/bgxz/" onfocus="this.blur()">表格下载</a>
				</dt>
				<dt class="m"></dt>
				<dt>
					<a href="html/PPT/index.htm"
						tppabs="http://www.xy3yy.com/itc/html/PPT/" onfocus="this.blur()">PPT模板</a>
				</dt>
				<dt class="r"></dt>
			</ul>
		</div>
		<div class="width mt10">
			<div id="right">
				<div class="border" id="index_hot">
					<div class="subject_bg">
						<div class="subject_title">
							栏目分类
						</div>
					</div>
					<div class="m10">
						<dl class="class_list">
							<dt>
								·
								<a href="itc.html" tppabs="http://www.xy3yy.com/itc/itc.html"
									style="font-weight: bold;">信息概况</a>
							</dt>
							<dl class="class_list">
								<dt>
									·
									<a href="html/xxzd/index.htm"
										tppabs="http://www.xy3yy.com/itc/html/xxzd/">信息制度</a>
								</dt>
								<dt>
									·
									<a href="html/gzfw/index.htm"
										tppabs="http://www.xy3yy.com/itc/html/gzfw/">工作范围</a>
								</dt>
								<dt>
									·
									<a href="html/xgzs/index.htm"
										tppabs="http://www.xy3yy.com/itc/html/xgzs/">效果展示</a>
								</dt>
								<dt>
									·
									<a href="html/bgxz/index.htm"
										tppabs="http://www.xy3yy.com/itc/html/bgxz/">表格下载</a>
								</dt>
								<dt>
									·
									<a href="html/PPT/index.htm"
										tppabs="http://www.xy3yy.com/itc/html/PPT/">PPT模板</a>
								</dt>
								<dt>
									·
									<a href="../index.htm" tppabs="http://www.xy3yy.com/">返回湘雅三医院</a>
								</dt>
							</dl>
						</dl>
					</div>
				</div>
			</div>
			<div id="left">
				<div class="border">
					<div class="subject_bg">
						<div class="subject_title">
							信息概况
						</div>
					</div>
					<div class="m10">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td class="other_content">
									<p>
										<span style="font-size: 14px;">&nbsp;</span><span
											style="font-size: 14px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											站在巨人的肩膀上，中南大学湘雅三医院的医院信息化建设高起点、高水平、高效率，渐成行业品牌翘楚。按照“总体规划，分步实施，小步快跑，兼顾安全”的原则，2002年开始上线全院收费管理系统；2006年“数字化建设年”，进入临床发展阶段，三年时间完成所有医疗流程的电子化；2011年，通过人、物、财三流合一，实现了医疗流程和管理流程的全数字化管理。</span>
									</p>
									<p>
										<span style="font-size: 14px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											医院现已完成医护工作站、全院电子病历及质量控制系统、全院PACS系统、实验室信息管理系统、住院腕带及门诊诊疗卡病人标识系统、门急诊预交费“一卡通”系统、中心摆药及静脉配置系统、输血管理系统、全院型病理管理系统、手术麻醉系统、重症监护系统、全接口医保系统、三位一体的体检系统、视频会议系统、办公系统、物流系统、HRP系统、科研管理系统等70余个大小系统，其中大部分在省内率先开展。作为“国家队”医院应有的社会担当，还建立了远程协作、会诊、支援、教学等区域医疗合作网络，利用信息化手段整合医疗资源，扶贫支边、援疆援藏。</span>
									</p>
									<p>
										<span style="font-size: 14px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											自上线以来，系统每成熟一个，运用一个，收效一个，从未出现过暂停、倒退、更换现象，也没有因信息系统原因引起全院混乱、漏费、投诉、安全、纠纷等问题。由于信息系统建设成效显著，医院先后荣获“全国信息化创新医疗服务模式十佳医院”、“全省医疗评审信息化应用评价首批通过医院”等称号；湖南省医学信息研究重点实验室和湖南省医疗机构信息管理质控中心挂靠医院。</span>
									</p>
									<p>
										<span style="font-size: 14px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											12年风雨兼程，12年稳步前行，医院的信息化建设正以其创新、科学、高效的态势，以其数字化、智能化、精细化，助推医院建设高水平国家优质医院建设。
										</span>
									</p>
								</td>
							</tr>
						</table>
						<div class="content_page"></div>
					</div>
				</div>
			</div>
			<!--Left Over-->
		</div>
		<div class="width" id="foot">
			版权所有：中南大学湘三医院信息中心
			<br>
			Powered By jzg 页面执行时间0.0469秒 查询数据库6次
			<script language="javascript" src="Inc/Spider.asp"
				tppabs="http://www.xy3yy.com/itc/Inc/Spider.asp">
</script>
			<div id="login"></div>
		</div>
	</body>
</html>