<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功登陆</title>
<script type="text/javascript">
/* function delete(sid){
	
} */
function sdelete(sid) {
	var flag = confirm("是否确定删除?");
	if(flag){
		//表明点了确定。 访问servlet。 在当前标签页上打开 超链接，
		//window.location.href="DeleteServlet?sid="+sid;
		location.href="DeleteServlet?sid="+sid;
	}
}
</script>
</head>
<body>
<!-- PageSelectServlet -->
 <form action="MoHuSelectSrevlet" method="post">
  <table border="1" width=960>
 			 <tr >
				<td colspan="8">
					
					按姓名查询:<input type="text" name="sname"/>
					&nbsp;
					按性别查询:<select name="sex">
								<option value="">--请选择--
								<option value="男">男
								<option value="女">女
							  </select>
					&nbsp;&nbsp;&nbsp;
					<input type="submit" value="查询">
					&nbsp;&nbsp;&nbsp;
					<a href="insert.jsp">添加</a>
				</td>
			</tr>
  
  <tr>
	<td>编号</td>
	<td>姓名</td>
	<td>性别</td>
	<td>电话</td>
	<td>出生日期</td>
	<td>爱好</td>
	<td>简介</td>
	<td>操作</td>
  </tr>
  <c:forEach items="${pagecc.list }" var="l">
	  <tr>
		<td>${l.sid }</td>
		<td>${l.sname }</td>
		<td>${l.sex }</td>
		<td>${l.phone }</td>
		<td>${l.birthday }</td>
		<td>${l.hobby }</td>
		<td>${l.info }</td>
		<td><a href="EditServlet?sid=${l.sid }">更新</a>|<a href="#" onclick="sdelete(${l.sid})">删除</a></td>
	  </tr>
  </c:forEach>
  <tr>
  
  		<td colspan="8">
  		第${pagecc.currentlypage }  /${pagecc.allpage }
  		每页显示  ${pagecc.num }条记录
  		总记录 ${pagecc.allnum } 条
  		<a href="PageSelectServlet?currentlypage=1">首页</a>
  		<a href="PageSelectServlet?currentlypage=${pagecc.currentlypage+1 }">下一页</a>
  		<c:forEach begin="1" end="${pagecc.allpage }" var="i">
  			<a href="PageSelectServlet?currentlypage=${i }">${i }</a>
  		</c:forEach>
  		<a href="PageSelectServlet?currentlypage=${pagecc.currentlypage-1 }">上一页</a>
  		<a href="PageSelectServlet?currentlypage=${pagecc.allpage }">尾页</a>
  		</td>
  	
  </tr>
  </table>
</form>
</body>
</html>