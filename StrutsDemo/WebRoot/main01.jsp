<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main01.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="content-type" content="text/html;charset='utf-8'">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="text-align:center">
    <a href="actions/Studentadd">增加学生</a><br>
    <a href="actions/Studentdelete">删除学生</a><br>
    <a href="actions/Teacher_add">增加老师</a><br>
    <a href="actions/Teacher_delete">删除老师</a><br>
  	<form action="actions/loginAction2" method="post">
    <table	border=1 align="center">
    	<!-- <tr><td>用户名</td><td><input type="text" name="userdto.username"></td></tr>
    	<tr><td>称呼</td><td><input type="text" name="userdto.nickname"></td></tr>
    	<tr><td>密码</td><td><input type="password" name="userdto.password"></td></tr>
    	<tr><td>确认密码</td><td><input type="password" name="userdto.passwordagin"></td></tr> -->
    	
    	<tr><td>用户名</td><td><input type="text" name="user.username"></td></tr>
    	<tr><td>称呼</td><td><input type="text" name="user.nickname"></td></tr>
    	<tr><td>密码</td><td><input type="password" name="user.password"></td></tr>
    </table>
    <input type="submit" value="提交">
    </form>
  </body>
</html>
