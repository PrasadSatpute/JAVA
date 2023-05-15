package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.sunbeam.jdbc.pojo.Book;
import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		try (Connection connection = DBUtil.getConnection(); 
			 Statement statement = connection.createStatement();) {
			String sql = "DELETE FROM books WHERE book_id=1026";
			int count = statement.executeUpdate(sql);
			System.out.println(count+" record deleted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try (Connection connection = DBUtil.getConnection(); 
			 Statement statement = connection.createStatement();) {
			String sql = "UPDATE books SET price=5000 WHERE book_id=1026";
			int count = statement.executeUpdate(sql);
			System.out.println(count+" record updated.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try (Connection connection = DBUtil.getConnection(); 
			 Statement statement = connection.createStatement();) {
			String sql = "INSERT INTO books VALUES(1026,'OS','LPI', 'Micheal Kerrisk', 3801)";
			int count = statement.executeUpdate(sql);
			System.out.println(count+" record inserted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
