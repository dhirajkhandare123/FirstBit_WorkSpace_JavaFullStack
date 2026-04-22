package mypackage;

public class Node<T> {
	T data;
	Node<T> next;
	
	Node(T val){
		this.data = val;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
