<!DOCTYPE html>
<html>
<head>
<title>Blood Finder</title>

<style>
body{
    margin:0;
    font-family:'Segoe UI';
    background:linear-gradient(135deg,#1e3c72,#2a5298);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

/* Main Card */
.box{
    background:white;
    padding:40px;
    border-radius:20px;
    text-align:center;
    width:350px;
    box-shadow:0 10px 30px rgba(0,0,0,0.3);
}

h1{
    color:#ff416c;
    margin-bottom:20px;
}

/* Buttons */
a{
    display:block;
    margin:15px 0;
    padding:12px;
    background:linear-gradient(45deg,#ff416c,#ff4b2b);
    color:white;
    text-decoration:none;
    border-radius:10px;
    font-weight:bold;
    transition:0.3s;
}

a:hover{
    transform:scale(1.05);
}
</style>

</head>
<body>

<div class="box">

<h1>Blood Donor Finder</h1>

<a href="register.jsp">Register</a>
<a href="login.jsp">Login</a>
<a href="adminLogin.jsp">Admin Login</a>

</div>

</body>
</html>