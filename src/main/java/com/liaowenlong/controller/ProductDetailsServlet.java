package com.liaowenlong.controller;

import com.liaowenlong.dao.ProductDao;
import com.liaowenlong.model.Category;
import com.liaowenlong.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(name = "ProductDetailsServlet",value = "/productDetails")
public class ProductDetailsServlet extends HttpServlet {
    Connection con=null;
    public void init() throws ServletException {
        con=(Connection)getServletContext().getAttribute("con");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=request.getParameter("id")!=null?Integer.parseInt(request.getParameter("id")):0;
        ProductDao productDao=new ProductDao();
        if (id ==0) {
            return;
        }
        List<Category> categoryList=null;
        categoryList=Category.findAllCategory(con);
        request.setAttribute("categoryList",categoryList);
        Product product=productDao.findById(id,con);
        request.setAttribute("p",product);
        String path="/WEB-INF/views/productDetails.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }
}