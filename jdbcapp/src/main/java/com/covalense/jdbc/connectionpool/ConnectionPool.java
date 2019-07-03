package com.covalense.jdbc.connectionpool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class ConnectionPool {
	private ArrayList<Connection> pool = new ArrayList<Connection>();
	private int poolSize = 10;
	private String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
	private String userNM = "root";
	private String password = "root";
	private Connection con = null;
	private String driverClassNM = "com.mysql.jdbc.Driver";
	private static ConnectionPool poolRef= null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if(poolRef==null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private ConnectionPool() throws Exception {
		for (int i = 0; i < poolSize; i++) {

			Class.forName(driverClassNM);
			con = DriverManager.getConnection(dbUrl, userNM, password);
			pool.add(con);

		} // end of for
	}// end of constructor

	public Connection getConnectionFromPool() {

		return pool.remove(0);
	}
	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
	
	
}// end of class
