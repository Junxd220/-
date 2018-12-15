<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.swing.text.View" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<title>登陆页面</title>
	</head>
	
	<body>
<form action="<%=request.getContextPath()%>/loginServlet" method="post">
<div align="center">
	<table>  
		<tr><select name="type">
	<option>请选择用户类型</option>
	<option value="student">学生</option>
	<option value="enterprise">企业</option>
	<option value="admin">管理员</option>
	</select></tr>
		<tr><td>用户名：</td><td><input type="text" name="user" placeholder="请输入用户名" maxlength="20"></td></tr>
		<tr><td>密   码：</td><td><input type="password" name="pwd" placeholder="请输入密码" maxlength="20"></td></tr>  
		<tr><td><input type="submit" value="登陆"></td><td><input type="reset" value="重填"></td>  
	    </tr>
	</table>  
</div>
	<div>
		还没有账号？<a href="logon.jsp">点此注册！</a>
		<br>
		<a href="../index.jsp">点此返回系统页</a>
	</div>
</form>

	</body>
</html>
