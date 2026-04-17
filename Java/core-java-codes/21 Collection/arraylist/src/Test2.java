import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Employee {
	int id, salary;
	String name;

	Employee() {
		this.id = 0;
		this.salary = 0;
		this.name = "NA";
	}

	Employee(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	void setId(int id) {
		this.id = id;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "\n\nid=" + id + "\nsalary=" + salary + "\nname=" + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		Employee e = (Employee)obj;
		if(this.id == e.id) {
			return true;
		}
		else {
			return false;
		}
	}

}

public class Test2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, 10000, "Sachin");
		Employee e2 = new Employee(102, 20000, "Virat");
		Employee e3 = new Employee(103, 70000, "Dhoni");

		ArrayList l1 = new ArrayList();

		l1.add(e1);
		l1.add(e2);
		l1.add(e3);

		//System.out.println(l1); // l1.toString();

//		for (int i = 0; i < l1.size(); i++) {
//
//			System.out.println(l1.get(i)); // l1.get(i).toString()
//		}
		
		if(l1.contains(new Employee(103, 70000, "Dhoni"))) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not found");
		}

	}

	public static void main1(String[] args) {

		//ArrayList a1 = new ArrayList();
		LinkedList a1 = new LinkedList();

		a1.add(10);
		a1.add(30);
		a1.add(20);

		// System.out.println(a1);

		for (int i = 0; i < a1.size(); i++) {

			System.out.println(a1.get(i));
		}

	}

}
