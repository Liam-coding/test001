package com.test.server2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        value = {"/rs"}
)
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String username  = req.getParameter("username");
        String password  = req.getParameter("password");

        System.out.println("提交上数据："+username+"\t"+password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String username  = req.getParameter("username");
        String password  = req.getParameter("password");

        //响应数据给客户端
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-type","text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("注册成功!");


    }
}
