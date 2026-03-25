<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ include file="common/header.jsp"%>

<style>
.confirm-wrapper {
	min-height: 80vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(135deg, #1f4037, #99f2c8);
	padding: 30px;
}

/* SUCCESS CARD */
.container {
	background: rgba(255, 255, 255, 0.95);
	padding: 45px 40px;
	border-radius: 20px;
	text-align: center;
	box-shadow: 0 20px 50px rgba(0, 0, 0, 0.4);
	max-width: 430px;
	width: 100%;
	position: relative;
	animation: pop 0.6s ease;
}

/* POP ANIMATION */
@
keyframes pop { 0%{
	transform: scale(0.7);
	opacity: 0;
}

100
%
{
transform
:
scale(
1
);
opacity
:
1;
}
}

/* SUCCESS ICON */
.container::before {
	position: absolute;
	top: -28px;
	left: 50%;
	transform: translateX(-50%);
	background: #4caf50;
	color: white;
	width: 60px;
	height: 60px;
	border-radius: 50%;
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 28px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.3);
}

/* TITLE */
h2 {
	color: #2e7d32;
	margin-bottom: 10px;
	font-size: 28px;
}

/* TEXT */
p {
	font-size: 18px;
	margin: 12px 0;
	color: #444;
}

/* TOTAL PRICE */
strong {
	color: #000;
	font-size: 20px;
}

/* BUTTON */
.container a{
	display: inline-block;
	padding: 13px 30px;
	background: linear-gradient(45deg, #ff9800, #ff5722);
	color: white;
	text-decoration: none;
	border-radius: 30px;
	font-weight: bold;
	margin-top: 20px;
	transition: 0.35s;
}

/* BUTTON HOVER */
a:hover {
	transform: scale(1.05);
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.3);
}
</style>
<div class="confirm-wrapper">

	<div class="container">
		<h2>Order Confirmed</h2>
		<p>Thank you for your purchase.</p>
		<p>
			<strong>Total Paid:</strong> ₹<%=request.getParameter("total")%></p>

		<a href="products.jsp">Continue Shopping</a>
	</div>

</div>

<%@ include file="common/footer.jsp"%>