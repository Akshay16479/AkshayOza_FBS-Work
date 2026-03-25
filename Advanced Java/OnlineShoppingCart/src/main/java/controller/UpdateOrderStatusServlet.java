package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import util.DBConnection;

@WebServlet("/UpdateOrderStatusServlet")
public class UpdateOrderStatusServlet extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws IOException {

int orderId = Integer.parseInt(req.getParameter("orderId"));
String status = req.getParameter("status");

try {

Connection con = DBConnection.getConnection();

PreparedStatement ps = con.prepareStatement(
"UPDATE orders SET status=? WHERE id=?"
);

ps.setString(1,status);
ps.setInt(2,orderId);

ps.executeUpdate();

res.sendRedirect("admin/viewOrders.jsp");

}catch(Exception e){
e.printStackTrace();
}

}
}