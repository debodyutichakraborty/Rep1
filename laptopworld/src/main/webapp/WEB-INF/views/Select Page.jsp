<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="row centered-form">
				<div
					class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Selected Item</h3>
						</div>
						<div class="panel-body">
							<form role="form">
								<div class="container">
									<div>
										<img src="${pageContext.request.contextPath}/resources/images/${selectedproduct.productid}.jpg"
											width="310" height="236"/>
									</div>
									
									<br>
									<br>
										<div class="form-group">
											<table class="table-striped" padding="8" cellspacing="4" width="310">
												<thead>
												<tr>
													<th align="center">Product</th>
													<th ><center>Details</center></th>
												</tr>
													</thead>
													<tbody>
													
												<tr>
													<th>Product ID</th>
													<td align="center">${selectedproduct.productid}</td>
												</tr>
												<tr>
													<th>Product name</th>
													<td align="center">${selectedproduct.name}</td>
												</tr>
												<tr>
													<th>Product price</th>
													<td align="center">${selectedproduct.price}</td>
												</tr>
												<tr>
													<th>Description</th>
													<td align="center">${selectedproduct.description}</td>
												</tr>
												<tr>
													<th>Supplier</th>
													<td align="center">${selectedproduct.supplier.name}</td>
												</tr>
												<tr>
													<th>Category</th>
													<td align="center">${selectedproduct.category.name}</td>
												</tr>
												</tbody>
											</table>
										</div>
									
									</div>
								</div>
								<a href="cart" class="btn btn-info" role="proceed">Proceed</a>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<footer>
			
			<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
		</footer>
	</div>