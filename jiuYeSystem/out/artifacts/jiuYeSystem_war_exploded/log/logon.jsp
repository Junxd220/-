<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<title>注册页面</title>
		<script type="text/javascript">
            function validataForm(){
                var user = document.getElementById("user").value;
                if(user == ""){
                    alert("用户名不能为空！");
                    return false;
                }

                var pwd1 = document.getElementById("pwd1").value;
                if(pwd1 == ""){
                    alert("密码不能为空!");
                    return false;
                }

                var pwd2 = document.getElementById("pwd2").value;
                if(pwd1 != pwd2){
                    alert("两次密码不一致！");
                    return false;
                }

                var email = document.getElementById("email").value;
                if(email.match("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")==null){
                    alert("哥们儿,邮箱地址非法");
                    return false;
                }
            }
		</script>

	</head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<body>

<form action="<%=request.getContextPath()%>/logonServlet" method="post" name="form" onsubmit="return validataForm();">
<table align="center">
	<br>
	<tr><select name="type" align="center">
		<option>请选择用户类型</option>
		<option value="student">学生</option>
		<option value="enterprise">企业</option>
		<option value="user">测试</option>
	</select></tr>
	<tr><td>用户名：</td><td><input type="text" name="user" placeholder="请输入用户名" maxlength="20"></td><td><font color="red">*</td></tr>
	<%--<tr><td>手机号：</td><td><input type="int" name="no" placeholder="请输入手机号" maxlength="11"></td><td><font color="red">*</td></tr>--%>
	<tr><td>邮  箱：</td><td><input type="text" name="email" placeholder="请输入邮箱号" maxlength="30"></td></tr>
	<%--<tr><td>姓  名：</td><td><input type="text" name="name" placeholder="请输入姓名" maxlength="20"></td><td><font color="red">*</td></tr>--%>
	<tr><td>密  码：</td><td><input type="password" name="pwd1" placeholder="请输入密码" maxlength="20"></td><td><font color="red">*</td></tr>
	<tr><td>确认密码：</td><td><input type="password" name="pwd2" placeholder="再次输入密码" maxlength="20"></td><td><font color="red">*</td></tr>
	<tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重填"></td>  
    </tr>
</table>  
</form>
<div>
	已有账号？<a href="login.jsp">点此登录！</a>
	<br>
	<a href="../index.jsp">点此返回系统页</a>
</div>
<!-- 	out.println("<script language='javascript'>alert('两次密码不正确！');</script>"); -->


	</body>
</html>
