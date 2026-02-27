class Shape{
	double area;

	Shape() {
		this.area = 0;
	}
	
	Shape(double area) {
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	// Common function
	double calculateArea() {
		return area;
	}
	
	void display() {
		System.out.println("Area: "+ this.calculateArea());
	}
}

class Circle extends Shape{
	double radius;

	Circle() {
		super();
		this.radius = 0;
	}
	
	Circle(double area, double radius) {
		super(area);
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Overriding
	double calculateArea() {
		this.area = 3.14 * this.radius * this.radius;
		return this.area;
	}
		
	void display() {
		super.display();
		System.out.println("Radius: "+this.radius);
	}
	
}

class Triangle extends Shape{
	double base, height;
	
	Triangle(){
		super();
		this.base=0;
		this.height=0;
	}
	
	Triangle(double area, double base, double height){
		super(area);
		this.base=base;
		this.height=height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	// Overriding
	double calculateArea() {
		this.area = 0.5 * this.base * this.height;
		return this.area;
	}

	void display() {
		super.display();
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
	}
}

class Rectangle extends Shape{
	double length, breadth;
	
	Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}

	Rectangle(double area, double length, double breadth) {
		super(area);
		this.length = length;
		this.breadth = breadth;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	// Overriding
	double calculateArea() {
		this.area = this.length * this.breadth;
		return this.area;
	}
	
	void display() {
		super.display();
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}

public class FbsPolymorphism03 {

	public static void main(String[] args) {
		
		Shape s1;
		
		// Polymorphism
		s1 = new Circle(10,7);
		s1.display();
		
		System.out.println();
		
		s1 = new Triangle(10,10,6);
		s1.display();
		
		System.out.println();
		
		s1 = new Rectangle(10,12,4);
		s1.display();
	}
}