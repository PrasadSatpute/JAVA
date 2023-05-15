package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sunbeam.jdbc.pojo.Book;
import org.sunbeam.jdbc.util.DBUtil;

/* Consider methods of java.sql.Connection interface
1. Statement createStatement()throws SQLException
2. Statement createStatement(int resultSetType, int resultSetConcurrency)throws SQLException
3. Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)throws SQLException 

	- resultSetType - one of the following ResultSet constants: 
		1. ResultSet.TYPE_FORWARD_ONLY
		2. ResultSet.TYPE_SCROLL_INSENSITIVE
		3. ResultSet.TYPE_SCROLL_SENSITIVE
	- resultSetConcurrency - one of the following ResultSet constants: 
		1. ResultSet.CONCUR_READ_ONLY
		2. ResultSet.CONCUR_UPDATABLE
	- resultSetHoldability - one of the following ResultSet constants: 
		1. ResultSet.HOLD_CURSORS_OVER_COMMIT
		2. ResultSet.CLOSE_CURSORS_AT_COMMIT
*/

public class Program {
	private static void printRow(ResultSet rs) throws Exception{
		Book book = new Book( rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"), rs.getString("author_name"), rs.getFloat("price"));
		System.out.println(book.toString());
	}
	public static void main(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement( ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / forward-only
				while( rs.next())
					Program.printRow( rs );
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try( Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement()){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / forward-only
				while( rs.next())
					Program.printRow( rs );
			}
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
