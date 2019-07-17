package com.covalense.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;
@Log
public class EmployeeInfoTestTwo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeInfoBean employeeBean = (EmployeeInfoBean)applicationContext.getBean("employeeBean");
		
		log.info("ID:="+employeeBean.getId());
		log.info("Name:="+ employeeBean.getName());
		log.info("DEPT ID:="+employeeBean.getDept().getDeptId());
		log.info("DEPT Name:="+ employeeBean.getDept().getDeptName());
		
		((AbstractApplicationContext)applicationContext).close();
		
	}

}
