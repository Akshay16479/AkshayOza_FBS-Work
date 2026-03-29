package com.blood.controller;

import java.io.IOException;

import com.blood.dao.DonorDAO;
import com.blood.model.Donor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sendRequest")
public class SendRequestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        DonorDAO dao = new DonorDAO();
        Donor d = dao.getDonorById(id); 

        String toEmail = d.getEmail(); 


        String subject = "Blood Request";
        String message = "Hello,\n\n"
                + "A blood request has been raised through the Blood Donor Finder system.\n\n"
                + "Blood Group Required: " + d.getBloodGroup() + "\n"
                + "Location: " + d.getCity() + "\n\n"
                + "If you are available and willing to donate, kindly respond to this request.\n\n"
                + "Your help can save a life \n\n"
                + "Thank you,\n"
                + "Blood Donor Finder Team";
        EmailUtil.sendEmail(toEmail, subject, message);

        response.sendRedirect("search.jsp?msg=sent");
    }
}