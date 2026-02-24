<h2>User Login</h2>

<form action="<%=request.getContextPath()%>/userLogin"
method="post">

Email:<br>
<input type="email" name="email"><br><br>

Password:<br>
<input type="password" name="password"><br><br>

<button>Login</button>

</form>

<a href="register.jsp">Register</a>
