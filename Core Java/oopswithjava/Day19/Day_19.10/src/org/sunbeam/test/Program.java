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
			String sql = "SELECT * FROM books";
			//DML : INSERT, UPDATE, DELETE => int executeUpdate( );
			//DQL : SELECT => ResultSet executeQuery( )
			
			ResultSet rs = statement.executeQuery(sql);
			
			while( rs.next()) {
				int bookId = rs.getInt(1);
				String subjectName = rs.getString(2);
				String bookName = rs.getString(3);
				String authorName = rs.getString(4);
				float price = rs.getFloat(5);
				
				System.out.printf("%-5d%-10s%-65s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price );
			}
			
			rs.close();
			
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
