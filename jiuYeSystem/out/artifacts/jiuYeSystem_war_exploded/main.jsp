<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <title>主页</title>
<%
    if(session.getAttribute("user") == null) {
%>
<script type="text/javascript" language="javascript">
    alert("您还没有登录，请登录...");
    top.location.href="log/login.jsp";
</script>
<%
    }
%>

</head>
<body>
<%@ include file="/bg/网页头_已登录.jsp" %>

<div style="width: 1000px; height:400px;">

    <div style="width:190px; height: 390px; float:left ; border:5px solid #000;">
        <br>
        <div>
            <span>个人信息</span>
        </div>
        <br>
        <div>
            <ul>
                <li><a>个人信息</a></li>
                <li><a>学籍信息</a></li>
            </ul>
        </div>
        <br>
        <div class="nav-tit">
            <span>就业信息</span>
        </div>
        <br>
        <div class="nav-tit">
            <span>就业调查</span>
        </div>
        <br>
        <div class="nav-tit">
            <span>考研信息</span>
        </div>
        <br>
        <div class="nav-tit">
            <span>修改密码</span>
        </div>
    </div>

    <div style="width:600px; float:left;">
        <div style="width:600px; height: 200px;">
            <div class="nav-tit">
                <span>公告/滚动图片</span>
            </div>
        </div>
        <div style="width:600px;">
            <div style="width:190px; height: 190px; float:left ;border:5px solid #000; ">
                <span>招聘</span>
            </div>
            <div style="width:190px; height: 190px; float:left ;border:5px solid #000; ">
                <span>就业</span>
            </div>
            <div style="width:190px; height: 190px; float:left ;border:5px solid #000; ">
                <span>论坛</span>
            </div>
        </div>
    </div>

    <div style="width: 200px; height: 400px; float: left;">
        <div style="width:190px; height: 190px; border:5px solid #000;">
                <span>用户管理</span>
            </a>
        </div>
        <div style="width:190px; height: 190px; border:5px solid #000;">
            <span>其他信息</span>
            </a>
        </div>
    </div>
</div>
<br>
<%@ include file="/bg/网页尾_未登录.txt" %>
</body>
</html>
