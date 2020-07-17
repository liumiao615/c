package com.lm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Method = req.getMethod();
        //获取方法
        System.out.println("请求方法" + Method + "getMethod()");
        String requestURL = req.getRequestURI();

        System.out.println("完整路径" + requestURL);
        String servletPath = req.getServletPath();
        System.out.println("排除contentPath的路径" + servletPath);
        String contextPath = req.getContextPath();
        System.out.println("ContentPath" + contextPath);
        //获取key-value
        {
            Enumeration<String> parameterNames = req.getParameterNames();
            while(parameterNames.hasMoreElements()){
                String key = parameterNames.nextElement();
                String value = req.getParameter(key);
                System.out.println(key +"="+value);
            }
            //获取协议号
            {
                String protocol = req.getProtocol();
                System.out.println(protocol);
            }
            //获取header
            {
                Enumeration<String> headerNames = req.getHeaderNames();
                while (headerNames.hasMoreElements()){
                    String key = headerNames.nextElement();
                    String value = req.getHeader(key);
                    System.out.println(key +"="+value);
                }
            }
        }

    }
}
