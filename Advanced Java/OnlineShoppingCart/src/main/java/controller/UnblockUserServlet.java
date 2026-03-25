package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.DBConnection;

@WebServlet("/UnblockUserServlet")
public class UnblockUserServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

int userId = Integer.parseInt(request.getParameter("userId"));

try{

Connection con = DBConnection.getConnection();

PreparedStatement ps = con.prepareStatement(
"UPDATE users SET status='ACTIVE' WHERE id=?"
);

ps.setInt(1,userId);
ps.executeUpdate();

response.sendRedirect("admin/viewUsers.jsp");

}catch(Exception e){
e.printStackTrace();
}

}
}