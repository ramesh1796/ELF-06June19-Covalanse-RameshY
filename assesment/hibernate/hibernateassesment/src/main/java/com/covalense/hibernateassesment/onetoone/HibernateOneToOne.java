package com.covalense.hibernateassesment.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassesment.bean.StudentInfoBean;
import com.covalense.hibernateassesment.bean.StudentOtherInfoBean;

public class HibernateOneToOne {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		StudentInfoBean stdinfo = new StudentInfoBean();
		stdinfo.setRoll(123);
		stdinfo.setName("Kamal");
		stdinfo.setGender("Male");
		stdinfo.setAge(24);
		stdinfo.setEmail("kamal@gmail.com");
		stdinfo.setPhone(8897667874L);
		
		StudentOtherInfoBean stdotherinfo= new StudentOtherInfoBean();
		stdotherinfo.setRoll(123);
		stdotherinfo.setFname("Mikesh");
		stdotherinfo.setMname("Sonali");
		stdotherinfo.setReligion("Hindu");
		stdotherinfo.setNationality("India");
		
		stdinfo.setStdOtherInfo(stdotherinfo);
		
		session.save(stdinfo);
		Transaction transaction =session.beginTransaction();
	    transaction.commit();
	    
	    session.close();
		
	}

}
