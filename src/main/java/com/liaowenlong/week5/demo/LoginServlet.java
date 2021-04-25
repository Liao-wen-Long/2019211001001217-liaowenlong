package com.liaowenlong.week5.demo;


import com.liaowenlong.dao.UserDao;
import com.liaowenlong.model.User;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Callable;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    Connection con = null;
    private String username;

    @Override
    public void init() throws ServletException {

        con = (Connection) getServletContext().getAttribute("dbConn");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String password = request.getParameter("password");


        UserDao userDao = new UserDao();
        try {
            User user = userDao.findByUsernamePassword(con, username, password);
            if (user != null) {

                String rememberMe=request.getParameter("rememberMs");
                if (rememberMe!=null && rememberMe.equals("1")){
                    Cookie usernameCookie=new Cookie("cUsername", (String) user.getUsername());
                  Cookie passwordCookie=new Cookie("cPassword",user.getPassword());
                    Cookie cRememberMeCookie=new Cookie("cRememberMe",rememberMe);

                    usernameCookie.setMaxAge(5);
                    passwordCookie.setMaxAge(5);
                    cRememberMeCookie.setMaxAge(5);
                    response.addCookie(usernameCookie);
                    response.addCookie(passwordCookie);
                    response.addCookie(cRememberMeCookie);

                }

                HttpSession session=request.getSession();
                System.out.println("session id-->"+session.getId());
                session.setMaxInactiveInterval(10);
                request.setAttribute("user", user);
                request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "username or password Error");
                request.getRequestDispatcher("WEB-INF/views/userinfo.jsp").forward(request, response);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            if (con != null) {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}