<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="product" commandName="product" method="POST">
		<table>
			<tr>
				<form:select path="category">
					<form:option value="" label="Select Category" />
					<form:options path="${availableOptions}" />
				</form:select>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
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
		</table>
		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>