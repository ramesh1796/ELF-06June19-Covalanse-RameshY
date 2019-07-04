package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadRecord {
	public static void main(String[] args) {
		
		Configuration configuration=new  Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		EmployeeInfoBean employeeInfoBean= session.get(EmployeeInfoBean.class, 2);
		log.info(""+employeeInfoBean.getId());
		log.info(""+employeeInfoBean.getName());
		log.info(""+employeeInfoBean.getAge());
		log.info(""+employeeInfoBean.getEmail());
		log.info(""+employeeInfoBean.getGender());
		log.info(""+employeeInfoBean.getAccountNumber());
		log.info(""+employeeInfoBean.getPhone());
		log.info(""+employeeInfoBean.getSalary());
		log.info(""+employeeInfoBean.getDeptId());
		log.info(""+employeeInfoBean.getDesigtnation());
		log.info(""+employeeInfoBean.getMangerId());
		session.close();
	}

}
