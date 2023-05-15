package org.sunbeam.jdbc.util;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
	private static Properties prop;
	static {
		try {
			prop = new Properties();
			prop.load(new FileReader("Config.properties"));
			Class.forName( prop.getProperty("DRIVER") );
		}catch (Exception cause) {
			throw new RuntimeException( cause );
		}
	}
	public static Connection getConnection( ) throws Exception {
		return DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PASSWORD"));
	}
}
