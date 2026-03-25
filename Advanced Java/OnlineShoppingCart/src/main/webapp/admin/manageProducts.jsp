<%@ page import="java.sql.*,util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="header1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Manage Products | Admin</title>

<style>
    body{
    margin:0;
    font-family:'Segoe UI',sans-serif;
    background:linear-gradient(135deg,#141e30,#243b55);
}

.container{
    width:90%;
    max-width:1100px;
    margin:40px auto;
    background:rgba(255,255,255,0.08);
    backdrop-filter:blur(12px);
    padding:30px;
    border-radius:18px;
    box-shadow:0 20px 40px rgba(0,0,0,0.5);
}

h2{
    text-align:center;
    color:#00e5ff;
}

table{
    width:100%;
    border-collapse:collapse;
}

table th{
    background:#00bcd4;
    color:white;
}

table td{
    padding:12px;
    border-bottom:1px solid rgba(255,255,255,0.1);
}

table tr:hover{
    background:rgba(0,255,255,0.08);
}

.btn{
    padding:6px 14px;
    border-radius:20px;
    font-size:14px;
    color:white;
    text-decoration:none;
}

.edit{
    background:linear-gradient(45deg,#ff9966,#ff5e62);
}

.delete{
    background:linear-gradient(45deg,#ff416c,#ff4b2b);
}

.btn:hover{
    transform:scale(1.05);
}

.back{
    display:inline-block;
    margin-top:20px;
    color:#00e5ff;
    text-decoration:none;
    font-weight:bold;
}
</style>
</head>

<body>

<div class="container">
    <h2>Manage Products</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Actions</th>
        </tr>

<%
Connection con = DBConnection.getConnection();
PreparedStatement ps = con.prepareStatement("SELECT * FROM products");
ResultSet rs = ps.executeQuery();

while(rs.next()){
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td>₹<%= rs.getDouble("price") %></td>
            <td><%= rs.getInt("quantity") %></td>
            <td>
                <a class="btn edit" href="editProduct.jsp?id=<%= rs.getInt("id") %>">Edit</a>
                <a class="btn delete"
                   href="../DeleteProductServlet?id=<%= rs.getInt("id") %>"
                   onclick="return confirm('Are you sure you want to delete this product?')">
                   Delete
                </a>
            </td>
        </tr>
<% } %>

    </table>

    <a href="dashboard.jsp" class="back">Back to Dashboard</a>
</div>

<%@ include file="footer1.jsp" %>
</body>
</html>