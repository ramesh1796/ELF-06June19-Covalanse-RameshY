package com.covalense.warehouse.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.java.Log;
@Log
public class GetItem {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory= context.getBean(SessionFactory.class);
		Session session = factory.openSession();
		ItemBean itemBean=session.get(ItemBean.class, 102);
		log.info("ItemId:-"+itemBean.getItemId());
		log.info("ItemName:-"+itemBean.getItemName());
		log.info("ItemCost:-"+itemBean.getCost());
		log.info("ItemDescriptin:-"+itemBean.getDescription());
		log.info("ItemQuantity:-"+itemBean.getQuantity());
		session.close();
	}

}
