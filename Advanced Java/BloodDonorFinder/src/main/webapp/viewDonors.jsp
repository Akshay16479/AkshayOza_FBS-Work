<%@ page import="java.util.*,com.blood.model.Donor" %>

<!DOCTYPE html>
<html>
<head>
<title>Donors</title>

<style>
body{
    background:linear-gradient(135deg,#1e3c72,#2a5298);
    font-family:Segoe UI;
    color:white;
}
table{
    width:90%;
    margin:20px auto;
    border-collapse:collapse;
    background:white;
    color:black;
}
th,td{
    padding:10px;
    border:1px solid #ccc;
}
th{
    background:#ff416c;
    color:white;
}
a{
    text-decoration:none;
}
</style>

</head>
<body>

<h2 style="text-align:center;">All Donors</h2>

<table>
<tr>
<th>Name</th><th>Email</th><th>Phone</th><th>Blood</th><th>City</th><th>Status</th><th>Action</th>
</tr>

<%
List<Donor> list = (List<Donor>)request.getAttribute("donorList");

if(list != null){
for(Donor d : list){
%>

<tr>
<td><%= d.getName() %></td>
<td><%= d.getEmail() %></td>
<td><%= d.getPhone() %></td>
<td><%= d.getBloodGroup() %></td>
<td><%= d.getCity() %></td>
<td><%= d.isAvailable()?"Available":"Not Available" %></td>

<td>
<a href="toggleAvailability?id=<%= d.getId() %>">Status Update</a> |
<a href="deleteDonor?id=<%= d.getId() %>" style="color:red;">Delete</a>
</td>

</tr>

<% }} %>

</table>

</body>
</html>