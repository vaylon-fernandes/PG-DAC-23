package assignmnents.q2;

public class Q2 {
//	2. You will be given an array and you need to find the third largest 
	public int findThirdLargest(int arr[]) {
		
		int first=arr[0],second=0,third=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second; // 10 5 1 -- 16 10 5
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second){ // 16 12 10
				third =second;
				second=first;
			}
			else {
				third=arr[i]; // 16 12 11
			}
		}
		
		
		return third;
	}
}
