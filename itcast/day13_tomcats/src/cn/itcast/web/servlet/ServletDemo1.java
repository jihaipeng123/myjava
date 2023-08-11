package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*Servlet快速入门*/
@WebServlet("/demo22")
public class ServletDemo1 implements Servlet {

    //创建,只执行一次，说明一个sevlet在内存中只存在一个对象
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //提供服务的方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello world !");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    //销毁关闭
    @Override
    public void destroy() {

    }
}
