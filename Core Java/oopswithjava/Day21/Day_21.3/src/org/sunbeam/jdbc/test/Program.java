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
			 Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			
			DatabaseMetaData metadata = connection.getMetaData();
			
			System.out.println(metadata.supportsResultSetType( ResultSet.TYPE_FORWARD_ONLY)); //true
			System.out.println(metadata.supportsResultSetType( ResultSet.TYPE_SCROLL_INSENSITIVE)); //true
			System.out.println(metadata.supportsResultSetType( ResultSet.TYPE_SCROLL_SENSITIVE)); //false
			
			System.out.println();
			
			System.out.println( metadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)); //true
			System.out.println( metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)); //true
			System.out.println( metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)); //false
			
			System.out.println();
			
			System.out.println( metadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)); //true
			System.out.println( metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)); //true
			System.out.println( metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)); //false
			
			System.out.println();
			
			System.out.println(metadata.supportsResultSetHoldability( ResultSet.CLOSE_CURSORS_AT_COMMIT)); //false
			System.out.println(metadata.supportsResultSetHoldability( ResultSet.HOLD_CURSORS_OVER_COMMIT)); //true
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
					while( rs.next())
						Program.printRow( rs );
				}
				
				System.out.println();
				
				if( rs.isAfterLast()) {
					while( rs.previous())
						Program.printRow( rs );
				}
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
