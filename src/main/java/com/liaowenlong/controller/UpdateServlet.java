package com.liaowenlong.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/updateUser")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//TODO 1 : forward to WEB-INF/views/updateUser.jsp
        //TODO 2 : create one jsp page - update User
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//write code to update user info - canupdate password, emall
        //TODO 1:get all (6) request parameters
        //TODO 2: creat on object of User Model
        //TODO 3 :set all 6 request parameters values into User model - setXXX()
        // TODO 4: create on object of UserDao
        //TODO 5: call upsateUser() in UserDao
        //TODO 6 : forward to WEB-INF/views/userInfo.jsp

}}
