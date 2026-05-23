// Object class

class Employee extends Object{
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
	
	
	
	
	double calSal() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "id=" + id + "\n name=" + name + "\n salary=" + salary;
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

	
	
	double calSal() {
		return this.salary+this.allowance;
	}

	@Override
	public String toString() {
		return super.toString()+"allowance=" + allowance + "\n Total salary=" + calSal();
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
	
	
	
	double calSal() {
		return this.salary+this.incentive;
	}

	@Override
	public String toString() {
		return super.toString()+"\n incentive=" + incentive + "\n target=" + target + "\n Total salary=" + calSal() + "]";
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
	
	
	
	double calSal() {
		return this.salary+this.commission;
	}

	@Override
	public String toString() {
		return super.toString()+"\n commission=" + commission + "\n Total salary=" + calSal() + "]";
	}
	
	
}

//======= class Hr ends here ==========


class TestObject {

	public static void main(String[] args) {
		
		Employee e1;
		
		e1 = new Employee(101,"Dhiraj",70000);
		System.out.println(e1.toString()); 
		
		System.out.println();
		
		e1 = new SalesManager(102,"Virat",20000,200,20);
		System.out.println(e1.toString());
		
		System.out.println();
		
		e1 = new Hr(104,"Roy",40000,5000);
		System.out.println(e1.toString());
		
		System.out.println();
		
		e1 = new Admin(103,"Om",71000, 10);
		System.out.println(e1.toString());

	}

}




class TestPolymorphism {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		
	}

}








//HR is-a Employee 
//• commission