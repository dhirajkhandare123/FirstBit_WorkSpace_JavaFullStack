package demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
//		Comparator cmp = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return 0;
//			}
//		};
//		
//		Collections.sort(null,cmp);
		
		

		
		Collections.sort(null,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return 0;
			}
		});


	}

}
