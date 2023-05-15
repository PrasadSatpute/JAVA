package org.sunbeam.jdbc.dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.sunbeam.jdbc.pojo.Book;
import org.sunbeam.jdbc.util.DBUtil;

public class BookDao implements Closeable{
	private Connection connection;
	private CallableStatement insertStatement;
	private CallableStatement updateStatement;
	private CallableStatement deleteStatement;
	private CallableStatement selectStatement;
	public BookDao() throws Exception {
		this.connection = DBUtil.getConnection();
		this.insertStatement = this.connection.prepareCall("{call sp_insert_book(?,?,?,?,?)}");
		this.updateStatement = this.connection.prepareCall("{call sp_update_book(?,?)}");
		this.deleteStatement = this.connection.prepareCall("{call sp_delete_book(?)}");
		this.selectStatement = this.connection.prepareCall("{call sp_select_book()}");
	}
	//Create / Insert
	public int insert( Book book )throws Exception {
		this.insertStatement.setInt(1, book.getBookId());
		this.insertStatement.setString(2, book.getSubjectName());
		this.insertStatement.setString(3, book.getBookName());
		this.insertStatement.setString(4, book.getAuthorName());
		this.insertStatement.setFloat(5, book.getPrice());
		this.insertStatement.execute( );
		return this.insertStatement.getUpdateCount();
	}
	
	//Update
	public int update( int bookId, float price )throws Exception {
		this.updateStatement.setInt(1, bookId);
		this.updateStatement.setFloat(2, price);
		this.updateStatement.execute( );
		return this.updateStatement.getUpdateCount();
	}
	//Delete
	public int delete( int bookId )throws Exception {
		this.deleteStatement.setInt(1, bookId);
		this.deleteStatement.execute( );
		return this.deleteStatement.getUpdateCount();
	}
	//Retrieve / Select
	public List<Book> getBooks( ) throws Exception{
		List<Book> books = new ArrayList<Book>();
		this.selectStatement.execute();
		try (ResultSet rs = this.selectStatement.getResultSet()) {
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
