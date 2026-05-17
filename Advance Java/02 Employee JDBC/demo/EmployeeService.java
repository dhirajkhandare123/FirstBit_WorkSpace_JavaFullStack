package demo;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {
	
	EmployeeDAO employeeDAO = new EmployeeDAO();

	public ArrayList<Employee> showAllEmployees() throws SQLException {
		
		return employeeDAO.getAllEmployee();
		
	}

	public int addEmployee(Employee emp) throws SQLException {
		return employeeDAO.addEmployee(emp);
		
	}

}
