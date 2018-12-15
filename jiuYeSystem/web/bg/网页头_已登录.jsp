<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

<div align="center">
   <font size="5" color="blue">
	<p>毕业生就业管理系统</p>
</div>
	<hr>
<div  align="center">
   <font size="3" color="blue">
	   <br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=request.getContextPath()%>/main.jsp">首页</a>
	<a>就业板（未开放）</a>
	<a>招聘板（未开放）</a>
	<a>论坛（未开放）</a>

	<a href="<%=request.getContextPath()%>/view/student.jsp">个人页（开发中）</a>
	&nbsp;
	/
	&nbsp;
	<from action="logoutServlet">
	<a href="<%=request.getContextPath()%>/log/logout.jsp">注销</a>
	</from>
	<br> <br>
	<hr>
</div>