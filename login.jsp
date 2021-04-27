<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="bootstrap-4.4.1-dist/css/bootstrap.min.css">
<script src="jquery-3.0.0.min.js"></script>
<script src="popper.min.js"></script>
<script src="bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>

<script>
$(function(){
	$("#regBtn").click(function(){
		let username=$("input[name='username']").val();
		let password=$("input[name='password']").val();
		let jym=$("input[name='vcode']").val();
		$.post("VerServlet",{jym:jym},function(){
			if(data=="ok"){
				$.post("Reg",{username:username,password:password},function(data){
					if(data=="success"){
						alert("注册成功");
					}
					else{
						alert(data);
					}
				})
			}
			else{
				alert("verf error")
			}
		})
		
	})
})
</script>
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
				<div class="card"
					style="width: 20rem; position: relative; top: 10px">
					<div class="card-header">用户登录</div>
					<div class="card-body">


						<form method="post" action="LoginServlet">
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-4 col-form-label">用户名</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" name="username"style="position:relative;right:40px">
								</div>
								
								<br>
								
							</div>
							<div class="form-group row">
								<label for="inputPassword" class="col-sm-4 col-form-label">密码</label>
								<div class="col-sm-8">
									<input type="password" class="form-control" id="inputPassword"
										placeholder="Password" name="password"style="position:relative;right:40px">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputPassword" class="col-sm-4 col-form-label">校验码</label>
								
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputPassword"
										placeholder="tcode" name="vcode"style="position: relative; right: 40px">
								</div>
								<div class="col-sm-2">
									<img id="codeimg"
										src="${pageContext.request.contextPath}/ResponseImage"
										style="position: relative; right: 55px">
								</div>
							</div>

							<div>${info}</div>
							<div style="text-align: center;">
								<button id="regBtn">登录</button>
							</div>
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