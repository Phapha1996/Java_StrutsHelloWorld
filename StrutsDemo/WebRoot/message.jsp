<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'message.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<h1 align="center">成功！！</h1>
	<!--<s:property value="errors.name[0]"/>
	<s:property value="userdto.username"/>-->
	<!-- 欢迎您：<s:property value="#attr.user.username"/>|||<s:property value="user.username"/><s:property value="user.password"/><s:property value="user.nickname"/> -->
	<s:property value="#session.user"/>
	<s:property value="#request.message"/>
	<s:property value="user.username"/>
	<s:debug></s:debug>
  </body>
</html>