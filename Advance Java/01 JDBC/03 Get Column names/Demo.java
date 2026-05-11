package demo;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		try {
			// Load Driver
			// no need to load driver class manually in new version
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","pass1234");
			
			// Statement
			Statement stmt = con.createStatement();
			
			// fire query and store result in resultset
			ResultSet result = stmt.executeQuery("select *from employee");
			
			ResultSetMetaData metadata = result.getMetaData();
			
			int x = metadata.getColumnCount();
			
			for(int i=1;i<=x;i++) {
				System.out.println(metadata.getColumnName(i));
			}
			
//			System.out.println("Id    Name    Salary");
//			while(result.next()) {
//			
//				System.out.println(result.getInt(1) +"    "+ result.getString(2) +"    "+ result.getDouble(3) );
//			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
