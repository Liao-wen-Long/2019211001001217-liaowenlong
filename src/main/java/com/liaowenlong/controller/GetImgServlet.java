package com.liaowenlong.controller;

import com.liaowenlong.dao.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "GetImgServlet", value = "/getImg")
public class GetImgServlet extends HttpServlet {
    Connection con = null;
    public void init() throws ServletException {
        super.init();
        con = (Connection) getServletContext().getAttribute("con");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=0;
        if (request.getParameter("id")!=null) {
            id = Integer.parseInt(request.getParameter("id"));
        }
        ProductDao productDao = new ProductDao();
        byte[] imgByte = new byte[0];
        try {
            imgByte = productDao.getPictureById(id,con);
            if(imgByte != null) {
                response.setContentType("image/gif");
                OutputStream outputStream = response.getOutputStream();
                outputStream.write(imgByte);
                outputStream.flush();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}