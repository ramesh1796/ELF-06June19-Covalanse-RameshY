package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// invalidate the session
		HttpSession session = req.getSession(false);
		RequestDispatcher dispatcher = null;
		if (session != null) {
			session.invalidate();
		}
		PrintWriter out = resp.getWriter();
		out.print("<h1><span style=\"color:Green\">" + " Thanks fo visiting" + "</span>" + "</h1>");
		out.print("<BR><BR>");
		dispatcher = req.getRequestDispatcher("login.html");
		dispatcher.include(req, resp);
	}// end of get
}// end of class
