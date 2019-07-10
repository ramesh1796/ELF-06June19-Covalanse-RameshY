package com.covalense.hibernateassesment.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassesment.bean.CustomerBean;

public class DeleteRecord {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		Session session = factory.openSession();
		int id=123;
		
		CustomerBean customerBean = new CustomerBean();
	    customerBean =  session.get(CustomerBean.class, id);
	    Transaction transaction =session.beginTransaction();
		session.delete(customerBean);
		
		
		
	    transaction.commit();
	    
	    session.close();

}
}