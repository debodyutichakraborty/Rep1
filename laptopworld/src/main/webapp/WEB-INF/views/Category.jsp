<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Laptop World Catagory</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<jsp:include page="Headers.jsp"></jsp:include>
	<br>
	<br>
	<a href="product">Product</a>|<a href="supplier">Supplier</a>|<a href="category">category</a>
	<br>
	<div class="container">
	
	<br>
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Category</h3>
					</div>
					<div class="panel-body">
						<form:form role="form" action="${pageContext.request.contextPath}/savecategory" modelAttribute="category" >
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<%--<c:choose>
								 	<c:when test="${! empty category.name}">
 --%>									<div class="form-group">
									 Enter Category Id
										<form:input type="text" path="categoryid" id="Category Id"
											class="form-control input-sm" placeholder="Category Id"/>
											
									</div>
									<%-- </c:when>
									</c:choose> --%>
									
									<div class="form-group">
									Enter Category Name
										<form:input type="text" path="name" id="Category name"
											class="form-control input-sm" placeholder="Category Name"/>
									</div>
									<div class="form-group">
									Enter Description
										<form:input type="text" path="categorydescription" id="Description"
											class="form-control input-sm" placeholder="Description"/>
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
				class="col-xs-15 col-sm-10 col-md-5 col-sm-offset-1 col-md-offset-3">
				<div class="panel panel-info">
			
					<div class="panel-heading" >
						<h3 class="panel-title">Category</h3>
					</div>
					<div class="panel-body">
	<table class="table table-condensed">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
                 
      </tr>
    </thead>
    <tbody>
			 <c:forEach var="category" items="${listcategory}">
			    <tr>
			    				<td>${category.categoryid}</td>
								<td>${category.name}</td>
								<td>${category.categorydescription}</td>
								<td><a href="edit/${category.categoryid}">Edit</a></td>
								<td><a href="delete/${category.categoryid}">Delete</a></td>
			 </tr>
			 </c:forEach>
  <!--     <tr>
        <td>C8988</td>
        <td>Inspiron</td>
        <td>Dell Laptop</td>
        
         <td><a href="#">Delete</a></td>
      </tr>
      <tr>
        <tr>
        <td>C3211</td>
        <td>Pro</td>
        <td>Mac Book</td>
    
         <td><a href="#">Delete</a></td>
      </tr> -->
	</tbody>
	</table>
						
						</div>
						</div>
				<br> <br> <br>
				<footer>
					<b>
						
						<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
				</footer>
				</b>
			</div>