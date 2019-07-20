package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;

public class ViewProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		PrintWriter out = resp.getWriter();
		HttpSession httpSession = req.getSession();
		if(httpSession!=null) {
			EmployeeInfoBean bean= (EmployeeInfoBean)httpSession.getAttribute("bean");
			out.print("<!DOCTYPE html>");
			out.print(" <html lang=\"en\">");
			out.print(" <head>");
			out.print("<meta charset=\"UTF-8\">");
			out.print("<meta name=\"viewport\"content=\"width=device-width, initial-scale=1.0\">");
			out.print("<meta http-equiv=\"X-UA-Compatible\"content=\"ie=edge\">");
			out.print("<title>EmployeeDetails</title>");
			out.print("<scriptsrc=\"//code.jquery.com/jquery-1.10.2.js\"></script>");
			out.print("<link rel=\"stylesheet\"href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"");
			out.print("integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"crossorigin=\"anonymous\">");
			out.print("<script>");
			out.print(" $(function(){");
			out.print("$(\"#header\").load(\"../include/header.html\")");
			out.print("$(\"#sidebar\").load(\"../include/sidebar.html\")");
			out.print(" })");
			out.print("</script>");
			out.print("</head>");
			out.print(" <body>");
			out.print("<nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">");
			out.print("<form class=\"form-inline\" action=\"searchemp\"   method=\"get\">");
			out.print("<input style=\"margin-left: 401px\" class=\"form-control mr-sm-2\" type=\"text\" name=\"id\" placeholder=\"Search Employee?\">");
			out.print("<button class=\"btn btn-success\" type=\"submit\">Search</button> ");
			out.print("<label class=\"float-right\" style=\"block-size: 30px; border: 2 solid green; text-decoration: greenyellow;\"><a href=\"./logout\" >Logout</a></label>");
			out.print("</form> ");
			out.print("</nav>");
			out.print("<div class=\"col-lg-4 offset-2\">");
			out.print("<div id=\"sidebar\"></div>");
			out.print("<div id=\"header\"></div>");
			out.print("<div class=\"card \" style=\"width:18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;\">");
			out.print("<div class=\"card-header\">EmployeeDetails</div>                                                     ");
			out.print("<div class=\"card-body\"style=\"padding:2.25rem;\">");
			out.print("<h6 class=\"card-subtitle mb-2text-muted\">EmpId:"+bean.getId()+"</h6><br>");
			out.print("<h6 class=\"card-subtitle mb-2text-muted\">Name :"+bean.getName()+"</h6><br>");
			out.print("<h6 class=\"card-subtitle mb-2text-muted\">Email  :"+bean.getEmail()+"</h6><br>");
			out.print("<h6 class=\"card-subtitle mb-2text-muted\">Age :"+bean.getAge()+"</h6><br>");
			out.print("<h6 class=\"card-subtitle mb-2text-muted\">Designation :"+bean.getDesigtnation()+"</h6>");
			out.print("<h6 class=\"card-subtitle mb-2text-muted\">Phone no:"+bean.getPhone()+"</h6><br>");
			out.print("</div>");
			out.print("</div>");
			out.print("</div>");
			out.print(" </body>");
			out.print(" </html>");
		}
	}
}
