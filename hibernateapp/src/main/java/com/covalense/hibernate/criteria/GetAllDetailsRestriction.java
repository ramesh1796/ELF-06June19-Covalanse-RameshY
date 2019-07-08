package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class GetAllDetailsRestriction {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary", 5000.0));
		//Criterion cr = Restrictions.eq("id", 1);
		//criteria.add(cr);
		List<EmployeeInfoBean> emp = criteria.list();
		for(EmployeeInfoBean employeeInfoBean:emp) {
		log.info("ID " + employeeInfoBean.getId());
		log.info("Name " + employeeInfoBean.getAge());
		log.info("Email " + employeeInfoBean.getGender());
		log.info("Desigantion " + employeeInfoBean.getDesigtnation());
		log.info("DOB " + employeeInfoBean.getDob());
		log.info("AccountNo " + employeeInfoBean.getAccountNumber());
		log.info("DepartmentId " + employeeInfoBean.getDeptId());
		log.info("joiningdate " + employeeInfoBean.getJoiningDate());
		log.info("ManagerId " + employeeInfoBean.getMangerId());
		log.info("Phone " + employeeInfoBean.getPhone());
		log.info("salary" + employeeInfoBean.getSalary());
		log.info("Age" + employeeInfoBean.getAge());
	}
}
}