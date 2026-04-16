

interface Vehicle {
	public abstract void ride();

	abstract void turn();

	void stop();
}

interface Toy{
	
	void play();
	
}

class Horse implements Vehicle,Toy{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Test {

	public static void main(String[] args) {
		
		Toy t1=new Horse();
		Vehicle v1=new Horse();
		

	}

}
