<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Products</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
 <meta name="_csrf" content="${_csrf.token}"/>
 <!-- default header name is X-CSRF-TOKEN -->
 <meta name="_csrf_header" content="${_csrf.headerName}"/>

<script>
    function deleteProduct(event){
        var product_id = $(event).val();
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");
   
    	$.ajax({
	    		url: "delete_product_r/"+product_id,
	    		beforeSend: function(xhr){xhr.setRequestHeader(header, token);},
	    		type:"DELETE", 
	    		error: function(response) {
	    			$("#div1").html("Cannot be deleted!");
	            },
	    		success: function(result,status)
	        	{
	            	$("#div1").html("Delete "+status);
	            	location.reload();	
	        	} 
	            	
	    		}
    		);
    } 
</script>

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
		            	<td>
		            		<button value="${product.id}" onclick="deleteProduct(this)">Delete</button>
		            		<br/>
		            		<button><a href="product/edit/${product.id}">Edit</a></button>
		            	</td>
		            </tr>
		     </c:forEach> 
	     </tbody>
     </table>    	
		<br>
		<div id="div1"></div>


</body>
</html>