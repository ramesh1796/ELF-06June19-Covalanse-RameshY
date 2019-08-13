package com.covalense.empspringrest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.empspringrest.dto.EmployeeAddressInfoBean;
import com.covalense.empspringrest.dto.EmployeeEducationalInfoBean;
import com.covalense.empspringrest.dto.EmployeeExperienceInfoBean;
import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeOtherInfoBean;
import com.covalense.empspringrest.dto.TrainingInfoBean;

public class HibernateImpl {
	private Configuration configuration = new Configuration();
	private SessionFactory factory = configuration.configure().buildSessionFactory();
	
	public void createTraining(TrainingInfoBean trainingInfoBean){
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(trainingInfoBean);
		transaction.commit();
		session.close();
		
	}
	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBeans,
			List<EmployeeEducationalInfoBean> employeeEducationalInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(infoBean);
		session.saveOrUpdate(otherInfoBean);

		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			session.saveOrUpdate(employeeAddressInfoBean);
		}

		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : employeeEducationalInfoBeans) {
			session.saveOrUpdate(employeeEducationalInfoBean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : experienceInfoBeans) {
			session.saveOrUpdate(experienceInfoBean);
		}

		transaction.commit();
		session.close();
	}
	
	public void createEmployee(EmployeeInfoBean infoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(infoBean);
		transaction.commit();
		session.close();
	}
	
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session = factory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
		
	}

}
