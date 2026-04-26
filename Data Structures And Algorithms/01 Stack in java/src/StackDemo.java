

class Stack{
	int arr[];
	int top;
	Stack(){
		top=-1;
		arr = new int[5];
	}
	
	
	
	boolean isFull() {
		if(top == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int ele) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			top++;
			arr[top] = ele;
		}
	}
	
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println(arr[top] + " is Pop from stack");
			top--;
		}
	}
	
	void peak() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println(arr[top]);
		}
	}
	
	// display method
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println();
			for(int i = top;i>=0;i--) {
				System.out.println("| " + arr[i] + " |");
				System.out.println("------");
			}
			System.out.println();
		}
	}
	
	
}

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.peak();
		s.push(10);
		s.push(43);
		s.push(12);
		s.push(21);
		s.push(27);
		
		s.display();
		
		s.pop();
		
		s.display();
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		s.display();
		

	}
	


}
