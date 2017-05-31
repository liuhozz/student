<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>#号的用法</h1>
<h3>获取context的数据</h3>
<%
	request.setAttribute("name", "李兵");
%>
<s:property value="#request.name"/>
<h3>构建map集合</h3>
<s:iterator var="i" value="{'aa','bb','cc'}">
	<s:property value="i"/> -- <s:property value="#i"/><br/>
</s:iterator>

<s:iterator var="entry" value="#{ 'aa':'11','bb':'22','cc':'33' }">
	<s:property value="key"/>--<s:property value="value"/><br/>
	<s:property value="#entry.key"/>--<s:property value="#entry.value"/><br/>
</s:iterator>
<hr/>
性别：<input type="radio" name="sex1" value="1">男 
<input type="radio" name="sex1" value="2">女
<br/>

<s:radio list="#{ '1':'男','2':'女' }" name="sex2" label="性别"/>
</body>
</html>