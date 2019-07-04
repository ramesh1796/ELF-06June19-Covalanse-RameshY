package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class EmployeeOtherInfo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empOtherInf = new EmployeeOtherInfoBean();
		empOtherInf.setId(8);
		empOtherInf.setPan("ABHD987Y");
		empOtherInf.setMarried(false);
		empOtherInf.setBloodGrp("B+");
		empOtherInf.setChallenged(false);
		empOtherInf.setEmergencyContactNumber(888875501);
		empOtherInf.setEmergencyContactName("Moshon");
		empOtherInf.setNationality("India");
		empOtherInf.setReligion("Hindu");
		empOtherInf.setFatherNm("Kunal");
		empOtherInf.setMotherNm("Awani");
		empOtherInf.setSpouseNm("Sonia");
		empOtherInf.setPassport("89094885973");
		empOtherInf.setAdhaar(900848859);

		Transaction transaction = session.beginTransaction();
		session.save(empOtherInf);
		transaction.commit();
		session.close();

	}
}
