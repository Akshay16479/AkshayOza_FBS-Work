<%@ page import="java.util.*,model.Product" %>

<link rel="stylesheet"
href="<%=request.getContextPath()%>/css/style.css">

<h2>Products</h2>

<%
List<Product> list =
(List<Product>)request.getAttribute("products");

for(Product p : list){
%>

<div class="card">
<img src="<%=request.getContextPath()%>/images/<%=p.getImage()%>"
width="150"><br>

<b><%=p.getName()%></b><br>
₹ <%=p.getPrice()%><br>

<form action="<%=request.getContextPath()%>/CartServlet"
method="post">
<input type="hidden" name="productId"
value="<%=p.getId()%>">
<input type="number" name="quantity"
value="1" min="1">
<button>Add To Cart</button>
</form>

</div>

<% } %>
