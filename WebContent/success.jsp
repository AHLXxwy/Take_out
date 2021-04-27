<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap-4.4.1-dist/css/bootstrap.min.css">
<script src="jquery-3.0.0.min.js"></script>
<script src="popper.min.js"></script>
<script src="bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>

</head>
<body>
<!--页面总容器-->
<div class="container">

<%@include file="nav.jsp"%>


	<div class="row" style="margin">
	    <div class="col-md-3">
		   <%@include file="left.jsp"%>
		</div>  
		    
		    
		<div class="col-md">
			 <div class="card" style="width: 18rem;position:relative;top:50px">
				<div class="card-header">
				用户登录
				</div>
			 <div class="card-body">
			 

			<h2>Success</h2>			
			 </div>
			 </div>
		</div>

		    
		<div class="col-md-3">
		     <%@include file="right.jsp"%>
	</div>
		    
	  </div>

 
</div>
</body>
</html>