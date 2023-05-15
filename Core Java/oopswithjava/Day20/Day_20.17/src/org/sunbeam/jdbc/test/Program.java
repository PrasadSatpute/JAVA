package org.sunbeam.jdbc.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		try (Connection connection = DBUtil.getConnection();
			 CallableStatement statement = connection.prepareCall("{call sp_fund_transfer(?,?,?,?,?)}")) {
			statement.setInt(1, 1001);
			statement.setInt(2, 1002);
			statement.setFloat(3, 5000);
			
			statement.registerOutParameter(4, Types.FLOAT);
			statement.registerOutParameter(5, Types.FLOAT);
			
			statement.execute();
			
			System.out.println("Source Balance		:	"+statement.getFloat(4));
			System.out.println("Destination Balance	:	"+statement.getFloat(5));
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
