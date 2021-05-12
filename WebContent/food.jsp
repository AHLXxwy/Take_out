<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
}</style>

</head>
<body>
	<!--页面总容器-->
	<div class="container">

		<%@include file="nav.jsp"%>


		<div class="row" style="">
			<div class="col-md-3">
				<%@include file="left.jsp"%>
			</div>


			<div class="col-md">
				<c:forEach items="${foods}" var="item">
					<div class="media">

						<a class="media-left" href="ShoppingAddServlet?fname=${item.fname}&ftype=${item.ftype}">  <img src="${item.fimgsrc}">
						</a>
						<div class="media-body">
							<h5 class="media-heading">${item.tname}</h5>
							
							<p>${item.fname}</p>
							<p>食物价格：${item.fprice}元</p>
							<p>配送时间：${item.ftime}分钟</p>
						</div>


					</div>
				</c:forEach>
			</div>
			<div class="col-md-3">
				

<div class="card" style="width: 18rem;">
 <a href='#'> <img class="card-img-top" src="pic/shopping.jpg" alt="Card image cap"style='heigt:120px;width:120px'>
  <div class="card-body">
    <h5 class="card-title">购物车</h5>
   <c:forEach items="${shoppings1}" var="shop">
					<div class="media">

						<a class="media-left" href="ShoppingList">  <img src="${shop.fimgsrc}">
						</a>
						<div class="media-body">
						<h6 class="media-heading">${shop.fname}</h6>
							<p>价格：${shop.fprice}元</p>
							<p>配送时间：${shop.ftime}分钟</p>
						</div>
					</div>
				</c:forEach>
    <a href="OrderServlet" class="btn btn-primary">结算</a>
  </div>
</div>


			</div>

		</div>


	</div>
</body>
</html>
