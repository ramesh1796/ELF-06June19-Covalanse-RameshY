package com.covalense.hibernateassesment.fifth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentResult {
public static void main(String[] args) {
	
	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory= configuration.buildSessionFactory();
	Session session = factory.openSession();
	String query= "firstname, totalmarks from student";
	
	 
}

}
