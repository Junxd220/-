package com.ctrl;

import com.model.ligBean;
import com.model.lig_userBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Administrator on 2018/12/10.
 */
@WebServlet(name = "loginServlet")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String type = request.getParameter("type");
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        HttpSession session=request.getSession();
//        user_type_lig use = ( user_type_lig ) session.getAttribute("user");


        lig_userBean lig = new lig_userBean(type,user,pwd);
        ligBean l = new ligBean();
        int s = l.student();
        int e = l.enterprise();
        int n = l.loginQuery(lig);
        l.close();

        request.setAttribute("student",s);
        request.setAttribute("enterprise",e);

        if(n == 1){
//            session.setAttribute("user",user);
            request.getSession().setAttribute("user",lig);
            request.setAttribute("user",user);
            request.setAttribute("type",type);

            request.getRequestDispatcher(("./log/logins.jsp")).forward(request,response);
        }else {
            response.sendRedirect("./log/e.jsp");
        }


    }
}
