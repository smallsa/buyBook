package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @className: loginServlet
 * @description:
 * @author: smallsacjz@foxmail.com
 * @date: 2020/5/30 20:37
 **/
public class loginServlet extends HttpServlet {
    public loginServlet(){
        super();
    }
    public void destroy(){
        super.destroy();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        HttpSession s=request.getSession();
        if("zhangsan".equals(username)&&"123".equals(password)){
            s.setAttribute("username",username);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
        else{
            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        doGet(request,response);
    }
    public void init()throws ServletException{

    }
}
