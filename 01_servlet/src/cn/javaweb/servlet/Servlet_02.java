package cn.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;

public class Servlet_02 implements Servlet {
   /* @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet_02的servlet的别名为："+servletConfig.getServletName());
        System.out.println("初始化参数username的值为:"+servletConfig.getInitParameter("username"));
        //获取context对象
        System.out.println(servletConfig.getServletContext());
    }*/
    public Servlet_02(){

    }
    @Override
    public void init(javax.servlet.ServletConfig servletConfig) throws ServletException {
        //1、可以获取Servlet程序的别名servlet-name的值
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        //2、获取初始化参数init-param
        String username = servletConfig.getInitParameter("username");
        System.out.println(username);
        //3、获取ServletContext对象
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
