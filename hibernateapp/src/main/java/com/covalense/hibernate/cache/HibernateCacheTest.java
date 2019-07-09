package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest {
public static void main(String[] args) {
	log.info("1st Time: "+getEmployeeData(1).toString());
	log.info("2st Time: "+getEmployeeData(1).toString());
	log.info("3st Time: "+getEmployeeData(1).toString());
}//end main

private static  NewEmployeeInfoBean getEmployeeData(int id) {
	
		//Session session = HibernateCacheUtil.openSession();
		//4. 
		//NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class, 11);
		//5.
	  NewEmployeeInfoBean bean=null;
	  try(Session session = HibernateCacheUtil.openSession();){
		  bean = session.get(NewEmployeeInfoBean.class, id);
	  }
		//session.close();
	
	return bean;
}//end getEmployeeData

}//end class
