package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection con;
	static Connection getMyConnection() {
		if(con==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/HT_CoreProject";
				con=DriverManager.getConnection(url,"root","ADi915868*");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}//get
	public static void closeMyConnection() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
