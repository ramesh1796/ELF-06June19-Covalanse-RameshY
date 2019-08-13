package com.covalense.empspringrest.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.covalense.empspringrest.dao.EmployeeDAO;
import com.covalense.empspringrest.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class Controllers {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void init(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@PostMapping("/createEmployee")
	public @ResponseBody boolean createEmployee(@RequestBody EmployeeInfoBean empinfoBean) {

		return dao.createEmployeeInfo(empinfoBean);
	}

	@PutMapping("/updateEmployee")
	public @ResponseBody boolean updateEmployee(@RequestBody EmployeeInfoBean empinfoBean) {

		return dao.updateEmployeeInfo(empinfoBean);
	}

	@DeleteMapping("/deleteEmployee")
	public @ResponseBody boolean deleteEmployee(@RequestParam("id") int id) {

		return dao.deleteEmployeeInfo(id);
	}

	@GetMapping("/getEmployee")
	public @ResponseBody EmployeeInfoBean getEmployee(@RequestParam("id") int id) {

		return dao.getEmployeeInfo(id);
	}

	@GetMapping("/getAllEmployee")
	public @ResponseBody List<EmployeeInfoBean> getAllEmployee() {

		return dao.getAllEmployeeInfo();
	}
}
