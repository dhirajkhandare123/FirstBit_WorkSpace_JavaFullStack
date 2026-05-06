package model;

public class SalesManager extends Employee{
	int target;
	double incentives;

	public SalesManager() {
		super();
		this.target = 0;
		this.incentives = 0;
	}
	
	public SalesManager(int id, String name, double salary, int target, double incentives) {
		super(id, name, salary);
		this.target = target;
		this.incentives = incentives;
	}
	
	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	@Override
	public String toString() {
		return super.toString() + "\nincentives=" + incentives;
	}

	@Override
	public double calSal() {
		
		return this.salary + this.incentives;
	}
	
	
}
