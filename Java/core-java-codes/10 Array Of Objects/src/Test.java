
class Employee{
	int id;
	String name;
	float salary;
	
	Employee() {
		this.id=0;
		this.name = "Not given";
		this.salary = 0;
	}
	
	Employee(int id, String name, float salary) {
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setSalary(float salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[3];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		arr[0] = new Employee();
		arr[1] = new Employee(102, "Sachin", 2000);
		arr[2] = new Employee(103,"Virat", 1000);
		
		

	}

}
