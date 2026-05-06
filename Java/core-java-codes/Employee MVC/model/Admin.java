package model;

public class Admin extends Employee{
	double allowance;


	public Admin(double allowance) {
		super();
		this.allowance = allowance;
	}
	
	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "\nallowance=" + allowance;
	}

	@Override
	public double calSal() {
		
		return this.salary + this.allowance;
	}
	
	
	
}
