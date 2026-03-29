<!DOCTYPE html>
<html>
<head>
<title>Register</title>

<style>
body{
    background:linear-gradient(135deg,#ff512f,#dd2476);
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
    width:350px;
}
input,select,button{
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
<h2>Register</h2>

<form action="register" method="post">
<input name="name" placeholder="Name" required>
<input name="email" placeholder="Email" required>
<input type="password" name="password" placeholder="Password" required>
<input name="phone" placeholder="Phone" required>

<select name="blood">
<option>A+</option><option>B+</option><option>O+</option><option>AB+</option>
<option>A-</option><option>B-</option><option>O-</option><option>AB-</option>
</select>

<input name="city" placeholder="city" required>
<input name="pincode" placeholder="pincode" required>

<button>Register</button>
</form>
</div>

</body>
</html>