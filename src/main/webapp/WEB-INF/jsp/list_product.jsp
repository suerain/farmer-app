<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
			    <th>Quantity</th> 
			    <th>Price</th>
			    <th>Action</th>
			</tr>
		</thead>
		<tbody>
			 <c:forEach items="${products}" var="product">
		            <tr>
		            	<td><c:out value="${product.name}"/></td>
		            	<td><c:out value="${product.qty}"/></td>
		            	<td><c:out value="${product.price}"/></td>
		            	<td>Delete</td>
		            </tr>
		     </c:forEach> 
	     </tbody>
     </table>    	
		<br>


</body>
</html>