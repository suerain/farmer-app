<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>
			Hello <b><c:out value="${user.name}" /></b>
		</h1>
	<form action="/product" method="POST">
	
		Product Name:<br> 
		<input type="text" name="name"> 
		<br>Quantity:<br> 
		<input type="text" name="qty"> 
		<br> Last name:<br> 
		<input type="text" name="" value=""> 
		<br> Last name:<br>  
		<input type="submit" value="Submit">
	</form>


</body>
</html>