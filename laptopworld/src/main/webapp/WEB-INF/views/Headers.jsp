<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html lang="en">


<head>

<title>Laptop World</title>

<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" 

href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<script
 
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script 

src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style type="text/css">
body { background: #FEFCFD !important; } /* Adding !important forces the browser to overwrite the default style applied by Bootstrap */
</style>

</head>
<body>
<br>
<br>

<nav class="navbar navbar-white navbar--top">

<div class="container-fluid">
<div class="navbar-header">
<div class="dropdown">
<a class="navbar-brand" href="home">Laptop World</a>
</div>
<ul class="nav navbar-nav">
<li class="active"><a href="home">Home</a></li>

<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="product">Product <span class="caret"></span></a>
<ul class="dropdown-menu">
 <c:forEach items="${listcategorynames}" var="categoryname">
<li><a href="#"> <c:out value="${categoryname}"></c:out></a></li>
 </c:forEach>


</ul>

<li><a href="aboutus">About Us</a></li>
<li><a href="login">Logout</a></li>


<li align="right"><a href="#">Welcome ${sessionScope.user.name}</a></li>
</div>
</nav>
<div class="row">
<div class="col-sm-14">
<img src="${pageContext.request.contextPath}/resources/images/loop.jpg" width="100%" height="274">/>
</div>


</div>
</div>
<br>
<br>

</body>
</html>