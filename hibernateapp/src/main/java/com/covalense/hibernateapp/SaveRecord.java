package com.covalense.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.beans.EmployeeInfoBean;

public class SaveRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(20);
		empInf.setName("Riksha");
		empInf.setAge(24);
		empInf.setGender("Female");
		empInf.setSalary(10330);
		empInf.setPhone(800075501);
		empInf.setJoiningDate(new Date(2110 - 10 - 20));
		empInf.setAccountNumber(255225854);
		empInf.setEmail("nllest@gmail.com");
		empInf.setDesigtnation("JEE");
		empInf.setDob(new Date(1950 - 06 - 06));
		// empInf.setDeptId(23);
		// empInf.setMangerId(1310);

		Transaction transaction = session.beginTransaction();
		// session.save(empInf);
		session.saveOrUpdate(empInf);
		transaction.commit();
		session.close();

	}
}
