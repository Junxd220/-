<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.text.*" %>
<%@ page import="com.model.ligBean" %>

<hr>
<div align="center">
   <font size="4" color="blue">
   <br><br>
	<b>ϵͳ�����ˣ�Ƚ��΢</b>
	&nbsp;&nbsp;&nbsp;
	<b>��ǰϵͳʱ�䣺
<% 
String time = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
out.print(time);
%>
	</b>
	&nbsp;&nbsp;&nbsp;
	<b>��ǰע��ѧ��������
<%
out.print(request.getAttribute("student"));
%>
	</b>
	&nbsp;&nbsp;&nbsp;
	<b>��ǰע����ҵ������
<%
out.print(request.getAttribute("enterprise"));
%>
	</b>
</div>