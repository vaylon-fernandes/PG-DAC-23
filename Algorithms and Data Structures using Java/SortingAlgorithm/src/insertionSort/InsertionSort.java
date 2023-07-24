package insertionSort;

public class InsertionSort {

	public static void sort(int[] arr) {
		// number of elements
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
