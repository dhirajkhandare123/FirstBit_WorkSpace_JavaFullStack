// Find the Second Maximum Element 
//Identify and print the second largest element in the array.

import java.util.Scanner;

public class FbsArray11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array: ");

		for (int i = 0; i < n; i++) {
			System.out.print("Enter: ");
			arr[i] = sc.nextInt();
		}

		// display
		System.out.println("Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);

		}
		
		System.out.println();

		int firstMax = arr[0];
		int secondMax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}

			else if (arr[i] > secondMax && arr[i] < firstMax) {
				secondMax = arr[i];
			}
		}

		System.out.println("Max Element: " + firstMax);
		System.out.println("Second Max: " + secondMax);
		sc.close();
	}

}
