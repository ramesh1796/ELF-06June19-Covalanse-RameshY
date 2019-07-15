package com.covalense.emp.controller;

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

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/login")
public class LoginServletController{
	@GetMapping("/getLoginForm")
	public String getForm() {
		return "Login";
	}
	@PostMapping("/authentication")
	public String authentication(int id, String password, ModelMap modelMap) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
        String mssg="";
		if (bean == null || !password.equals(bean.getPassword())) {
			mssg="Successfully Login!!";
		modelMap.addAttribute("msg", mssg);
		return "Home";
		}else {
			mssg="Opps!!!!UserName or password incorrect!!";
			modelMap.addAttribute("msg", mssg);
			return "Login";
		}
		

	}

}
