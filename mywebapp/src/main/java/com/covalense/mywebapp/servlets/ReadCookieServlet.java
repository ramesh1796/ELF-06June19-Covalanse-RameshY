package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet{

@Override
protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException {
	//get the cookies from Request
	Cookie[] receiveCookies = req.getCookies();

	PrintWriter out = resp.getWriter();
	if(receiveCookies==null) {
	out.print("Cookie are not Present !!!!!");
	}
	else {
		out.print("Cookie are  Present !!!!!");
		for(Cookie rcvdCookie:receiveCookies) {
			out.print("Cookie Name ===="+rcvdCookie.getName());
			out.print("Cookie Value ===="+rcvdCookie.getValue());
		}
	}
}//end of Get
}//end of class