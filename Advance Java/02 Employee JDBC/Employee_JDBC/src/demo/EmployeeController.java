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

	public int deleteEmployeeById(int did) {
		try {
			return employeeService.deleteEmpById(did);
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	public int update(Employee emp1) {
		try {
			return employeeService.updateEmployee(emp1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

	public ArrayList<Employee> sortEmployee() {
		// TODO Auto-generated method stub
		try {
			return employeeService.sortBySalary();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
