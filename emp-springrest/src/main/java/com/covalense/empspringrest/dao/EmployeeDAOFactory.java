package com.covalense.empspringrest.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
    
	@Bean("jdbc")
	public EmployeeDAO getEmployeeDAOJDBCImpl() {
		return new EmployeeDAOJDBCImpl();
	}
	@Bean("hibernate")
	public EmployeeDAO getEmployeeDAOHibernateImpl() {
		return new EmployeeDAOHibernateImpl();
		
	}// end of getInstance
}// end of class
