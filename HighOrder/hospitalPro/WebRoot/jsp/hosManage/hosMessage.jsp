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
		<script>
			window.onerror = function() {
				return true;
			}
		</script>
		<script>TMall.BackTop.init();</script>
		<script>var webdir = "/";</script>
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
	<link rel="stylesheet" href="../../css/jqueryslidemenu.css" type="text/css"></link>
	<link rel="stylesheet" href="../../css/z_css.css" type="text/css"></link>
	</head>

	<body>

		<!--top begin-->
		<div class="z_top">
			<div class="z_topcon">
				<span><font id="datetime"></font><font id="ggtxt" color="red"
					style="font-size: 14px; font-weight: bold"></font>
				</span>
				<p>
					<a href="#" title="邮箱登录" target="_blank">邮箱登录</a> |
					<a href="../../mailbox/index.htm" title="院长信箱" target="_blank">院长信箱</a> |
					<a href="#" title="English" target="_blank">English</a>
					|
					<a href="../../tg/index.htm" title="投稿专线" target="_blank">投稿专线</a>
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
			<div class="z_tel" style=" background:url('../../ImgVedio/image/z_souch.jpg') no-repeat top right ;">
				<form id="form1" name="form1" method="post"
					action="../../search/-keyword=请输入关键词！&boardid=.htm">
					<input class="search_key" value="请输入关键词！" onfocus="this.value=''"
						name="keyword" id="keyword">
					<input class="search_button" value="" type="submit" style="background:url('../../ImgVedio/image/z_s.jpg') no-repeat right top;"/>
					<input type="hidden" name="boardid" value="0" />
				</form>
			</div>
		</div>
		<!--head end-->
		<!--nav begin-->
		<div class="z_nav" >
			<div class="z_navcon" style="background:url('../../ImgVedio/image/z_libg.jpg') repeat-x;">
				<div class="jqueryslidemenu" id="myslidemenu">
					<ul>
      					<li>
      						<a href="WebRoot/index.jsp">首页</a>
      					</li>
            			<li >                        	
            				<a href="jsp/hosManage/index.jsp"  title="医院管理1">医院管理</a>  
                        	<ul>                      
                        		<li>
                        			<a href="../../yygl/yyjj/index.htm"  title="医院简介1">医院简介</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yygl/xrld/index.htm"  title="现任领导1">现任领导</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yygl/jgsz/index.htm"  title="机构设置1">机构设置</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yygl/gzzd/index.htm"  title="规章制度1">规章制度</a>
                        		</li>                    
                        		<li>
                        			<a href="../../itc/itc.html"  title="医院信息1">医院信息</a>
                        		</li>                    
                        		<li>
                        			<a href="#"  title="远程医疗1">远程医疗</a>
                        		</li>                   
                        	</ul>         
                        </li>            	
                        <li >                    
                        	<a href="jsp/hosServe/index.jsp"  title="医疗服务1">医疗服务</a>                         
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
                        <li >                    
                        	<a href="jsp/Employmentguide/index.jsp" title="就医指南1">就医指南</a>                                   
                        </li>            	
                        <li >                        	
                        	<a href="jsp/nursing/nurse.jsp" title="护理风采1">护理风采</a>                                  
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
                        <li >                    
                        	<a href="jsp/M_enducation/index.jsp" title="医学教育1">医学教育</a>                          
                        	<ul>                      
                        		<li>
                        			<a href="#" title="研究生教育网1">研究生教育网</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yxjy/zyys/index.htm" title="医师培训1">医师培训</a>
                        		</li>                   
                        	</ul>         
                        </li>            	
                        <li >                    
                        	<a href="jsp/scientificresearch/index.jsp" title="科学研究1">科学研究</a>                          
                        	<ul>                      
                        		<li>
                        			<a href="#" title="伦理委员会1">伦理委员会</a>
                        		</li>                    
                        		<li>
                        			<a href="#" title="临床试验机构1">临床试验机构</a>
                        		</li>                   
                        	</ul>         
                        </li>            	
                        <li >                    
                        	<a href="jsp/partyGroup/index.jsp" title="党建群团1">党建群团</a>                          
                        	<ul>            
                        		<li>
                        			<a target="_blank" href="../../djqt/index.htm"  title="党建网">党建网</a>
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
                        <li >                        	
                        	<a href="jsp/hosCulture/index.jsp" title="医院文化1">医院文化</a>                                  
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
                       		<a href="#" title="办公系统1">办公系统</a>                                   
                       	</li>      
    </ul>
				</div>
			</div>
		</div>
		<!--nav end-->


		<div class="z_spcon" style="background:url('../../ImgVedio/image/z_leftbt.gif') no-repeat left bottom;">
			<!--人物风采 left-->
			<div class="z_rw_l">
				<div class="z_rw_con" style="background:url('../../ImgVedio/image/z_lbg.jpg') repeat-y center;">
					<div class="z_rw_top" style="background:url('../../ImgVedio/image/z_top.jpg') no-repeat top;">
						<h2>
							医院管理
						</h2>
						<ul class="z_ywgl">
							<li>
								<a href="index.htm" title="信息概况" class="navH">信息概况</a>
							</li>
							<li>
								<a href="../yyxx/index.htm" title="信息制度">信息制度</a>
							</li>
							<li>
								<a href="../yyry/index.htm" title="工作范围">工作范围</a>
							</li>
							<li>
								<a href="../jzwh/index.htm" title="效果展示">效果展示</a>
							</li>
							
							
						</ul>
					</div>
					<div class="z_rw_bt" style=" background:url('../../ImgVedio/image/z_lbt.jpg') no-repeat bottom;"></div>
				</div>
				<div class="clear"></div>
				<div class="z_lx">
					<div class="z_tg" style="background:url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a
								href="#"
								target="_blank">每日门诊</a>
						</h3>
					</div>
					<div class="z_wb" style="background:url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a
								href="#"
								target="_blank">预约体检</a>
						</h3>
					</div>
					<div class="z_jd" style="background:url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="../../tg/index.htm" target="_blank">投稿专线</a>
						</h3>
					</div>
					<div class="z_jd" style="background:url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="../../newsph/index.htm" target="_blank">热门点击</a>
						</h3>
					</div>
					<div class="z_jd2" style="background:url('../../ImgVedio/image/z_tg5.jpg') no-repeat;">
						<h3>
							<a href="../../news/index.htm" target="_blank">医院新闻</a>
						</h3>
					</div>
				</div>
			</div>
			<div class="z_title">
					<h3>
						医院信息
					</h3>
					<span>当前位置：<a href="../../index.htm">首页</a> &gt; 医院管理&gt; <a href="index.htm">医院信息</a>
					</span>
				</div>
			<div class="z_rw_r">
				站在巨人的肩膀上，中南大学湘雅三医院的医院信息化建设高起点、高水平、高效率，渐成行业品牌翘楚。按照“总体规划，分步实施，小步快跑，兼顾安全”的原则，2002年开始上线全院收费管理系统；2006年“数字化建设年”，进入临床发展阶段，三年时间完成所有医疗流程的电子化；2011年，通过人、物、财三流合一，实现了医疗流程和管理流程的全数字化管理。

      医院现已完成医护工作站、全院电子病历及质量控制系统、全院PACS系统、实验室信息管理系统、住院腕带及门诊诊疗卡病人标识系统、门急诊预交费“一卡通”系统、中心摆药及静脉配置系统、输血管理系统、全院型病理管理系统、手术麻醉系统、重症监护系统、全接口医保系统、三位一体的体检系统、视频会议系统、办公系统、物流系统、HRP系统、科研管理系统等70余个大小系统，其中大部分在省内率先开展。作为“国家队”医院应有的社会担当，还建立了远程协作、会诊、支援、教学等区域医疗合作网络，利用信息化手段整合医疗资源，扶贫支边、援疆援藏。

      自上线以来，系统每成熟一个，运用一个，收效一个，从未出现过暂停、倒退、更换现象，也没有因信息系统原因引起全院混乱、漏费、投诉、安全、纠纷等问题。由于信息系统建设成效显著，医院先后荣获“全国信息化创新医疗服务模式十佳医院”、“全省医疗评审信息化应用评价首批通过医院”等称号；湖南省医学信息研究重点实验室和湖南省医疗机构信息管理质控中心挂靠医院。

      12年风雨兼程，12年稳步前行，医院的信息化建设正以其创新、科学、高效的态势，以其数字化、智能化、精细化，助推医院建设高水平国家优质医院建设。 


			</div>
		</div>
		<div class="clear"></div>
		<div class="z_foot">
			<div class="z_link">
				<h3>
					友情链接
				</h3>
				<p>
					<a
						href="#">人民网</a> |
					<a
						href="#">新华网</a> |
					<a
						href="#">中新网</a> |
					<a
						href="#">卫计委</a> |
					<a
						href="#">教育部</a> |
					<a
						href="#">湖南省政府</a> |
					<a
						href="#">红网</a> |
					<a
						href="#">省卫生计生委</a> |
					<a
						href="#">湖南省教育厅</a>
					|
					<a
						href="#">中南大学</a> |
					<a
						href="#">湘雅医学院</a> |
					<a
						href="#">湘雅医院</a> |
					<a
						href="#">湘雅二医院</a> |
					<a
						href="#">协和医院</a> |
					<a
						href="#">华西医院</a> |
					<a
						href="#">西京医院</a> |
					<a
						href="#">瑞金医院</a>
					|
					<a
						href="#">复旦中山医院</a> |
					<a
						href="#">武汉同济医院</a> |
					<a
						href="#">中山医院</a>
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
						<a
						href="#">长沙网站建设</a>-
						<a
						href="#">创研科技</a>
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
					<script type="text/javascript" id="bdshare_js" data="type=tools&uid=0">
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
document.write(unescape("%3Cspan id='_ideConac' %3E%3C/span%3E%3Cscript src='../../../dcs.conac.cn/js/33/000/0000/60497944/CA330000000604979440004.js'/*tpa=http://dcs.conac.cn/js/33/000/0000/60497944/CA330000000604979440004.js*/ type='text/javascript'%3E%3C/script%3E"));</script>
				</div>
			</div>
		</div>
	</body>
</html>
