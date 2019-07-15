package com.covalense.warehouse.util;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.covalense.warehouse.beans.ItemBean;

public class AddTest {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Session session = context.getBean("hibernateUtil", HibernateUtil.class).openSession();
		
		ItemBean itemBean = new ItemBean();
		itemBean.setItemId(333);
		itemBean.setItemName("Audi");
		itemBean.setCost(104800);
		itemBean.setDescription("A5");
		itemBean.setQuantity(10);
		
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
