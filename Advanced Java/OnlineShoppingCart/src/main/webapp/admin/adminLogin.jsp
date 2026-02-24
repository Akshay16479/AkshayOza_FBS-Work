<h2>Admin Login</h2>

<form action="<%=request.getContextPath()%>/adminLogin"
method="post">

Username:<br>
<input name="username"><br><br>

Password:<br>
<input type="password" name="password"><br><br>

<button>Login</button>

</form>
