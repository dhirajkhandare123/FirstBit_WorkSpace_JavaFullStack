class Student {
	int frn;
	String name;
	double distanceCovered;
	static int count;
	
	static {
		count=0;
	}
	
	Student() { 		// default constructor
		this.frn = 0;
		this.name = "Not given";
		this.distanceCovered = 0;
		count++;
		
		System.out.println("in Student default constructor");
	}
	
	Student(int frn, String name, double distanceCovered) {		// parameterised constructor
		this.frn = frn;
		this.name = name;
		this.distanceCovered = distanceCovered;
		count++;
		
		System.out.println("in Student parameterised constructor");
	}

	int getFrn() {
		return frn;
	}

	void setFrn(int frn) {
		this.frn = frn;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getDistanceCovered() {
		return distanceCovered;
	}

	void setDistanceCovered(double distanceCovered) {
		this.distanceCovered = distanceCovered;
	}

	static int getCount() {
		return count;
	}


	
	void display() {
		System.out.println("Frn: "+this.frn);
		System.out.println("Name: "+this.name);
		System.out.println("Name: "+this.distanceCovered);
		System.out.println("Count: "+count);
	}
	
}



// ====== class Student end  ======



class PlacedStudent extends Student{
	
	String companyName, designation;
	double distanceCovered;

	PlacedStudent() {
		super();
		this.companyName = "Not given";
		this.designation = "Not given";
		System.out.println("in PlacedStudent parameterised constructor");
	}

	PlacedStudent(int frn, String name, String companyName, String designation, double distanceCovered) {
		super(frn, name, distanceCovered);
		this.companyName = companyName;
		this.designation = designation;
		System.out.println("in PlacedStudent parameterised constructor");
	}
	
	
	int getFrn() {
		return frn;
	}

	void setFrn(int frn) {
		this.frn = frn;
	}

	String getStudentName() {
		return name;
	}

	void setStudentName(String studentName) {
		this.name = studentName;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	double getDistanceCovered() {
		return distanceCovered;
	}

	void setDistanceCovered(double distanceCovered) {
		this.distanceCovered = distanceCovered;
	}

	void display() {
		super.display();
		System.out.println("Comapany Name: " + this.companyName);
		System.out.println("Designation: " + this.designation);
	}
}



//====== class PlacedStudent end  ======



public class Test {

	public static void main(String[] args) {
		
		//Student s3 = new Student(3, "Om", 500);
		//Student s4 = new Student(4, "Ramesh",300);
		PlacedStudent ps1 = new PlacedStudent(3, "Om", "DP World", "Data Scientist", 500);
		
		
		System.out.println(Student.getCount());
		
		ps1.display();

	}

}






