package blog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/signup")
public class SignUpServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String host = request.getContextPath();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"EUC-KR\">\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"<meta name=\"viewport\"\r\n" + 
				"	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"<meta name=\"description\" content=\"\">\r\n" + 
				"<meta name=\"author\" content=\"\">\r\n" + 
				"\r\n" + 
				"<title>Clean Blog - MultiCampus Theme</title>\r\n" + 
				"\r\n" + 
				"<!-- Bootstrap core CSS -->\r\n" + 
				"<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n" + 
				"\r\n" + 
				"<!-- Custom fonts for this template -->\r\n" + 
				"<link href=\"vendor/font-awesome/css/font-awesome.min.css\"\r\n" + 
				"	rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"<link href='./css/google_font_css.css' rel='stylesheet' type='text/css'>\r\n" + 
				"<link href='./css/font_css.css' rel='stylesheet' type='text/css'>\r\n" + 
				"\r\n" + 
				"<!-- Custom styles for this template -->\r\n" + 
				"<link href=\"css/clean-blog.min.css\" rel=\"stylesheet\">\r\n" + 
				"\r\n" + 
				"<!-- sign-in style for this template -->\r\n" + 
				"<link href=\"css/signup.css\" rel=\"stylesheet\">\r\n" + 
				"<script>\r\n" + 
				"function checkz() {\r\n" + 
				"    	\r\n" + 
				"    	var getIntro = $(\"#intro\").val().replace(/\\s|/gi,'');\r\n" + 
				"        var hobbyCheck = false;\r\n" + 
				"        var getMail = RegExp(/^[A-Za-z0-9_\\.\\-]+@[A-Za-z0-9\\-]+\\.[A-Za-z0-9\\-]+/);\r\n" + 
				"        var getCheck= RegExp(/^[a-zA-Z0-9]{4,12}$/);\r\n" + 
				"        var getName= RegExp(/^[가-힣]+$/);\r\n" + 
				"        var fmt = RegExp(/^\\d{6}[1234]\\d{6}$/); //형식 설정\r\n" + 
				"        var buf = new Array(13); //주민등록번호 배열\r\n" + 
				"            //alert(\"ok\");\r\n" + 
				"        //이메일 공백 확인\r\n" + 
				"        if($(\"#email\").val() == \"\"){\r\n" + 
				"          alert(\"이메일을 입력해주세요\");\r\n" + 
				"          $(\"#email\").focus();\r\n" + 
				"          return false;\r\n" + 
				"        }\r\n" + 
				"             \r\n" + 
				"        //이메일 유효성 검사\r\n" + 
				"        if(!getMail.test($(\"#email\").val())){\r\n" + 
				"          alert(\"이메일형식에 맞게 입력해주세요\")\r\n" + 
				"          $(\"#email\").val(\"\");\r\n" + 
				"          $(\"#email\").focus();\r\n" + 
				"          return false;\r\n" + 
				"        }\r\n" + 
				"        //비밀번호\r\n" + 
				"        if(!getCheck.test($(\"#psw\").val())) {\r\n" + 
				"        alert(\"형식에 맞춰서 PW를 입력해줘용\");\r\n" + 
				"        $(\"#psw\").val(\"\");\r\n" + 
				"        $(\"#psw\").focus();\r\n" + 
				"        return false;\r\n" + 
				"        }\r\n" + 
				"      //아이디랑 비밀번호랑 같은지\r\n" + 
				"        if ($(\"#email\").val()==($(\"#psw\").val())) {\r\n" + 
				"        alert(\"비밀번호가 ID와 똑같으면 안!대!\");\r\n" + 
				"        $(\"#psw\").val(\"\");\r\n" + 
				"        $(\"#psw\").focus();\r\n" + 
				"      }\r\n" + 
				"      //비밀번호 똑같은지\r\n" + 
				"        if($(\"#psw\").val() != ($(\"#psw-repeat\").val())){ \r\n" + 
				"        alert(\"비밀번호가 틀렸네용.\");\r\n" + 
				"        $(\"#psw\").val(\"\");\r\n" + 
				"        $(\"#psw-repeat\").val(\"\");\r\n" + 
				"        $(\"#psw\").focus();\r\n" + 
				"        return false;\r\n" + 
				"       }\r\n" + 
				"    }\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<!-- Navigation -->\r\n" + 
				"	<nav class=\"navbar navbar-expand-lg navbar-light fixed-top\"\r\n" + 
				"		id=\"mainNav\">\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"			<a class=\"navbar-brand\" href=\"index.html\">MultiCampus</a>\r\n" + 
				"			<button class=\"navbar-toggler navbar-toggler-right\" type=\"button\"\r\n" + 
				"				data-toggle=\"collapse\" data-target=\"#navbarResponsive\"\r\n" + 
				"				aria-controls=\"navbarResponsive\" aria-expanded=\"false\"\r\n" + 
				"				aria-label=\"Toggle navigation\">\r\n" + 
				"				Menu <i class=\"fa fa-bars\"></i>\r\n" + 
				"			</button>\r\n" + 
				"			<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n" + 
				"				<ul class=\"navbar-nav ml-auto\">\r\n" + 
				"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\">Home</a>\r\n" + 
				"					</li>\r\n" + 
				"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"about.html\">About</a>\r\n" + 
				"					</li>\r\n" + 
				"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"sign_up.html\">Sing-Up</a>\r\n" + 
				"					</li>\r\n" + 
				"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"login.html\">Login</a>\r\n" + 
				"					</li>\r\n" + 
				"				</ul>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</nav>\r\n" + 
				"\r\n" + 
				"	<!-- Page Header -->\r\n" + 
				"	<header class=\"masthead\"\r\n" + 
				"		style=\"background-image: url('img/contact-bg.jpg')\">\r\n" + 
				"		<div class=\"overlay\"></div>\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"			<div class=\"row\">\r\n" + 
				"				<div class=\"col-lg-8 col-md-10 mx-auto\">\r\n" + 
				"					<div class=\"page-heading\">\r\n" + 
				"						<h1>Sgin In</h1>\r\n" + 
				"						<span class=\"subheading\">가입하고 당신의 생각을 적어보세요.</span>\r\n" + 
				"					</div>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</header>\r\n" + 
				"\r\n" + 
				"	<!-- Main Content -->\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"col-lg-8 col-md-10 mx-auto\">\r\n" + 
				"				<p>Sgin-Up 버튼을 눌러주세요.</p>\r\n" + 
				"				<!-- Contact Form - Enter your email address on line 19 of the mail/contact_me.php file to make this form work. -->\r\n" + 
				"				<!-- WARNING: Some web hosts do not allow emails to be sent through forms to common mail hosts like Gmail or Yahoo. It's recommended that you use a private domain email address! -->\r\n" + 
				"				<!-- To use the contact form, your site must be on a live web host with PHP! The form will not work locally! -->\r\n" + 
				"				<button\r\n" + 
				"					onclick=\"document.getElementById('id01').style.display='block'\"\r\n" + 
				"					style=\"width: 50%;\">Sign Up</button>\r\n" + 
				"\r\n" + 
				"				<div id=\"id01\" class=\"modal\">\r\n" + 
				"\r\n" + 
				"					<form class=\"modal-content\" action=\""+host+"/signup_status\" method=\"POST\">\r\n" + 
				"						<div class=\"container\">\r\n" + 
				"							<h1>Sign Up</h1>\r\n" + 
				"							<p>항목을 입력해주세요.</p>\r\n" + 
				"							<hr>\r\n" + 
				"							<label for=\"email\"><b>Email</b></label> <input type=\"text\"\r\n" + 
				"								placeholder=\"Email을 입력해주세요.\" id=\"email\" name=\"email\"  required> <label\r\n" + 
				"								for=\"psw\"><b>Password</b></label> <input type=\"password\"\r\n" + 
				"								placeholder=\"비밀번호를 입력해주세요.\" id=\"psw\" name=\"psw\" required> <label\r\n" + 
				"								for=\"psw-repeat\"><b>Repeat Password</b></label> <input\r\n" + 
				"								type=\"password\" placeholder=\"다시 한번 입력해주세요.\" id=\"psw-repeat\" name=\"psw-repeat\"\r\n" + 
				"								required>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!-- 8. address\r\n" + 
				"      10 : 경기도\r\n" + 
				"      20 : 전라도\r\n" + 
				"      30 : 경상도\r\n" + 
				"       -->\r\n" + 
				"\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"inputAddr\" class=\"col-sm-2 control-label\">Address</label>\r\n" + 
				"								<div class=\"col-sm-9\">\r\n" + 
				"									<div class=\"btn-group btn-group-toggle\" data-toggle=\"buttons\"\r\n" + 
				"										id=\"inputAddr\">\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"00\" autocomplete=\"off\"> 서울\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"10\" autocomplete=\"off\"> 경기도\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"20\" autocomplete=\"off\"> 충청도\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"30\" autocomplete=\"off\"> 강원도\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"40\" autocomplete=\"off\"> 전라도\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"50\" autocomplete=\"off\"> 경상도\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input type=\"radio\"\r\n" + 
				"											name=\"addr\" value=\"60\" autocomplete=\"off\"> 제주도\r\n" + 
				"										</label>\r\n" + 
				"									</div>\r\n" + 
				"									<p class=\"col-sm-1\"></p>\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"\r\n" + 
				"							<!-- 9. hobby\r\n" + 
				"      10 : 수영\r\n" + 
				"      20 : 음악감상\r\n" + 
				"      30 : 공부\r\n" + 
				"       -->\r\n" + 
				"\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"inputHobbies\" class=\"col-sm-2 control-label\">Hobby</label>\r\n" + 
				"								<div class=\"col-sm-9\">\r\n" + 
				"									<div class=\"btn-group btn-group-toggle\" data-toggle=\"buttons\"\r\n" + 
				"										id=\"inputHobbies\">\r\n" + 
				"										<label class=\"btn btn-secondary active\"> <input\r\n" + 
				"											type=\"checkbox\" name=\"hobby01\" value=\"10\"> 수영\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input\r\n" + 
				"											type=\"checkBox\" name=\"hobby02\" value=\"20\"> 음악감상\r\n" + 
				"										</label> <label class=\"btn btn-secondary\"> <input\r\n" + 
				"											type=\"checkBox\" name=\"hobby03\" value=\"30\"> 공부\r\n" + 
				"										</label>\r\n" + 
				"									</div>\r\n" + 
				"									<p class=\"col-sm-1\"></p>\r\n" + 
				"								</div>\r\n" + 
				"							</div>" +
				"							<div class=\"clearfix\">\r\n" + 
				"								<button type=\"button\"\r\n" + 
				"									onclick=\"document.getElementById('id01').style.display='none'\"\r\n" + 
				"									class=\"cancelbtn\">Cancel</button>\r\n" + 
				"								<button type=\"submit\" class=\"signupbtn\">Sign Up</button>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</form>\r\n" + 
				"				</div>\r\n" + 
				"\r\n" + 
				"				<script>\r\n" + 
				"					// Get the modal\r\n" + 
				"					var modal = document.getElementById('id01');\r\n" + 
				"\r\n" + 
				"					// When the user clicks anywhere outside of the modal, close it\r\n" + 
				"					window.onclick = function(event) {\r\n" + 
				"						if (event.target == modal) {\r\n" + 
				"							modal.style.display = \"none\";\r\n" + 
				"						}\r\n" + 
				"					}\r\n" + 
				"				</script>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"\r\n" + 
				"	<hr>\r\n" + 
				"\r\n" + 
				"	<!-- Footer -->\r\n" + 
				"	<footer>\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"			<div class=\"row\">\r\n" + 
				"				<div class=\"col-lg-8 col-md-10 mx-auto\">\r\n" + 
				"					<ul class=\"list-inline text-center\">\r\n" + 
				"						<li class=\"list-inline-item\"><a\r\n" + 
				"							href=\"https://twitter.com/?lang=ko\"> <span\r\n" + 
				"								class=\"fa-stack fa-lg\"> <i\r\n" + 
				"									class=\"fa fa-circle fa-stack-2x\"></i> <i\r\n" + 
				"									class=\"fa fa-twitter fa-stack-1x fa-inverse\"></i>\r\n" + 
				"							</span>\r\n" + 
				"						</a></li>\r\n" + 
				"						<li class=\"list-inline-item\"><a\r\n" + 
				"							href=\"https://ko-kr.facebook.com/\"> <span\r\n" + 
				"								class=\"fa-stack fa-lg\"> <i\r\n" + 
				"									class=\"fa fa-circle fa-stack-2x\"></i> <i\r\n" + 
				"									class=\"fa fa-facebook fa-stack-1x fa-inverse\"></i>\r\n" + 
				"							</span>\r\n" + 
				"						</a></li>\r\n" + 
				"					</ul>\r\n" + 
				"					<p class=\"copyright text-muted\">Copyright &copy; Your Website\r\n" + 
				"						2018</p>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</footer>\r\n" + 
				"\r\n" + 
				"	<!-- Bootstrap core JavaScript -->\r\n" + 
				"	<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n" + 
				"	<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n" + 
				"\r\n" + 
				"	<!-- Contact Form JavaScript -->\r\n" + 
				"	<script src=\"js/jqBootstrapValidation.js\"></script>\r\n" + 
				"	<script src=\"js/contact_me.js\"></script>\r\n" + 
				"\r\n" + 
				"	<!-- Custom scripts for this template -->\r\n" + 
				"	<script src=\"js/clean-blog.min.js\"></script>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>\r\n" + 
				"");
		
	}
	
}
