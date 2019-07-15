package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{

@Override
protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException {
	
	EmployeeInfoBean bean= new EmployeeInfoBean();
	bean.setId(166);
	bean.setName("Rohan");
	bean.setAge(24);
	bean.setGender("Male");	
	//Pass the above object to employeeSearchServlet
	//req.setAttribute("info", bean);
	ServletContext ctx = getServletContext();
	ctx.setAttribute("info", bean);
	
	String url ="search?id=1";
	RequestDispatcher dispatcher= req.getRequestDispatcher(url);
	dispatcher.forward(req,resp);

}//end of Get
}//end of class