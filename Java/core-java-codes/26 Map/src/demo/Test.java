package demo;

import java.util.HashMap;
import java.util.TreeMap;

public class Test {
	
	
	public static void main(String[] args) {
		HashMap<MyKey, Employee> hm1 = new HashMap<MyKey, Employee>();
		hm1.put(new MyKey(3), new Employee(3, "Dhiraj", 15000));
		hm1.put(new MyKey(2), new Employee(2, "Magar", 10000));
		hm1.put(new MyKey(4), new Employee(4, "Sagar", 30000));
		hm1.put(new MyKey(1), new Employee(1, "Pritish", 35000));
		
		System.out.println(hm1);
	}

	public static void main1(String[] args) {
		TreeMap<MyKey, Employee> tm1 = new TreeMap<MyKey, Employee>();
		
		tm1.put(new MyKey(3), new Employee(3, "Dhiraj", 15000));
		tm1.put(new MyKey(2), new Employee(2, "Magar", 10000));
		tm1.put(new MyKey(4), new Employee(4, "Sagar", 30000));
		tm1.put(new MyKey(1), new Employee(1, "Pritish", 35000));
		
		System.out.println(tm1);
		
		if(tm1.containsKey(new MyKey(3))) {
			System.out.println("Found!!!");
		}
		else {
			System.out.println("Not Found");
		}
	}

}
