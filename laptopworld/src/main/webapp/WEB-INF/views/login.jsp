<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Laptop World Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

	<jsp:include page="Header.jsp"></jsp:include>
	<br>

	
	<div class="col-sm-3 col-md-5">
<img src="${pageContext.request.contextPath}/resources/images/login.jpg"  width="200" height="150"  align="bottom">

<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Login Here</h3>
					</div>
					<div class="panel-body">
						<form action="<c:url value='/j_spring_security_check'/>" method="post">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
			    				<input type="text" id="username"  name="username" class="form-control input-sm" placeholder="Username"/>
			    			</div>
                            </div>
                            </div>
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password"  id="password" name="password" class="form-control input-sm" placeholder="Password"/>
			    					</div>
			    				</div>
			    				</div>
			    			
			    		<input type="submit" class="btn btn-info" value="Login"/>
			    		<input type="hidden" name="${_csrf.parameterName}"
			    		value="${_csrf.token}"/> 
			    		</form>
			    		<p><b>${msgreg}</b></p>
			    		<p><b>${msglogin}</b></p>
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div>
    <br>
      				<footer>
											
						&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;
				</footer>
				
			</div>
</body>
</html>
