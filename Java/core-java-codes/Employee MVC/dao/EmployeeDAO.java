package dao;

import model.Employee;

public class EmployeeDAO {
	
	Employee[] arr;
	
	int count;
	
	public EmployeeDAO() {
		this.arr = new Employee[10];
		this.count = 0;
	}


	public boolean createEmployee(Employee e1) {
		this.arr[count] = e1;
		count++;
		return true;
	}


	public Employee getEmployeeById(int empId) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getId() == empId) {
				return arr[i];
			}
		}
		return null;
		
	}
	
	
	
}

// only three methods are in this class
// createEmployee()
// getEmployee()
// getAllEmployee()

// DAO - access data for database
// DTO - what response to send frontend/ view