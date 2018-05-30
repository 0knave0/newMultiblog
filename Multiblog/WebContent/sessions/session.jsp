<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Clean Blog - MultiCampus Theme</title>

<!-- Bootstrap core CSS -->
<link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="../vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href='../css/google_font_css.css' rel='stylesheet' type='text/css'>
<link href='../font_css.css' rel='stylesheet' type='text/css'>


<!-- Custom styles for this template -->
<link href="../css/clean-blog.min.css" rel="stylesheet">
<!-- Login css -->
<link rel="stylesheet" href="../css/css_login.css">

<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>



</head>

<body>
	<%@ page import="javabean.MemberBean"%>
	<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		MemberBean memberBean = new MemberBean();
		boolean rightAccount = memberBean.getRightAccount(email, password);
		boolean flag = false;
		if (rightAccount == true) {
			System.out.println("Session userID :" + request.getParameter("email"));
			session.setAttribute("userID", email);
			response.sendRedirect("http://70.12.115.68:8081/Multiblog/index.jsp");
		} else {
			%>
			

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="http://70.12.115.68:8081/Multiblog/index.jsp">MultiCampus</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fa fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="http://70.12.115.68:8081/Multiblog/index.jsp">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="http://70.12.115.68:8081/Multiblog/about.jsp">About</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="http://70.12.115.68:8081/Multiblog/signup.jsp">Sing-Up</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="http://70.12.115.68:8081/Multiblog/login.jsp">Login</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Header -->
	<header class="masthead"
		style="background-image: url('../img/home-bg.jpg')">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="site-heading">
						<h1></h1>
						<span class="subheading"></span>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- Main Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-md-10 mx-auto">
				<div class="col-sm-12 text-right">
					<div class="container-fluid text-center login">
						<div class="login">
							<div class="container-fluid">
								<div class="col-lg-12 login-box">
									<!-- right-box -->
									<div class="col-lg-6 right-box" style="padding-top:30%">
										<% String host = request.getContextPath(); %>
										
										<form role="form" action="<%=host %>/login.jsp" method="GET">
										
										<h3>ID와 비밀번호를<br>
										확인해주세요.</h3>

											<div class="login-button">
												<button class="btn btn-default" type="submit">로그인 창으로 돌아가기</button>
											</div>

									
										</form>
									</div>

								</div>
								<!--col-lg-8-->
							</div>
						</div>


					</div>
				</div>
			</div>
		</div>
	</div>

	<hr>

	<!-- Footer -->
	<footer>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<ul class="list-inline text-center">
						<li class="list-inline-item"><a
							href="https://twitter.com/?lang=ko"> <span
								class="fa-stack fa-lg"> <i
									class="fa fa-circle fa-stack-2x"></i> <i
									class="fa fa-twitter fa-stack-1x fa-inverse"></i>
							</span>
						</a></li>
						<li class="list-inline-item"><a
							href="https://ko-kr.facebook.com/"> <span
								class="fa-stack fa-lg"> <i
									class="fa fa-circle fa-stack-2x"></i> <i
									class="fa fa-facebook fa-stack-1x fa-inverse"></i>
							</span>
						</a></li>
					</ul>
					<p class="copyright text-muted">Copyright &copy; Your Website
						2018</p>
				</div>
			</div>
		</div>
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="../vendor/jquery/jquery.min.js"></script>
	<script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="../js/clean-blog.min.js"></script>

			<% 
			
		}
	%>
</body>

</html>
