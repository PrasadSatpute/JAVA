package org.sunbeam.jdbc.test;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Program {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/sunbeam_db";
	public static final String USER = "sunbeam";
	public static final String PASSWORD = "sunbeam";
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			//Step 3 : Load and register Driver
			Class.forName( DRIVER);
			
			//Step 4 : Establish connection Using users credentials
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//Step 5 : Create Statement object to execute query
			statement = connection.createStatement();
			
			//Step 6 : Prepare and execute query
			String sql = "SELECT book_id, book_name, author_name, price, subject_name FROM books";
			ResultSet rs = statement.executeQuery(sql);
			
			while( rs.next() ) {
				int bookId = rs.getInt(1);
				String bookName = rs.getString(2);
				String authorName = rs.getString(3);
				float price = rs.getFloat(4);
				String subjectName = rs.getString(5);
				System.out.printf("%-5d%-60s%-50s%-10.2f%-15s\n", bookId, bookName, authorName, price, subjectName );
			}

			rs.close();
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}finally {
			try {
				//Step 7 : Close the resources
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
