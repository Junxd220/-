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
<form>
<div height:400px;>

    <div style="width:20%; float:left">
        <div>
            <span>个人信息</span>
        </div>
        <div>
            <p>基本资料</p>
            <p>学籍信息</p>
        </div>
        <div>

        </div>
        <div>
            <span>修改密码</span>
        </div>
    </div>

    <div style="width:80%; height:400px; float:right">
        <div height:200px; float:right">
        <tr>
            <td>毕业生ID：</td><td><input type="text"></td>
            <td>注册ID：</td><td><input type="text"></td>
        </tr>
        </div>
        <div height:200px; float:right">
                <span>修改密码</span>
            <table>
                <tr>
                    <td>姓名：</td><td><input type="text"></td>
                    <td>性别：</td><td><input type="text"></td>
                </tr>
                <tr>
                    <td>国籍</td><td><input type="text"></td>
                    <td>生日</td><td><input type="text"></td>
                </tr>
                <tr>
                    <td>婚姻状况</td><td><input type="text"></td>
                </tr>
                <tr>
                    <td>身高</td><td><input type="text"></td>
                    <td>体重</td><td><input type="text"></td>
                </tr>
                <tr>
                    <td>证件类型</td><td><input type="text"></td>
                    <td>证件号码</td><td><input type="text"></td>
                </tr>
                <tr>
                    <td>籍贯</td><td><input type="text"></td>
                </tr>
            </table>
        </div>
        <div>
            <tr>
                <td>电话号码</td><td><input type="text"></td>
                <td>移动电话</td><td><input type="text"></td>
            </tr>
            <tr>
                <td>Q Q号码</td><td><input type="text"></td>
                <td>电子邮件</td><td><input type="text"></td>
            </tr>
            <tr>
                <td>邮政编码</td><td><input type="text"></td>
                <td>通讯地址</td><td><input type="text"></td>
            </tr>
        </div>
        <div>
            <tr>
                <td>毕业院校</td><td><input type="text"></td>
                <td>专业名称</td><td><input type="text"></td>
            </tr>
            <tr>
                <td>学位</td><td><input type="text"></td>
            </tr>
            <tr>
                <td>自我评价</td><td><input type="text"></td>
            </tr>
        </div>
        <div>
            <tr>
                <td>中文水平</td><td><input type="text"></td>
                <td>电脑等级</td><td><input type="text"></td>
            </tr>
            <tr>
                <td>第一外语</td><td><input type="text"></td>
                <td>一外水平</td><td><input type="text"></td>
            </tr>
            <tr>
                <td>第二外语</td><td><input type="text"></td>
                <td>二外水平</td><td><input type="text"></td>
            </tr>
        </div>
        <div>
            <tr>
                <td><input type="submit" value="提交"></td>
                <td><input type="reset" value="清空"></td>
            </tr>

        </div>
    </div>


</div>
</form>
<%@ include file="/bg/网页尾_未登录.txt" %>
</body>
</html>
