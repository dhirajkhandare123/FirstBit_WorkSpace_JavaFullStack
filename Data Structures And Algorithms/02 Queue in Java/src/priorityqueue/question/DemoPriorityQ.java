package priorityqueue.question;

import java.util.Scanner;

class Ride{
	int carNo;
	String driverName;
	int distance;
	
	Ride(){
		carNo = 0;
		driverName = "NA";
		distance = 0;
	}
	
	Ride(int no, String name, int d){
		carNo = no;
		driverName = name;
		distance = d;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
}

class Queue{
	int front,rear;
	Ride[] arr;
	
	Queue(int size){
		arr = new Ride[size];
		rear = -1;
		front = -1;
	}
	
	public boolean isEmpty() {
		if(rear==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insert(Ride r) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else if(isEmpty()) {
			rear = 0;
			front = 0;
			arr[rear] = r;
		}
		else {
			int i =0;
			for(i=rear;i>=0;i++) {
				if(r.getDistance() < arr[i].getDistance()) {
					arr[i+1] = arr[i];
				}
				else {
					break;
				}
			}
			rear++;
			arr[rear] = r;
		}
	}
	
	public Ride delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        Ride r = arr[front];

        if (rear == front) {
            rear = front = -1;
        } else {
            front++;
        }

        return r;
    }
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println("Car No: "+arr[i].getDriverName());
				System.out.println("Driver Name: " + arr[i].getDriverName());
				System.out.println("Distance: "+arr[i].getDistance());
				System.out.println("------------------------");
			}
		}
	}
}

public class DemoPriorityQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Queue q = new Queue(4);
		
		boolean flag = true;
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				
				System.out.println("Enter car No: ");
				int no = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter driver name: ");
				String name = sc.nextLine();
				System.out.println("Enter distance: ");
				int d = sc.nextInt();
				Ride r = new Ride(no,name,d);
				
				q.insert(r);
				break;
			}
			
			case 2: {
				System.out.println(q.delete() + "is deleted");
				break;
			}

			case 3: {
				q.display();
				break;
			}
			
			case 4: {
				flag = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(flag);
		
	

	}

}
