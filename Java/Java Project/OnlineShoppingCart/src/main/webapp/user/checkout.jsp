<%@ page import="java.util.*,model.CartItem" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Your Cart</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container card">

<h2>Your Cart 🛒</h2>

<%
List<CartItem> cart=(List<CartItem>)session.getAttribute("cart");
double total=0;

if(cart!=null && !cart.isEmpty()){
for(CartItem c:cart){
total+=c.getProduct().getPrice()*c.getQuantity();
%>

<p>
<b><%=c.getProduct().getName()%></b>
&nbsp; | Qty: <%=c.getQuantity()%>
</p>

<% } %>

<hr>

<h3>Total : ₹ <%=total%></h3>

<form action="../CheckoutServlet" method="post">
<button class="btn">Checkout (COD)</button>
</form>

<%
}else{
%>

<p>Your cart is empty 😢</p>

<a href="../products">
<button class="btn">Continue Shopping</button>
</a>

<%
}
%>

</div>

</body>
</html>