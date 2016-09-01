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
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Enter Details</h3>
					</div>
					<div class="panel-body">
						<form role="form">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
									 Enter Name
										<input type="text" name="Name" id="Name"
											class="form-control input-sm" placeholder="Name">
									</div>
									<div class="form-group">
									Enter Address
										<input type="text" name="Address" id="Address"
											class="form-control input-sm" placeholder="Address">
									</div>
									<div class="form-group">
									Enter Email
										<input type="email" name="email" id="email"
											class="form-control input-sm" placeholder="Email Address">
									</div>
									
									<div class="form-group">
									Enter Phone Number
										<input type="phone_number" name="phone_number"
											id="phone_number" class="form-control input-sm"
											placeholder="Phone Number">
									</div>
								</div>
							</div>
							
						
							<input type="submit" value="Proceed "
								class="btn btn-info btn-block">
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