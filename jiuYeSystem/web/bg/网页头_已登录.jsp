<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

<div align="center">
   <font size="5" color="blue">
	<p>��ҵ����ҵ����ϵͳ</p>
</div>
	<hr>
<div  align="center">
   <font size="3" color="blue">
	   <br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=request.getContextPath()%>/main.jsp">��ҳ</a>
	<a>��ҵ�壨δ���ţ�</a>
	<a>��Ƹ�壨δ���ţ�</a>
	<a>��̳��δ���ţ�</a>

	<a href="<%=request.getContextPath()%>/view/student.jsp">����ҳ�������У�</a>
	&nbsp;
	/
	&nbsp;
	<from action="logoutServlet">
	<a href="<%=request.getContextPath()%>/log/logout.jsp">ע��</a>
	</from>
	<br> <br>
	<hr>
</div>