package demo;

public class Demo {

	public static void main(String[] args) {
		
		Calculator cal = (a,b) -> a+b;
		
		System.out.println(cal.add(10, 60));
	}

}
