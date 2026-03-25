<%@ page import="java.sql.*,util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="header1.jsp" %>

<%
String idParam = request.getParameter("id");

if (idParam == null) {
    response.sendRedirect("manageProducts.jsp");
    return;
}

int id = Integer.parseInt(idParam);


Connection con = DBConnection.getConnection();
PreparedStatement ps =con.prepareStatement("SELECT * FROM products WHERE id=?");
ps.setInt(1, id);
ResultSet rs = ps.executeQuery();
rs.next();
%>

<!DOCTYPE html>
<html>
<head>
<title>Edit Product | Admin</title>

  <style>
   body{
    margin:0;
    font-family:'Segoe UI',sans-serif;
    background:linear-gradient(135deg,#0f2027,#203a43,#2c5364);
}

.page-container{
    display:flex;
    justify-content:center;
    padding-top:120px;
}

.card{
    background:rgba(255,255,255,0.08);
    backdrop-filter:blur(12px);
    width:420px;
    padding:30px;
    border-radius:18px;
    box-shadow:0 20px 40px rgba(0,0,0,0.5);
}

h2{
    text-align:center;
    color:#00e5ff;
}

input{
    width:100%;
    padding:12px;
    margin-bottom:12px;
    border-radius:8px;
    border:none;
}

button{
    width:100%;
    padding:13px;
    margin-top:15px;
    border:none;
    color:white;
    font-weight:bold;
    border-radius:25px;
    background:linear-gradient(45deg,#00c6ff,#0072ff);
    transition:0.3s;
}

button:hover{
    transform:scale(1.05);
}

.back{
    display:block;
    margin-top:18px;
    text-align:center;
    color:#00e5ff;
    text-decoration:none;
}
</style>
</head>

<body>

<div class="page-container">
    <div class="card">
        <h2>Edit Product</h2>

        <form action="../UpdateProductServlet" method="post">
            <input type="hidden" name="id" value="<%= id %>">

            <label>Product Name</label>
            <input type="text" name="name" value="<%= rs.getString("name") %>" required>

            <label>Description</label>
            <input type="text" name="desc" value="<%= rs.getString("description") %>" required>

            <label>Price</label>
            <input type="number" name="price" value="<%= rs.getDouble("price") %>" required>

            <button type="submit">Update Product</button>
        </form>

        <a href="manageProducts.jsp" class="back">Back to Manage Products</a>
    </div>
</div>

<%@ include file="footer1.jsp" %>
</body>

</html>