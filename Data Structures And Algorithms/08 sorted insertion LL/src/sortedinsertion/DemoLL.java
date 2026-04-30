package sortedinsertion;

import java.util.Scanner;

public class DemoLL {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		LinkedList ll = new LinkedList();
		
		boolean flag = true;
		
		do {
			System.out.println("1. insert");
			System.out.println("2. display");
			System.out.println("3. exit");
			
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter: ");
				int x = sc.nextInt();
				ll.insertData(x);
				break;
			}
			
			case 2: {
				ll.display();
				break;
			}

			case 3: {
				flag = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}while(flag==true);
		
		sc.close();
	}

}
