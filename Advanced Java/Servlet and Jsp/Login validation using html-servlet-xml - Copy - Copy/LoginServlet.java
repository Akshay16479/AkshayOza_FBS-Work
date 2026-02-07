package com.loginvalidation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginServlet extends HttpServlet {

	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	public void init() {
		try {
			
			//getting db config info from xml middleware file
			String driverclass=getServletConfig().getServletContext().getInitParameter("driver");
			String url=getServletConfig().getServletContext().getInitParameter("url");
			String user=getServletConfig().getServletContext().getInitParameter("username");
			String pass=getServletConfig().getServletContext().getInitParameter("password");

			Class.forName(driverclass);
			con = DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// user data from html
		try {
			String u = request.getParameter("username");
			String p = request.getParameter("password");

			// get data from db as connection is done in init()
			pst = con.prepareStatement(
				    "SELECT * FROM user WHERE username=? AND password=?"
				);
				pst.setString(1, u);
				pst.setString(2, p);

			rs = pst.executeQuery();

			// data print on browser
			PrintWriter out = response.getWriter();
			
			RequestDispatcher rd=null;
			
			if (rs.next()) 
			{
			   //rd=request.getRequestDispatcher("/registration.html");    //yaha se regis page nhi ja rahe ab servlet2 ja rahe
				
				rd=request.getRequestDispatcher("/data");
				rd.forward(request, response);
				
			} 
			
			else 
			{
				rd=request.getRequestDispatcher("/index.html");
				rd.include(request, response);
				out.println("Please try again.......!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	public void destroy() {
		try {
			con.close(); // releasing connection not destroying

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
