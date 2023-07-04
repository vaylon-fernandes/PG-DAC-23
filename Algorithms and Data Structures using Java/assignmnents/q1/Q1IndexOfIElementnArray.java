package assignmnents.q1;

//1. Write a Java program to find the index of an array element.

public class Q1IndexOfIElementnArray {
	
	public int findIndexOfElement(int arr [],int element) {
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
