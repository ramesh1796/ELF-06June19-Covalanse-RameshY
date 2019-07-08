package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "delete from EmployeeInfoBean where id=:eid";
		  
		Query query = session.createQuery(hql);
		query.setParameter("eid", 30);
		int result;
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			result = query.executeUpdate();
			log.info("Record deleted");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

}
