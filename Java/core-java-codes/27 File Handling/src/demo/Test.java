package demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	
	public Student() {
		this.id = 0;
		this.name = "NA";
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
public class Test {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("demo.txt");
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(dis);
			Student s1 = (Student)ois.readObject();
			
			System.out.println(s1);
			s1.toString();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("demo.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(new Student(10,"Dhiraj"));
			System.out.println("Successfully written");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
