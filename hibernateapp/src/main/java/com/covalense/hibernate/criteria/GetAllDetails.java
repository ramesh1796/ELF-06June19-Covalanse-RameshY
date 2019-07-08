package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class GetAllDetails {
public static void main(String[] args) {
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
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
