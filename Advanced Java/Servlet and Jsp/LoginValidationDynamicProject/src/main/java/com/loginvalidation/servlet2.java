package com.loginvalidation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Enumeration;

import com.sun.net.httpserver.Request;


public class servlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// get data from gadget page
				String laptop=request.getParameter("laptop");
				String laptopprice=request.getParameter("laptopPrice");
				String mobile=request.getParameter("mobile");
				String mobileprice=request.getParameter("mobilePrice");
				
				

				Connection con = null;
			    PreparedStatement pst = null;
			    try {
			        // Get DB config from ServletContext (recommended)
			        ServletContext sc = getServletContext();
			        String driver = sc.getInitParameter("driver");
			        String url = sc.getInitParameter("url");
			        String user = sc.getInitParameter("username");
			        String pass = sc.getInitParameter("password");

			        Class.forName(driver);
			        con = DriverManager.getConnection(url, user, pass);

			        String sql = "INSERT INTO gadget_selection(laptop, laptopprice, mobile, mobileprice) VALUES(?, ?, ?, ?)";
			        pst = con.prepareStatement(sql);
			        pst.setString(1, laptop);
			        pst.setDouble(2, Double.parseDouble(laptopprice));
			        pst.setString(3, mobile);
			        pst.setDouble(4, Double.parseDouble(mobileprice));

			        int rows = pst.executeUpdate();
			        System.out.println("Inserted rows: " + rows);

			    } catch (Exception e) {
			        e.printStackTrace();
			    } finally {
			        try {
			            if (pst != null) pst.close();
			            if (con != null) con.close();
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    }

			    //  Forward to billing page
		
		RequestDispatcher rd = request.getRequestDispatcher("/billing.html");
		rd.forward(request, response);
			}

	}


