package org.sunbeam.jdbc.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		String sql = "{call sp_select_book()}";	
		try (Connection connection = DBUtil.getConnection(); 
				CallableStatement statement = connection.prepareCall(sql)) {
			
			boolean status = statement.execute();
			System.out.println("Status	:	"+status);	//false
			
			try( ResultSet rs = statement.getResultSet()){
				while( rs.next()) {
					System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getString(3)+"	"+rs.getString(4)+"	"+rs.getFloat(5));
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		String sql = "{ call sp_delete_book(?)}";	
		try (Connection connection = DBUtil.getConnection(); 
			 CallableStatement statement = connection.prepareCall(sql)) {
			statement.setInt(1, 1026);
			boolean status = statement.execute();
			System.out.println("Status	:	"+status);	//false
			System.out.println("Count	:	"+statement.getUpdateCount());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		String sql = "{ call sp_update_book(?,?)}";	
		try (Connection connection = DBUtil.getConnection(); 
			 CallableStatement statement = connection.prepareCall(sql)) {
			statement.setInt(1, 1026);
			statement.setFloat(2, 5000);
			boolean status = statement.execute();
			System.out.println("Status	:	"+status);	//false
			System.out.println("Count	:	"+statement.getUpdateCount());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		// {call <procedure-name>[(<arg1>,<arg2>, ...)]}
		String sql = "{call sp_insert_book(?,?,?,?,?)}";
		try (Connection connection = DBUtil.getConnection(); 
			 CallableStatement statement = connection.prepareCall(sql)) {
			statement.setInt(1, 1026);
			statement.setString(2, "OS");
			statement.setString(3, "LPI");
			statement.setString(4, "M.K.");
			statement.setFloat(5, 3881);
			
			boolean status = statement.execute();
			System.out.println("Status	:	"+status);	//false
			System.out.println("Count	:	"+statement.getUpdateCount());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
