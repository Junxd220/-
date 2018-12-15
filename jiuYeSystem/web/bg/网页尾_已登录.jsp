<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.text.*" %>
<%@ page import="com.model.ligBean" %>

<hr>
<div align="center">
   <font size="4" color="blue">
   <br><br>
	<b>系统制作人：冉得微</b>
	&nbsp;&nbsp;&nbsp;
	<b>当前系统时间：
<% 
String time = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
out.print(time);
%>
	</b>
	&nbsp;&nbsp;&nbsp;
	<b>当前注册学生人数：
<%
out.print(request.getAttribute("student"));
%>
	</b>
	&nbsp;&nbsp;&nbsp;
	<b>当前注册企业人数：
<%
out.print(request.getAttribute("enterprise"));
%>
	</b>
</div>