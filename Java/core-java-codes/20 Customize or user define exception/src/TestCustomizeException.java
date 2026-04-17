
class InvalidAgeException extends Exception
{

	@Override
	public String toString() {
		return "You are not allowed to vote........";
	}
	
}

class Voter{
	int age;
	
	public Voter(int age) {
		this.age = age;
	}
	
	void validate() throws InvalidAgeException{
		
		if(this.age < 10) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("You are eligible to vote........");
		}
	}
}

public class TestCustomizeException {
	public static void main(String[] args) {
		
		Voter v1 = new Voter(9);
		
		try {
			v1.validate();
		}
		catch (InvalidAgeException e) {
			
			e.printStackTrace();
			System.out.println("Inside main.....");
			
			System.out.println(e);
		}
	}
}
