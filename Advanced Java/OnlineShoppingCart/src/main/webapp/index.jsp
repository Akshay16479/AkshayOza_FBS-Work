<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>Amazon Clone</title>
<link rel="stylesheet"
href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>

<header class="nav">
<h2>🛒 AmazonClone</h2>

<div>
<a href="ProductServlet">Products</a>
<a href="user/login.jsp">Login</a>
<a href="admin/adminLogin.jsp">Admin</a>
</div>
</header>

<section class="hero">
<h1>Welcome to Amazon Clone</h1>
<a href="ProductServlet" class="btn">Shop Now</a>
</section>

</body>
</html>
