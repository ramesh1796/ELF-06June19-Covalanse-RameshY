package com.covalense.hibernateassesment.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassesment.bean.CustomerBean;

public class SaveData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		Session session = factory.openSession();
		
	    
	    
		CustomerBean cbeBean = new CustomerBean();
		cbeBean.setId(121);
		cbeBean.setFirstName("Alia");
		cbeBean.setLastName("Bhatt");
		cbeBean.setContact(8858568886L);
		cbeBean.setAddress("BTM");
		cbeBean.setCity("Bangalore");
		cbeBean.setState("UP");
		cbeBean.setCountry("India");
		
		session.save(cbeBean);
		Transaction transaction =session.beginTransaction();
	    transaction.commit();
	    
	    session.close();
	}

}
