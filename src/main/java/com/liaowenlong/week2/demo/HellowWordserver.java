package com.liaowenlong.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//now its just a java class
//extend HttpServlet
public class HellowWordserver extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //we went send hellow to cliend
    //we need to write hellow in response
    //get writer - java.io
        PrintWriter writer = response.getWriter();        //we went send hellow to cliend
        writer.println("Hello client!!!!!!");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        //when client request method is Post - here-inside doPost()

    }
}
