package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.beans.EmployeeInfoBean;

public class DemoDelete {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 1);
		Transaction transaction = session.beginTransaction();
		session.delete(emp);
		transaction.commit();
		session.close();
	}
}
