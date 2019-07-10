package com.covalense.hibernateassesment.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassesment.bean.CustomerBean;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		Session session = factory.openSession();
		
	    int id=121;
	    
		CustomerBean customerBean = new CustomerBean();
	    customerBean =  session.get(CustomerBean.class, id);
	    customerBean.setFirstName("Sonali");
	    customerBean.setLastName("Bhatt");
	    customerBean.setContact(8858568856L);
	    customerBean.setAddress("BTM");
	    customerBean.setCity("Mangalore");
	    customerBean.setState("karnataka");
	    customerBean.setCountry("India");
		
		session.saveOrUpdate(customerBean);
		Transaction transaction =session.beginTransaction();
	    transaction.commit();
	    
	    session.close();
	}

}
