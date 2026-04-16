package p1;

public class A {
	void myFunA() {
		System.out.println("Inside class A");
	}
}

class B extends A{
	public void myFunB() {
		A ref = new A();
		ref.myFunA();
	}
}

class C{
	public void myFunC() {
		A ref = new A();
		ref.myFunA();
	}
}