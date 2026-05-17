package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {
	Connection con;
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","pass1234");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		
		return con;
	}
	
}
