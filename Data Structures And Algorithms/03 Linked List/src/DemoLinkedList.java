import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
	
	Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

class LinkedList{
	Node start;
	int count;
	
	LinkedList() {
		start = null;
		count = 0;
	}
	
	boolean isEmpty() {
		if(start == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertAtEnd(int x) {
		Node nn = new Node(x);
		if(isEmpty()) {
			start = nn;
		}
		else {
			Node p = start;
			while(p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(nn);
		}
	}
	
	public void insertAtBeg(int x) {
		Node nn = new Node(x);
		if(isEmpty()) {
			start = nn;
			return;
		}
		else {
			nn.next = start;
			start = nn;
			return;
		}
	}
	
	public void insertAtPos(int x, int pos) {
		Node nn = new Node(x);
		if(pos <= 0) {
			System.out.println("Invalid position");
			return;
		}
		else if(isEmpty() && pos == 1) {
			insertAtBeg(x);
			return;
		}
		else if(!isEmpty() && pos == 1) {
			insertAtBeg(x);
			return;
		}
		else {
			Node p = start;
			int c = 1;
			while(p.getNext()!=null && c < pos-1) {
				p=p.getNext();
				c++;
			}
			if(c != pos-1) {
				System.out.println("Not found");
			}
			else {
				nn.setNext(p.getNext());
				p.setNext(nn);
			}
		}
	}
	
	void display() {
		Node temp = start;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}

public class DemoLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList ll = new LinkedList();
		
		boolean flag = true;
		do {
			System.out.println("1. Insert at end");
			System.out.println("2. Insert at beginning");
			System.out.println("3. Insert at position");
			System.out.println("4. display");
			System.out.println("5. Exit");
			
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			
			int x;
			
			switch (choice) {
			case 1: {
				System.out.println("Enter: ");
				x = sc.nextInt();
				
				ll.insertAtEnd(x);
				break;
			}
			
			case 2: {
				System.out.println("Enter: ");
				x = sc.nextInt();
				
				ll.insertAtBeg(x);
				break;
			}
			
			case 3: {
				System.out.println("Enter: ");
				x = sc.nextInt();
				
				System.out.println("insert position: ");
				int pos = sc.nextInt();
				
				ll.insertAtPos(x, pos);
				break;
			}
			
			case 4: {
				ll.display();
				break;
			}
			
			case 5:{
				flag=false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(flag==true);
	}
}
