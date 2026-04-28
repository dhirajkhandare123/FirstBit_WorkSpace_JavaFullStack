package mycircularqueue;

import mycircularqueue.Node;

public class LinkedList {
	int count;
	Node start;
	Node end;
	
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
			end = nn;
			
		}
		else {
			nn.setNext(start);
			end.setNext(nn);
		}
		count++;
		return;
	}
	
	public void insertAtBeg(int x) {
		Node nn = new Node(x);
		if(isEmpty()) {
			start = nn;
			end = nn;
			end.setNext(start);
			
		}
		else {
			nn.setNext(start);
			start = nn;
			end.setNext(nn);
			
		}
		count++;
		return;
	}
	
	public void insertAtPos(int ele, int pos) {
		if(pos<=0 || pos > count+1) {
			System.out.println("Invalid");
			return;
		}
		Node nn = new Node(ele);
		if(isEmpty()) {
			insertAtBeg(ele);
			return;
		}
		else if(pos == 1) {
			insertAtBeg(ele);
			return;
		}
		else if(pos == count+1) {
			insertAtEnd(ele);
		}
	}
	
	
}
