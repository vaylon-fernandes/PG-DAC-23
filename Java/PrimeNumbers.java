import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n; 
		boolean isPrime=true;
		System.out.println("Enter value of n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<2) {
		System.out.println("Not a prime number");
		}
		else {
			for(int i=2;i<n;i++) { 
				if(n%i==0) { 
					System.out.println("Not a prime number");
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Prime Number");
			}
		}
	}

}
