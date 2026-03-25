<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>Login | Online Shopping</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:'Poppins',sans-serif;
}

/* ===== ANIMATED BACKGROUND ===== */
body{
height:100vh;
display:flex;
justify-content:center;
align-items:center;

background:linear-gradient(-45deg,#667eea,#764ba2,#00c6ff,#0072ff);
background-size:400% 400%;
animation:bgmove 12s ease infinite;
}

@keyframes bgmove{
0%{background-position:0% 50%;}
50%{background-position:100% 50%;}
100%{background-position:0% 50%;}
}

/* ===== GLASS LOGIN CARD ===== */
.login-box{

width:420px;
padding:45px 40px;

background:rgba(255,255,255,0.12);
backdrop-filter:blur(14px);

border-radius:20px;

box-shadow:0 20px 45px rgba(0,0,0,0.35);

color:white;
text-align:center;

border:1px solid rgba(255,255,255,0.3);
}

/* ===== TITLE ===== */

h2{
margin-bottom:25px;
font-size:28px;
letter-spacing:1px;
}

/* ===== INPUT ===== */

input{
width:100%;
padding:14px;
margin:12px 0;

border:none;
border-radius:10px;

background:rgba(255,255,255,0.2);
color:white;
font-size:14px;

transition:0.3s;
}

input::placeholder{
color:#eee;
}

/* glow effect */
input:focus{
outline:none;
box-shadow:0 0 8px #00f7ff;
}

/* ===== ERROR MESSAGE ===== */

.error{
background:rgba(255,0,0,0.2);
padding:10px;
margin-bottom:15px;
border-radius:8px;
font-size:14px;
}

/* ===== BUTTON ===== */

button{
width:100%;
padding:14px;

border:none;
border-radius:30px;

background:linear-gradient(90deg,#00f7ff,#00ff9d);

color:black;
font-weight:bold;
font-size:16px;

cursor:pointer;
transition:0.3s;
}

button:hover{
transform:translateY(-3px);
box-shadow:0 8px 25px rgba(0,0,0,0.5);
}

/* ===== REGISTER LINK ===== */

.register-link{
margin-top:18px;
font-size:14px;
}

.register-link a{
color:#00f7ff;
text-decoration:none;
font-weight:bold;
}

.register-link a:hover{
text-decoration:underline;
}

</style>
</head>

<body>

<div class="login-box">

<h2>Login</h2>
<%
String error = request.getParameter("error");

if("blocked".equals(error)){
%>

<script>
alert("Your account is blocked. Please contact admin.");
</script>

<%
}

if("1".equals(error)){
%>

<div class="error">Invalid Email or Password</div>

<%
}
%>

<form action="LoginServlet" method="post">

<input type="email" name="email" placeholder="Email" required>

<input type="password" name="password" placeholder="Password" required>

<button type="submit">Login</button>

</form>

<div class="register-link">
New User? <a href="register.jsp">Register Here</a>
</div>

</div>

</body>
</html>