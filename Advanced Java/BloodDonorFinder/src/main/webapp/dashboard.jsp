<%@ page session="true" %>
<%
if(session.getAttribute("admin")==null){
    response.sendRedirect("adminLogin.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

<style>
body{
    background:linear-gradient(135deg,#1e3c72,#2a5298);
    font-family:Segoe UI;
    text-align:center;
    color:white;
}
.card{
    background:white;
    color:black;
    margin:40px auto;
    padding:30px;
    width:300px;
    border-radius:15px;
}
a{
    display:block;
    margin:15px;
    padding:12px;
    background:#ff416c;
    color:white;
    text-decoration:none;
    border-radius:10px;
}
</style>

</head>
<body>

<%@ include file="header.jsp" %>

<div class="card">
<h2>Admin Dashboard</h2>

<a href="viewDonors">View Donors</a>
<a href="logout.jsp">Logout</a>

</div>

</body>
</html>