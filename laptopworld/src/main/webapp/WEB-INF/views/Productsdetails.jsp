<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Product</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<jsp:include page="Headers.jsp"></jsp:include>
	<br>
	<br>
	<br>

	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-16 col-sm-16 col-md-9 col-sm-offset-6 col-md-offset-2">
				<div class="panel panel-info">
			
					<div class="panel-heading" >
						<h3 class="panel-title">Product</h3>
					</div>
					<div class="panel-body">
	<table class="table table-condensed">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>PRICE</th>
        <th>DESCRIPTION</th>
        <th>CATEGORY</th>
        <th>SUPPLIER</th>
        
           
      </tr>
    </thead>
    <tbody>
      <c:forEach var="product" items="${listproduct}">
			    <tr>
			    				<td>${product.productid}</td>
								<td>${product.name}</td>
								<td>${product.description}</td>
								<td>${product.price}</td>
								<td>${product.category.name}</td>
								<td>${product.supplier.name}</td>
								<td><img src="resources/images/${product.productid}.jpg" height="100" width="100"/></td>
								<td><a href="viewproduct/${product.productid}">View</a></td>
			 </tr>
			 </c:forEach>
	</tbody>
	</table>
						
						</div>
						</div>
						<br>
						<footer>
						
						<br>
						<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
						</footer>
					
					</div></div></div>