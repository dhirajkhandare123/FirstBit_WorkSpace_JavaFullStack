package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DBConnection {
	Connection con;
	
	public Connection getConnection() {
		FileInputStream fis = null;
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(".//Resources//dbconfig.properties");
			prop.load(fis);
			String url = (String) prop.get("url");
			String username = (String) prop.get("username");
			String passsword = (String) prop.get("password");
			con = DriverManager.getConnection(url, username, passsword);
			
		} catch (SQLException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
	
}
