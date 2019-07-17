package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;

@Configuration
public class DepartmentConfig {

	@Bean(name = "SE")
	public DepartmentBean getDepartmentBean() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(101);
		departmentBean.setDeptName("SE");
		return departmentBean;

	}

	@Bean(name ="Tester")
	public DepartmentBean getDepartmentTesting() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(201);
		departmentBean.setDeptName("Testing");
		return departmentBean;

	}

	@Bean(name ="HR")
	public DepartmentBean getDepartmentHR() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(301);
		departmentBean.setDeptName("HR");
		return departmentBean;

	}
}
