package javabean;

import javax.servlet.http.HttpServlet;

public class MemberBean extends HttpServlet {
	String email;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String toString() {
		String concatStr=email+","+password;
		return concatStr;
	}
	public boolean getRightAccount(String email, String password) {
		boolean result;
		if(email.equals("otter.oh@gmail.com")&&password.equals("q1w2e3r4")) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
}
