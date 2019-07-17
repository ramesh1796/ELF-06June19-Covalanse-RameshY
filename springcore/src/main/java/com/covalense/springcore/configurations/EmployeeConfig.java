package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;

@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {
@Bean	
public EmployeeBean getEmployeeBean(){
	EmployeeBean employeeBean = new EmployeeBean();
	employeeBean.setId(109);
	employeeBean.setName("Kamal");
	return employeeBean; 
	
}
	/*
	 * @Bean public DepartmentBean getDepartmentBean(){ DepartmentBean
	 * departmentBean = new DepartmentBean(); departmentBean.setDeptId(209);
	 * departmentBean.setDeptName("SE"); return departmentBean;
	 * 
	 * }
	 */
}
