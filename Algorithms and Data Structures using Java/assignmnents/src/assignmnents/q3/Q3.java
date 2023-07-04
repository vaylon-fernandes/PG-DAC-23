package assignmnents.q3;

public class Q3 {
	/*
	 * 3. You are given array consisting of n integers. Your task is to find the
	 * maximum length of an increasing subarray of the given array.
	 * 
	 * A subarray is the sequence of consecutive elements of the array. Subarray is
	 * called increasing if each element of this subarray strictly greater than
	 * previous. i/p-5 1 7 2 11 15
	 */

	public int lenLargestIncSubArray(int arr[]) {
		int maxLength = 0, length = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length-1; i++) {
			// if flag is set and consecutive elements are in increasing order
			if (flag && (arr[i] > arr[i + 1])) {
				length++;// incr length
				// check for longest chain
				if (maxLength < length) {
					maxLength = length;
					System.out.println(maxLength);
				}
				// if flag is set and consecutive elements are in increasing order
			} else if (arr[i] > arr[i + 1]) {
				// set flag and increment length 
					length++;
					flag=true;
			}
			else {
				flag=false;
				length=0;
			}
		}
		return maxLength;
	}
}
