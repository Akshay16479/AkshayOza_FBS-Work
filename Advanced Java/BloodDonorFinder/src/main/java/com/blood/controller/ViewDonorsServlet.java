package com.blood.controller;

import java.io.IOException;
import java.util.List;

import com.blood.dao.DonorDAO;
import com.blood.model.Donor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/viewDonors")
public class ViewDonorsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("admin") == null){
            response.sendRedirect("adminLogin.jsp");
            return;
        }

        DonorDAO dao = new DonorDAO();
        List<Donor> list = dao.getAllDonors();

        request.setAttribute("donorList", list);
        request.getRequestDispatcher("viewDonors.jsp").forward(request, response);
    }
}