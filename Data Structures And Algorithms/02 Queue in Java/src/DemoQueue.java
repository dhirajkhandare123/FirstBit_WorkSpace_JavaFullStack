import java.util.Scanner;

class Queue{
	int[] arr;
	int front,rear;
	
	Queue(int size){
		arr = new int[size];
		rear = -1;
		front = -1;
	}
	
	public boolean isEmpty() {
		if(rear==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insert(int ele) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		
		if(isEmpty()) {
			front = 0;
		}
		
		rear++;
		arr[rear] = ele;
	}
	
	public int delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return 0;
		}
		else if(rear == front) {
			rear = -1;
			front = -1;
			return 0;
		}
		else {
			
			return front++;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			int i=front;
			int j=rear;
			while(i<=j) {
				System.out.print(arr[i] + " ");
				i++;
			}
			System.out.println();
		}
	}
}



public class DemoQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		Queue q = new Queue(n);
		
		boolean flag = true;
		
		do {
			
			int choice;
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				
				System.out.println("Enter element: ");
				int x = sc.nextInt();
				
				q.insert(x);
				break;
			}
			
			case 2: {
				
				q.delete();
				break;
			}
			
			case 3: {
				q.display();
				break;
			}
			
			case 4: {
				flag=false;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}while(flag!=false);
		
		sc.close();
		
	}
}
