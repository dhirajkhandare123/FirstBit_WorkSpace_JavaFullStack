package mypackage;

public class MyApp {

	public static void main(String[] args) {
		LinkedList<Student> ll = new LinkedList<Student>();
		
		Student s = new Student(1,"Dhiraj",90);
		ll.insertAtEnd(s);
		Student s1 = new Student(2,"Om",100);
		ll.insertAtEnd(s1);
		
		ll.display();
		
		ll.sort();
	}

}
