<%@ page import="java.util.*,java.sql.*,util.DBConnection" %>
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

/* CART CONTAINER */

.cart-container{
width:92%;
max-width:1100px;
margin:40px auto;

background:rgba(255,255,255,0.95);
padding:30px;

border-radius:16px;

box-shadow:0 15px 40px rgba(0,0,0,0.25);
}

/* TITLE */

h2{
text-align:center;
color:#222;
font-size:28px;
letter-spacing:1px;
}

/* TABLE */

table{
width:100%;
border-collapse:collapse;
margin-top:25px;
overflow:hidden;
border-radius:10px;
}

/* HEADER */

table th{
background:linear-gradient(90deg,#11998e,#38ef7d);
color:white;

padding:14px;
font-size:15px;
}

/* CELLS */

table td{
padding:14px;
border-bottom:1px solid #eee;
font-size:14px;
}

/* ROW HOVER */

table tr:hover{
background:#f5fdf9;
transition:0.3s;
}

/* PRODUCT IMAGE */

.product-img{
width:75px;
height:75px;
object-fit:cover;

border-radius:10px;
box-shadow:0 4px 10px rgba(0,0,0,0.2);
}

/* BUTTONS */

button{
padding:6px 12px;
border:none;
border-radius:6px;
cursor:pointer;

font-weight:bold;
font-size:14px;
transition:0.25s;
}

/* INCREASE */

.btn-inc{
background:#00c853;
color:white;
}

.btn-inc:hover{
transform:scale(1.1);
box-shadow:0 3px 10px rgba(0,0,0,0.3);
}

/* DECREASE */

.btn-dec{
background:#ff7043;
color:white;
}

.btn-dec:hover{
transform:scale(1.1);
}

/* REMOVE */

.btn-remove{
background:#e53935;
color:white;
padding:7px 14px;
}

.btn-remove:hover{
background:#c62828;
}

/* TOTAL SECTION */

.total-section{
text-align:right;
margin-top:25px;

font-size:22px;
font-weight:bold;

color:#2e7d32;
}

/* ACTION BUTTONS */

.cart-actions{
display:flex;
justify-content:space-between;
margin-top:30px;
}

/* LINKS */

.cart-actions a{
padding:12px 28px;

background:linear-gradient(90deg,#00c853,#64dd17);
color:white;

border-radius:30px;
text-decoration:none;
font-weight:bold;

transition:0.3s;
}

.cart-actions a:hover{
transform:translateY(-3px);
box-shadow:0 8px 20px rgba(0,0,0,0.3);
}

/* EMPTY CART */

.empty-cart{
text-align:center;
margin:60px 0;
font-size:22px;
color:#555;
}

.empty-cart a{
display:inline-block;
margin-top:20px;

padding:12px 28px;
background:linear-gradient(90deg,#11998e,#38ef7d);

color:white;
border-radius:30px;
text-decoration:none;
font-weight:bold;
}

.empty-cart a:hover{
transform:scale(1.05);
box-shadow:0 6px 18px rgba(0,0,0,0.3);
}

</style>

<div class="cart-container">

<%
Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");

if (cart == null || cart.isEmpty()) {
%>
    <div class="empty-cart">
        <p> Your Cart is Empty</p>
        <a href="products.jsp">Start Shopping</a>
    </div>
<%
} else {
%>

<h2>Your Shopping Cart</h2>

<table>
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Qty</th>
        <th>Subtotal</th>
        <th>Action</th>
    </tr>

<%
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
double total = 0;

try {
    con = DBConnection.getConnection();

    for (Integer pid : cart.keySet()) {
        ps = con.prepareStatement("SELECT * FROM products WHERE id=?");
        ps.setInt(1, pid);
        rs = ps.executeQuery();

        if (rs.next()) {
            int qty = cart.get(pid);
            double price = rs.getDouble("price");
            double sub = price * qty;
            total += sub;
%>
    <tr>
        <td>
            <img class="product-img" src="images/<%= rs.getString("image") %>"><br>
            <%= rs.getString("name") %>
        </td>
        <td>₹<%= price %></td>
        <td>
            <form action="UpdateCartServlet" method="post" style="display:inline;">
                <input type="hidden" name="pid" value="<%= pid %>">
                <button name="action" value="dec" class="btn-dec">−</button>
                <%= qty %>
                <button name="action" value="inc" class="btn-inc">+</button>
            </form>
        </td>
        <td>₹<%= sub %></td>
        <td>
            <form action="UpdateCartServlet" method="post">
                <input type="hidden" name="pid" value="<%= pid %>">
                <button name="action" value="remove" class="btn-remove">Remove</button>
            </form>
        </td>
    </tr>
<%
        }
    }
} catch(Exception e) {
    e.printStackTrace();
} finally {
    if (rs != null) rs.close();
    if (ps != null) ps.close();
    if (con != null) con.close();
}
%>

</table>

<div class="total-section">
    Total Amount: ₹<%= total %>
</div>

<div class="cart-actions">
    <a href="products.jsp">Continue Shopping</a>
    <a href="checkout.jsp">Proceed to Checkout</a>
</div>

<%
}
%>

</div>

<%@ include file="common/footer.jsp" %>