package com.covalense.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@GetMapping("/search")
	public String searchEmployee(String id, ModelMap modelMap) {
		List<EmployeeInfoBean> beans = (List<EmployeeInfoBean>)dao.getEmployeeInfo(id);
		modelMap.addAttribute("bean", beans);
		return "homePage";
		
		
	}

}
