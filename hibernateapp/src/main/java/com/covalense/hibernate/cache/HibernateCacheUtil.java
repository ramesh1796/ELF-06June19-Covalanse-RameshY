package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	private HibernateCacheUtil() {
		
	}
	private static SessionFactory seesionFactory = null;
   private static SessionFactory getSessionFactory() {
	   if(seesionFactory==null) {
	   Configuration config = new Configuration();
	   config.configure("com/covalense/hibernate/cache/hibernate.cache.cfg.xml");
	   config.addAnnotatedClass(NewEmployeeInfoBean.class);
	   SessionFactory seesionFactory = config.buildSessionFactory();
	   }
	   return seesionFactory;
	   
   }
   public static Session openSession() {
	return getSessionFactory().openSession();
	   
   }
}
