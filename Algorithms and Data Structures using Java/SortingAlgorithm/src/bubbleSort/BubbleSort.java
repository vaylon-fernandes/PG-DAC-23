package bubbleSort;

public class BubbleSort {

	public static void sort(int[] arr) {
		// number of elements
		int n = arr.length - 1;
		int temp = 0;
		int count;
		// compare adjacent elements and swap if incorrect order
		for (int i = 0; i < n; i++) {
			count = 0;
			// since last element bubbles to correct position,
			// reduce one comparison from the end at each pass
			
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}
			// if after a pass, no elements were sort, array is sorted
			if(count==0) {
				System.out.println("Elements: "+(n)+" Passes: "+(i+1));
				return;
			}
		}
		
	}

}
