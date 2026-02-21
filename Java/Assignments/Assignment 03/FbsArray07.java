//Add Two Arrays and Store Result in Third Array 
//Given two arrays of equal size, calculate their element-wise sum and store it
//in a third array.

import java.util.Scanner;

public class FbsArray07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size: ");
		int n = sc.nextInt();

		// array1
		int[] arr1 = new int[n];

		System.out.println("Enter elemrnts for array1");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter: ");
			arr1[i] = sc.nextInt();
		}

		// array2
		int[] arr2 = new int[n];
		System.out.println("Enter elemrnts for array2");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter: ");
			arr2[i] = sc.nextInt();
		}
		
		// result
		int[] res = new int[n];
		for(int i=0;i<res.length;i++) {
			res[i] = arr1[i] + arr2[i];
		}
		
		// display array1
		System.out.print("array1: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(" "+arr1[i]);
		}
		
		// display array2
		System.out.print("\narray2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(" "+arr2[i]);
		}
		
		// display result
		System.out.print("\nResult: ");
		for (int i = 0; i < res.length; i++) {
			System.out.println(" "+res[i]);
		}
		
		sc.close();
	}

}
