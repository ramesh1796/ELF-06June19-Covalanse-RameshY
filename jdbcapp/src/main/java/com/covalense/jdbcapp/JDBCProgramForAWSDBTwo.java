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
public class JDBCProgramForAWSDBTwo {
	public static void main(String[] args) {
		//.Load the driver
		
		String query = "insert into employee_info values(8,'Kamal', 35, 'Male', 34000,"
		 		+ " 907789677, '2016-08-09', 776868686868, 'abcd2gmail.com', 'SE', '2012-06-05', 61, 505)"; 
		String dbUrl = "jdbc:mysql://mysqlawscovalense.ctrdgtks4cxb.ap-south-1.rds.amazonaws.com:3306/covalense_db";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "rameshcovalense");
				Statement stmt = con.createStatement();
				 
				
				){
				/*
				 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
				 * DriverManager.registerDriver(driver);
				 */
			
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			//2. get the db connection via driver
			  //String dbUrl="jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
		      //con = DriverManager.getConnection(dbUrl);
			 
			 
		       
		       log.info("Connection impl class ===="+con.getClass());
			//3. Issue "Sql queries via connection
			   
			 
		       int i= stmt.executeUpdate( query);
			 if(i>0) {
				 log.info("record inserted");
			 }
			 else {
				 log.info("Not inserted");
			 }
			 //4. Process the result returned by sql queries
			/*
			 * while(rs.next()) { log.info(" ID                ==>  "+rs.getInt("ID"));
			 * log.info(" NAME              ==>  "+rs.getString("NAME"));
			 * log.info(" AGE               ==>  "+rs.getInt("AGE"));
			 * log.info(" GENDER            ==>  "+rs.getString("GENDER"));
			 * log.info(" SALARY            ==>  "+rs.getDouble("SALARY"));
			 * log.info(" PHONE             ==>  "+rs.getLong("PHONE"));
			 * log.info(" JOINING_DATE      ==>  "+rs.getDate("JOINING_DATE"));
			 * log.info(" ACCOUNT_NO        ==>  "+rs.getLong("ACCOUNT_NO"));
			 * log.info(" EMAIL             ==>  "+rs.getString("EMAIL"));
			 * log.info(" DESIGNATION       ==>  "+rs.getString("DESIGNATION"));
			 * log.info(" DOB               ==>  "+rs.getDate("DOB"));
			 * log.info(" DEPT_ID           ==>  "+rs.getInt("DEPT_ID"));
			 * log.info(" MNGR_ID           ==>  "+rs.getInt("MANAGER_ID"));
			 * 
			 * }
			 */
		} 
		
		catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			log.info(""+e);
		} 
		
	}
}
