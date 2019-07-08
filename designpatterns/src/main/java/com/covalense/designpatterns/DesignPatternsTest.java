package com.covalense.designpatterns;

import java.util.List;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) {
		// EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		// EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));

		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : beans) {
			printInfo(bean);
		}

		// create an Employee
		/*
		 * EmployeeInfoBean empInf = new EmployeeInfoBean(); empInf.setId(30);
		 * empInf.setName("Isha"); empInf.setAge(24); empInf.setGender("Female");
		 * empInf.setSalary(10330); empInf.setPhone(800075501);
		 * empInf.setJoiningDate(new Date(2110-10-20));
		 * empInf.setAccountNumber(255225854); empInf.setEmail("issest@gmail.com");
		 * empInf.setDesigtnation("EE"); empInf.setDob(new Date(1950-06-06));
		 * empInf.setDepartmentId(203); empInf.setManagerId(13100);
		 * //log.info("record inserted"+ dao.createEmployeeInfo(empInf));
		 * log.info("record inserted"+ dao.deleteEmployeeInfo(20));
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
