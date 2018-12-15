<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/11
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生用户界面</title>
    <link rel="stylesheet" href="css/StudentLeft.css">
    <script src="js/jquery-1.9.1.min.js"></script>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        frame{
            height: 2000px;
        }
        .bx{
            height: 60px;
            width: 100%;
            background: #177ec1;
        }
        .bx .container{
            margin: 0 60px;
            overflow: hidden;
        }
        .bx .container .left{
            width: 201px;
            height: 43px;
            padding-top: 19px;
            color: #FFFFFF;
            font-size: 24px;
            float: left;
        }
        .bx .container .right{
            overflow: hidden;
            width: 124px;
            padding-top: 19px;
            float: right;
        }
        .bx .container .right span{
            font-size: 16px;
            color: #fff;
        }
        .bx .container .right .l{
            float: left;
        }
        .bx .container .right .r{
            float: right;
        }
    </style>
</head>
<body>

<div class="bx">
    <div class="container">
        <h2 class="left">学生就业管理系统</h2>
        <div class="right">
            <span class="l">注销</span>
            <span class="r">退出登录</span>
        </div>
    </div>
</div>
<div class="nav">
    <div class="nav-list">
        <div class="nav-tit" id="personal">
            <a href="student.html" target="main">
                <img src="images/personal-msg.png" style="height: 30px" alt="">
                <span>个人信息</span>
            </a>
        </div>
        <div class="personal-list" id="personal-child">
            <ul>
                <li><a href="FamilyInformation.html" target="main">家庭信息</a></li>
                <li><a href="StudentScInformation.html" target="main">学校信息</a></li>
                <li><a href="school-msg.html" target="main">学籍信息</a></li>
                <li><a href="punishment.html" target="main">处分信息</a></li>
            </ul>
        </div>
        <div class="nav-tit">
            <a href="StudentInformation.html" target="main">
                <img src="images/archives-msg.png" alt="">
                <span>档案信息</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="StudentEmInformation.html" target="main">
                <img src="images/job-msg.png" alt="">
                <span>就业信息</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="investigation.html" target="main">
                <img src="images/job-change.png" alt="">
                <span>就业调查</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="StudentPubMed.html" target="main">
                <img src="images/PubMed-msg.png" alt="">
                <span>考研信息</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="StudentRevise.html" target="main">
                <img src="images/modify-password.png" alt="">
                <span>修改密码</span>
            </a>
        </div>
    </div>
</div>

<script>
    $(document).ready(function(){
        $('#personal').on('click',function(){
            $('#personal-child').fadeToggle(300);
        });
        let aLi = $('#personal-child li');
        aLi.on('click',function(){
            $(this).addClass('active').siblings('li').removeClass('active');
        })
    });
</script>


<frame src="UntitledFrame-1" name="main" scrolling="yes" noresize="noresize" />

</body>
</html>
