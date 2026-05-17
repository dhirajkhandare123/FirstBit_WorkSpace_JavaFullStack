package demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class EmployeeDAO {
	DBConnection dbc = new DBConnection();
	
	public ArrayList<Employee> getAllEmployee() throws SQLException{
		Connection con = dbc.getConnection();
		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery("select * from employee");
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		while(resultSet.next()) {
			Employee emp = new Employee();
			emp.setId(resultSet.getInt(1));
			emp.setName(resultSet.getString(2));
			emp.setSalary(resultSet.getDouble(3));
			
			emplist.add(emp);
		}
		
		return emplist;
	}

	public int addEmployee(Employee emp) throws SQLException {
		Connection con = dbc.getConnection();
		Statement stmt = con.createStatement();
		return stmt.executeUpdate(
			    "insert into employee values(" 
			    + emp.getId() + ",'"
			    + emp.getName() + "',"
			    + emp.getSalary() + ")"
			);
		
	}
}
