package myqueue;

import java.util.Scanner;


public class DemoQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList ll = new LinkedList();
		boolean flag = true;
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			
				case 1: {
					System.out.println("Enter: ");
					int x = sc.nextInt();
					ll.insertAtEnd(x);
					break;
				}
				
				case 2: {
					ll.delteFront();
					break;
				}
				
				case 3: {
					ll.display();
					break;
				}
				
				case 4: {
					flag = false;
					break;
				}
				
				default:{
					System.out.println("Invalid case");
				}
				
			}
		}while(flag!=false);
		sc.close();
	}
}
