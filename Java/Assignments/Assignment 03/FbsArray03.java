//Find the Sum of All Elements 
//Calculate and print the sum of all numbers present in the array.


import java.util.Scanner;

public class FbsArray03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter elements in array one by one!");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter: ");
			arr[i] = sc.nextInt();
		}
		
		int total = 0;
		
		for(int i=0; i<arr.length;i++) {
			total+=arr[i];
		}
		
		System.out.println("Total: "+ total);
		
		sc.close();
	}

}
