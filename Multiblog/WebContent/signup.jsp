<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
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
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href='./css/google_font_css.css' rel='stylesheet' type='text/css'>
<link href='./css/font_css.css' rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/clean-blog.min.css" rel="stylesheet">

<!-- sign-in style for this template -->
<link href="css/signup.css" rel="stylesheet">
<script>
function checkz() {
    	
    	var getIntro = $("#intro").val().replace(/\s|/gi,'');
        var hobbyCheck = false;
        var getMail = RegExp(/^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/);
        var getCheck= RegExp(/^[a-zA-Z0-9]{4,12}$/);
        var getName= RegExp(/^[가-힣]+$/);
        var fmt = RegExp(/^\d{6}[1234]\d{6}$/); //형식 설정
        var buf = new Array(13); //주민등록번호 배열
            //alert("ok");
        //이메일 공백 확인
        if($("#email").val() == ""){
          alert("이메일을 입력해주세요");
          $("#email").focus();
          return false;
        }
             
        //이메일 유효성 검사
        if(!getMail.test($("#email").val())){
          alert("이메일형식에 맞게 입력해주세요")
          $("#email").val("");
          $("#email").focus();
          return false;
        }
        //비밀번호
        if(!getCheck.test($("#psw").val())) {
        alert("형식에 맞춰서 PW를 입력해줘용");
        $("#psw").val("");
        $("#psw").focus();
        return false;
        }
      //아이디랑 비밀번호랑 같은지
        if ($("#email").val()==($("#psw").val())) {
        alert("비밀번호가 ID와 똑같으면 안!대!");
        $("#psw").val("");
        $("#psw").focus();
      }
      //비밀번호 똑같은지
        if($("#psw").val() != ($("#psw-repeat").val())){ 
        alert("비밀번호가 틀렸네용.");
        $("#psw").val("");
        $("#psw-repeat").val("");
        $("#psw").focus();
        return false;
       }
    }
</script>

</head>

<body>

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
		style="background-image: url('img/contact-bg.jpg')">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="page-heading">
						<h1>Sgin In</h1>
						<span class="subheading">가입하고 당신의 생각을 적어보세요.</span>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- Main Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-md-10 mx-auto" >
			<div style="text-align: center">
				<p>Sgin-Up 버튼을 눌러주세요.</p>
				<!-- Contact Form - Enter your email address on line 19 of the mail/contact_me.php file to make this form work. -->
				<!-- WARNING: Some web hosts do not allow emails to be sent through forms to common mail hosts like Gmail or Yahoo. It's recommended that you use a private domain email address! -->
				<!-- To use the contact form, your site must be on a live web host with PHP! The form will not work locally! -->
				<button
					onclick="document.getElementById('id01').style.display='block'"
					style="width: 50%;">Sign Up</button>
				</div>
				<div id="id01" class="modal">

					<form class="modal-content" action="/Multiblog/signup_status">
						<div class="container">
							<h1>Sign Up</h1>
							<p>항목을 입력해주세요.</p>
							<hr>
							<label for="email"><b>Email</b></label> <input type="text"
								placeholder="Email을 입력해주세요." id="email" name="email" required>
							<label for="psw"><b>Password</b></label> <input type="password"
								placeholder="비밀번호를 입력해주세요." id="psw" name="psw" required>
							<label for="psw-repeat"><b>Repeat Password</b></label> <input
								type="password" placeholder="다시 한번 입력해주세요." id="psw-repeat"
								name="psw-repeat" required>
							<!-- 8. address
      10 : 경기도
      20 : 전라도
      30 : 경상도
       -->

							<div class="form-group">
								<label for="inputAddr" class="col-sm-2 control-label">Address</label>
								<div class="col-sm-9">
									<div class="btn-group btn-group-toggle" data-toggle="buttons"
										id="inputAddr">
										<label class="btn btn-secondary active"> <input
											type="radio" name="addr" value="10" autocomplete="off"
											checked> 경기도
										</label> <label class="btn btn-secondary"> <input type="radio"
											name="addr" value="20" autocomplete="off"> 전라도
										</label> <label class="btn btn-secondary"> <input type="radio"
											name="addr" value="30" autocomplete="off"> 경상도
										</label>
									</div>
									<p class="col-sm-1"></p>
								</div>
							</div>

							<!-- 9. hobby
      10 : 수영
      20 : 음악감상
      30 : 공부
       -->

							<div class="form-group">
								<label for="inputHobbies" class="col-sm-2 control-label">Hobby</label>
								<div class="col-sm-9">
									<div class="btn-group btn-group-toggle" data-toggle="buttons"
										id="inputHobbies">
										<label class="btn btn-secondary active"> <input
											type="checkbox" name="hobbies1" value="10"> 수영
										</label> <label class="btn btn-secondary"> <input
											type="checkBox" name="hobbies2" value="20"> 음악감상
										</label> <label class="btn btn-secondary"> <input
											type="checkBox" name="hobbies3" value="30"> 공부
										</label>
									</div>
									<p class="col-sm-1"></p>
								</div>
							</div>

							<div class="clearfix">
								<button type="button"
									onclick="document.getElementById('id01').style.display='none'"
									class="cancelbtn">Cancel</button>
								<button type="submit" class="signupbtn"
									onclick="location.href='http://70.12.115.68:8081/Multiblog/signup_status' ">Sign
									Up</button>
							</div>

						</div>
					</form>
				</div>

				<script>
					// Get the modal
					var modal = document.getElementById('id01');

					// When the user clicks anywhere outside of the modal, close it
					window.onclick = function(event) {
						if (event.target == modal) {
							modal.style.display = "none";
						}
					}
				</script>
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
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Contact Form JavaScript -->
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/contact_me.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/clean-blog.min.js"></script>

</body>

</html>
