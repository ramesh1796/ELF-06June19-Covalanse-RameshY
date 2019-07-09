package com.covalense.hibernate.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.cache.NewEmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class HibernateForAWS {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernate/awsrds/hibernate.aws.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		//2. Build session factory
		SessionFactory factory = config.buildSessionFactory();
		//3. open session
		Session session = factory.openSession();
		//4. 
		NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class, 1);
		log.info("Employee Details: "+ bean.toString() );
		//5.
		session.close();
	
	
	}

}
