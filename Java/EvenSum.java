import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) { 
		int n, odd_sum=0,even_sum=0; 
		System.out.println("Enter Value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				even_sum+=i;
			}
			else { 
				odd_sum+=i;
			}
		}
		System.out.println("Even Sum: "+even_sum+"\nOdd Sum: "+odd_sum);
	}
}
