package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest2 {
public static void main(String[] args) {
	//1. Load the config file
	Configuration config = new Configuration();
	config.configure("com/covalense/hibernate/cache/hibernate.cache.cfg.xml");
	config.addAnnotatedClass(NewEmployeeInfoBean.class);
	//2. Build session factory
	SessionFactory factory = config.buildSessionFactory();
	//3. open session
	Session session = factory.openSession();
	//4. 
	NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class, 11);
	log.info("1st Time :"+bean.toString());
	NewEmployeeInfoBean bean2 = session.get(NewEmployeeInfoBean.class, 11);
	log.info("2st Time :"+bean2.toString());
	NewEmployeeInfoBean bean3 = session.get(NewEmployeeInfoBean.class, 11);
	log.info("3st Time :"+bean3.toString());
	//5.
	session.close();
}//end main
}//end class
