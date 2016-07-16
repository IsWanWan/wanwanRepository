package test;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by wanwan on 16/7/10.
 */
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        HttpServletRequest request = (HttpServletRequest)req;
        HttpSession session = request.getSession();
        HttpServletResponse response = (HttpServletResponse) resp;
        StringBuffer url = request.getRequestURL();
        System.out.println("url  :"+url);
//        if("".endsWith("login.jsp")!= -1){

            if(session.getAttribute("user") ==null){
                response.sendRedirect("/view/login.jsp");
            }


//        }else{
//            response.sendRedirect("/view/login.jsp");
//        }


        chain.doFilter(request, response);

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
