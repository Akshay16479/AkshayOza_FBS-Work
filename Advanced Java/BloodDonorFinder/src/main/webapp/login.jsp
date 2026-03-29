<!DOCTYPE html>
<html>
<head>
<title>Login</title>

<style>
body{
    background:linear-gradient(135deg,#1e3c72,#2a5298);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
    font-family:Segoe UI;
}
.box{
    background:white;
    padding:30px;
    border-radius:15px;
    width:300px;
    text-align:center;
}
input,button{
    width:100%;
    padding:10px;
    margin:10px 0;
    border-radius:8px;
}
button{
    background:#ff416c;
    color:white;
    border:none;
}
</style>

</head>
<body>

<div class="box">
<h2>User Login</h2>

<form action="login" method="post">
<input name="email" placeholder="Email" required>
<input type="password" name="password" required>
<button>Login</button>
</form>

<% if(request.getParameter("error")!=null){ %>
<p style="color:red;">Invalid Login</p>
<% } %>

</div>

</body>
</html>