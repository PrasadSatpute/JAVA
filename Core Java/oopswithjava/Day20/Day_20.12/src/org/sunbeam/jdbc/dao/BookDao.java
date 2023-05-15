package org.sunbeam.jdbc.dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.sunbeam.jdbc.pojo.Book;
import org.sunbeam.jdbc.util.DBUtil;

public class BookDao implements Closeable{
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement selectStatement;
	public BookDao() throws Exception {
		this.connection = DBUtil.getConnection();
		this.insertStatement = this.connection.prepareStatement("INSERT INTO books VALUES(?,?,?,?,?)");
		this.updateStatement = this.connection.prepareStatement("UPDATE books SET price = ? WHERE book_id=?");
		this.deleteStatement = this.connection.prepareStatement("DELETE FROM books WHERE book_id=?");
		this.selectStatement = this.connection.prepareStatement("SELECT * FROM books");
	}
	//Create / Insert
	public int insert( Book book )throws Exception {
		this.insertStatement.setInt(1, book.getBookId());
		this.insertStatement.setString(2, book.getSubjectName());
		this.insertStatement.setString(3, book.getBookName());
		this.insertStatement.setString(4, book.getAuthorName());
		this.insertStatement.setFloat(5, book.getPrice());
		return this.insertStatement.executeUpdate();
	}
	
	//Update
	public int update( int bookId, float price )throws Exception {
		this.updateStatement.setFloat(1, price);
		this.updateStatement.setInt(2, bookId);
		return this.updateStatement.executeUpdate();
	}
	//Delete
	public int delete( int bookId )throws Exception {
		this.deleteStatement.setInt(1, bookId);
		return this.deleteStatement.executeUpdate();
	}
	//Retrieve / Select
	public List<Book> getBooks( ) throws Exception{
		List<Book> books = new ArrayList<Book>();
		try (ResultSet rs = this.selectStatement.executeQuery();) {
			while (rs.next())
				books.add(new Book(rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"),  rs.getString("author_name"), rs.getFloat("price")));
		}
		return books;
	}
	@Override
	public void close() throws IOException {
		try {
			this.insertStatement.close();
			this.updateStatement.close();
			this.deleteStatement.close();
			this.selectStatement.close();
			this.connection.close();
		} catch (SQLException cause) {
			throw new IOException(cause);
		}
	}
}
