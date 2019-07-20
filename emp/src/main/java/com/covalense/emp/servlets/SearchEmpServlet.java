package com.covalense.emp.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/searchemp")
//@WebServlet("/search/employeeSearch")
public class SearchEmpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// validate the session

		String idValue = req.getParameter("id");
		// Interact with DB & get the Employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		List<EmployeeInfoBean> emplId= dao.searchById(idValue);
		PrintWriter out = resp.getWriter();
		RequestDispatcher dispatcher = null;
		resp.setContentType("text/html");
        //validate the session
		HttpSession httpSession = req.getSession(false);
		if (httpSession == null) {
			// Invalid session; Generate Login Page
			out.print("<h1><span style=\"color:Green\">" + " Invalid session or Session is expired" + "</span>" + "</h1>");
			out.print("<BR><BR>");
			dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}else {
			out.print("<HTML>");
			out.print("<BODY><BR><BR>");
			dispatcher = req.getRequestDispatcher("searchemp.html");
			dispatcher.include(req, resp);
			out.print("<div class=\"col-lg-4 offset-4\">");
			out.print("<h1><span style=\"color:Green\">" + " Employee Found" + "</span>" + "</h1>");
			for (EmployeeInfoBean empId : emplId) {
				out.print("<span style=\"color:Green\">"+"<a href=\"./search\">"+"EmpId:-"+ empId.getId() +"</a>"+ "</span>");
				out.print("<BODY><BR><BR>");
			}
			out.print("</div>");
			out.print("</BODY>");
			out.print("</HTML>");
		}

	}// end of doGet
}// end of class
