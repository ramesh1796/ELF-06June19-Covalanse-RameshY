package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createemployeeinfo2")
public class CreateEmployeeInfoServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
		bean.setEmail(req.getParameter("email"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setPhone(Long.parseLong(req.getParameter("phone")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountNo")));
		bean.setDesigtnation(req.getParameter("designation"));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("departmentId")));
		bean.setManagerId(Integer.parseInt(req.getParameter("managerId")));
		bean.setGender(req.getParameter("gender"));
		bean.setPassword(req.getParameter("password"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		try {
			bean.setJoiningDate(format.parse(req.getParameter("joiningDate")));
			bean.setDob(format.parse(req.getParameter("dob")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		// Interact with DB & get the Employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		//PrintWriter out = resp.getWriter();
		RequestDispatcher dispatcher= null;
		resp.setContentType("text/html");
		if (dao.createEmployeeInfo(bean)) {
			String url= "empinfo.html?msg=Employee Successfully created";
			dispatcher= req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
		} else {
			String url= "empinfo.html?msg=Somthing went wrong again fill form and submit it!!";
			dispatcher= req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
		}
	}// end of doGet
}// end of class
