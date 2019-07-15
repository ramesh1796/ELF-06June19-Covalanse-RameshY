package com.covalense.warehouse.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.java.Log;
@Log
public class AddItem {
public static void main(String[] args) {
	//Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	//SessionFactory factory= configuration.buildSessionFactory();
	ApplicationContext context= new AnnotationConfigApplicationContext(HibernateConfig.class);
	SessionFactory factory= context.getBean(SessionFactory.class);
	Session session = factory.openSession();
	
	ItemBean itemBean = new ItemBean();
	itemBean.setItemId(128);
	itemBean.setItemName("Laptop");
	itemBean.setCost(14800);
	itemBean.setDescription("HP");
	itemBean.setQuantity(16);
	
	Transaction transaction=null;
	try {
		transaction= session.beginTransaction();
	    session.saveOrUpdate(itemBean);
		transaction.commit();
	} catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();
	}
	finally {
		session.close();
	}
	
}
}
