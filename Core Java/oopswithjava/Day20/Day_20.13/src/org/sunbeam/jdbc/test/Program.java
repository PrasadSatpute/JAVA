package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		String email = "sandeepkulange@gmail.com' or '1' = '1";
		String password="";
		String sql = "SELECT * FROM users WHERE email=? and password=?";
		try (Connection connection = DBUtil.getConnection();
			 PreparedStatement statement = connection.prepareStatement(sql)) {
			 statement.setString(1, email);
			 statement.setString(2, password);
			try( ResultSet rs = statement.executeQuery()){
				if( rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
				}
			}
			System.out.println("I am here");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
