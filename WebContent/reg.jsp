<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
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
			<div class="card" style="width: 30rem; position: relative; top: 10px">
			<div class="card-header">用户注册</div>
				 <div class="card-body">
				    <form action="RegAction" method="post">
					<div class="form-group">
					<p>用户名:<input type='text'name='username'class="form-control"></p>
					<p>密码:<input type='text'name='password'class="form-control"></p>
					<p>配送地址:<input type='text'name='caddress'class="form-control"></p>
					<p>联系方式:<input type='text'name='cphone'class="form-control"></p>
					</div>
					
					<input type='submit' value='注册'>
					</p>
				</form>
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