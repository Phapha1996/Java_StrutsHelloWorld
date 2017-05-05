<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    
	<meta http-equiv="Content-type" content="text/html;cahrset='utf-8'">
  </head>
  
  <body style="text-align:center">
  <a href="Student_add">增加学生</a><br>
  <a href="Student_delete">删除学生</a>
  
   <form action="Login.action" method="post">
   	<table border=1 align="center">
   		<tr><td>账号</td><td><input type="text" name="user.username"></td><tr>
   		<tr><td>密码</td><td><input type="password" name="user.password"></td><tr>
   	</table>
   	<input type="submit" value="提交">
   </form>
   
  </body>
</html>
