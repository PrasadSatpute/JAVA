package org.sunbeam.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.sunbeam.jdbc.util.DBUtil;

public class Program {
	public static void main(String[] args) {
		String email = "sandeepkulange@gmail.com' or '1' = '1";
		String password="";
		try (Connection connection = DBUtil.getConnection();
			 Statement statement = connection.createStatement();) {
			
			String sql = "SELECT * FROM users WHERE email='"+email+"' and password='"+password+"'";
			System.out.println(sql);
			try( ResultSet rs = statement.executeQuery(sql)){
				if( rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
