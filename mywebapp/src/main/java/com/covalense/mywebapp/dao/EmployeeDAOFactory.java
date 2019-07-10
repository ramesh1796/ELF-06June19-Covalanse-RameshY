package com.covalense.mywebapp.dao;

public class EmployeeDAOFactory {
	
	private EmployeeDAOFactory() {}
	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}

		return dao;

	}//end of getInstance
}//end of class
