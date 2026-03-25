<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="header1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Add Product | Admin</title>
<style>
 body{
    font-family:'Segoe UI',sans-serif;
    background:linear-gradient(135deg,#141e30,#243b55);
}

.card{
    background:rgba(255,255,255,0.08);
    backdrop-filter:blur(12px);
    width:420px;
    padding:35px;
    border-radius:18px;
    box-shadow:0 20px 40px rgba(0,0,0,0.4);
    margin:80px auto;
}

h2{
    text-align:center;
    color:#00e676;
}

input{
    width:100%;
    padding:12px;
    margin:12px 0;
    border-radius:8px;
    border:none;
    background:#f5f5f5;
}

button{
    width:100%;
    padding:13px;
    margin-top:18px;
    border:none;
    border-radius:30px;
    font-weight:bold;
    color:white;
    background:linear-gradient(45deg,#00c6ff,#0072ff);
    cursor:pointer;
    transition:0.3s;
}

button:hover{
    transform:scale(1.05);
    box-shadow:0 10px 20px rgba(0,0,0,0.4);
}

.back{
    display:block;
    margin-top:18px;
    text-align:center;
    color:#00e676;
}
</style>
</head>
<body>

<div class="card">
    <h2>Add New Product</h2>
    <form action="../AdminProductServlet" method="post">
        <input type="text" name="name" placeholder="Product Name" required>
        <input type="text" name="desc" placeholder="Product Description" required>
        <input type="number" name="price" placeholder="Price" required>
        <input type="text" name="category" placeholder="Category" required>
        <input type="number" name="qty" placeholder="Quantity" required>
        <input type="text" name="image" placeholder="Image Filename (example.jpg)" required>
        <button type="submit">Add Product</button>
    </form>
    <a href="dashboard.jsp" class="back">Back to Dashboard</a>
</div>

<%@ include file="footer1.jsp" %>
</body>
</html>