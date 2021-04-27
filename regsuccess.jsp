<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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


		<div class="row" style="">
			<div class="col-md-3">
				<%@include file="left.jsp"%>
			</div>


			<div class="col-md">
				<div class="card-body">

					<li>用户名： ${username};</li>
					<li>密码： ${password};</li>
					<li>用户名： ${caddress};</li>
					<li>密码： ${cphone};</li>

				</div>

			</div>


			<div class="col-md-3">
				<%@include file="right.jsp"%>
			</div>

		</div>


	</div>
</body>
</html>