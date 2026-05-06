package model;

public class HR extends Employee{
	double commision;

	public HR() {
		super();
		this.commision = 0;
	}
	
	public HR(int id, String name, double salary, double commision) {
		super(id, name, salary);
		this.commision = commision;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\ncommision=" + commision + "]";
	}

	@Override
	public double calSal() {
		
		return this.salary + this.commision;
	}
	
}
