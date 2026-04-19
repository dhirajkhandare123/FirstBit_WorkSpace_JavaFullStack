import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;




class Student implements Comparable<Student>{
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

	@Override
	public String toString() {
		return "\nroll=" + roll + "\nname=" + name + "\nmarks=" + marks + "\n\n";
	}
	
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		System.out.println("inside compareTo");
		return this.roll-s1.roll;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals");
		Student s1 = (Student)obj;
		if(this.roll == s1.roll) {
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Inside Hashcode");
		return this.roll;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		ArrayList <Student>hs= new ArrayList<Student>();
		
		hs.add(new Student(10, "Sachin", 100));
		hs.add(new Student(18,"Viraty",87));
		hs.add(new Student(70, "Dhoni", 16));
		hs.add(new Student(110, "ss", 100));
		hs.add(new Student(718,"Virssssaty",87));
		
		MyCompareByMarks mmc= new MyCompareByMarks();
		
		System.out.println("Before\n\n"+hs);
		Collections.sort(hs, mmc);
		System.out.println("After\n\n"+hs);
	}
	
	public static void main4(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		
		hs.add(new Student(10, "Sachin", 100));
		hs.add(new Student(18,"Viraty",87));
		hs.add(new Student(70, "Dhoni", 16));
		hs.add(new Student(110, "ss", 100));
		hs.add(new Student(718,"Virssssaty",87));
		//st.add(100);
		hs.add(new Student(70, "Dhoniiiiiiii", 16));
		
		System.out.println(hs);
		
		
		if(hs.contains(new Student(110, "ss", 100) ))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
	
	public static void main3(String[] args) {
		TreeSet <Student> st = new TreeSet<Student>();
		st.add(new Student(10,"Sachin",100));
		st.add(new Student(18,"Virat",87));
		st.add(new Student(7,"Dhoni",16));
		
		System.out.println(st);
		
		if(st.contains(new Student(18,"Virat",87))) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
	
	public static void main2(String[] args) {
		HashSet st = new HashSet();
		
		st.add(10);
		st.add(30);
		st.add(110);
		st.add(20);
		st.add(90);
		st.add(160);
		st.add(107);
		st.add(101);
		
		System.out.println(st);
	}

	public static void main1(String[] args) {
		TreeSet st = new TreeSet();
		
		st.add(10);
		st.add(30);
		st.add(110);
		st.add(20);
		st.add(90);
		st.add(160);
		st.add(107);
		st.add(101);
		
		System.out.println(st);
		

	}

}
