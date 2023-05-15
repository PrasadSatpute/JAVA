package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sunbeam.jdbc.pojo.Book;
import org.sunbeam.jdbc.util.DBUtil;
public class Program {
	private static void printRow(ResultSet rs) throws Exception{
		Book book = new Book( rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"), rs.getString("author_name"), rs.getFloat("price"));
		System.out.println(book.toString());
	}
	public static void main(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				rs.afterLast();
				if( rs.isAfterLast()) {
					rs.previous();
					rs.previous();
					rs.previous();
					rs.previous();
					rs.previous();
					
					if( rs.absolute(-3)) //Moves the cursor a relative number of rows, either positive or negative.
						Program.printRow(rs); //1008 More Effective C++  619.00    
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main5(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				rs.afterLast();
				if( rs.isAfterLast()) {
					rs.previous();
					rs.previous();
					rs.previous();
					rs.previous();
					rs.previous();
					
					if( rs.relative(-3)) //Moves the cursor a relative number of rows, either positive or negative.
						Program.printRow(rs); //1008 More Effective C++  619.00    
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main4(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				if( rs.isBeforeFirst()) {
					rs.next();	//Cursor position : First Record
					rs.next();	//Cursor position : Second Record
					rs.next();	//Cursor position : Third Record
					
					if( rs.relative(5)) //Moves the cursor a relative number of rows, either positive or negative.
						Program.printRow(rs); //1008 More Effective C++  619.00    
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				if( rs.isBeforeFirst()) {
					rs.next();	//Cursor position : First Record
					rs.next();	//Cursor position : Second Record
					rs.next();	//Cursor position : Third Record
					
					if( rs.absolute(5)) //Moves the cursor to the given row number in this ResultSet object.
						Program.printRow(rs); //1005 Head First C 800.00  
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				if( rs.isBeforeFirst()) {
					
					rs.afterLast();	//Cursor position is set to after last
					while( rs.previous())
						Program.printRow(rs);
					
					System.out.println();
					
					while( rs.next())
						Program.printRow(rs);
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				if( rs.isBeforeFirst()) {
					//Print only first record
					if( rs.first())
						Program.printRow(rs);
				
					//Print only last record
					if( rs.last())
						Program.printRow(rs);
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
