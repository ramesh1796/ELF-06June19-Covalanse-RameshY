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
@WebServlet("/loginfail")
public class EmpLoginServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher dispatcher= null;
		resp.setContentType("text/html");
		
		int empId = Integer.parseInt(req.getParameter("id"));
		String empPass = req.getParameter("password");
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(empId);
		
		
		
		if (empPass.equals(bean.getPassword())) {
			String url= "LoginFail.jsp?msg=Login Success";
			dispatcher= req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);

		}else {
			
			String url= "/LoginFail.jsp?msg=UserName or password incorrect";
			dispatcher= req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
			}

	}

}
