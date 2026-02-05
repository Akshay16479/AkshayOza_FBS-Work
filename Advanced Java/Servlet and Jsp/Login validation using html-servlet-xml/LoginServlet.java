package com.loginvalidation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String u=request.getParameter("username");
		String p=request.getParameter("password");
		
		
//		System.out.println("Data coming from Browser : ");     //data ko console pr print krne k liye
//		System.out.println("username : " + u);
//		System.out.println("password : " + p);

		
		//data ko response k saath me browser pr print krne ke liye
		
		PrintWriter out = response.getWriter();
		
		if(u.equals("akshay") && p.equals("akshay@123"))
		{
			out.println("<h1>Valid User</h1>");
		}
		else
		{
			out.println("<h1>Invalid User</h1>");
		}
		
	}

}
