
class Employee{
	String ename;
	float basicSalary;
	static float bonusRate;
	
	static {
		bonusRate=8;
	}
	
	void setEmployee(String name, float salary) {
		this.ename = name;
		this.basicSalary = salary;
	}
	
	void setBonusRate(float rate) {
		bonusRate = rate;
	}
	
	float getTotalSalary() {
		float totalSalary = this.basicSalary + (this.basicSalary * bonusRate/100);
		return totalSalary;
	}
	
	void display() {
		System.out.println("Name: "+this.ename);
		System.out.println("Basic Salary: $"+this.basicSalary);
		System.out.println("Bonus Rate: "+bonusRate);
		System.out.println("Total Salary: $"+this.getTotalSalary());
		System.out.println();
	}
}

public class FbsStatic02 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmployee("Dheeraj", 50000);
		e1.display();
		
		Employee e2 = new Employee();
		e2.setEmployee("Lala", 30000);
		e2.setBonusRate(5);
		e2.display();
		
		Employee e3 = new Employee();
		e3.setEmployee("Dheeraj", 20000);
		e3.display();

	}

}
