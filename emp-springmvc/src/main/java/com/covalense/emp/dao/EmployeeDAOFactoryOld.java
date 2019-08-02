package com.covalense.emp.dao;

public class EmployeeDAOFactoryOld {
	
	private EmployeeDAOFactoryOld() {}
	//private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance(String dbInteractionType) {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}

		return dao;

	}//end of getInstance
}//end of class
