class Employee {

// Attributes

	int id;
	String name;
	double salary;

//default constructor

	Employee() {
		this.id = 452;
		this.name = "kunal";
		this.salary = 45000;

	}

//parameter constructor

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	// setter
	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	// getters

	int getId() {
		return this.id;
	}

	String getName() {
		return this.name;
	}

	double getSalary() {
		return this.salary;
	}

	// display

	void display() {

		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println(" salary is " + salary);
	}

	double calSal() {
		return salary;
	}

}// Employee class end here

class Admin extends Employee {

	double allowance; // attributes

	// default constructor

	Admin() {
		super(); // call employee super class attributes
		this.allowance = 2000;

	}

	// parameter constructor
	Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);// call employee super class
		this.allowance = allowance;
	}
// getter setter

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display() {
		super.display();
		System.out.println("Allowance" + allowance);
	}

	double calSal() {
		return salary + allowance;
	}

}// class Admin end here

class SalesManager extends Employee {
	double incentive;
	double target;

//default constructor

	SalesManager() {
		super();// calling employee of super class Attributes
		this.incentive = 2500;
		this.target = 40;
	}
//parameterize constructor

	SalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);// call Employee

		this.incentive = incentive;
		this.target = target;
	}

//getter setter
	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

//display 

	void display() {
		super.display();// display all from employee and Admin
		System.out.println("incentive" + incentive);
		System.out.println("target" + target);
	}

	double calSal() {
		return salary + incentive;
	}

}// salemanager class end here

class HR extends Employee {
	double commission;

//default constructor

	HR() {
		super();
		this.commission = 10000;
	}

//parameter constructor
	HR(int id, String name, double salary, double commission)

	{

		super(id, name, salary);
		this.commission = commission;

	}

// getter setter
	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	void display() {
		super.display();
		System.out.println("commission" + commission);
	}

	double calSal() {
		return salary + commission;
	}

}// HR class end here

public class EmployeeTestPoly {

	public static void main(String[] args) {

		Employee e1;// generic reference (super class)

		e1 = new Employee(101, "sachin", 10000);// reference of generic class emp
		e1.display();
		System.out.println("Calculate salary: "+e1.calSal());
		System.out.println();

		e1 = new Admin(102, "rohit", 23000, 300);// reference of generic class emp and object of special class
		// for all class admin , salemanager, HR
		e1.display();
		System.out.println("Calculate salary: "+e1.calSal());

		System.out.println();

		e1 = new SalesManager(103, "virat", 45000, 500, 200);// up casting happens here
		e1.display();
		System.out.println("Calculate salary: "+e1.calSal());

		System.out.println();

		e1 = new HR(104, "janak", 40000, 5000);// up casting
		e1.display();
		System.out.println("Calculate salary: "+e1.calSal());

	}// “In polymorphism, I should not create separate object. Only I have to give
		// them reference of super class.”
		// In polymorphism, we still create different child class objects
		// (Admin, SalesManager, HR), but we use only one parent class reference
		// (Employee) to refer to all of them.
}