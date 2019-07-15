package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{

@Override
protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException {
	String url ="search?id=1";
	RequestDispatcher dispatcher= req.getRequestDispatcher(url);
	dispatcher.forward(req,resp);

}//end of Get
}//end of class