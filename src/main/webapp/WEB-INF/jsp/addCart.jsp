<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add To Cart</title>
</head>
<body>
	<h1>Product Description</h1>
	<form:form action="addToCart" commandName="product">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
				<%-- <td><form:errors path="name"></form:errors> --%>
			</tr>
			<tr>
				<td>Location</td>
				<td><form:input path="location" /></td>
				<%-- <td><form:errors path="location"></form:errors> --%>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description" /></td>
				<%-- <td><form:errors path="description"></form:errors> --%>
			</tr>
			<tr>
				<td>Start Date</td>
				<td><form:input path="startDate" /></td>
				<%-- <td><form:errors path="startDate"></form:errors> --%>
			</tr>
			<tr>
				<td>End Date</td>
				<td><form:input path="endDate" /></td>
				<%-- <td><form:errors path="endDate"></form:errors> --%>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>