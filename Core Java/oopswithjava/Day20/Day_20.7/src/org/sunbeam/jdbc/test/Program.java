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
		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement();) {
			String sql = "SELECT * FROM books";
			try (ResultSet rs = statement.executeQuery(sql);) {
				List<Book> books = new ArrayList<Book>();
				while (rs.next())
					books.add(new Book(rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"),  rs.getString("author_name"), rs.getFloat("price")));
				books.forEach(System.out::println);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main4(String[] args) {
		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement();) {
			String sql = "SELECT * FROM books";
			try (ResultSet rs = statement.executeQuery(sql);) {
				while (rs.next()) {
					Book book = new Book(rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"),  rs.getString("author_name"), rs.getFloat("price"));
					System.out.println(book.toString());
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement();) {
			String sql = "SELECT * FROM books";
			try (ResultSet rs = statement.executeQuery(sql);) {
				while (rs.next()) {
					Book book = new Book();
					book.setBookId(rs.getInt("book_id"));
					book.setSubjectName(rs.getString("subject_name"));
					book.setBookName(rs.getString("book_name"));
					book.setAuthorName(rs.getString("author_name"));
					book.setPrice(rs.getFloat("price"));
					System.out.println(book.toString());
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement();) {
			String sql = "SELECT * FROM books";
			try (ResultSet rs = statement.executeQuery(sql);) {
				while (rs.next()) {
					Book book = new Book();
					int bookId = rs.getInt("book_id");
					book.setBookId(bookId);
					
					String subjectName = rs.getString("subject_name");
					book.setSubjectName(subjectName);
					
					String bookName = rs.getString("book_name");
					book.setBookName(bookName);
					
					String authorName = rs.getString("author_name");
					book.setAuthorName(authorName);
					
					float price = rs.getFloat("price");
					book.setPrice(price);
					
					System.out.println(book.toString());
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement();) {
			String sql = "SELECT * FROM books";
			try (ResultSet rs = statement.executeQuery(sql);) {
				while (rs.next()) {
					Book book = new Book();
					int bookId = rs.getInt(1);
					book.setBookId(bookId);
					
					String subjectName = rs.getString(2);
					book.setSubjectName(subjectName);
					
					String bookName = rs.getString(3);
					book.setBookName(bookName);
					
					String authorName = rs.getString(4);
					book.setAuthorName(authorName);
					
					float price = rs.getFloat(5);
					book.setPrice(price);
					
					System.out.println(book.toString());
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
