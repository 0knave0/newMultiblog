<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap Core CSS -->
<link type="text/css" href="../resources/css/bootstrap.min.css"
	rel="stylesheet" />

<title>Edit</title>
</head>
<body>
	<%@ page import="javabean.MemberBean"%>
	<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		MemberBean memberBean = new MemberBean();
		boolean rightAccount = memberBean.getRightAccount(email, password);

		if (rightAccount == true) {
			System.out.println("Session userID :" + request.getParameter("email"));
			session.setAttribute("userID", email);
			response.sendRedirect("http://70.12.115.68:8081/Multiblog/index.jsp");
		} else {
			response.sendRedirect("http://70.12.115.68:8081/Multiblog/sessions/sessionDelete.jsp");
		}
	%>

</body>
</html>