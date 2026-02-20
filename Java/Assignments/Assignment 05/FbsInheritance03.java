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
	
	void display() {
		System.out.println("Area: "+this.area);
	}
}

class Circle extends Shape{
	double radius;

	Circle() {
		super();
		this.radius = 0;
	}
	
	Circle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
		this.area=3.14*this.radius*this.radius;
	}
		
	void display() {
		this.setRadius(this.radius);
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
	
	Triangle(double base, double height){
		super();
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
	
	void setTriangleArea() {
		this.area = 0.5 * this.base * this.height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	void display() {
		this.setTriangleArea();
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

	Rectangle(double length, double breadth) {
		super();
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
	
	void setRectangleArea() {
		this.area = this.length * this.breadth;
	}
	
	void display() {
		this.setRectangleArea();
		super.display();
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
	
	
}


public class FbsInheritance03 {

	public static void main(String[] args) {
		Circle c1 = new Circle(7);
		c1.display();
		
		System.out.println();
		
		Triangle t1 = new Triangle(10,6);
		t1.display();
		
		System.out.println();
		
		Rectangle r1 = new Rectangle(12,4);
		r1.display();
	}

}
