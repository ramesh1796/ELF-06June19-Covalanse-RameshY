package com.covalense.designpatterns.dao;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = null;
		try {
			// 1.Load the driver

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2. get the db connection via driver
			// String
			// dbUrl="jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			// con = DriverManager.getConnection(dbUrl);

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("Connection impl class ====" + con.getClass());
			// 3. Issue "Sql queries via connection
			query = "select * from employee_info" + " where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
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
				bean.setDesigtnation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

			}

		}

		catch (Exception e) {
			log.info("" + e);
		}

		finally {
			// 5. Close all "JDBC objects"
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e2) {
				log.info("" + e2);
			}
		}
		return null;

	}// end of getEmployeeInfo id

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
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
			ArrayList<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();
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
				bean.setDesigtnation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

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

}// end of class
