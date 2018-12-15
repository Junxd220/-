package com.ctrl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2018/12/11.
 */
@WebServlet(name = "logoutServlet")
public class logoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(false);//∑¿÷π¥¥Ω®Session

        if(session == null){
            response.sendRedirect("../jiuYeSystem/index.jsp");
        }

        session.removeAttribute("user");
        response.sendRedirect("../jiuYeSystem/index.jsp");

    }


}
