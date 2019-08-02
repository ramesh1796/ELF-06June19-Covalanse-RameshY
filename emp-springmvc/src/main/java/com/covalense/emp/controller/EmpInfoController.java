package com.covalense.emp.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;

@Controller
@RequestMapping("/empinfo")
public class EmpInfoController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
	    binder.registerCustomEditor(Date.class, editor);
	}
	@GetMapping("/createEmp")
	public String getEmpCreate() {
		//Date date = new Date();
		return "empinfo";
		
	}
	
	@PostMapping("/createemployeeinfo")
	public String createEmp(EmployeeInfoBean bean) {
		
		EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(null);
		dao.createEmployeeInfo(bean);
		return "createEmployee";
		
	}
	
}
