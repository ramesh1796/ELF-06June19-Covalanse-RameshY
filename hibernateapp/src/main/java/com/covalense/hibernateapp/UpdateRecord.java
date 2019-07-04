package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class UpdateRecord {
public static void main(String[] args) {
	Configuration configuration=new  Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionFactory= configuration.buildSessionFactory();
	Session session= sessionFactory.openSession();
	EmployeeInfoBean employeeInfoBean= session.get(EmployeeInfoBean.class, 13);
	employeeInfoBean.setAge(45);
	employeeInfoBean.setName("Sonal");
	Transaction transaction= session.beginTransaction();
	session.update(employeeInfoBean);
	transaction.commit();
	session.close();
}
}
