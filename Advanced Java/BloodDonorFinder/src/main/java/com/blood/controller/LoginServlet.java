package com.blood.controller;

import java.io.IOException;

import com.blood.dao.DonorDAO;
import com.blood.model.Donor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(email == null || password == null || email.isEmpty() || password.isEmpty()){
            response.sendRedirect("login.jsp?error=empty");
            return;
        }

        DonorDAO dao = new DonorDAO();
        Donor d = dao.login(email, password);

        if (d != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", d);
            response.sendRedirect("search.jsp");
        } else {
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}