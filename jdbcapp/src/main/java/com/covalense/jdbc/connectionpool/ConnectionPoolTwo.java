package com.covalense.jdbc.connectionpool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPoolTwo {
	
	
	private Vector<Connection> pool ;
	private int poolSize;
	private String dbUrl ;
	private String userNM ;
	private String password ;
	
	private String driverClassNM ;
	private static ConnectionPoolTwo poolRef= null;
	public static ConnectionPoolTwo getConnectionPool() throws Exception {
		if(poolRef==null) {
			poolRef = new ConnectionPoolTwo();
		}
		return poolRef;
	}
	private void loadProperties() throws Exception {
	
	poolSize= Integer.parseInt(PropertyUtil.getConnectionUtil().getProperty(ConnectionPoolConstant.POOL_SIZE));
	dbUrl = PropertyUtil.getConnectionUtil().getProperty(ConnectionPoolConstant.DB_URL);
	userNM= PropertyUtil.getConnectionUtil().getProperty(ConnectionPoolConstant.USER_NM);
	password=PropertyUtil.getConnectionUtil().getProperty(ConnectionPoolConstant.PASSWORD);
	driverClassNM= PropertyUtil.getConnectionUtil().getProperty(ConnectionPoolConstant.DRIVER_CLASS_NM);
	}
	
	private void intializePool() throws Exception{
		pool = new Vector<>();
		Connection con = null;
		Class.forName(driverClassNM);
		for (int i = 0; i < poolSize; i++) {

			Class.forName(driverClassNM);
			con = DriverManager.getConnection(dbUrl, userNM, password);
			pool.add(con);
	}
	}
	
	private ConnectionPoolTwo() throws Exception  {
		loadProperties();
		intializePool();

		 // end of for
	}// end of constructor

	public Connection getConnectionFromPool() {

		return pool.remove(0);
	}
	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
	
	
}// end of class
