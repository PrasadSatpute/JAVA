package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		String sql = "SELECT * FROM books";	//Parameterized query
		try (Connection connection = DBUtil.getConnection(); 
			 PreparedStatement statement = connection.prepareStatement(sql)) {
			try( ResultSet rs = statement.executeQuery()){
				while( rs.next()) {
					System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getString(3)+"	"+rs.getString(4)+"	"+rs.getFloat(5));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		String sql = "DELETE FROM books WHERE book_id=?";	//Parameterized query
		try (Connection connection = DBUtil.getConnection(); 
			 PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, 1026);
			int count = statement.executeUpdate();
			System.out.println(count+" record deleted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		String sql = "UPDATE books SET price=? WHERE book_id=?";	//Parameterized query
		try (Connection connection = DBUtil.getConnection(); 
			 PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setFloat(1, 5000);
			statement.setInt(2, 1026);
			int count = statement.executeUpdate();
			System.out.println(count+" record updated.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		//String sql = "INSERT INTO books(book_id, subject_name, book_name, author_name, price) VALUES(?,?,?,?,?)";
		String sql = "INSERT INTO books VALUES(?,?,?,?,?)";	//Parameterized query
		try (Connection connection = DBUtil.getConnection(); 
			 PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, 1026);
			statement.setString(2, "OS");
			statement.setString(3, "LPI");
			statement.setString(4, "M.K.");
			statement.setFloat(5, 3881);
			int count = statement.executeUpdate();
			System.out.println(count+" record inserted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
