<!DOCTYPE html>
<html lang="en">
<head>
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
        <div class="col-xs-12 col-sm-6 col-md-4 col-sm-offset-2 col-md-offset-2">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">Make Payment </h3>
			 			</div>
			 			
			    					

<form action="" method="POST" id="payment-form">
  <span class="payment-errors"></span>

  <div class="form-row">
    <label>
       <h5> <b>                       
 
                    <input type=radio name=formOfPayment id=formOfPayment value=Net0 />

                    Enter Card No</h5> </b>   
      <input type="text" size="20" data-stripe="number">
    </label>
  </div>

  <div class="Section_Header">                    
 
                <h5> <b>                       
 
                    <input type=radio name=formOfPayment id=formOfPayment value=Net0 />

                    Cash On Delivery</h5> </b>              

            </div>            
  


  <td><a href="thanks" class="btn btn-info" role="proceed">Proceed</a>
</form>
</div>
</div>
</div>
		
		<br> <br>
		
		<footer>
		<p>&#169; Copyright 2000 - 2016 Laptop World.com &nbsp;</p>
		</footer>
		</div>