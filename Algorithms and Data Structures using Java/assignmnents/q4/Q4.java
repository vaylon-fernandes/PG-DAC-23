package assignmnents.q4;

public class Q4 {
	/*
	 * Given an array of size n where all elements are in range from 0 to n-1,
	 * change contents of arr[] so that arr[i] = j is changed to arr[j] = i. i/p -
	 * 22 13 9 41 o/p - 22 9 13 41
	 */

	public static void changeEverything(int arr[]) {
		
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp = arr[i];
			arr[i] = arr[temp];
			arr[temp]=temp;
		}
		
		
		for(int t:arr) {
			System.out.print(t+" ");
		}
	}
	public static void main(String[] args) {
//		int arr[] = {450,100,500,450,200,200,250,250};
        int[] arr = { 22, 13, 9, 41 };

		changeEverything(arr);
	}
}