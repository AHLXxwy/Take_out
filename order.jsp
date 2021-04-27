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
}
.media-bordered {
        border: 1px solid black; /* 整体表格边框 */
    }
</style>

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
				<c:forEach items="${orders}" var="item">
					<div class="media media-bordered">

						<a class="media-left" href="#">  <img src="${item.fimgsrc}">
						</a>
						<div class="media-body">

					<p class="media-heading">${item.fname}</p>
							<p>价格：${item.fprice}元</p>
							<p>${item.cname}</p>
							<p>配送地址：${item.caddress}</p>
							<p>联系电话：${item.cphone}</p>
						</div>
					</div>
					<br>
				</c:forEach>
			</div>
			<div class="col-md-3">
				




			</div>

		</div>


	</div>
</body>
</html>