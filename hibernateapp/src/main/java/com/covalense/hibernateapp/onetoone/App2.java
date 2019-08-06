package com.covalense.hibernateapp.onetoone;

import com.covalense.hibernateapp.beans.EmployeeInfoBean;

public class App2 {

	public static void main(String[] args) {

		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(12);
		bean.setName("Madhvi");
		bean.setDesigtnation("manager");
		bean.setPassword("Jssi56");
		
		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		bean1.setId(14);
		bean1.setName("Iqra");
		bean1.setPassword("Jggi56");
		bean1.setDesigtnation("Architecht");
		bean1.setManagerId(bean);
		
		EmployeeInfoBean bean2 = new EmployeeInfoBean();
		bean2.setId(13);
		bean2.setName("Akira");
		bean2.setPassword("Adf56");
		bean2.setDesigtnation("SE");
		bean2.setManagerId(bean);
		
		HibernateImpl impl = new HibernateImpl();
	   impl.createEmployee(bean);
	   impl.createEmployee(bean1);
	   impl.createEmployee(bean2);
		
	}

	}


