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
			 Statement statement = connection.createStatement( ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
			String sql = "SELECT * FROM books";
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				while( rs.next()) {
					if( rs.getInt("book_id") == 1011 ) {
						rs.deleteRow();
						break;
					}
				}
			}
			
			try( ResultSet rs = statement.executeQuery(sql)){ //Read-Only / Scrollable
				while( rs.next()) {
					Program.printRow(rs);
				}
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
