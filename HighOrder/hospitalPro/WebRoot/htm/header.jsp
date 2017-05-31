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
		<script>TMall.BackTop.init();</script>
		<script>var webdir = "/";</script>
<script src="../../js/saved_resource.js"  type="text/javascript"></script>
<script src="../../js/header.js" type="text/javascript"></script>
<script src="../../js/bckToTop.js" type="text/javascript"></script>
<script src="../../js/Dropdown/jquery-1.7.2.min.js"type="text/javascript"></script>
<script>TMall.BackTop.init();</script>
<script>var webdir="/";</script>
<script src="../../js/tryine.js" type="text/javascript"></script>
<script type="text/javascript" src="../../js/jqueryslidemenu.js" type="text/javascript" ></script>
<link rel="stylesheet" href="../css/t_css.css" type="text/css"></link>
<link rel="stylesheet" href="../css/jqueryslidemenu.css" type="text/css"></link></head>

	<body>
  
<!--head begin-->
		<div class="z_head">
			<div class="z_head_logo">
				<img src="../ImgVedio/image/z_logo.jpg"></img>
				&#160;
				<img src="../ImgVedio/image/2013071536077001.jpg"></img>
				<img src="../ImgVedio/image/z_tel.jpg"></img>
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
		<div class="z_nav" style="background:url('../../ImgVedio/image/z_libg.jpg') repeat-x;">
			<div class="z_navcon" >
				<div class="jqueryslidemenu" id="myslidemenu">
					<ul>
      					<li>
      						<a href="index.jsp">首页</a>
      					</li>
            			<li >                        	
            				<a href="../../hosManage/manageIndex.jsp"  title="医院管理1">医院管理</a>  
                        	<ul>                      
                        		<li>
                        			<a href="../../hosManage/yyjj.jsp"  title="医院简介1">医院简介</a>
                        		</li>                    
                        		<li>
                        			<a href="../../hosManage/xrld.jsp"  title="现任领导1">现任领导</a>
                        		</li>                    
                        		<li>
                        			<a href="../../hosManage/jgsz.jsp"  title="机构设置1">机构设置</a>
                        		</li>                    
                        		<li>
                        			<a href="../../hosManage/jgsz.jsp"  title="规章制度1">规章制度</a>
                        		</li>                    
                        		<li>
                        			<a href="../../hosManage/hosMessage.jsp"  title="医院信息1">医院信息</a>
                        		</li>                    
                        		<li>
                        			<a href="#"  title="远程医疗1">远程医疗</a>
                        		</li>                   
                        	</ul>         
                        </li>            	
                        <li >                    
                        	<a href="#"  title="医疗服务1">医疗服务</a>                         
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
                        	<a href="../../Employmentguide/index.jsp" title="就医指南1">就医指南</a>                                   
                        </li>            	
                        <li >                        	
                        	<a href="#" title="护理风采1">护理风采</a>                                  
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
                        	<a href="../../M_enducation/index.jsp" title="医学教育1">医学教育</a>                          
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
                        	<a href="#" title="科学研究1">科学研究</a>                          
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
                        	<a href="../../djqt/index.htm" title="党建群团1">党建群团</a>                          
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
                        	<a href="index.htm" title="医院文化1">医院文化</a>                                  
                        	<ul>                      
                        		<li>
                        			<a href="../../jsll/index.jsp" title="精神理念1">精神理念</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yyxx/index.htm" title="医院形象1">医院形象</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yyry/index.htm" title="医院荣誉1">医院荣誉</a>
                        		</li>                    
                        		<li>
                        			<a href="../../jzwh/index.htm" title="建筑文化1">建筑文化</a>
                        		</li>                    
                        		<li>
                        			<a href="../../yylc/index.htm" title="医院历程1">医院历程</a>
                        		</li>                    
                        		<li>
                        			<a href="../../hdjy/index.htm" title="活动剪影1">活动剪影</a>
                        		</li>                    
                        		<li>
                        			<a href="../../picture/index.htm" title="经典图片1">经典图片</a>
                        		</li>                    
                        		<li>
                        			<a href="../../whys/index.htm" title="文化元素1">文化元素</a>
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
</body>
</html>