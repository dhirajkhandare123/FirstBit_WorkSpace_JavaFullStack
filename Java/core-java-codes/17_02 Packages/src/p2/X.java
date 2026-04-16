package p2;

public class X {
	public void myFunX() {
		p1.A ref = new p1.A();
		ref.myFunA();
	}
}

class Y extends p1.A{
	public void myFunY() {
		p1.A ref = new p1.A();
		ref.myFunA();
		super.myFunA(); 
		this.myFunA();
	}
}
