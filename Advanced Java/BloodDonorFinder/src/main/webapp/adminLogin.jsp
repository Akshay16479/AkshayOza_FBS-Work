<!DOCTYPE html>
<html>
<head>
<title>Admin Login</title>

<style>
body{
    background:linear-gradient(135deg,#ff416c,#ff4b2b);
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
    width:320px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.3);
}
input,button{
    width:100%;
    padding:10px;
    margin:10px 0;
    border-radius:8px;
    border:none;
}
button{
    background:#ff416c;
    color:white;
}
</style>

</head>
<body>

<div class="box">
<h2>Admin Login</h2>

<form action="adminLogin" method="post">
<input name="username" placeholder="Username" required>
<input type="password" name="password" placeholder="Password" required>
<button>Login</button>
</form>

<% if(request.getParameter("error")!=null){ %>
<p style="color:red;">Invalid Login</p>
<% } %>

</div>

</body>
</html>