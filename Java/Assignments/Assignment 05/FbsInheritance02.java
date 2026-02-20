
class Vehicle{
	String vehicleNumber;
	String model, companyName;
	int noOfWheels;
	double price;
	
	Vehicle() {
		this.vehicleNumber = "NA";
		this.model = "NA";
		this.companyName = "NA";
		this.noOfWheels = 0;
		this.price = 0;
	}
	
	Vehicle(String vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}

	String getVehicleNumber() {
		return vehicleNumber;
	}

	void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	int getNoOfWheels() {
		return noOfWheels;
	}

	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("Vehicle Number: "+this.vehicleNumber);
		System.out.println("Model: "+this.model);
		System.out.println("Company Name: "+this.companyName);
		System.out.println("Number of Wheels: "+this.noOfWheels);
		System.out.println("Price: "+this.price);
	}
	
}

class Bike extends Vehicle{
	int noOfStands, noOfHelmets;
	String bikeCategory;
	Bike() {
		super();
		this.noOfStands = 0;
		this.noOfHelmets = 0;
		this.bikeCategory = "NA";
	}
	
	Bike(String vehicleNumber, String model, String companyName, int noOfWheels, double price, int noOfStands, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}

	int getNoOfStands() {
		return noOfStands;
	}

	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}

	int getNoOfHelmets() {
		return noOfHelmets;
	}

	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}

	String getBikeCategory() {
		return bikeCategory;
	}

	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	
	void display() {
		super.display();
		System.out.println("Number of Stands: "+this.noOfStands);
		System.out.println("Number of Helmets: "+this.noOfHelmets);
		System.out.println("Bike Category: "+this.bikeCategory);
		
	}
}

class Car extends Vehicle{
	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;
	
	Car() {
		super();
		this.hasPowerSteering = false;
		this.driveMode = "Normal";
		this.parkingAssistSensors = 0;
	}
	
	Car(String vehicleNumber, String model, String companyName, int noOfWheels, double price, boolean hasPowerSteering, String driveMode, int parkingAssistSensors) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}

	boolean isHasPowerSteering() {
		return hasPowerSteering;
	}

	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}

	String getDriveMode() {
		return driveMode;
	}

	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	int getParkingAssistSensors() {
		return parkingAssistSensors;
	}

	void setParkingAssistSensors(int parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}
	
	void display() {
		super.display();
		System.out.println("Power Steering: "+this.hasPowerSteering);
		System.out.println("Drive Mode: "+this.driveMode);
		System.out.println("Parking Sensors: "+this.parkingAssistSensors);
		
	}
}

public class FbsInheritance02 {

	public static void main(String[] args) {
		Bike b1 = new Bike("MH28AB5095", "KTM", "KTM AG", 2, 120000, 2, 1, "Sport Bike");
		b1.display();
		
		System.out.println();
		
		Car c1 = new Car("MH28JJ3012", "Nano", "Tata", 4, 100000, false, "Normal", 0);
		c1.display();
		
		

	}

}



//Bike is-a Vehicle 
//• noOfStands 
//• noOfHelmets 
//• bikeCategory 
//Car is-a Vehicle 
//hasPowerSteering 
//• driveMode 
//• parkingAssistSensors 
//Bus is-a Vehicle 
//• passengerCapacity 
//• standingCapacity 