<!DOCTYPE html>
<html>
<head>
<title>Search Blood</title>

<style>
body{
    background: linear-gradient(135deg,#1e3c72,#2a5298);
    font-family:Segoe UI;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
    color:white;
}
.box{
    background:white;
    color:black;
    padding:30px;
    border-radius:15px;
    width:320px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.3);
}

/* inputs */
select,input,button{
    width:100%;
    padding:10px;
    margin:10px 0;
    border-radius:8px;
    border:none;
}

/* button */
button{
    background:#ff416c;
    color:white;
    font-weight:bold;
    cursor:pointer;
}
button:hover{
    background:#ff1e56;
}

/* success message */
.success-msg{
    background:#28a745;
    color:white;
    padding:10px;
    border-radius:8px;
    margin-bottom:15px;
    font-weight:bold;
    animation:fadeIn 0.5s ease-in-out;
}

/* animation */
@keyframes fadeIn{
    from{opacity:0; transform:translateY(-10px);}
    to{opacity:1; transform:translateY(0);}
}

#otherCity{
    display:none;
}
</style>

<script>
function handleCityChange() {
    var cityDropdown = document.getElementById("cityDropdown");
    var otherInput = document.getElementById("otherCity");

    if (cityDropdown.value === "Other") {
        otherInput.style.display = "block";
        otherInput.required = true;
    } else {
        otherInput.style.display = "none";
        otherInput.required = false;
    }
}

function setCity(){
    var dropdown = document.getElementById("cityDropdown");
    var other = document.getElementById("otherCity");
    var finalCity = document.getElementById("finalCity");

    if(dropdown.value === "Other"){
        finalCity.value = other.value;
    } else {
        finalCity.value = dropdown.value;
    }
}
</script>

</head>
<body>

<div class="box">

<h2>Find Blood Donor</h2>

<% if(request.getParameter("msg") != null){ %>
    <p class="success-msg">Request Sent Successfully</p>
<% } %>

<form action="searchDonor" method="post">

<select name="blood">
<option>A+</option>
<option>B+</option>
<option>O+</option>
<option>AB+</option>
<option>A-</option>
<option>B-</option>
<option>O-</option>
<option>AB-</option>
</select>

<select id="cityDropdown" onchange="handleCityChange()">
<option value="">Select City</option>
<option>Pune</option>
<option>Mumbai</option>
<option>Nashik</option>
<option>Nagpur</option>
<option>Navi Mumbai</option>
<option>Delhi</option>
<option>Bangalore</option>
<option>Hyderabad</option>
<option>Chennai</option>
<option>Kolkata</option>
<option>Ahmedabad</option>
<option>Other</option>
</select>

<input type="hidden" name="city" id="finalCity">

<input type="text" id="otherCity" placeholder="Enter Your City">

<button type="submit" onclick="setCity()">Search</button>

</form>
</div>

</body>
</html>