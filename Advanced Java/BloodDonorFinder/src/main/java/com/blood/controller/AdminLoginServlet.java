package com.blood.controller;

import java.io.IOException;

import com.blood.dao.AdminDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username == null || password == null || username.isEmpty() || password.isEmpty()){
            response.sendRedirect("adminLogin.jsp?error=empty");
            return;
        }

        AdminDAO dao = new AdminDAO();

        if (dao.login(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", username);
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("adminLogin.jsp?error=invalid");
        }
    }
}