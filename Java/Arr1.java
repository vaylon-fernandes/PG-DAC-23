import java.util.Scanner; 

public class Arr1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice = 0, size; 

	System.out.println("Enter number of elements: ");
//	int arr [];
	int arr[] = new int[sc.nextInt()];
	System.out.println("Array Created For storing "+arr.length+"  Numbers");
	do {
		System.out.println("\nMENU");
		System.out.println("1:Read Array\n2:Print Array\n3:Search element in array\n"
				+ "4:Reverse Array\n5:Even number from array\n6:sum of array element\n7: Exit");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter array elements");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter Element: "+(i+1));
				arr[i]=sc.nextInt();
			}
			break;
		case 2:
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			break;
		case 3:
			System.out.println("Enter Element to Search.");
			int num = sc.nextInt();
			boolean flag=false;
			for(int no:arr) {
				if (no==num) {
					flag=true;
					break;
				}
				else {
					flag=false;
				}
			}
			if(flag) {
				System.out.println("Element found");
			}
			else {
				System.out.println("Element not found");
			}
			break;
		case 4:
		int temp=0;
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		break;
		case 5: 
			System.out.println("Even numbers in Array: ");
			for(int no:arr) {
				if(no%2==0) {
					System.out.print(no+" ");
				}
			}
			break;
		case 6: 
			int sum = 0; 
			for(int no:arr) {
				sum+=no;
			}
			System.out.println("Sum of all array elements="+sum);
			break;
		case 7: 
			System.out.println("Exiting.......");
			break;
		case 8:
			int max=arr[0];
			for (int i=0; i<arr.length;i++) {
				for(int j=i; j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					}
			}
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			break;
		default: 
			System.out.println("Invalid input. try again.");
		}
	}while(choice!=7);
	
	sc.close();
}
}
