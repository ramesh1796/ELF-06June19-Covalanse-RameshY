package com.covalense.hibernateapp.onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernate.manytoone.EmployeeEducationalInfoBean;
import com.covalense.hibernate.manytoone.EmployeeExperienceInfoBean;
import com.covalense.hibernateapp.manytomany.TrainingInfoBean;

public class HibernateImpl {
	private Configuration configuration = new Configuration();
	private SessionFactory factory = configuration.configure().buildSessionFactory();
	
	public void createTraining(TrainingInfoBean trainingInfoBean){
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		transaction.commit();
		session.close();
		
	}
	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBeans,
			List<EmployeeEducationalInfoBean> employeeEducationalInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);

		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			session.save(employeeAddressInfoBean);
		}

		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : employeeEducationalInfoBeans) {
			session.save(employeeEducationalInfoBean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : experienceInfoBeans) {
			session.save(experienceInfoBean);
		}

		transaction.commit();
		session.close();
	}

}
