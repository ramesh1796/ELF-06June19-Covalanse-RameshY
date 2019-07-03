package com.covalense.jdbcapp;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;

import com.covalense.jdbc.connectionpool.ConnectionPoolTwo;

import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest {
	public static void main(String[] args) {
		// .Load the driver

		ConnectionPoolTwo pool = null;
		Connection con=null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			 pool = ConnectionPoolTwo.getConnectionPool();
			 con= pool.getConnectionFromPool();
			// 3. Issue "Sql queries via connection
			String qry = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
			// 4. Process the result returned by sql queries
			if (rs.next()) {
				// log.info(" ID ==> " + rs.getInt("ID"));
				// log.info(" NAME ==> " + rs.getString("NAME"));
				log.info(" ID                ==>  " + rs.getInt(1));
				log.info(" NAME              ==>  " + rs.getString(2));
				log.info(" AGE               ==>  " + rs.getInt("AGE"));
				log.info(" GENDER            ==>  " + rs.getString("GENDER"));
				log.info(" SALARY            ==>  " + rs.getDouble("SALARY"));
				log.info(" PHONE             ==>  " + rs.getLong("PHONE"));
				log.info(" JOINING_DATE      ==>  " + rs.getDate("JOINING_DATE"));
				log.info(" ACCOUNT_NO        ==>  " + rs.getLong("ACCOUNT_NO"));
				log.info(" EMAIL             ==>  " + rs.getString("EMAIL"));
				log.info(" DESIGNATION       ==>  " + rs.getString("DESIGNATION"));
				log.info(" DOB               ==>  " + rs.getDate("DOB"));
				log.info(" DEPT_ID           ==>  " + rs.getInt("DEPT_ID"));
				log.info(" MNGR_ID           ==>  " + rs.getInt("MANAGER_ID"));

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				pool.returnConnectionToPool(con);
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
