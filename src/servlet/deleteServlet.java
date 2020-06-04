package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @className: deleteServlet
 * @description:
 * @author: smallsacjz@foxmail.com
 * @date: 2020/5/30 20:48
 **/
public class deleteServlet extends HttpServlet {
    public deleteServlet(){
        super();
    }
    public void destroy(){
        super.destroy();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws SecurityException, IOException{
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession s=request.getSession();
        s.setAttribute("username","zhangsan");
        s.invalidate();
        PrintWriter out = response.getWriter();
        response.sendRedirect(request.getContextPath()+"/login.jsp");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        doGet(request,response);
    }
    public void init() throws ServletException{

    }
}
