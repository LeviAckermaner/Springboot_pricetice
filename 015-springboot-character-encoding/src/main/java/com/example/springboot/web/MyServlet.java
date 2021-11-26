package com.example.springboot.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午11:04
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //必须设置
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("ssss显示中文");
        writer.flush();
        writer.close();
    }
}
