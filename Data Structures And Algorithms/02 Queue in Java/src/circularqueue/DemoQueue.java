package circularqueue;

class Queue{
	int front, rear;
	int[] arr;
	
	Queue(int size){
		front = rear = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear == arr.length) {
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
		
		
		else if(rear == arr.length-1 && front!=0) {
			rear = 0;
			arr[rear] = ele;
		}
		
		else {
			rear++;
			arr[rear] = ele;
		}
		
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		else if(front == rear) {
			front = rear = -1;
		}
		else if(front == arr.length-1 && rear != front) {
			front = 0;
		}
		else {
			front++;
		}
	}
	
	public void display() {
		int i = front;
		int j = rear;
		
		if(front==arr.length-1 && rear!=front) {
			i = i 
		}
		
		while(i<=j) {
			
		}
	}
}

public class DemoQueue {

}
