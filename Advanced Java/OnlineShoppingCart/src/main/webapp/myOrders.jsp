<%@ page import="java.sql.*,util.DBConnection"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/header.jsp" %>

<style>

/* PAGE BACKGROUND */

body{
font-family:'Poppins',sans-serif;
background:linear-gradient(135deg,#1f4037,#99f2c8);
margin:0;
padding:0;
min-height:100vh;
}

/* CONTAINER */

.orders-container{
width:94%;
max-width:1200px;
margin:40px auto;

background:rgba(255,255,255,0.95);
padding:35px;

border-radius:16px;

box-shadow:0 15px 40px rgba(0,0,0,0.25);
}

/* TITLE */

h2{
text-align:center;
color:#222;
font-size:30px;
letter-spacing:1px;
margin-bottom:20px;
}

/* TABLE */

table{
width:100%;
border-collapse:collapse;
margin-top:20px;
overflow:hidden;
border-radius:10px;
}

/* HEADER */

table th{
background:linear-gradient(90deg,#11998e,#38ef7d);
color:white;

padding:16px;
font-size:16px;
}

/* CELLS */

table td{
padding:16px;
border-bottom:1px solid #eee;
font-size:15px;
text-align:center;
}

/* ROW HOVER */

table tr:hover{
background:#f5fdf9;
transition:0.3s;
}

/* STATUS BADGES */

.status{
padding:6px 14px;
border-radius:20px;
font-weight:bold;
font-size:13px;
color:white;
}

.processing{
background:#ff9800;
}

.shipped{
background:#2196f3;
}

.delivered{
background:#00c853;
}

.cancelled{
background:#e53935;
}

/* EMPTY MESSAGE */

.empty-orders{
text-align:center;
margin:60px 0;
font-size:22px;
color:#555;
}

</style>

<div class="orders-container">

<h2>My Orders</h2>

<table>
<tr>
<th>Order ID</th>
<th>Order Date</th>
<th>Total Amount</th>
<th>Status</th>
</tr>

<%
int userId = (int)session.getAttribute("userId");

Connection con = DBConnection.getConnection();

PreparedStatement ps = con.prepareStatement(
"SELECT * FROM orders WHERE user_id=? ORDER BY id DESC"
);

ps.setInt(1,userId);

ResultSet rs = ps.executeQuery();

boolean hasOrders = false;

while(rs.next()){

hasOrders = true;

String status = rs.getString("status");

String cssClass="processing";

if(status.equalsIgnoreCase("Shipped"))
cssClass="shipped";

else if(status.equalsIgnoreCase("Delivered"))
cssClass="delivered";

else if(status.equalsIgnoreCase("Cancelled"))
cssClass="cancelled";

%>

<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getTimestamp("order_date")%></td>
<td>₹ <%=rs.getDouble("total")%></td>

<td>
<span class="status <%=cssClass%>">
<%=status%>
</span>
</td>

</tr>

<%
}

if(!hasOrders){
%>

<tr>
<td colspan="4">
<div class="empty-orders">
You haven't placed any orders yet
</div>
</td>
</tr>

<%
}
%>

</table>

</div>

<%@ include file="common/footer.jsp" %>