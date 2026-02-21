//Merge Two Arrays 
//Combine two arrays into a single array and display the result. 

public class FbsArray08 {

	public static void main(String[] args) {
		int[] array1 = {11, 12 , 13, 14, 15};
		int n = array1.length;
		
		int[] array2 = {21, 22 ,10, 4, 7};
		int m = array2.length;
		
		int p = m + n;
		int[] res = new int[p];
		
		int i = 0;
		int a1 = 0;
		int a2 = 0;
		
		while(a1<n) {
			res[i] = array1[a1];
			a1++;
			i++;
		}
		
		while(a2<m) {
			res[i] = array2[a2];
			a2++;
			i++;
		}
		
		for (int j : res) {
			System.out.println(" "+j);
		}
		
	}

}
