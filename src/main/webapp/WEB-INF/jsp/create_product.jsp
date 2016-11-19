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
</head>
<body>
	<form action="/product" method="POST">
		Product Name:<br> 
		<input type="text" name="name"> 
		<br>Quantity:<br> 
		<input type="text" name="qty"> 
		<br>Price:<br> 
		<input type="text" name="price"> 
		<br>
	<select name="selectedCategory">
	<%-- 	<c:forEach items="${categories}" var="value">
		    <option>${value}<option>
		</c:forEach> --%>
		</select> 
	<select name="category">
	 <c:forEach items="${categories}" var="author">
        <option  value="${author}">
            <c:out value="${author}"/> - <c:out value="${author}"/>
        </option>
        </c:forEach>
      </select>   
        
   <%--     <form:select path="selectedCategory">
              <form:option value="-" label="--Please Select"/>
              <form:options items="${categories}" itemValue="selectedValue" itemLabel="selectedValue"/>
          </form:select>
	</select>  --%>
	
	
		<br>
		<input type="submit" value="Submit">
	</form>


</body>
</html>