//Search an Element in an Array 
//Write a program to search a given number in an array and display its index
//if not found give message. 

import java.util.Scanner;

public class FbsArray01 {

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
		
		boolean flag = false;
		int idx=0;
		
		System.out.println("Enter number you want to find: ");
		int x = sc.nextInt();
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				flag = true;
				idx = i;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("Number found at " + idx + "index.");
		}
		else {
			System.out.println("Sorry not found!");
		}
		
		sc.close();

	}

}
