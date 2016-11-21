<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
</head>
<body>

<h1>
			Edit Product<!-- Hello <b><c:out value="${user.name}" /></b>  -->
</h1>
	<form:form action="/product/edit" commandName="product" method="POST">
		<table>
			<tr>
				<td>Name</td>
				<td>
					<form:input path="id" cssStyle="display:none"/>
					<form:input path="name"/>
				</td>
				<%-- <td><form:errors path="name"></form:errors> --%>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><form:input path="qty" /></td>
				<%-- <td><form:errors path="location"></form:errors> --%>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
				<%-- <td><form:errors path="description"></form:errors> --%>
			</tr>
			<tr>
				<td>Category</td>
				<td>
					<form:select path="category">
						<form:option value="" label="Select Category" />
						<form:options path="${availableOptions}" />
					</form:select>
				<td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form:form>
	


</body>
</html>