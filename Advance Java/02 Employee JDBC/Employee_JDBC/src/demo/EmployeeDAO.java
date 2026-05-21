package demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;



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
	
	public int deleteById(int did) throws SQLException {
		Connection con = dbc.getConnection();
		Statement stmt = con.createStatement();
		return stmt.executeUpdate("delete from employee where id = " + did);
	}

	public int updateEmployee(Employee emp1) throws SQLException {
		Connection con = dbc.getConnection();
		Statement stmt = con.createStatement();
		return stmt.executeUpdate(
				"update employee set name = '"+emp1.getName() 
				+ "', salary = " + emp1.getSalary() 
				+ "where id = "+emp1.getId());
		
	}

	public ArrayList<Employee> sortBySalary() throws SQLException {
		Connection con = dbc.getConnection();
		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery("select * from employee");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		while(resultSet.next()) {
			Employee emp = new Employee();
			emp.setId(resultSet.getInt(1));
			emp.setName(resultSet.getString(2));
			emp.setSalary(resultSet.getDouble(3));
			
			list.add(emp);
		}
		
		Collections.sort(list, new SalaryComparator());
		return list;
	}

	
}
