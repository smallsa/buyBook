package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: cartServlet
 * @description:
 * @author: smallsacjz@foxmail.com
 * @date: 2020/5/30 20:56
 **/
public class cartServlet extends HttpServlet {
    public cartServlet(){
        super();
    }
    public void destroy(){
        super.destroy();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws SecurityException, IOException{
        String interests[]=request.getParameterValues("interest");
        List<String> interest=(List)request.getSession().getAttribute("interest");
        if(interests!=null)
        {
            if(interest==null)
            {
                interest=new ArrayList<String>();
            }
            for(String s:interests)
            {
                interest.add(s);
            }
            request.getSession().setAttribute("interest",interest);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws SecurityException,IOException{
        doGet(request,response);
    }
    public void init() throws SecurityException{

    }
}
