package mypackage;


class LinkedList<T>{
	Node<T> start;
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
	
	public void insertAtEnd(T x) {
		Node<T> nn = new Node<>(x);
		if(isEmpty()) {
			start = nn;
		}
		else {
			Node<T> p = start;
			while(p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(nn);
			count++;
			return;
		}
	}
	
	public void insertAtBeg(T x) {
		Node<T> nn = new Node<>(x);
		if(isEmpty()) {
			start = nn;
			return;
		}
		else {
			nn.next = start;
			start = nn;
			count++;
			return;
		}
	}
	
	public void insertAtPos(T x, int pos) {
		Node<T> nn = new Node<>(x);
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
			Node<T> p = start;
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
				count++;
				return;
			}
		}
	}
	
	void display() {
		Node<T> temp = start;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
//	void sort() {
//		Node temp = start;
//		int count=0;
//		while(temp!=null) {
//			count++;
//			temp = temp.getNext();
//		}
//		
//		for(int i=0;i<count-1;i++) {
//			Node t = start;
//			for(int j=0;j<count-i-1;j++) {
//				if(t.data > t.next.data) {
//					Student v = t.data;
//					t.data = t.next.data;
//					t.next.data = v;
//				}
//				System.out.print(t.data);
//				t = t.getNext();
//			}
//		}
//		return;
//	}
	
	
	
	void printReverse(Node<T> node) {
		
	    if (node == null) {
	        return;
	    }

	    printReverse(node.getNext());
	    System.out.print(node.data + " ");
	}
	
	void delteAtPos(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else if(pos <= 0 || pos > count) {
			System.out.println("Invalid position");
		}
		else if(pos == 1){
			System.out.println(start.data + "is deleted");
			start = start.getNext();
			return;
		}
		else {
			Node<T> p = start;
			int c = 1;
			while(c < pos - 1) {
				p = p.getNext();
				c++;
			}
			System.out.println(p.getNext().data + " is deleted");
			p.setNext(p.getNext().getNext());
			count--;
		}
	}
}