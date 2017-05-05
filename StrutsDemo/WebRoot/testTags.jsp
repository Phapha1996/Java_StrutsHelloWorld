<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testTags.jsp' starting page</title>
    
	<meta http-equiv="content-type" content="text/html;charset='utf-8'">

  </head>
  
  <body>
	<%--<s:property value="username"/>
	<s:property value="password"/>
	<s:property value="user.username"/>
	<s:property value="user.password"/>
	<s:property value="#parameters"/>
 	
 	<s:property value="admin" default="管理员"/>
 	<s:property value="'<hr/>'" escape="false"/>
 	<s:set var="adminName" value="username"/>
 	<s:property value="#adminName"/>
 	<s:property value="#parameters.username[0]"/>
	<s:set var="adminName" value="username" scope="session"></s:set>
	<s:property value="#session.adminName"/>--%>
	
	<%-- <s:bean name="domain.User" var="user">
		<s:param name="username" value="'fafa'"></s:param>
		<s:param name="password" value="'123123'"></s:param>
		<s:param name="nickname" value="'fage'"></s:param>
	</s:bean>
	<s:property value="#user.username"/>
	<s:property value="#user.password"/>
	<s:property value="#user.nickname"/> --%>
	
	<!--<s:property value="errors.myMessage[0]"/>-->
	
	<%-- <s:set var="admin" value="username"></s:set>
	<s:set var="pwd" value="password"></s:set>
	<s:property value="#parameters.username[0]"/>||
	<s:property value="#parameters.password[0]"/>
	 --%>
	 
	<%--  <s:if test="#parameters.age[0]<20">你太年轻</s:if>
	 <s:elseif test="#parameters.age[0]<40">刚刚合适</s:elseif>
	 <s:else>您该退休了！！</s:else> --%>
	 
	<%--  
	<s:iterator value="list">
		<s:property/>
	</s:iterator>	 --%>
	
 	<%-- <s:iterator value="list" var="num">
		<s:property value="#num"/>
	</s:iterator> --%>
	
	<%-- <s:property value="list.size()"/>
	<s:iterator value="list" status="status">
		<s:property/><br>
		遍历过的元素总数：<s:property value="#status.count"/><br>
		<s:if test="#status.count==6"><font color="red">么么哒，第六次了呢！！</font></s:if>
		遍历过的元素索引：<s:property value="#status.index"/><br>
		当前的是偶数？<s:property value="#status.even"/><br>
		当前是奇数？<s:property value="#status.odd"/><br>
		是第一个元素吗？<s:property value="#status.first"/><br>
		是最后一个元素吗？<s:property value="#status.last"/><br><br>
	</s:iterator> --%>
	
	<s:iterator value="map">
		<s:property value="key"/>:<s:property value="value"/><br>
	</s:iterator>
 	<s:debug></s:debug>
  </body>
</html>
