package com.the.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	
	private static Connection dbConn = null;
	private static Statement st= null;
	private static ResultSet rs= null;
	
	public Connection getInstance() {
		if(dbConn==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url="oracle:jdbc:thin:@localhost:1521:xe";
				String id ="c##userS";
				String pw ="userS";
				dbConn = DriverManager.getConnection(url,id,pw);
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return dbConn;
	}
}
