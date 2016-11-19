<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty orderLineList}">
		</c:when>
		<c:otherwise>
			<h1>Shopping Cart</h1>
			<table border="1">
				<tr>
					<th>Name</th>
					<th>Quantity</th>
					<th>Price</th>
				</tr>
				<c:forEach var="orderLine" items="${orderLineList}">
					<tr>
						<td>${orderLine.product.name}</td>
						<td>${orderLine.quantity}</td>
						<td>${orderLine.price}</td>
						<td><a href="orderLines/${orderLine.id}">Remove From Cart</a></td>
					</tr>
				</c:forEach>
			</table>
			<br />
			<a href="checkOut">Proceed To Checkout</a>
		</c:otherwise>
	</c:choose>
	Hello From JSP
	<a href="addToCart">Add to Cart</a>
</body>
</html>