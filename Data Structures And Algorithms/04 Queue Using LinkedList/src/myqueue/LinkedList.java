package myqueue;



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
			count++;
			return;
		}
	}
	
	void delteFront() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		
		start = start.getNext();
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