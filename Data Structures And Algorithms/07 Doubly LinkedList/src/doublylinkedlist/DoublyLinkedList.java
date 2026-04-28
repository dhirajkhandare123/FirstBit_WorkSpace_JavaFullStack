package doublylinkedlist;

public class DoublyLinkedList {
	Node start;
	int count;
	
	boolean isEmpty() {
		if(start == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void insert(int ele, int pos){
		if(pos<=0 || pos > count++) {
			System.out.println("Invalid");
			return;
		}
		
		Node nn = new Node(ele);
		if(pos == 1) {
			if(!isEmpty()) {
				nn.setNext(start);
				start.setPrev(nn);
			}
			start = nn;
			count++;
			return;
		}
		
		Node p = start;
		int c = 1;
		
		while(c<pos && p.getNext()!=null) {
			p = p.getNext();
			c++;
		}
		
		if(c==pos-1) {
			p.setNext(nn);
			nn.setPrev(p);
			count++;
			return;
		}
		
		count++;
		nn.setPrev(p.getPrev());
		nn.setNext(p);
		p.getPrev().setNext(nn);
		p.setPrev(nn);
		return;
	}
	
	void delete(int pos) {
		if(pos<=0 || pos>count) {
			System.out.println("Invalid");
			return;
		}
		
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		
		if(pos==1) {
			start = start.getPrev();
			if(start!=null) {
				start.setPrev(null);
			}
			count--;
			return;
		}
		
		int c = 1;
		Node p = start;
		
		while(c<pos) {
			p = p.getNext();
			c++;
		}
		
		p.getPrev().setNext(p.getNext());
		if(p.getNext()!=null) {
			p.getNext().setPrev(p.getPrev());
		}
		count--;
	}
	
	void deleteByElement(int data) {
	    if (isEmpty()) {
	        System.out.println("List is empty");
	        return;
	    }

	    Node p = start;

	    while (p != null) {
	        if (p.getData() == data) {

	            
	            if (p == start) {
	                start = p.getNext();
	                if (start != null) {
	                    start.setPrev(null);
	                }
	            }
	            
	            else {
	                if (p.getPrev() != null) {
	                    p.getPrev().setNext(p.getNext());
	                }
	                if (p.getNext() != null) {
	                    p.getNext().setPrev(p.getPrev());
	                }
	            }

	            count--;
	            return; 
	        }
	        p = p.getNext();
	    }

	    System.out.println("Element not found");
	}
	
	void display() {
		
	}
	
}
