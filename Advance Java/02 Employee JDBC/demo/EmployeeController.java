package demo;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeController {
	
	EmployeeService employeeService = new EmployeeService();
	
	public ArrayList<Employee> displayAllEmployees() {
		try {
			return employeeService.showAllEmployees();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public int addEmployee(Employee emp) {
		try {
			return employeeService.addEmployee(emp);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
}
