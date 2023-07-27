package mergeSort;

public class MergeSort {

	public static void sort(int[] arr, int left, int right) {
		// number of elements

		if (left >= right)
			return;

		int mid = (left + right) / 2;

		sort(arr, left, mid);
		sort(arr, mid + 1, right);
		merge(arr, left, mid, mid + 1, right);

	}

	private static void merge(int[] arr, 
			int leftStart, int leftEnd, 
			int rightStart, int rightEnd) {
        int noOfElements = rightEnd - leftStart + 1;

		int [] tempArr = new int[noOfElements];
		int tempPos = -1;

		while((leftStart <= leftEnd) && (rightStart <= rightEnd)) {
            if (arr[leftStart] < arr[rightStart]) {
                //shift ls element to temp
                tempArr[++tempPos] = arr[leftStart];
                leftStart++;
            } else {
                //shift rs element to temp
                tempArr[++tempPos] = arr[rightStart];
                rightStart++;
            }
        }
		
		while(leftStart <= leftEnd) {
            tempArr[++tempPos] = arr[leftStart];
            leftStart++;
        }

        while(rightStart <= rightEnd) {
            tempArr[++tempPos] = arr[rightStart];
            rightStart++;
        }		
		for(int i = 1; i <= noOfElements; i++) {
            arr[rightEnd] = tempArr[tempPos];
            tempPos--;
            rightEnd--;
        }
	}

}
