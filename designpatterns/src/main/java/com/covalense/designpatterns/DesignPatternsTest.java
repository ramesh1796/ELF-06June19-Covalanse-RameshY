package com.covalense.designpatterns;

import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;
import com.covalense.designpatterns.dao.EmployeeDAOHibernateImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) {
		//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		//EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao =  EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));
		/*
		 * ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(); for
		 * (EmployeeInfoBean bean : beans) { printInfo(bean); }
		 */

	}

	private static void printInfo(EmployeeInfoBean bean) {
		log.info("ID" + bean.getId());
		log.info("Name" + bean.getAge());
		log.info("Email" + bean.getGender());
		log.info("Desigantion" + bean.getDesigtnation());
		log.info("DOB" + bean.getDob());
		log.info("AccountNo" + bean.getAccountNumber());
		log.info("DepartmentId" + bean.getDepartmentId());
		log.info("joiningdate" + bean.getJoiningDate());
		log.info("ManagerId" + bean.getManagerId());
		log.info("Phone" + bean.getPhone());
		log.info("salary" + bean.getSalary());
		log.info("Age" + bean.getAge());
	}
}
