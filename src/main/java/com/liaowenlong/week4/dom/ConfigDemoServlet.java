package com.liaowenlong.week4.dom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ConfigDemoServlet",urlPatterns="/jdbc",initParams={
        @WebInitParam(name="name",value="liaowenglong"),
        @WebInitParam(name="student-id",value="2019211001001217")
})

public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();
        writer.println("name:"+getServletConfig().getInitParameter("name"));
        writer.println("student-id:"+getServletConfig().getInitParameter("student-id"));
    }
}