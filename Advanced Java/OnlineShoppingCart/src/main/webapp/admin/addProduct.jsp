<h2>Add Product</h2>

<form action="<%=request.getContextPath()%>/ProductServlet"
method="post">

Name:<br>
<input name="name"><br><br>

Price:<br>
<input name="price"><br><br>

Image Name:<br>
<input name="image"><br><br>

<button>Add</button>

</form>
