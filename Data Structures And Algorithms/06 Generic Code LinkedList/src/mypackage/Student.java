package mypackage;

public class Student implements Comparable<Student> {
	int roll;
	String name;
	int marks;
	
	public Student() {
		
		this.roll = 0;
		this.name = "NA";
		this.marks = 0;
	}
	
	
	public Student(int roll, String name, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "\nroll=" + roll + "\nname=" + name + "\nmarks=" + marks + "\n\n\n";
	}
	
	@Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // ascending order
    }
	
	
	
}
