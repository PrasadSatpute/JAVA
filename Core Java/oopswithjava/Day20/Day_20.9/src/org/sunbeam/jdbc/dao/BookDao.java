package org.sunbeam.jdbc.dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.sunbeam.jdbc.pojo.Book;
import org.sunbeam.jdbc.util.DBUtil;

public class BookDao implements Closeable{
	private Connection connection;
	private Statement statement;
	public BookDao() throws Exception {
		this.connection = DBUtil.getConnection();
		this.statement = this.connection.createStatement();
	}
	//Create / Insert
	public int insert( Book book )throws Exception {
		String sql = "INSERT INTO books VALUES("+book.getBookId()+",'"+book.getSubjectName()+"','"+book.getBookName()+"','"+book.getAuthorName()+"',"+book.getPrice()+")";
		return this.statement.executeUpdate(sql);
	}
	
	//Update
	public int update( int bookId, float price )throws Exception {
		String sql = "UPDATE books SET price="+price+" WHERE book_id="+bookId;
		return this.statement.executeUpdate(sql);
	}
	//Delete
	public int delete( int bookId )throws Exception {
		String sql = "DELETE FROM books WHERE book_id="+bookId;
		return this.statement.executeUpdate(sql);
	}
	//Retrieve / Select
	public List<Book> getBooks( ) throws Exception{
		String sql = "SELECT * FROM books";
		List<Book> books = new ArrayList<Book>();
		try (ResultSet rs = statement.executeQuery(sql);) {
			while (rs.next())
				books.add(new Book(rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"),  rs.getString("author_name"), rs.getFloat("price")));
		}
		return books;
	}
	@Override
	public void close() throws IOException {
		try {
			this.statement.close();
			this.connection.close();
		} catch (SQLException cause) {
			throw new IOException(cause);
		}
	}
}
