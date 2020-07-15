package com.bit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从query string中获取用户的username和password
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/plain; charset = utf-8");
        PrintWriter writer = resp.getWriter();


        //验证用户名密码是否正确
        if(username != null && username.equals("liumiao")
        && password != null && password.equals("111")){
            //登陆成功
            writer.println("登陆成功");
            System.out.println("登陆成功");
        }else {
            //登陆失败
            writer.println("登陆失败");
            System.out.println("登陆失败");
        }
    }
}
