/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author Ta Tu
 */
public class ManagerProductServlet extends HttpServlet {

   ProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String product_id = request.getParameter("product_id");

        String url = "";
        try {
            switch (command) {

                case "delete":
                    productDAO.deleteProduct(Long.parseLong(product_id));
                    url = "/admin/manager_product.jsp";
                    break;
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String tenSP= request.getParameter("tenSP");
        long loaiSP= request.getDateHeader("loaiSP");
        double giaSP= request.getIntHeader("giaSP");
        String hinhSP = request.getParameter("hinhSP");
        String motaSP = request.getParameter("motaSP");
        String url = "", error = "";
        if (tenSP.equals("")) {
            error = "Vui lòng nhập tên sản phẩm!";
            request.setAttribute("error", error);
        }
        

        try {
            if (error.length() == 0) {
                switch (command) {
                    case "insert":
                        productDAO.insertProduct(new Product(new Date().getTime(), loaiSP, tenSP, hinhSP, giaSP,  motaSP));
                        url = "/admin/manager_product.jsp";
                        break;
                    case "update":
                        productDAO.updateProduct(new Product(Long.parseLong(request.getParameter("product_id")),
                               loaiSP, tenSP, hinhSP, giaSP,  motaSP));
                        url = "/admin/manager_product.jsp";
                        break;
                }
            } else {
                url = "/admin/insert_product.jsp";
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);

    }

}
