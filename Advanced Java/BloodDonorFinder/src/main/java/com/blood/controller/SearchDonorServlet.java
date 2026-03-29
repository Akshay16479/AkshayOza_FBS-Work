package com.blood.controller;

import java.io.IOException;
import java.util.List;

import com.blood.dao.DonorDAO;
import com.blood.model.Donor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/searchDonor")
public class SearchDonorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String blood = request.getParameter("blood");
        String city = request.getParameter("city");

        if(blood == null || city == null || city.isEmpty()){
            response.sendRedirect("search.jsp?error=1");
            return;
        }

        DonorDAO dao = new DonorDAO();
        List<Donor> list = dao.searchDonors(blood, city);

        request.setAttribute("donorList", list);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}