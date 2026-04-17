

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println(a/b);
			
			System.out.println("Addition is " + (a+b));
		}
		catch(NumberFormatException e) {
			System.out.println("Enter only integers......");
		}
		catch(ArithmeticException e) {
			System.out.println("second argument must be non zero......");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter only two input....");
		}
		catch(Exception e) {
			System.out.println("Oopps something went wrong....");
		}
		
		finally {
			System.out.println("This is the end of programm.......");
		}

	}

}
