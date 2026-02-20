class Employee{
	int id;
	String name;
	double salary;
	Employee() {

		this.id = 0;
		this.name = "Not given";
		this.salary = 0;
	}
	
	Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {

		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
		System.out.println();
	}
	
}

//	====== Employee class ends here =======


class Admin extends Employee{
	double allowance;
	

	Admin() {
		super();
		allowance = 7;
	}

	Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}
	
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display() {
		super.display();
		System.out.println("Allowance: "+this.allowance);
		System.out.println();
	}
	
}

//  ========== class Admin ends here ===========

class SalesManager extends Employee{
	double incentive;
	double target;
	
	SalesManager() {
		super();
		this.incentive = 0;
		this.target = 0;
	}
	
	SalesManager(int id, String name, double salary,double incentive, double target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}

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
	
	void display() {
		super.display();
		System.out.println("Incentives: "+this.incentive);
		System.out.println("Target: "+this.target);
		System.out.println();
	}
}

//  ===== class SalesManager ends here =========

class Hr extends Employee{
	double commission;
	
	Hr() {
		super();
		this.commission = 0;
	}
	
	Hr(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		super.display();
		System.out.println("Commission: "+this.commission);
		System.out.println();
	}
}

//  ======= class Hr ends here ==========

public class FbsInheritance01 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Dhiraj",70000);
		e1.display();
		
		Hr h1 = new Hr(101,"Roy",40000,5000);
		h1.display();
		
		Admin a1 = new Admin(103,"Om",71000, 10);
		a1.display();
		
		
	}

}








//HR is-a Employee 
//• commission