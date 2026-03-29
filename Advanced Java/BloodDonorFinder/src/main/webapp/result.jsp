<%@ page import="java.util.*,com.blood.model.Donor" %>

<!DOCTYPE html>
<html>
<head>
<title>Results</title>

<style>
body{
    background:linear-gradient(135deg,#1e3c72,#2a5298);
    font-family:Segoe UI;
    color:white;
    text-align:center;
}
.card{
    background:white;
    color:black;
    margin:20px auto;
    padding:20px;
    width:300px;
    border-radius:15px;
}
.call-btn{
    display:inline-block;
    padding:8px 15px;
    background:green;
    color:white;
    border-radius:8px;
}
.req-btn{
    display:inline-block;
    padding:8px 15px;
    background:#ff416c;
    color:white;
    border-radius:8px;
    text-decoration:none;
}
</style>

</head>
<body>

<h2>Available Donors</h2>

<%
List<Donor> list = (List<Donor>)request.getAttribute("donorList");

if(list != null && !list.isEmpty()){
for(Donor d : list){
%>

<div class="card">
<h3><%= d.getName() %></h3>
<p><%= d.getBloodGroup() %></p>
<p><%= d.getCity() %></p>
<a href="sendRequest?id=<%= d.getId() %>" class="call-btn">
    Request Blood
</a>
<% }} else { %>
<p>No donors found</p>
<% } %>
<% if(request.getParameter("msg")!=null){ %>
<p style="color:lime;">Request Sent Successfully </p>
<% } %>
</body>
</html>