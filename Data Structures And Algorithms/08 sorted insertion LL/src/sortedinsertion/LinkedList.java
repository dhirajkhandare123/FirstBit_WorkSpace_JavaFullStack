package sortedinsertion;

public class LinkedList {
	Node start;
	
	int count;
	
	LinkedList() {
		this.count = 0;
		this.start = null;
	}
	
	boolean isEmpty() {
		if(start == null) {
			return true;
		}
		return false;
	}
	
	void insertData(int data) {
		Node nn = new Node(data);
		if(isEmpty()) {
			start = nn;
			
			start.setNext(nn);
			count++;
			return;
		}
		
		else {
			Node p = start;
			while(p.getNext() != null && p.getData() < nn.getData()) {
				p = p.getNext();
			}
			
			
			p.setNext(nn);
			count++;
			
			return;
		}
		
		
		
		
	}
	
	void display() {
		Node temp = start;
		while(temp != null) {
			System.out.print(temp.getData() + " ");
		}
		System.out.println();
	}
}
