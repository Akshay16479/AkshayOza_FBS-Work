<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="common/header.jsp"%>

<style>

/* BACKGROUND WRAPPER */
.payment-wrapper {
	min-height: 80vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(135deg, #141e30, #243b55);
	padding: 30px;
}

/* PAYMENT CARD */
.container {
	background: rgba(255, 255, 255, 0.95);
	width: 420px;
	padding: 40px 35px;
	border-radius: 18px;
	box-shadow: 0 20px 45px rgba(0, 0, 0, 0.45);
	position: relative;
	transition: 0.4s;
}

.container:hover {
	transform: translateY(-5px);
	box-shadow: 0 25px 60px rgba(0, 0, 0, 0.6);
}

h2 {
	text-align: center;
	color: #1a1a1a;
	margin-bottom: 20px;
	font-size: 26px;
}

/* ERROR MESSAGE */
.error {
	background: #ffebee;
	color: #c62828;
	padding: 10px;
	border-radius: 6px;
	margin-bottom: 15px;
	text-align: center;
	font-size: 14px;
}

form {
	display: flex;
	flex-direction: column;
}

/* RADIO BUTTON */
.payment-option{
	display:flex;
	align-items:center;
	margin-bottom:10px;
	font-size:15px;
}

.payment-option input{
	margin-right:8px;
}

/* INPUT FIELDS */
input{
	width:100%;
	padding:14px 12px;
	margin-bottom:18px;
	border-radius:10px;
	border:1px solid #ddd;
	font-size:14px;
}

button{
	width:100%;
	padding:14px;
	background:linear-gradient(45deg,#00c6ff,#0072ff);
	color:white;
	border:none;
	border-radius:30px;
	font-weight:bold;
	font-size:16px;
	cursor:pointer;
}

button:hover{
	transform:scale(1.05);
	box-shadow:0 8px 25px rgba(0,0,0,0.4);
}

</style>


<div class="payment-wrapper">

<div class="container">

<h2>Payment Details</h2>

<%
if ("1".equals(request.getParameter("error"))) {
%>
<div class="error">Insufficient Balance!</div>
<%
} else if ("2".equals(request.getParameter("error"))) {
%>
<div class="error">Card details are incorrect!</div>
<%
} else if ("3".equals(request.getParameter("error"))) {
%>
<div class="error">Something went wrong. Try again.</div>
<%
}
%>

<form action="PaymentServlet" method="post">

<input type="hidden" name="total" value="<%=request.getParameter("total")%>">

<!-- PAYMENT OPTIONS -->

<div class="payment-option">
<input type="radio" name="payment_method" checked onclick="showCard()">
Credit / Debit Card
</div>

<div class="payment-option">
<input type="radio" name="payment_method" onclick="hideCard()">
Cash On Delivery
</div>


<!-- CARD DETAILS -->

<div id="cardBox">

<input type="text" name="card_name" placeholder="Cardholder Name" required>

<input type="text" name="card_number" placeholder="Card Number"
maxlength="12" pattern="[0-9]{12}" required>

<input type="text" name="expiry" placeholder="Expiry (MM/YY)" maxlength="5" required>

<input type="text" name="cvv" placeholder="CVV" maxlength="3" pattern="[0-9]{3}" required>

</div>

<button type="submit">Confirm Payment</button>

</form>

</div>

</div>


<script>

function hideCard(){

document.getElementById("cardBox").style.display="none";

document.getElementsByName("card_name")[0].required=false;
document.getElementsByName("card_number")[0].required=false;
document.getElementsByName("expiry")[0].required=false;
document.getElementsByName("cvv")[0].required=false;

}

function showCard(){

document.getElementById("cardBox").style.display="block";

document.getElementsByName("card_name")[0].required=true;
document.getElementsByName("card_number")[0].required=true;
document.getElementsByName("expiry")[0].required=true;
document.getElementsByName("cvv")[0].required=true;

}

</script>

<%@ include file="common/footer.jsp"%>