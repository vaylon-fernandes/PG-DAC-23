package quickSort;

public class QuickSort {

	// divide and conquer algorithm
	// array is divided into two parts
	// One element is selected as a pivot element and other elements are arranged
	// Such that all elements to the left are less than pivot and all elements to
	// the right
	// are greater than pivot
	public static void sort(int[] arr, int left, int right) {
		if (left > right)
			return;
		// find correct position of pivot element by partitioning the array
		int pivot = partition(arr, left, right);
		sort(arr, left, pivot - 1);
		sort(arr, pivot + 1, right);

	}

	public static int partition(int[] arr, int left, int right) {
		// fix left element as pivot
		int pivot = arr[left];
		
		// decrement right pointer and move value to left if element < pivot
		while(left<right) {
			while(arr[right]>pivot && left!=right) {
				right--;
			}
			
		if(left!=right) {
			arr[left]=arr[right];
			left++;
		}
		
		while(arr[left]<pivot && left!=right) {
			left++;
		}
			
		if(left!=right) {
			arr[right]=arr[left];
			right--;
		}
		}
		arr[left] = pivot;
		return right;
	}
}
