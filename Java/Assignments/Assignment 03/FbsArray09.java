//Reverse the Given Array 
//Reverse the elements of the array without using extra arrays (if possible).

import java.util.Scanner;
public class FbsArray09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array: ");
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter: ");
			arr[i] = sc.nextInt();
		}
		
		// display
		System.out.println("Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(" "+arr[i]);
			
		}
		System.out.println();
		
		// reverse array
		
		int a=0;
		int b=arr.length-1;
		
		while(a<b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			
			a++;
			b--;
		}
		
		// diplay reverse array
		System.out.println("Reverse array: ");
		for(int i=0; i<n; i++) {
			System.out.print(" "+arr[i]);
			
		}
		
		sc.close();
	}

}
