package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeController ec = new EmployeeController();
		
		int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employee");
            System.out.println("5. Sort Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    // INSERT CODE
                	System.out.println("Enter ID: ");
                	int eid = sc.nextInt();
                	
                	sc.nextLine();
                	System.out.println("Enter name: ");
                	
                	String name = sc.nextLine();
                	
                	System.out.println("Enter salary: ");
                	double salary = sc.nextDouble();
                	
                	Employee emp = new Employee(eid,name,salary);
                	int res = ec.addEmployee(emp);
                	
                	if(res == 1) {
                		System.out.println("Employee added successfully");
                	}
                	else {
                		System.out.println("Filed to add");
                	}

                    break;

                case 2:

                    // UPDATE CODE

                    break;

                case 3:

                    // DELETE CODE

                    break;

                case 4:
				
				ArrayList<Employee> emplist = ec.displayAllEmployees();
            		
            		for(Employee employee: emplist) {
            			System.out.println(employee);
            		}

                    break;

                case 5:

                    // SORT CODE

                    break;

                case 6:

                    System.out.println("Program Exited");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
        
        sc.close();

	}

}

