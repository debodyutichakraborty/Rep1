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
	<jsp:include page="Header.jsp"></jsp:include>
	<br>
	<br>
	<br>
<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">Product</h3>
					</div>
					<div class="panel-body">
						
						<form:form role="form" action="${pageContext.request.contextPath}/saveproduct"  enctype="multipart/form-data" commandName="product">
							
							<div class="row">
								 <div class="col-xs-8 col-sm-8 col-md-9">
									<%--<c:choose>
								 	<c:when test="${! empty category.name}">
 --%>									<div class="form-group">
									
									 Enter Product Id
										<form:input type="text" path="productid" id="Product Id"
											class="form-control input-sm" placeholder="Product Id"/>
										</div>
									<%-- </c:when>
									</c:choose> --%>
									
									<div class="form-group">
									Enter Product Name
									<form:input type="text" path="name" id="Product Name"
									class="form-control input-sm" placeholder="Product Name"/>
									</div>
									
									<div class="form-group">
											
									Enter Product Description
										<form:input type="Product Description" path="description"
											id="Category Id" class="form-control input-sm"
											placeholder="Product Description"/>
											
									</div>
									
									<div class="form-group">
									
									Enter Product Price
										<form:input type="Product Price" path="price" id="Product Price"
											class="form-control input-sm" placeholder="Product Price"/>
									</div>
									
									<div class="form-group">
									Enter Product Supplier Id
										<form:select type="Supplier Id" path="supplierid" id="Supplier Id"
											class="form-control input-sm" items="${supplierlist}" itemValue="supplierid" itemLabel="name"/>
									</div>
									
									<div class="form-group">
									
									Enter Product Category Id
										<form:select type="Category Id" path="categoryid"
											id="Category Id" class="form-control input-sm"
											items="${categorylist}" itemValue="categoryid" itemLabel="name"/>
											</div>
										
								
								<div class="form-group">
									
									Choose Product Image:
										<form:input type="file" path="file"
											id="Category Id" class="form-control input-sm"
											placeholder="Category Id"/>
											
											
								</div>
										
								</div>
							</div>
							
						
							<input type="submit" value="SUBMIT"
								class="btn btn-info btn-block"/>
							
						</form:form>
						
						
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-15 col-sm-10 col-md-1 col-sm-offset-1 col-md-offset-2">
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
    <c:choose>
    <c:when test="${not empty listproduct}">
      <c:forEach var="product" items="${listproduct}">
			    <tr>
			    				<td>${product.productid}</td>
								<td>${product.name}</td>
								<td>${product.description}</td>
								<td>${product.price}</td>
								<td>${product.category.name}</td>
								<td>${product.supplier.name}</td>
								<td><a href="editproduct/${product.productid}">Edit</a></td>
								<td><a href="deleteproduct/${product.productid}">Delete</a></td>
			 </tr>
			 </c:forEach>
			 </c:when>
			 <c:otherwise>
			 <tr><td>${msg}</td></tr>
			 </c:otherwise>
			 </c:choose>
	</tbody>
	
	</table>
	
						
						</div>
						</div>
						<br>
						<footer>
						
						<br>
						<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
						</footer>
					
					