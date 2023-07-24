package bubbleSort;

public class Tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {7,8,9,6,1,2,11,3,44,4,111,66,5};
		System.out.println("Before Sort: ");
		for(int n: arr) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		BubbleSort.sort(arr);
		
		System.out.println("After Sort: ");
		for(int n: arr) {
			System.out.print(n+" ");
		}
	}

}
