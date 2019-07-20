package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createemployeeinfo")
public class CreateEmployeeInfoServlet extends HttpServlet {
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
		PrintWriter out = resp.getWriter();
		if (dao.createEmployeeInfo(bean)) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color:Green\">" + "Employee Created" + "</span>" + "</h1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY><BR><BR>");
			out.print("<h1><span style=\"color:Red\">" + " Employee Record Not inserted " + "</span>" + "</h1>");

			out.print("</BODY>");
			out.print("</HTML>");
		}
	}// end of doGet
}// end of class
