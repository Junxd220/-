<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>系统页</title>

</head>
<!-- JS动画插入 -->
<body>
<%@ include file="bg/网页头_未登录.txt" %>

	<div align="left">游客，欢迎访问该系统</div><br>
	<div align="center">
		<a href="log/login.jsp">点此登陆</a>
		<br><br>
		<a href="log/logon.jsp">点此注册</a>
		<br><br>
		<a href="main.jsp">游客模式浏览（暂未开放）</a>
	</div>

<%@ include file="bg/网页尾_未登录.txt" %>
</body>
</html>
