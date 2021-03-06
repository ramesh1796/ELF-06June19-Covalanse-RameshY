package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class Insert {
public static void main(String[] args) {
	Transaction transaction = null; 
	int result;
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	String hql = "insert into EmployeeNewInfo(eid, name, email) select id, name, email from EmployeeInfoBean where id=2";
	try {
		transaction= session.beginTransaction();
		Query query = session.createQuery(hql);
		result= query.executeUpdate();
		log.info("Record inserted "+result);
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
