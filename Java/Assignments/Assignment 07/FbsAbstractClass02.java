import java.util.Scanner;

abstract class ElectricityBill{
	String customerName;
	int units;
	
	ElectricityBill() {
		super();
		this.customerName = "NA";
		this.units = 0;
	}
	
	ElectricityBill(String customerName, int units) {
		super();
		this.customerName = customerName;
		this.units = units;
	}

	String getCustomerName() {
		return customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	int getUnits() {
		return units;
	}

	void setUnits(int units) {
		this.units = units;
	}
	
	void showsage() {
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Units consumed: " + this.units);
	}
	
	abstract double calculateBill();
	
	final void generateBill() {
		
		double amount = this.calculateBill();
		
		double amountAfterTax = amount + (amount * 5 /100);
		
		double finalAmount = amountAfterTax + 50;
		
		System.out.println("Final Bill amount: $" + finalAmount);
	}
	
}

class ResidentialBill extends ElectricityBill{
	
	double amount;
	
	ResidentialBill() {
		super();
		this.amount = 0;
	}



	ResidentialBill(String customerName, int units) {
		super(customerName, units);
		this.amount = 0;
	}

	
	double getAmount() {
		return amount;
	}



	void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public double calculateBill() {
		
		if(this.units >= 0 && this.units <= 100) {
			amount = 2.5 * this.units;
		}
		else if(this.units >= 101 && this.units <= 300) {
			amount = 3.5 * this.units;
		}
		else if(this.units > 300 && this.units <= 500){ // for above $ 5 per unit
			amount = 5 * this.units;
		}
		
		else if(amount > 500) {
			amount = 5 * this.units;
			amount = amount + 150;
		}
		
		return amount;
	}
	
	
}

class CommercialBill extends ElectricityBill{
	double amount;
	
	CommercialBill() {
		super();
		this.amount = 0;
	}
	
	CommercialBill(String customerName, int units) {
		super(customerName, units);
		this.amount = 0;
	}
	
	
	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	double calculateBill() {
		if(this.units < 200) {
			this.amount = 1500; // minimum amount
		}
		else if(units >= 200 && units <= 1000) {
			this.amount = this.units * 6.5;
		}
		else if(this.units > 1000) {
			this.amount = (this.units * 6.5) * 8 / 100;
		}
		return this.amount;
	}
}

public class FbsAbstractClass02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter employee type: ");
		System.out.println("1. Residential");
		System.out.println("2. Commercial");
		int choice = sc.nextInt();
		
		ElectricityBill e1;
		sc.nextLine();
		if(choice == 1) {
			String name;
			System.out.println("Enter Name: ");
			name = sc.nextLine();
			int units;
			
			System.out.println("Enter units");
			units = sc.nextInt();
			
			e1 = new ResidentialBill(name, units);
			
			e1.generateBill();
		}
		else if(choice == 2) {
			String name;
			System.out.println("Enter Name: ");
			name = sc.nextLine();
			
			int units;
			
			System.out.println("Enter units");
			units = sc.nextInt();
			
			e1 = new CommercialBill(name, units);
			
			e1.generateBill();
		}
		else {
			System.out.println("Enter valid customer type");
		}
		
		
		
		sc.close();

	}

}
