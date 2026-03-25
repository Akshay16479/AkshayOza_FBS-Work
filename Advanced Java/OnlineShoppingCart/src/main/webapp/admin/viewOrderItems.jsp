
<%@ page import="java.sql.*, util.DBConnection"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="header1.jsp"%>

<!DOCTYPE html>
<html>
<head>
<title>Admin | Order Details</title>

<style>
body {
	margin: 0;
	font-family: 'Segoe UI', sans-serif;
	background: linear-gradient(135deg, #141e30, #243b55);
}

.page-container {
	display: flex;
	justify-content: center;
	padding-top: 120px;
	padding-bottom: 60px;
}

.container {
	background: rgba(255, 255, 255, 0.08);
	backdrop-filter: blur(12px);
	max-width: 1000px;
	width: 100%;
	padding: 30px;
	border-radius: 18px;
	box-shadow: 0 20px 40px rgba(0, 0, 0, 0.5);
}

h2 {
	text-align: center;
	color: #00e5ff;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 14px;
	text-align: center;
}

th {
	background: #00bcd4;
	color: white;
}

tr:nth-child(even) {
	background: rgba(255, 255, 255, 0.05);
}

tr:hover {
	background: rgba(0, 255, 255, 0.1);
}

.back-btn {
	display: inline-block;
	margin-top: 20px;
	padding: 10px 20px;
	background: linear-gradient(45deg, #00c6ff, #0072ff);
	color: white;
	text-decoration: none;
	border-radius: 25px;
	transition: 0.3s;
}

.back-btn:hover {
	transform: scale(1.05);
}
</style>
</head>

<body>

	<div class="page-container">
		<div class="container">

			<h2>Order Products</h2>

			<%
			String orderParam = request.getParameter("orderId");

			if (orderParam == null) {
				response.sendRedirect("viewOrders.jsp");
				return;
			}

			int orderId = Integer.parseInt(orderParam);

			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			double grandTotal = 0;

			try {
				con = DBConnection.getConnection();
				ps = con.prepareStatement("SELECT p.name, oi.price, oi.quantity " + "FROM order_items oi "
				+ "JOIN products p ON oi.product_id = p.id " + "WHERE oi.order_id=?");
				ps.setInt(1, orderId);
				rs = ps.executeQuery();
			%>

			<table>
				<tr>
					<th>Product Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Subtotal</th>
				</tr>

				<%
				while (rs.next()) {
					double price = rs.getDouble("price");
					int qty = rs.getInt("quantity");
					double sub = price * qty;
					grandTotal += sub;
				%>
				<tr>
					<td><%=rs.getString("name")%></td>
					<td>₹ <%=price%></td>
					<td><%=qty%></td>
					<td>₹ <%=sub%></td>
				</tr>
				<%
				}
				%>
				<tr>
					<th colspan="3">Grand Total</th>
					<th>₹ <%=grandTotal%></th>
				</tr>
			</table>

			<%
			} catch (Exception e) {
			%>
			<p style="color: red; text-align: center;">
				Error:
				<%=e.getMessage()%></p>
			<%
			} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
			}
			%>

			<a class="back-btn" href="viewOrders.jsp">⬅ Back to Orders</a>

		</div>
	</div>

	<%@ include file="footer1.jsp"%>

</body>
</html>