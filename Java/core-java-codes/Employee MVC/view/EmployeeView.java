package view;

import java.util.Scanner;

import controller.EmployeeController;
import model.Employee;
import model.HR;
import model.SalesManager;

public class EmployeeView {

	EmployeeController controller;

	public EmployeeView(EmployeeController ec1) {
		super();
		this.controller = ec1;
	}
	
	public void showMenu() {
		
		int choice;
		
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Calculate Salary");
			System.out.println("6. Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			
			
			switch(choice) {
			
				case 1:{
					System.out.println("1.HR\n2.Admin\n3.Sales Manager");
					int ch;
					ch = sc.nextInt();
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Salary: ");
					double salary = sc.nextDouble();
					if(ch==1) {
						System.out.println("Enter Commission: ");
						double comm = sc.nextDouble();
						HR h1 = new HR(id,name,salary,comm);
						if(controller.addEmployee(h1)) {
							System.out.println("HR Added!!!!!!");
						}
						else {
							System.out.println("Error: HR not Added!!!!");
						}
					}
					else if(ch==2) {
						System.out.println("Enter target: ");
						int target = sc.nextInt();
						System.out.println("Enter incentives: ");
						double incentive = sc.nextDouble();
						SalesManager s1 = new SalesManager(id, name, salary, target, incentive);
						controller.addEmployee(s1);
					}
					else if(ch==3) {
						
					}
					else {
						System.out.println("Error: Enter valid input.......");
					}
					
					break;
					
				}
				
				case 2:{
					System.out.println("Enter ID: ");
					int empId = sc.nextInt();
					Employee res = controller.searchEmployee(empId);
					if(res!=null) {
						System.out.println("Employee Found!!!");
						System.out.println(res);
					}
					else {
						System.out.println("Not found!!!");
					}
					break;
					
				}
				
				
				
			}
			
			
			
			
			
		}while(choice!=6);
		
		
	}
}
