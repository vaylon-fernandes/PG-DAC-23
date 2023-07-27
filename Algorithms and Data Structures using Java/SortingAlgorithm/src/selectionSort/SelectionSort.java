package selectionSort;

public class SelectionSort {

	public static void sort(int[] arr) {
		// number of elements
		int n = arr.length;
		int temp = 0;
		int min;
		// Divide array into 2 logical parts: Sorted and unsorted
		// Assume first element as sorted. Compare with the element with the unsorted array 
		// if element is not in order, shift the sorted array by one position and insert the 
		// the element at it's correct sorted position
		for (int i = 0; i < n-1; i++) {
			min = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

	}

}
