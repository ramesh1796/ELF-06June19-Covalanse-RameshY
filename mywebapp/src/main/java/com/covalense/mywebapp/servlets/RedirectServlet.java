package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet{

@Override
protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException {
	//String url="http://www.gmail.com";
	//String url="http://localhost/mywebapp/search?id=1";
	String url=" index.html";
	resp.sendRedirect(url);
}
}