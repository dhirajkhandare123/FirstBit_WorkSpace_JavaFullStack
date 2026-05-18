package usinganonymousclass;

public class Demo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator() {
			
			@Override
			public void add1(int a, int b) {
				
				System.out.println("Addition is: " + (a + b));
			}
		};
		
		c1.add1(10, 20);
	}
}
