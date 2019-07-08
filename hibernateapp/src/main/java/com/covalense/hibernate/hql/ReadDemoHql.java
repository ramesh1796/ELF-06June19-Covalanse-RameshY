package com.covalense.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log

public class ReadDemoHql {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<String> emplName = query.list();
		for(String emplNm: emplName) {
			log.info("Name:- "+emplNm);
		
		/*String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		for(EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
			log.info("ID" + employeeInfoBean.getId());
			log.info("Name" + employeeInfoBean.getAge());
			log.info("Email" + employeeInfoBean.getGender());
			log.info("Desigantion" + employeeInfoBean.getDesigtnation());
			log.info("DOB" + employeeInfoBean.getDob());
			log.info("AccountNo" + employeeInfoBean.getAccountNumber());
			log.info("DepartmentId" + employeeInfoBean.getDeptId());
			log.info("joiningdate" + employeeInfoBean.getJoiningDate());
			log.info("ManagerId" + employeeInfoBean.getMangerId());
			log.info("Phone" + employeeInfoBean.getPhone());
			log.info("salary" + employeeInfoBean.getSalary());
			log.info("Age" + employeeInfoBean.getAge()); */
		}
		
	}
	

}
