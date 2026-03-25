<%@ page import="java.sql.*, util.DBConnection"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="header1.jsp"%>

<!DOCTYPE html>
<html>
<head>
<title>View Users | Admin</title>

<style>
body {
	margin: 0;
	font-family: 'Segoe UI', sans-serif;
	background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
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
	width: 700px;
	padding: 30px;
	border-radius: 20px;
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

table th {
	background: #00bcd4;
	color: white;
	padding: 12px;
}

table td {
	padding: 12px;
	border-bottom: 1px solid rgba(255, 255, 255, 0.1);
}

table tr:hover {
	background: rgba(0, 255, 255, 0.08);
}

.back {
	display: inline-block;
	margin-top: 20px;
	padding: 10px 20px;
	text-decoration: none;
	background: linear-gradient(45deg, #ff512f, #dd2476);
	color: white;
	border-radius: 25px;
	font-weight: bold;
	transition: 0.3s;
}

.back:hover {
	transform: scale(1.05);
}

.block-btn {
	background: #ff4d4d;
	color: white;
	border: none;
	padding: 8px 16px;
	border-radius: 20px;
	cursor: pointer;
	font-weight: bold;
	transition: 0.3s;
}

.block-btn:hover {
	background: #ff1a1a;
	transform: scale(1.05);
}

.unblock-btn {
	background: #00c853;
	color: white;
	border: none;
	padding: 8px 16px;
	border-radius: 20px;
	cursor: pointer;
	font-weight: bold;
	transition: 0.3s;
}

.unblock-btn:hover {
	background: #009624;
	transform: scale(1.05);
}
</style>
</head>

<body>

	<div class="page-container">
		<div class="container">
			<h2>Registered Users</h2>

			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Action</th>

				</tr>

				<%
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;

				try {
					con = DBConnection.getConnection();
					ps = con.prepareStatement("SELECT id, name, email, status FROM users WHERE role='user'");
					rs = ps.executeQuery();

					while (rs.next()) {
				%>
				<tr>
					<td><%=rs.getInt("id")%></td>
					<td><%=rs.getString("name")%></td>
					<td><%=rs.getString("email")%></td>
					<td>
						<%
						if (rs.getString("status").equals("ACTIVE")) {
						%>

						<form action="<%=request.getContextPath()%>/BlockUserServlet"
							method="post">
							<input type="hidden" name="userId" value="<%=rs.getInt("id")%>">
							<button type="submit" class="block-btn">Block</button>
						</form> <%
 } else {
 %>

						<form action="<%=request.getContextPath()%>/UnblockUserServlet"
							method="post">
							<input type="hidden" name="userId" value="<%=rs.getInt("id")%>">
							<button type="submit" class="unblock-btn">Unblock</button>
						</form> <%
 }
 %>
					</td>
				</tr>
				<%
				}
				} catch (Exception e) {
				%>
				<tr>
					<td colspan="3" style="color: red;">Error: <%=e.getMessage()%></td>
				</tr>
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
			</table>

			<a href="dashboard.jsp" class="back">Back to Dashboard</a>
		</div>
	</div>

	<%@ include file="footer1.jsp"%>

</body>
</html>