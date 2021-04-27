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
<style>
img{
height:80px;
width:80px;
}
body{
     backgroud:url(pic/background.jpg) no-repeat;
     background-size: cover;
    
}
</style>
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
			<img src="pic/take_out.jpg"style="width:500px;height:300px">
				<div class="row">
					<div class="col-sm">
						<a href="${pageContext.request.contextPath}/FoodList?ftype=food"><img src="pic/food.jpg" id="food"></a> <br>
						<label>美食</label>
					</div>
					<div class="col-sm">
						<a href="${pageContext.request.contextPath}/FoodList?ftype=sweet"><img src="pic/sweet.jpg" id="sweet"></a>
						<br> <label>甜品饮品</label>
					</div>
					<div class="col-sm">
						<a href="${pageContext.request.contextPath}/FoodList?ftype=fruit"><img src="pic/fruit.jpg" id="fruit"></a>
						<br> <label>水果</label>
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