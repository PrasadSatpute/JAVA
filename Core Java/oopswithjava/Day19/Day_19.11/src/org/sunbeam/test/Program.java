//Step 1 : include .jar file in classpath/buildpath
package org.sunbeam.test;
//Step 2 : Import sql package;
import java.sql.*;
public class Program {
	public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/sunbeam_db";
	public static final String USERNAME = "sunbeam";
	public static final String PASSWORD = "sunbeam";
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			//Step 3 : Load and register driver
			Class.forName(DRIVER_CLASS);
			//Step 4 : Establish connection using users credential
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//Step 5 : Create Statement
			statement = connection.createStatement();
			//Step 6 : Prepare and execute query 
			String email = "sandeepkulange@gmail.com' or '1'='1"; //SQL Injection
			String password = "";
			String sql = "SELECT * FROM users WHERE email='"+email+"' and password='"+password+"'";
			ResultSet rs = statement.executeQuery(sql);
			while( rs.next()) {
				System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getString(3)+"	"+rs.getString(4));
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}finally {
			try {
				//Step 7 : Close resources
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
