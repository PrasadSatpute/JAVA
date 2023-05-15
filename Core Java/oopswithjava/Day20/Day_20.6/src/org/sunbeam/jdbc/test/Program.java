package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement();) {
			String sql = "SELECT book_id, book_name, author_name, price, subject_name FROM books";
			try (ResultSet rs = statement.executeQuery(sql);) {
				while (rs.next()) {
					int bookId = rs.getInt(1);
					String bookName = rs.getString(2);
					String authorName = rs.getString(3);
					float price = rs.getFloat(4);
					String subjectName = rs.getString(5);
					System.out.printf("%-5d%-60s%-50s%-10.2f%-15s\n", bookId, bookName, authorName, price, subjectName);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
