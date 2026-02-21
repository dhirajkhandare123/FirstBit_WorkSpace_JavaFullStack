//Print Prime Numbers from Array 
//Accept an array and print only the prime numbers. 


import java.util.Scanner;

public class FbsArray06 {

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
		
		System.out.println("Prime numbers are: ");
		
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=arr[i]/2;j>=2;j--) {
				if(arr[i]%j==0) {
					flag=true;
				}
				else flag = false;
			}
			if(flag==false) System.out.println(" "+arr[i]);
		}
		
		sc.close();
		}
		

	}


