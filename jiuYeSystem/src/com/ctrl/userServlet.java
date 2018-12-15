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

        int stuID = Integer.parseInt(request.getParameter("stuID"));//��ҵ��ID
        String loginID = UUID.randomUUID().toString().trim().replaceAll("-", "");;//ע��ID
        String name = request.getParameter("name");//����
        String sex = request.getParameter("sex");//�Ա�
        String nation = request.getParameter("nation");//����
        String birth = request.getParameter("birth");//����
        Boolean maarry = Boolean.valueOf(request.getParameter("marry"));//����״��
        int height = Integer.parseInt(request.getParameter("height"));//���
        int weight = Integer.parseInt(request.getParameter("weight"));//����
        String idCard = request.getParameter("idCard");//���֤����
        String idAddress = request.getParameter("idAddress");//����

        String telephone = request.getParameter("telephone");
        String mobilephone = request.getParameter("mobilephone");
        String qq = request.getParameter("qq");
        String email = request.getParameter("email");//�����ʼ�
        String postNum = request.getParameter("postNum");//��������
        String nowAddress = request.getParameter("nowAddress");//ͨѶ��ַ

        String myselfOpinin = request.getParameter("myselfOpinin");//��������
        String college = request.getParameter("college");//��ҵԺУ
        String studyType = request.getParameter("studyType");//רҵ����
        String studyName = request.getParameter("studyName");//ѧλ
        String chinese = request.getParameter("chinese");//����ˮƽ
        String computer = request.getParameter("computer");//���Եȼ�
        String language_a = request.getParameter("language_a");//��һ����
        String level_a = request.getParameter("level_a");//һ��ˮƽ
        String language_b = request.getParameter("language_b");//�ڶ�����
        String level_b = request.getParameter("level_b");//����ˮƽ

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
