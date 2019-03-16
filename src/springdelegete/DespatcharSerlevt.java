package springdelegete;

import com.sun.net.httpserver.HttpsServer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/3/16.
 * 相当于项目经理的角色
 */
public class DespatcharSerlevt extends HttpServlet {

    public void doDespatch(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uri= request.getRequestURI();
        String mid = request.getParameter("mid");


        if("getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        }else if("getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        }else if ("logout".equals(uri)){
            new SystemController().logout();
        }else{
            response.getWriter().write(" 404 Not Found!!");
        }

    }

    public void service (HttpServletRequest request,HttpServletResponse response) throws IOException {
        doDespatch(request,response);
    }
}
