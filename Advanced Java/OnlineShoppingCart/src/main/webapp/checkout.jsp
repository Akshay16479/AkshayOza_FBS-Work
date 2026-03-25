<%@ page import="java.util.*, java.sql.*, util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/header.jsp" %>
<%
    Map<Integer, Integer> cart =
        (Map<Integer, Integer>) session.getAttribute("cart");

    String action = request.getParameter("action");
    String pidStr = request.getParameter("pid");
    String qtyStr = request.getParameter("qty");

    if (cart != null && action != null && pidStr != null) {
        int pid = Integer.parseInt(pidStr);

        if ("plus".equals(action)) {
            cart.put(pid, cart.get(pid) + 1);
        } else if ("minus".equals(action)) {
            int q = cart.get(pid);
            if (q <= 1) cart.remove(pid);
            else cart.put(pid, q - 1);
        } else if ("update".equals(action)) {
            int q = Integer.parseInt(qtyStr);
            if (q <= 0) cart.remove(pid);
            else cart.put(pid, q);
        }

        session.setAttribute("cart", cart);
        response.sendRedirect("checkout.jsp");
        return;
    }
%>


<style>

/* PAGE BACKGROUND */

body{
font-family:'Poppins',sans-serif;
margin:0;
padding:0;
background:linear-gradient(135deg,#141e30,#243b55);
min-height:100vh;
}

/* MAIN CARD */

.container{
width:700px;
margin:50px auto;

background:rgba(255,255,255,0.95);
padding:30px;

border-radius:18px;

box-shadow:0 15px 40px rgba(0,0,0,0.4);
}

/* TITLE */

h2{
text-align:center;
font-size:28px;
color:#333;
margin-bottom:20px;
letter-spacing:1px;
}

/* TABLE */

table{
width:100%;
border-collapse:collapse;
margin-top:20px;
border-radius:10px;
overflow:hidden;
}

/* HEADER */

th{
background:linear-gradient(90deg,#00c6ff,#0072ff);
color:white;

padding:14px;
font-size:15px;
}

/* CELLS */

td{
padding:14px;
border-bottom:1px solid #eee;
font-size:14px;
}

/* ROW HOVER */

tr:hover{
background:#f7fbff;
transition:0.3s;
}

/* QTY BUTTON */

.qty-btn{
padding:6px 12px;

border:none;
border-radius:6px;

background:linear-gradient(45deg,#ff9966,#ff5e62);
color:white;

font-weight:bold;
cursor:pointer;

transition:0.25s;
}

.qty-btn:hover{
transform:scale(1.1);
box-shadow:0 5px 15px rgba(0,0,0,0.3);
}

/* QTY INPUT */

.qty-input{
width:55px;
padding:6px;

border-radius:6px;
border:1px solid #ccc;

text-align:center;
font-weight:bold;
}

/* TOTAL */

.total{
text-align:right;

font-size:22px;
margin-top:20px;

font-weight:bold;
color:#2e7d32;
}

/* PAYMENT BUTTON */

.pay-btn{
width:100%;
padding:14px;
margin-top:25px;

border:none;
border-radius:30px;

background:linear-gradient(90deg,#00c853,#64dd17);
color:white;

font-size:16px;
font-weight:bold;

cursor:pointer;
transition:0.3s;
}

.pay-btn:hover{
transform:translateY(-3px);
box-shadow:0 10px 25px rgba(0,0,0,0.4);
}

/* EMPTY CART */

.empty-cart{
text-align:center;
font-size:20px;
margin-top:40px;
color:#555;
}

.empty-cart a{
display:inline-block;
margin-top:15px;

padding:10px 25px;

background:linear-gradient(90deg,#00c853,#64dd17);
color:white;

border-radius:25px;
text-decoration:none;
font-weight:bold;
}

.empty-cart a:hover{
transform:scale(1.05);
}

</style>

<div class="container">

<h2 align="center">Checkout</h2>

<%
    if (cart == null || cart.isEmpty()) {
%>
    <div class="empty-cart">
        Cart is empty! <a href="products.jsp">Shop Now</a>
    </div>
<%
    } else {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    double total = 0;

    try {
        con = DBConnection.getConnection();
%>

<table>
<tr>
    <th>Product</th>
    <th>Quantity</th>
    <th>Price</th>
    <th>Subtotal</th>
</tr>

<%
        for (Integer pid : cart.keySet()) {

            ps = con.prepareStatement(
                "SELECT name, price FROM products WHERE id=?"
            );
            ps.setInt(1, pid);
            rs = ps.executeQuery();

            if (rs.next()) {
                int qty = cart.get(pid);
                double price = rs.getDouble("price");
                double subtotal = qty * price;
                total += subtotal;
%>

<tr>
    <td><%= rs.getString("name") %></td>

    <td>
        <!-- Minus -->
        <form method="post" style="display:inline;">
            <input type="hidden" name="pid" value="<%= pid %>">
            <button class="qty-btn" name="action" value="minus">−</button>
        </form>

        <!-- Update -->
        <form method="post" style="display:inline;">
            <input type="hidden" name="pid" value="<%= pid %>">
            <input type="hidden" name="action" value="update">
            <input type="number"
                   name="qty"
                   value="<%= qty %>"
                   min="0"
                   class="qty-input"
                   onchange="this.form.submit()">
        </form>

        <!-- Plus -->
        <form method="post" style="display:inline;">
            <input type="hidden" name="pid" value="<%= pid %>">
            <button class="qty-btn" name="action" value="plus">+</button>
        </form>
    </td>

    <td>₹<%= price %></td>
    <td>₹<%= subtotal %></td>
</tr>

<%
            }
            rs.close();
            ps.close();
        }
%>

</table>

<div class="total">
    Total: ₹<%= total %>
</div>

<form action="payment.jsp" method="post">
    <input type="hidden" name="total" value="<%= total %>">
    <button class="pay-btn">Proceed to Payment</button>
</form>

<%
    } catch(Exception e) {
        e.printStackTrace();
    } finally {
        if (con != null) con.close();
    }
}
%>

</div>

<%@ include file="common/footer.jsp" %>