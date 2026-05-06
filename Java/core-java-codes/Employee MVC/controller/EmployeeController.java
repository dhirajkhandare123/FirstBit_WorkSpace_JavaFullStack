package controller;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeController {

	EmployeeDAO dao = new EmployeeDAO();
	
	public boolean addEmployee(Employee e1) {
		return dao.createEmployee(e1);
		
	}

	public Employee searchEmployee(int empId) {
		return dao.getEmployeeById(empId);
		
	}

}
