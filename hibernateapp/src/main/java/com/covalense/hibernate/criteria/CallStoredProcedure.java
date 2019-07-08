package com.covalense.hibernate.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class CallStoredProcedure {
public static void main(String[] args) {
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
   StoredProcedureQuery query =	session.createStoredProcedureCall("employeeInfo");
   List<Object[]> empl =query.getResultList();
   for(Object[] employeeInfoBean:empl) {
	   log.info("ID" + employeeInfoBean[0]);
		log.info("Name" + employeeInfoBean[1]);
		log.info("Email" + employeeInfoBean[2]);
		log.info("Desigantion" + employeeInfoBean[3]);
		log.info("DOB" + employeeInfoBean[4]);
		log.info("AccountNo" + employeeInfoBean[5]);
		log.info("DepartmentId" + employeeInfoBean[6]);
		log.info("joiningdate" + employeeInfoBean[7]);
		log.info("ManagerId" + employeeInfoBean[9]);
		log.info("Phone" + employeeInfoBean[10]);
		log.info("salary" + employeeInfoBean[11]);
		log.info("Age" + employeeInfoBean[12]);
   }
}
}
