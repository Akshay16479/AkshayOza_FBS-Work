<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard</title>

<style>
    body{
    margin:0;
    font-family:'Segoe UI',sans-serif;
    background: linear-gradient(135deg,#0f2027,#203a43,#2c5364);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.dashboard{
    background: rgba(255,255,255,0.08);
    backdrop-filter: blur(15px);
    width:460px;
    padding:40px;
    border-radius:20px;
    box-shadow:0 20px 40px rgba(0,0,0,0.5);
    text-align:center;
}

h2{
    color:#00e5ff;
    margin-bottom:30px;
}

.card{
    display:block;
    padding:15px;
    margin:14px 0;
    text-decoration:none;
    font-size:17px;
    font-weight:bold;
    border-radius:12px;
    color:white;
    background: linear-gradient(45deg,#ff512f,#dd2476);
    transition:0.4s;
}

.card:hover{
    transform:translateY(-5px) scale(1.03);
    box-shadow:0 10px 25px rgba(0,0,0,0.6);
}

footer{
    margin-top:20px;
    color:#aaa;
}
</style>
</head>

<body>

<div class="dashboard">
    <h2>Admin Dashboard</h2>

   <a href="addProduct.jsp" class="card" style="background:linear-gradient(45deg,#ff512f,#dd2476);">
    Add Product
</a>

<a href="manageProducts.jsp" class="card" style="background:linear-gradient(45deg,#ff512f,#dd2476);">
    Manage Products
</a>

<a href="viewUsers.jsp" class="card" style="background:linear-gradient(45deg,#ff512f,#dd2476);">
    View Users
</a>

<a href="viewOrders.jsp" class="card" style="background:linear-gradient(45deg,#ff512f,#dd2476);">
    View Orders
</a>

<a href="../logout.jsp" class="card" style="background:linear-gradient(45deg,#616161,#212121);">
    Logout
</a>

    
</div>

</body>
</html>