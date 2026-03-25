<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>Register | Online Shopping</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Poppins',sans-serif;
}

/* ===== BACKGROUND ===== */
body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(-45deg,#ff6a00,#ee0979,#00c6ff,#0072ff);
    background-size:400% 400%;
    animation:gradientBG 12s ease infinite;
}

/* animated background */
@keyframes gradientBG{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

/* ===== REGISTER CARD ===== */
.register-box{
    width:380px;
    padding:40px 35px;
    border-radius:18px;
    background:rgba(255,255,255,0.15);
    backdrop-filter:blur(15px);
    box-shadow:0 20px 40px rgba(0,0,0,0.3);
    text-align:center;
    color:white;
    border:1px solid rgba(255,255,255,0.3);
}

/* title */
h2{
    margin-bottom:25px;
    font-size:26px;
    letter-spacing:1px;
}

/* ===== INPUTS ===== */
input,select{
    width:100%;
    padding:12px;
    margin:12px 0;
    border-radius:8px;
    border:none;
    background:rgba(255,255,255,0.2);
    color:white;
    font-size:14px;
}

input::placeholder{
    color:#eee;
}

select{
    color:white;
}

/* focus glow */
input:focus,select:focus{
    outline:none;
    box-shadow:0 0 8px #00f7ff;
}

/* ===== BUTTON ===== */
button{
    width:100%;
    padding:13px;
    margin-top:18px;
    border:none;
    border-radius:30px;
    background:linear-gradient(90deg,#00f7ff,#00ff9d);
    color:black;
    font-weight:bold;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
}

/* hover effect */
button:hover{
    transform:translateY(-2px);
    box-shadow:0 8px 20px rgba(0,0,0,0.4);
}

/* ===== LOGIN LINK ===== */
.login-link{
    margin-top:18px;
    font-size:14px;
}

.login-link a{
    color:#00f7ff;
    text-decoration:none;
    font-weight:bold;
}

.login-link a:hover{
    text-decoration:underline;
}

</style>
</head>

<body>

<div class="register-box">
<h2>Create Account</h2>

<form action="RegisterServlet" method="post">

<input type="text" name="name" placeholder="Full Name" required>

<input type="email" name="email" placeholder="Email Address" required>

<input type="password" name="password" placeholder="Password" required>

<select name="role" required>
<option value="">Select Role</option>
<option value="user">User</option>
<option value="admin">Admin</option>
</select>

<button type="submit">Register</button>

</form>

<div class="login-link">
Already have an account? <a href="login.jsp">Login Here</a>
</div>

</div>

</body>
</html>