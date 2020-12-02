package cn.javaweb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取web.xml里配置的上下文参数
        ServletContext context = getServletConfig().getServletContext();
        String password = context.getInitParameter("password");
        System.out.println(password);
        //获取当前的工程路径
        System.out.println("当前的工程路径为："+context.getContextPath());
        //获取当前部署后在服务器上的绝对路径
        //斜杠被服务器解析为地址：http://ip:port/工程名/
        System.out.println("当前部署后在服务器上的绝对路径为："+context.getRealPath("/"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
