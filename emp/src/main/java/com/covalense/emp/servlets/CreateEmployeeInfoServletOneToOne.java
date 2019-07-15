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
import com.covalense.emp.beans.EmployeeOtherInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;


@WebServlet("/createemployeeinfoOneToOne")
public class CreateEmployeeInfoServletOneToOne extends HttpServlet {
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
		
		EmployeeOtherInfoBean empOtherInf= new EmployeeOtherInfoBean();
		
		
		empOtherInf.setId(Integer.parseInt(req.getParameter("eid")));
		empOtherInf.setPan(req.getParameter("pancard"));
		empOtherInf.setMarried(Boolean.parseBoolean(req.getParameter("mstatus")));
		empOtherInf.setBloodGrp(req.getParameter("bloodgroup"));
		empOtherInf.setChallenged(Boolean.parseBoolean(req.getParameter("phstatus")));
		empOtherInf.setEmergencyContactNumber(Long.parseLong(req.getParameter("ecnNo")));
		empOtherInf.setEmergencyContactName(req.getParameter("ecnNm"));
		empOtherInf.setNationality(req.getParameter("nationality"));
		empOtherInf.setReligion(req.getParameter("religion"));
		empOtherInf.setFatherNm(req.getParameter("fatherNm"));
		empOtherInf.setMotherNm(req.getParameter("motherNm"));
		empOtherInf.setSpouseNm(req.getParameter("spouse"));
		empOtherInf.setPassport(req.getParameter("passportNo"));
		empOtherInf.setAdhaar(Long.parseLong(req.getParameter("aadhar")));
		
		bean.setOtherInfo(empOtherInf);

		// Interact with DB & get the Employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		//PrintWriter out = resp.getWriter();
		RequestDispatcher dispatcher= null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if (dao.createEmployeeInfo(bean)) {
			//String url= "empinfo.html?msg=Employee Successfully created";
			out.print("<h1><span style=\"color:Green\">" + "Record Successfully Inserted!!!!!! " + "</span>" + "</h1>");
			dispatcher= req.getRequestDispatcher("empinfo.html");
			dispatcher.include(req, resp);
		} else {
			//String url= "empinfo.html?msg=Somthing went wrong again fill form and submit it!!";
			out.print("<h1><span style=\"color:Red\">" + "Somthing went worng try again!!!!!! " + "</span>" + "</h1>");
			dispatcher= req.getRequestDispatcher("empinfo.html");
			dispatcher.include(req, resp);
		}
	}// end of doGet
}// end of class
