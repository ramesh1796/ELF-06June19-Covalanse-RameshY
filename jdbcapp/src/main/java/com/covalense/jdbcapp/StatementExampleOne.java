package com.covalense.jdbcapp;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import lombok.extern.java.Log;
@Log
public class StatementExampleOne {
	public static void main(String[] args) {
		//.Load the driver
		
		Connection  con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String query=null;
		try {
				/*
				 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
				 * DriverManager.registerDriver(driver);
				 */
			
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			//2. get the db connection via driver
			  //String dbUrl="jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
		      //con = DriverManager.getConnection(dbUrl);
			 
			  String dbUrl="jdbc:mysql://localhost:3306/covalense_db";
		       con = DriverManager.getConnection(dbUrl, "root", "root");
		       log.info("Connection impl class ===="+con.getClass());
			//3. Issue "Sql queries via connection
			 query="select * from employee_info"
			 		+ " where id=1";
			 stmt=con.createStatement();
			 rs= stmt.executeQuery( query);
			 //4. Process the result returned by sql queries
			 while(rs.next()) {
				 log.info(" ID                ==>  "+rs.getInt("ID"));
				 log.info(" NAME              ==>  "+rs.getString("NAME"));
				 log.info(" AGE               ==>  "+rs.getInt("AGE"));
				 log.info(" GENDER            ==>  "+rs.getString("GENDER"));
				 log.info(" SALARY            ==>  "+rs.getDouble("SALARY"));
				 log.info(" PHONE             ==>  "+rs.getLong("PHONE"));
				 log.info(" JOINING_DATE      ==>  "+rs.getDate("JOINING_DATE"));
				 log.info(" ACCOUNT_NO        ==>  "+rs.getLong("ACCOUNT_NO"));
				 log.info(" EMAIL             ==>  "+rs.getString("EMAIL"));
				 log.info(" DESIGNATION       ==>  "+rs.getString("DESIGNATION"));
				 log.info(" DOB               ==>  "+rs.getDate("DOB"));
				 log.info(" DEPT_ID           ==>  "+rs.getInt("DEPT_ID"));
				 log.info(" MNGR_ID           ==>  "+rs.getInt("MANAGER_ID"));

			 }
		} 
		
		catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			log.info(""+e);
		} 
		
		finally {
			//5. Close all "JDBC objects"
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
