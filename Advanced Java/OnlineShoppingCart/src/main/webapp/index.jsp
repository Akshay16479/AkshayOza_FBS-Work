<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online Shopping Cart</title>

    <style>

*{
margin:0;
padding:0;
box-sizing:border-box;
}

body{
font-family:'Poppins',sans-serif;
height:100vh;

display:flex;
justify-content:center;
align-items:center;

background:linear-gradient(135deg,#141e30,#243b55);
}

/* MAIN CARD */

.container{

background:rgba(255,255,255,0.95);

width:420px;
padding:45px;

border-radius:20px;

text-align:center;

box-shadow:0 20px 40px rgba(0,0,0,0.4);

backdrop-filter:blur(10px);

animation:fadeIn 1s ease;
}

/* TITLE */

h1{

font-size:32px;
color:#222;

margin-bottom:10px;
letter-spacing:1px;
}

/* SUBTEXT */

p{
color:#555;
margin-bottom:30px;
font-size:15px;
}

/* BUTTON */

.btn{

display:inline-block;

width:150px;

padding:13px;
margin:10px;

border-radius:30px;

text-decoration:none;

color:white;
font-weight:bold;

background:linear-gradient(90deg,#ff512f,#dd2476);

transition:all 0.35s ease;

box-shadow:0 6px 20px rgba(0,0,0,0.25);
}

/* BUTTON HOVER */

.btn:hover{

transform:translateY(-4px) scale(1.05);

box-shadow:0 12px 30px rgba(0,0,0,0.35);

background:linear-gradient(90deg,#ff9966,#ff5e62);
}

/* FOOTER */

footer{

margin-top:25px;
font-size:13px;

color:#777;
}

/* ENTRY ANIMATION */

@keyframes fadeIn{

from{
opacity:0;
transform:translateY(20px);
}

to{
opacity:1;
transform:translateY(0);
}

}

</style>
</head>

<body>

<div class="container">
    <h1>Online Shopping</h1>
    <p>Buy your favorite products easily</p>

    <a href="login.jsp" class="btn">Login</a>      
    <a href="register.jsp" class="btn">Register</a>

    <footer>
        Enjoy Shopping with us
    </footer>
</div>
           
          
</body>
</html>