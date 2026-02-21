//Sort the Array in Ascending and Descending Order 
//Sort the array in: 
//o Ascending order 
//o Descending order

import java.util.Scanner;

public class FbsArray10 {

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

		// bubble sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// display in ascending order
		System.out.println("Ascending oder: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}

		System.out.println();

		// display in descending order
		System.out.println("Descending order: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(" " + arr[i]);
		}

		sc.close();
	}

}
