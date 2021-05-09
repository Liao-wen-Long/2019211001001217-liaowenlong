package com.liaowenlon.week3.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

// automatic -new --> servlet
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//request come here= <from method=post>
         //get parameter from requst
        String username = request.getParameter("username");//name of iput type <input type="text" name="username" ><br/>
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String sex = request.getParameter("sex");
        String date = request.getParameter("date");


        PrintWriter writer = response.getWriter();
        writer.println("<br>username :"+username);
        writer.println("<br>password"+password);
        writer.println("<br>email"+email);
        writer.println("<br>sex"+sex);
        writer.println("<br>date"+date);
        //week - 9
        response.sendRedirect("login");//loginServlet

    }
}
