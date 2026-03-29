package com.blood.controller;

import java.io.IOException;

import com.blood.dao.DonorDAO;
import com.blood.model.Donor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        if(name == null || email == null || name.isEmpty() || email.isEmpty()){
            response.sendRedirect("register.jsp?error=empty");
            return;
        }

        Donor d = new Donor();

        d.setName(name);
        d.setEmail(email);
        d.setPassword(request.getParameter("password"));
        d.setPhone(request.getParameter("phone"));
        d.setBloodGroup(request.getParameter("blood"));
        d.setCity(request.getParameter("city"));
        d.setPincode(request.getParameter("pincode"));

        DonorDAO dao = new DonorDAO();

        if (dao.registerDonor(d)) {
            response.sendRedirect("login.jsp?success=1");
        } else {
            response.sendRedirect("register.jsp?error=1");
        }
    }
}