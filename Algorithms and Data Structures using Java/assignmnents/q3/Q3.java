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
			if (flag && (arr[i] < arr[i + 1])) {
				length++;// incr length
				// check for longest chain
//				System.out.println(arr[i+1]);
				if (maxLength < length) {
					maxLength = length;
//					System.out.println(maxLength);
				}
				// if flag is set and consecutive elements are in increasing order
			} else if (arr[i] < arr[i + 1]) {
				// set flag and set length to 2 -- e.g 2 11 --chain of 2
					length=2;
					flag=true;
//					System.out.println("also"+i+" "+arr[i]+" "+arr[i+1]);
			}
			else {
				// if chain breaks, reset flag and length
				flag=false;
				length=0;
			}
		}
		return maxLength;
	}
}
