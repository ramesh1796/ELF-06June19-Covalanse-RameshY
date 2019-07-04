package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadRecordOtherInfo {
	public static void main(String[] args) {
		Configuration configuration=new  Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		EmployeeOtherInfoBean employeeInfoBean= session.get(EmployeeOtherInfoBean.class, 13);
		log.info(""+employeeInfoBean.getId());
		log.info(""+employeeInfoBean.getBloodGrp());
		log.info(""+employeeInfoBean.getAdhaar());
		log.info(""+employeeInfoBean.getEmergencyContactName());
		log.info(""+employeeInfoBean.getEmergencyContactNumber());
		log.info(""+employeeInfoBean.getFatherNm());
		log.info(""+employeeInfoBean.getMotherNm());
		log.info(""+employeeInfoBean.getSpouseNm());
		log.info(""+employeeInfoBean.getReligion());
		log.info(""+employeeInfoBean.getPassport());
		log.info(""+employeeInfoBean.isChallenged());
		session.close();
	}

}
