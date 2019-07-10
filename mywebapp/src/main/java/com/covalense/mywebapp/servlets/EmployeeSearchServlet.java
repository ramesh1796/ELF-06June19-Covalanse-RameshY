package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;


@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet{
@Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	String idValue = req.getParameter("id");
	//Interact with DB & get the Employee info
	EmployeeDAO dao = EmployeeDAOFactory.getInstance();
	EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
	PrintWriter out = resp.getWriter();
	if(bean==null) {
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<h1><span style=\"color:red\">"+" Employee Not Found"+"</span>"+"</h1>");
		out.print("</BODY>");
		out.print("</HTML>");
	}
	else {
		out.print("<HTML>");
		out.print("<BODY><BR><BR>");
		out.print("<h1><span style=\"color:Green\">"+" Employee Found"+"</span>"+"</h1>");
		out.print("ID  " + bean.getId());
		out.print("<BR>Name " + bean.getAge());
		out.print("<BR>Email " + bean.getGender());
		out.print("<BR>Desigantion " + bean.getDesigtnation());
		out.print("<BR>DOB " + bean.getDob());
		out.print("<BR>AccountNo " + bean.getAccountNumber());
		out.print("<BR>DepartmentId " + bean.getDepartmentId());
		out.print("<BR>joiningdate " + bean.getJoiningDate());
		out.print("<BR>ManagerId "  + bean.getManagerId());
		out.print("<BR>Phone " + bean.getPhone());
		out.print("<BR>salary " + bean.getSalary());
		out.print("<BR>Age " + bean.getAge());
		out.print("</BODY>");
		out.print("</HTML>");
	}
}//end of doGet
}//end of class
