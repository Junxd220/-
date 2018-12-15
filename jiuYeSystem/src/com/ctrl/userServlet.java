package com.ctrl;

import com.model.logBean;
import com.model.log_userBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2018/12/15.
 */
@WebServlet(name = "userServlet")
public class userServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        int stuID = Integer.parseInt(request.getParameter("stuID"));//毕业生ID
        String loginID = UUID.randomUUID().toString().trim().replaceAll("-", "");;//注册ID
        String name = request.getParameter("name");//姓名
        String sex = request.getParameter("sex");//性别
        String nation = request.getParameter("nation");//国籍
        String birth = request.getParameter("birth");//生日
        Boolean maarry = Boolean.valueOf(request.getParameter("marry"));//婚姻状况
        int height = Integer.parseInt(request.getParameter("height"));//身高
        int weight = Integer.parseInt(request.getParameter("weight"));//体重
        String idCard = request.getParameter("idCard");//身份证号码
        String idAddress = request.getParameter("idAddress");//籍贯

        String telephone = request.getParameter("telephone");
        String mobilephone = request.getParameter("mobilephone");
        String qq = request.getParameter("qq");
        String email = request.getParameter("email");//电子邮件
        String postNum = request.getParameter("postNum");//邮政编码
        String nowAddress = request.getParameter("nowAddress");//通讯地址

        String myselfOpinin = request.getParameter("myselfOpinin");//自我评价
        String college = request.getParameter("college");//毕业院校
        String studyType = request.getParameter("studyType");//专业名称
        String studyName = request.getParameter("studyName");//学位
        String chinese = request.getParameter("chinese");//中文水平
        String computer = request.getParameter("computer");//电脑等级
        String language_a = request.getParameter("language_a");//第一外语
        String level_a = request.getParameter("level_a");//一外水平
        String language_b = request.getParameter("language_b");//第二外语
        String level_b = request.getParameter("level_b");//二外水平

        log_userBean log = new log_userBean(stuID,loginID,name,sex,nation,birth,maarry,height,weight,idCard,idAddress,telephone,mobilephone,qq,email,postNum,nowAddress, myselfOpinin,college,studyType,studyName,chinese,computer,language_a,level_a,language_b,level_b);
        logBean l = new logBean();
        int n = l.stuInsert(log);

        if(n == 1){

            request.getRequestDispatcher(("./view/student.jsp")).forward(request,response);
        }else {
            response.sendRedirect("./view/e.jsp");
        }
    }
}
