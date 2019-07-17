package com.covalense.springcore.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		log.info("eName:-"+employeeBean.getName());
		log.info("eID:-"+employeeBean.getId());
		
		DepartmentBean departmentBean = employeeBean.getDept();
		log.info("DeptName:-"+departmentBean.getDeptName());
		log.info("DeptID:-"+departmentBean.getDeptId());
		
	}

}
