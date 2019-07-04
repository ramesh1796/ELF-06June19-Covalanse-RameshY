package com.covalense.xmlexample.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveRecord {
public static void main(String[] args) {
	DepartmentInfoBean departmentInfoBean = new DepartmentInfoBean();
	departmentInfoBean.setDeptId(102);
	departmentInfoBean.setDeptName("kukesh");
	
	
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	
	
	SessionFactory factory=cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction transaction= session.beginTransaction();
    session.save(departmentInfoBean);	
	transaction.commit();
	session.close();
}
}
