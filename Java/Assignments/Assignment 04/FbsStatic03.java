
class LibraryUser{
	String name;
	int returnDays;
	static int finePerDay;
	
	static {
		finePerDay = 20;
	}
	
	LibraryUser(String name, int returnDays){
		this.name = name;
		this.returnDays = returnDays;
	}
	
	int totalFine(int returnDays) {
		int totalFine = this.returnDays * finePerDay;
		return totalFine;
	}
	
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Total Late Days: "+this.returnDays);
		System.out.println("Fine per day: "+finePerDay);
		System.out.println("Total Fine: $"+this.totalFine(this.returnDays));
		System.out.println();
	}
}


public class FbsStatic03 {

	public static void main(String[] args) {
		LibraryUser b1 = new LibraryUser("Dheeraj",0);
		b1.display();
		
		LibraryUser b2 = new LibraryUser("Karan",10);
		b2.display();
		
		LibraryUser b3 = new LibraryUser("Ramesh",3);
		b3.display();

	}

}
