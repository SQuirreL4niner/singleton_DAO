package net.eprojex.DAO.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static Database instance = new Database();
	
	
	
	private Connection con;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
////////////////////////////////////////////////////////////
	//////////// Below is the old way of creating a singleton instance variable object
	///////////  that can't be changed. But it is not thread safe  because 
	//////////   multiple threads can access the variable at the same time
	
	
	/*private static Database instanceOld;
	
	public static Database getInstanceOld() {
		if(instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}*/
	
	public Connection getConnection() {
		return con;
	}
	public void connect () throws Exception {
		if (con!= null)
			return;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new Exception("Driver not found");
		}
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","none");
		
		//con = DiverManager.getConnection(url, "squi")
		//System.out.println("Connected to database");
		
	}
	
	public void disconnect() {
		if (con != null) {
			try {
				con.close();
			
			} catch (SQLException e) {
				System.out.println("Can't close connection");
			}
		}
		
		//System.out.println("Disconnected fromt the database");
		con = null;
	}
	
}
