package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wanwan on 16/7/10.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String password =request.getParameter("password");

        request.getSession().setAttribute("name",name);
        request.getSession().setAttribute("password",password);
        System.out.println(" name :"+request.getSession().getAttribute("name"));
        request.getSession().setAttribute("count",SessionListener.getCount());

         request.getRequestDispatcher("/index.jsp").include(request,response);
       // response.sendRedirect("/index.jsp");

       // doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hello hahaha");

    }

}
