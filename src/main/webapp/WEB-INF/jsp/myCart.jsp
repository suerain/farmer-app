<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
	<h1>Shopping Cart</h1>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach var="orderLine" items="${orderLines}">
			<tr>
				<td>${orderLine.product.name}</td>
				<td>${orderLine.quantity}</td>
				<td>${orderLine.price}</td>
				<td><a href="orderLines/${orderLine.id}">Remove From Cart</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="dashboard">Add More Products</a>

</body>
</html>