package com.covalense.empspringrest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.covalense.empspringrest.dto.EmployeeInfoBean;
import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public EmployeeInfoBean getEmployeeInfo(String id) {

		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}// end of getEmployeeInfo String

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = null;
		try {
			// 1.Load the driver

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2. get the db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("Connection impl class ====" + con.getClass());
			// 3. Issue "Sql queries via connection
			query = "select * from employee_info" ;
			stmt = con.createStatement();

			rs = stmt.executeQuery(query);
			/*
			 * int i= pstmt.executeUpdate( query); if(i>0) { log.info("record inserted"); }
			 * else { log.info("Not inserted"); }
			 */
			// 4. Process the result returned by sql queries
			EmployeeInfoBean bean = new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getLong("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				//bean.setDepartmentId(rs.getInt("DEPT_ID"));
				//bean.setManagerId(rs.getInt("MANAGER_ID"));

			}
			return bean;

		}

		catch (Exception e) {
			log.info("" + e);
			return null;
		}

		finally {
			// 5. Close all "JDBC objects"
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e2) {
				log.info("" + e2);
				
			}
		}
		

	}// end of getEmployeeInfo id

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		// .Load the driver
		String qry = "select * from employee_info";
		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(qry);) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2. get the db connection via driver
			log.info("Connection impl class ====" + con.getClass());
			// 3. Issue "Sql queries via connection

			// 4. Process the result returned by sql queries
			List<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
     			bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getLong("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				//bean.setDepartmentId(rs.getInt("DEPT_ID"));
				//bean.setManagerId(rs.getInt("MANAGER_ID"));

				beans.add(bean); // Adding it to arraylist
			}
			return beans;
		}

		catch (

				Exception e) {
			log.info("" + e);
			return null;
		} // end of try-catch

	}// end of main

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeInfoBean> searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}// end of class
