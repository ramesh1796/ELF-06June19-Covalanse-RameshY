package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	Cookie dummyCookie = new Cookie("dummyCookie","CheckCookiesEnabled");
	resp.addCookie(dummyCookie);
	PrintWriter out = resp.getWriter();
	RequestDispatcher dispatcher= null;
	resp.setContentType("text/html");
	HttpSession session = req.getSession(false);
	if(session==null) {
		out.print("<h1><span style=\"color:Red; margin-left:10px;\">"+"Session not present"+"</span>"+"</h1>");
		dispatcher= req.getRequestDispatcher("login.html");
		dispatcher.include(req, resp);
		
	}else {
			
		out.print("<h1><span style=\"color:Green; margin-left:10px;\">"+" session is not null "+"</span>"+"</h1>");
		req.getRequestDispatcher("login.html").include(req, resp); 
	}
}
}//end class
