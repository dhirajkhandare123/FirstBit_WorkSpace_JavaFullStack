package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	int marks;
	
	Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\n Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		System.out.println("inside compareTo");
		return this.roll-s1.roll;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("inside equals");
		Student s1=(Student)obj;
		if(this.roll==s1.roll)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hasCode inside");
		return this.roll;
	}
}//class Student ends here

public class Test {

	public static void main(String[] args) {
		
		ArrayList <Student>hs= new ArrayList<Student>();
		
		hs.add(new Student(10, "Sachin", 100));
		hs.add(new Student(18,"Viraty",87));
		hs.add(new Student(70, "Dhoni", 16));
		hs.add(new Student(110, "ss", 100));
		hs.add(new Student(718,"Virssssaty",87));
		
		MyMarksComparator mmc= new MyMarksComparator();
		
		System.out.println("Before\n\n"+hs);
		Collections.sort(hs, mmc);
		System.out.println("After\n\n"+hs);
		
	}
	public static void main112(String[] args) {
		HashSet <Student>hs= new HashSet<Student>();
		
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
	public static void main2(String[] args) {
		TreeSet <Student> st = new TreeSet<Student>();
		st.add(new Student(10, "Sachin", 100));
		st.add(new Student(18,"Viraty",87));
		//st.add(100);
		st.add(new Student(7, "Dhoni", 16));
		
		System.out.println(st);
		
		if(st.contains(new Student(18,"Virat",87)))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found ");
		}
	}
	public static void main1(String[] args) {
		
		TreeSet t1=new TreeSet();
		
		
		t1.add(100);
		t1.add(109);
		t1.add(7);
		t1.add(48);
		t1.add(130);
		t1.add(103);
		t1.add(28);
		t1.add(6);
		t1.add(300);
		t1.add(125);
		
		System.out.println(t1);
		
		

	}

}
