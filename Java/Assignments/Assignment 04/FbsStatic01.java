
class ElectricityBill{
	String name;
	int customerId;
	float unitConsumed;
	static int ratePerUnit;
	
	static {
		ratePerUnit=5;
	}
	
	ElectricityBill(int id, String name, float unitConsumed) {
		this.customerId=id;
		this.name = name;
		this.unitConsumed = unitConsumed;
	}
	
	void setRatePerUnit(int rate) {
		ratePerUnit = rate;
	}
	
	float calculateBill(int customerId, float unitConsumed) {
		float amount =  unitConsumed * ratePerUnit;
		return amount;
	}
	
	void display() {
		System.out.println("Customer ID: "+this.customerId);
		System.out.println("Name: "+this.name);
		System.out.println("unitConsumed: "+this.unitConsumed);
		System.out.println("rate per unit: "+ratePerUnit);
		System.out.println("Bill Amount: $"+this.calculateBill(this.customerId, this.unitConsumed));
	}
	
}

public class FbsStatic01 {

	public static void main(String[] args) {
		ElectricityBill d1 = new ElectricityBill(101, "Dheeraj", 120);
		d1.display();
		
		System.out.println();
		
		ElectricityBill d2 = new ElectricityBill(102, "Shree", 150);
		d2.setRatePerUnit(10);
		d2.display();
		
		System.out.println();
		
		ElectricityBill d3 = new ElectricityBill(103, "Virat", 110);
		d3.display();

	}

}
