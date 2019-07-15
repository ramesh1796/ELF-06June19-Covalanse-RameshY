package com.covalense.warehouse.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.java.Log;
@Log
public class UpdateItem {
public static void main(String[] args) {
	//Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	//SessionFactory factory= configuration.buildSessionFactory();
	ApplicationContext context= new AnnotationConfigApplicationContext(HibernateConfig.class);
	SessionFactory factory= context.getBean(SessionFactory.class);
	Session session = factory.openSession();
	ItemBean itemBean=session.get(ItemBean.class, 102);
	

	itemBean.setItemName("BCycle");
	itemBean.setCost(1200550);
	itemBean.setDescription("Herot");
	itemBean.setQuantity(1204);
	
	Transaction transaction=null;
	try {
		transaction= session.beginTransaction();
	    session.update(itemBean);
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
