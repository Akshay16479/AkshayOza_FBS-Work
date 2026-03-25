<%@ page import="java.sql.*, util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="header1.jsp" %>

<!DOCTYPE html>
<html>
<head>
<title>Admin | View Orders</title>

<style>
*{
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}

body{
    margin:0;
    padding:30px;
    background:linear-gradient(135deg,#141e30,#243b55);
}

.container{
    background:rgba(255,255,255,0.08);
    backdrop-filter:blur(12px);
    max-width:1100px;
    margin:auto;
    padding:30px;
    border-radius:18px;
    box-shadow:0 15px 35px rgba(0,0,0,0.5);
}

h2{
    text-align:center;
    margin-bottom:20px;
    color:#00e5ff;
}

table{
    width:100%;
    border-collapse:collapse;
}

th,td{
    padding:14px;
    text-align:center;
}

th{
    background:#00bcd4;
    color:white;
}

tr:nth-child(even){
    background:rgba(255,255,255,0.05);
}

tr:hover{
    background:rgba(0,255,255,0.1);
}

.status-success{
    color:#00e676;
    font-weight:bold;
}

.status-pending{
    color:#ff9800;
    font-weight:bold;
}

.view-btn{
    padding:8px 16px;
    background:linear-gradient(45deg,#00c6ff,#0072ff);
    color:white;
    text-decoration:none;
    border-radius:20px;
    font-size:14px;
    transition:0.3s;
}

.view-btn:hover{
    transform:scale(1.08);
    box-shadow:0 5px 15px rgba(0,0,0,0.4);
}

.update-btn{
    padding:6px 12px;
    background:#00c853;
    border:none;
    color:white;
    border-radius:15px;
    cursor:pointer;
    
    
}
/* DROPDOWN STYLE */

select{
    padding:6px 12px;
    border-radius:15px;
    border:none;
    outline:none;
    font-weight:600;
    font-size:13px;
    cursor:pointer;

    background:linear-gradient(45deg,#00c6ff,#0072ff);
    color:white;

    margin-right:6px;

    box-shadow:0 3px 10px rgba(0,0,0,0.3);
    transition:0.25s;
}

select:hover{
    transform:scale(1.05);
}

select option{
    background:#1e293b;
    color:white;
}
</style>
</head>

<body>
<div class="container">
<h2>Customer Orders</h2>

<table>
<tr>
    <th>Order ID</th>
    <th>User ID</th>
    <th>Total Amount</th>
    <th>Payment Status</th>
    <th>Order Status</th>
    <th>Action</th>
</tr>

<%
Connection con = DBConnection.getConnection();

PreparedStatement ps = con.prepareStatement(
"SELECT id, user_id, total, payment_status, status FROM orders ORDER BY id DESC"
);

ResultSet rs = ps.executeQuery();

while(rs.next()){

    String paymentStatus = rs.getString("payment_status");
    String orderStatus = rs.getString("status");
%>

<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getInt("user_id") %></td>
    <td>₹ <%= rs.getDouble("total") %></td>

    <td class="<%= paymentStatus.equalsIgnoreCase("Paid") ? "status-success" : "status-pending" %>">
        <%= paymentStatus %>
    </td>

    <!-- ORDER STATUS UPDATE -->
    <td>
        <form action="<%=request.getContextPath()%>/UpdateOrderStatusServlet" method="post">

            <input type="hidden" name="orderId" value="<%= rs.getInt("id") %>">

            <select name="status">

                <option <%= orderStatus.equals("Processing")?"selected":"" %>>Processing</option>

                <option <%= orderStatus.equals("Shipped")?"selected":"" %>>Shipped</option>

                <option <%= orderStatus.equals("Delivered")?"selected":"" %>>Delivered</option>

                <option <%= orderStatus.equals("Cancelled")?"selected":"" %>>Cancelled</option>

            </select>

            <button type="submit" class="update-btn">Update</button>

        </form>
    </td>

    <td>
        <a class="view-btn" href="viewOrderItems.jsp?orderId=<%= rs.getInt("id") %>">
            View Products
        </a>
    </td>
</tr>

<% } %>

</table>
</div>

<%@ include file="footer1.jsp" %>
</body>
</html>