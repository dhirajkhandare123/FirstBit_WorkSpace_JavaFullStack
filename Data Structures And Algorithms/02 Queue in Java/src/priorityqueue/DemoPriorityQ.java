package priorityqueue;

import java.util.Scanner;

class Queue{
	int front,rear;
	String[] arr;
	
	Queue(int size){
		arr = new String[size];
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
	
	public void insert(String ele) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		
		else if(isEmpty()) {
			front = 0;
			rear = 0;
			arr[rear] = ele;
		}
		
		else {
		
		int i=0;
		
		for (i = rear; i >= front; i--) {
            // if new element has higher priority (smaller string)
            if (ele.compareTo(arr[i]) < 0) {
                arr[i + 1] = arr[i]; // shift right
            } else {
                break;
            }
        }
		
		rear++;
		arr[rear] = ele;
		}
	}
	
	public String delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        String val = arr[front];

        if (rear == front) {
            rear = front = -1;
        } else {
            front++;
        }

        return val;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	
	
}

public class DemoPriorityQ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		Queue q = new Queue(n);
		
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
				sc.nextLine();
				System.out.println("Enter: ");
				String str = sc.nextLine();
				q.insert(str);
				break;
			}
			
			case 2: {
				System.out.println("Deleted");
				q.delete();
				break;
			}
			
			case 3: {
				q.display();
				break;
			}
			
			case 4: {
				flag = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
				
			}
		}while(flag!=false);
		
		
	}

}
