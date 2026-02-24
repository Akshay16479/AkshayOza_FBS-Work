<%@ page import="java.util.*,model.CartItem" %>

<link rel="stylesheet"
href="<%=request.getContextPath()%>/css/style.css">

<h2>Your Cart</h2>

<%
List<CartItem> cart =
(List<CartItem>)session.getAttribute("cart");

double total = 0;

if(cart != null){
for(CartItem c : cart){
total += c.getProduct().getPrice()
* c.getQuantity();
%>

<p>
<%=c.getProduct().getName()%>
- Qty: <%=c.getQuantity()%>
</p>

<% }} %>

<h3>Total: ₹ <%=total%></h3>

<form action="<%=request.getContextPath()%>/CheckoutServlet"
method="post">
<button>Checkout (COD)</button>
</form>
