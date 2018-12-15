<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/10
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>

<html>
<head>
    <title>注销界面</title>
</head>
<body>
<%@ include file="../bg/网页头_已登录.jsp"%>
<form action="<%=request.getContextPath()%>/logoutServlet" method="post">
    是否要登出用户？
    <br>
    <input type="submit" value="登出"><br>
    <a href="./main.jsp">返回主页</a>
</form>
<%@ include file="../bg/网页尾_已登录.jsp"%>
</body>
</html>
