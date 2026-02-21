//Find First Minimum and First Maximum Element 
//Identify and print the first minimum and first maximum values from the array.


import java.util.Scanner;

public class FbsArray02 {

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
		
		int maxEle = arr[0];
		int minEle = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			// finds max element
			if(arr[i]>maxEle) maxEle = arr[i]; 
			// finds min element
			if(arr[i]<minEle) minEle = arr[i];
		}
		
		System.out.println("Maximum: " + maxEle);
		System.out.println("Minimum: " + minEle);
		
		sc.close();

	}

}
