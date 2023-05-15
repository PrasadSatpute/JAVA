package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try{
			connection = DBUtil.getConnection();
			
			//Step 1 : Disable auto commit
			connection.setAutoCommit(false);
			
			statement = connection.createStatement(); 
					 
			String sql1 = "UPDATE accounts SET balance = balance - 5000 WHERE acc_number=1001";
			statement.executeUpdate(sql1);
			
			int x = 10, y = 2, z;
			z = x / y;	//ArithmeticException
			
			String sql2 = "UPDATE accounts SET balance = balance + 5000 WHERE acc_number=1002";
			statement.executeUpdate(sql2);
			
			System.out.println("Fund transfered successfully.");
			//Step 2 : If no exception then commit the transaction
			connection.commit();
		} catch (Exception ex) {
			try {
				ex.printStackTrace();
				//Step 3 : Rollback the transaction
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main1(String[] args) {
		try (Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement() ) {
			
			String sql1 = "UPDATE accounts SET balance = balance - 5000 WHERE acc_number=1001";
			statement.executeUpdate(sql1);
			
			int x = 10, y = 0, z;
			z = x / y;	//ArithmeticException
			
			String sql2 = "UPDATE accounts SET balance = balance + 5000 WHERE acc_number=1002";
			statement.executeUpdate(sql2);
			
			System.out.println("Fund transfered successfully.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
