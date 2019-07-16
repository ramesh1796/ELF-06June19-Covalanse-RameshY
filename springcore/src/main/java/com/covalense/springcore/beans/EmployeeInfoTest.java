package com.covalense.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;
@Log
public class EmployeeInfoTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeInfoBean employeeBean = (EmployeeInfoBean)applicationContext.getBean("employeeBean");
		
		Scanner scanner = new Scanner(System.in);
		log.info("Enter Id  :");
		employeeBean.setId(scanner.nextInt());
		scanner.nextLine();
		log.info("Enter Name  :");
		employeeBean.setName(scanner.nextLine());
		
		log.info(""+employeeBean.getId());
		log.info(""+ employeeBean.getName());
		
		EmployeeInfoBean employeeBean2 = (EmployeeInfoBean)applicationContext.getBean("employeeBean");
		log.info("Enter Id  :");
		employeeBean2.setId(scanner.nextInt());
		scanner.nextLine();
		log.info("Enter Name  :");
		employeeBean2.setName(scanner.nextLine());
		
		log.info(""+employeeBean2.getId());
		log.info(""+ employeeBean2.getName());
		log.info(""+employeeBean.getId());
		log.info(""+ employeeBean.getName());
		
		((AbstractApplicationContext)applicationContext).close();
		
	}

}
