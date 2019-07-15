package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	public MyFirstServlet() {
		System.out.println("myFirstServlet");
	}
	
	@Override
	protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {
		
		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("Movie");
        ServletConfig config = getServletConfig();
        String actorName=config.getInitParameter("Actor");
        String actressName=config.getInitParameter("actress");
		
	 String httpMethod = req.getMethod();
	 String protocol = req.getProtocol();
	 String requestURL = req.getRequestURI().toString();
	 
	 System.out.println(" httpMethod  "+ httpMethod);
	
	 System.out.println(" protocol   "+ protocol);

	 System.out.println(" requestURL   "+ requestURL);
     String currentDateTime = new Date().toString();
     //Get Query String Information
     String fnameValue = req.getParameter("fname");
     String lnameValue = req.getParameter("lname");
     String htmlResponse =
    		 "<!DOCTYPE html>"+
    		 "<html>"+
    		 "<head>"+
    		 "<meta charset=\"ISO-8859-1\">"+
    		 "<title>Insert title here</title>"+
    		 "</head>"+
    		 "<body>"+
    		 "  <h1 >Current Data & Time is : "+
    		 "  <br>"+
    		 " <span style=\"color:red\">"+currentDateTime +"</span>"+
    		 "  <br>"+
    		 "  <br>"+
    		 "  First Name:-"+fnameValue+
    		  "  <br>"+
    		 "  Last Name:-"+lnameValue+
    		  "  <br>"+
    		 "  Movie Name:-"+movieName+
    		  "  <br>"+
    		 "  Actor Name:-"+actorName+
    		  "  <br>"+
    		 "  Actress Name:-"+actressName+
    		 
    		 "  </h1>"+
    		 "</body>"+
    		 "</html>";
     //Send the above HTML Response of Browser
     resp.setContentType("text/html");
    // resp.setHeader("Refresh", "1"); //auto refresh for every sec.
     PrintWriter out = resp.getWriter();
     out.print(htmlResponse);
     
     
     
     
	}//end of doGet()
	
}// End of class
