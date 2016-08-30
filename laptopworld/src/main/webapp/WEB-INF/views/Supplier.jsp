<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<title>Laptop World Supplier</title>
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
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-2">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Supplier</h3>
					</div>
					<div class="panel-body">
						<form:form role="form" action="${pageContext.request.contextPath}/savesupplier" modelAttribute="supplier">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
								<%--<c:choose>
								 	<c:when test="${! empty supplier.name}">
 --%>									<div class="form-group">
									<div class="form-group">
									 Enter Supplier Id
										<form:input type="text" path="supplierid" id="Supplier Id"
											class="form-control input-sm" placeholder="Supplier Id"/>
									</div>
									<%-- </c:when>
									</c:choose> --%>
									<div class="form-group">
									Enter Supplier Name
										<form:input type="text" path="name" id="Suppliername"
											class="form-control input-sm" placeholder="Supplier Name"/>
									</div>
									<div class="form-group">
									Enter Address
										<form:input type="text" path="supplieraddress" id="Address"
											class="form-control input-sm" placeholder="Address"/>
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
				class="col-xs-15 col-sm-10 col-md-5 col-sm-offset-1 col-md-offset-2">
				<div class="panel panel-info">
			
					<div class="panel-heading" >
						<h3 class="panel-title">Supplier</h3>
					</div>
					<div class="panel-body">
	<table class="table table-condensed">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>ADDRESS</th>
                 
      </tr>
    </thead>
    <tbody>
     <c:forEach var="supplier" items="${listsupplier}">
			    <tr>
			    				<td>${supplier.supplierid}</td>
								<td>${supplier.name}</td>
								<td>${supplier.supplieraddress}</td>
								<td><a href="editsup/${supplier.supplierid}">Edit</a></td>
								<td><a href="deletesup/${supplier.supplierid}">Delete</a></td>
			 </tr>
			 </c:forEach>
       <!--  <tr>
        <td>S3211</td>
        <td>Camcs</td>
        <td>Camac street Kolkata</td>
    
         <td><a href="#">Delete</a></td>
      </tr> -->
	</tbody>
	</table>
						
						</div>
						</div>	
						<footer>
					<b>
						
						<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
				</footer>
				</b>
			</div>