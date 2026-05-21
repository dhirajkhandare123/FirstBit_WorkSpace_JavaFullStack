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

	public int deleteEmpById(int did) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.deleteById(did);
	}

	public int updateEmployee(Employee emp1) throws SQLException {
		return employeeDAO.updateEmployee(emp1);
		
	}

	public ArrayList<Employee> sortBySalary() throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.sortBySalary();
	}

}
