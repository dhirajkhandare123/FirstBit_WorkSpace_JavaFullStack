package p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

class Employee implements Collection{
	int id;
	String name;
	double salary;

	public Employee() {
		this.id = 0;
		this.name = "Not Given";
		this.salary = 10000;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {

		return "\n\n id=" + id + "\nname=" + name + "\nsalary=" + salary;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return e.id - this.getId();
	}
}




public class Test {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sachin", 10000);
		Employee e2 = new Employee(1022, "Virat", 20000);
		Employee e3 = new Employee(1013, "Dhoni", 70000);

		ArrayList l1 = new ArrayList();

		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		System.out.println("Before: "+l1);
		Collections.sort(l1);
		System.out.println("After: "+l1);
		
		
	}

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(5);
		l1.add(20);
		l1.add(30);
		
		System.out.println("Before: "+l1);
		
		Collections.sort(l1);
		System.out.println("After: " + l1);

	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add(new Employee(10, "Sachin", 20000));
		l1.add(new Employee(18, "Virat", 25000));
		System.out.println(l1);

	}
}
