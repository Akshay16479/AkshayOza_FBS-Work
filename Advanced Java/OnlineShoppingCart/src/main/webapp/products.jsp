<%@ page import="java.sql.*, util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="common/header.jsp" %>

<style>

body{
font-family:'Poppins',sans-serif;
background:linear-gradient(135deg,#1f4037,#99f2c8);
margin:0;
}

/* PRODUCTS GRID */

.products-container{

width:92%;
margin:40px auto;

display:grid;

grid-template-columns:repeat(auto-fit,minmax(250px,1fr));

gap:30px;

}

/* PRODUCT CARD */

.product-card{

background:rgba(255,255,255,0.95);

padding:20px;

border-radius:18px;

text-align:center;

box-shadow:0 10px 25px rgba(0,0,0,0.25);

transition:0.35s;

position:relative;

overflow:hidden;

}

/* CARD HOVER */

.product-card:hover{

transform:translateY(-10px) scale(1.02);

box-shadow:0 18px 40px rgba(0,0,0,0.35);

}

/* PRODUCT IMAGE */

.product-card img{

width:75%;

height:160px;

object-fit:contain;

margin-bottom:10px;

transition:0.4s;

}

.product-card:hover img{

transform:scale(1.1);

}

/* PRODUCT TITLE */

.product-card h3{

margin:8px 0;

color:#222;

}

/* DESCRIPTION */

.product-card p{

font-size:14px;

color:#666;

height:40px;

overflow:hidden;

}

/* PRICE */

.product-card h3:last-of-type{

color:#2e7d32;

font-size:20px;

margin-top:5px;

}

/* BUTTON BASE */

button{

width:90%;

padding:10px;

margin-top:10px;

border:none;

border-radius:25px;

font-weight:bold;

cursor:pointer;

transition:0.3s;

}

/* ADD CART BUTTON */

.add-btn{

background:linear-gradient(45deg,#ff8c00,#ff512f);

color:white;

}

.add-btn:hover{

transform:scale(1.05);

box-shadow:0 5px 15px rgba(0,0,0,0.3);

}

/* BUY BUTTON */

.buy-btn{

background:linear-gradient(45deg,#11998e,#38ef7d);

color:white;

}

.buy-btn:hover{

transform:scale(1.05);

box-shadow:0 5px 15px rgba(0,0,0,0.3);

}

/* PAGE TITLE */

h2{

font-size:28px;

color:white;

letter-spacing:1px;

}

/* TOAST MESSAGE */

#toast{

visibility:hidden;

min-width:260px;

background:linear-gradient(45deg,#00b09b,#96c93d);

color:white;

text-align:center;

border-radius:8px;

padding:16px;

position:fixed;

z-index:9999;

left:50%;

bottom:35px;

transform:translateX(-50%);

font-size:16px;

box-shadow:0 10px 25px rgba(0,0,0,0.35);

}

/* SHOW TOAST */

#toast.show{

visibility:visible;

animation:fadein 0.5s, fadeout 0.5s 2.5s;

}

@keyframes fadein{

from{bottom:0;opacity:0;}

to{bottom:35px;opacity:1;}

}

@keyframes fadeout{

from{opacity:1;}

to{opacity:0;}

}

</style>

<h2 style="text-align:center; margin-top:20px;">Our Products</h2>

<div class="products-container">

<%
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

try {
    con = DBConnection.getConnection();
    ps = con.prepareStatement("SELECT * FROM products");
    rs = ps.executeQuery();

    while (rs.next()) {
%>

    <div class="product-card">
        <img src="images/<%= rs.getString("image") %>" alt="Product Image">

        <h3><%= rs.getString("name") %></h3>
        <p><%= rs.getString("description") %></p>
        <h3>₹ <%= rs.getDouble("price") %></h3>

        <!-- ADD TO CART -->
        <form action="CartServlet" method="post">
            <input type="hidden" name="productId" value="<%= rs.getInt("id") %>">
            <button type="submit" name="action" value="add" class="add-btn">
                Add to Cart
            </button>
        </form>

        <!-- BUY NOW -->
        <form action="CartServlet" method="post">
            <input type="hidden" name="productId" value="<%= rs.getInt("id") %>">
            <button type="submit" name="action" value="buy" class="buy-btn">
                Buy Now
            </button>
        </form>
    </div>

<%
    }

} catch (Exception e) {
    out.println("<p style='color:red;text-align:center;'>Error loading products</p>");
    e.printStackTrace();
} finally {
    if (rs != null) rs.close();
    if (ps != null) ps.close();
    if (con != null) con.close();
}
%>

</div>

<!-- FLASH POPUP MESSAGE -->
<%
String msg = (String) session.getAttribute("cartMsg");
if (msg != null) {
%>
    <div id="toast"><%= msg %> ✅</div>
    <script>
        window.onload = function () {
            var toast = document.getElementById("toast");
            toast.classList.add("show");

            setTimeout(function () {
                toast.classList.remove("show");
            }, 3000);
        };
    </script>
<%
    session.removeAttribute("cartMsg");
}
%>

<%@ include file="common/footer.jsp" %>