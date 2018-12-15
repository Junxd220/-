package com.view;

import com.model.ligBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Administrator on 2018/12/11.
 */
@WebServlet(name = "logServlet")
public class logServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ligBean l = new ligBean();
        int student = l.student();
        int enterprise = l.enterprise();
        request.getSession().setAttribute("student",student);
        request.getSession().setAttribute("enterprise",enterprise);
        l.close();

    }
}
