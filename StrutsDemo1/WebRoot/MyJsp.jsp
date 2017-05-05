<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equic="content-type" content="text/html;charset='utf-8'" >
  </head>
  
  <body>
	<form action="${pageContext.request.contextPath }/collection">
		<s:bean name="domain.User" var="u1">
			<s:param name="username" value="'fage'"></s:param>
			<s:param name="password" value="'123'"></s:param>
		</s:bean> 
		<s:set name="user" value="#u1" scope="request"></s:set>
		<s:property value="#request.user"/>


		fage<input type="checkbox" name="" value=<s:property value="#u1"/>>
		<input type="submit" value="确定">
	</form>
	<s:debug></s:debug>
  </body>
</html>
