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
			<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="http://placehold.it/100x100" alt="..." class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">Product 1</h4>
										<p>Enter Product Details</p>
									</div>
								</div>
							</td>
							<td data-th="Price">Rs500</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="2">
							</td>
							<td data-th="Subtotal" class="text-center">Rs1000</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Total </strong></td>
						</tr>
						<tr>
							<td><a href="homee" class="btn btn-warning"role="continue shopping"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total Rs1000</strong></td>
							<td><a href="paymentpage" class="btn btn-info" role="checkout">Checkout</a> <i class="fa fa-angle-right"></i></a></td>
						</tr>
						</tfoot>
						</table>
						<br>
						<br>
		<footer>
			
			<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
		</footer>
		</div>