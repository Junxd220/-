package com.ctrl;

import com.model.ligBean;
import com.model.lig_userBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/12/10.
 */
@WebServlet(name = "logonServlet")
public class logonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String type = request.getParameter("type");
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd1");

        lig_userBean log = new lig_userBean(type,user,pwd);
        ligBean l = new ligBean();
        int n = l.logonQuery(log);

        if(n > 0){
            response.sendRedirect("./log/logon.jsp");
        }else {
            int m = l.logonInsert(log);
            l.close();
            if(m == 1){
                response.sendRedirect("./log/logons.jsp");
            }else {
                response.sendRedirect("./log/e.jsp");
            }
        }
        l.close();
    }
}
