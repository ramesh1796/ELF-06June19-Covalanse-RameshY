package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;


public class HibernateUtilOld {
	private static SessionFactory sessionFactory;
	public static SessionFactory buildSessionFactory(){
	
		return  new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeOtherInfoBean.class)
				.buildSessionFactory();
	
	 
	}
	private static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
	 public static Session openSeesion() {
		return getSessionFactory().openSession();
		 
	 }
	
}
