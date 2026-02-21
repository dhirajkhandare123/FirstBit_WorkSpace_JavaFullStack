//Separate Odd and Even Numbers 
//Print all odd numbers and even numbers from the array.


public class FbsArray04 {
	public static void main(String[] args) {
		int[] arr = {11, 12, 13, 14, 15, 16};
		
		System.out.println("Even: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.print(" " + arr[i]);
			}
		}
		
		System.out.println();
		
		System.out.println("Odd: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				System.out.print(" " + arr[i]);
			}
		}
		
	}
}
