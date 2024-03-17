package org.sunbeam.jdbc.test;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class Program {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			
			Reader reader = new FileReader("Config.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName( prop.getProperty("DRIVER") );
			
			//Step 4 : Establish connection Using users credentials
			connection = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PASSWORD"));
			
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