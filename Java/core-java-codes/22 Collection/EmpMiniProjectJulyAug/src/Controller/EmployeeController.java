package Controller;

import java.util.ArrayList;

import Model.Employee;
//import dao.EmployeeDAO;
import dao.EmployeeListDao;

public class EmployeeController {
	//EmployeeDAO ed = new EmployeeDAO();
	
	EmployeeListDao ed = new EmployeeListDao();
 
	public boolean addEmployee(Employee e) {
		return ed.addEmployee(e);
	}

	public Employee searchEmployeeById(int id) {
		return ed.getById(id);
	}

	public boolean updateEmployee(int id, double salary) {
		return ed.updateSalary(id, salary);
	}

	public boolean deleteEmployee(int id) {
		return ed.deleteEmployee(id);
	}

	public ArrayList displayAll() {
		return ed.getAllEmployees();

	}

}
