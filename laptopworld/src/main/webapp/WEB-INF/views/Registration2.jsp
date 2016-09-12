<html>
<head>
<title>Laptop World Registration</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<br>
	

	<div class="col-sm-3 col-md-5">
<img src="${pageContext.request.contextPath}/resources/images/register.jpg" width="200" height="200" >

	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-5 col-sm-offset-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Register</h3>
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
									Enter User Name
										<input type="text" name="user_name" id="user_name"
											class="form-control input-sm" placeholder="User Name">
									</div>
									<div class="form-group">
									Enter Email
										<input type="email" name="email" id="email"
											class="form-control input-sm" placeholder="Email Address">
									</div>
									<div class="form-group">
									Enter Password
										<input type="password" name="password" id="password"
											class="form-control input-sm" placeholder="Password">
									</div>
									<div class="form-group">
									Enter Phone Number
										<input type="phone_number" name="phone_number"
											id="phone_number" class="form-control input-sm"
											placeholder="Phone Number">
									</div>
														
							<div class="form-group">
									Enter Address
										<input type="Address" name="Address"
											id="Address" class="form-control input-sm"
											placeholder="Address">
									</div>
									
									<div class="form-group">
									Enter Role
										<input type="Role" name="Role"
											id="Role" class="form-control input-sm"
											placeholder="Role">
									</div>
							</div>
							</div>
						
							<a href="login" class="btn btn-info" role="Register">Register</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	
	<footer>
		<b>
			
			<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
			</b>
	</footer>
	
	
</body>
</html>