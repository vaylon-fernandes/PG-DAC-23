import java.util.Scanner;

public class PrimeNums {
	public static boolean isPrime(int num) {
		for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                return false;
            }
        }
		return true;
	}
	 public static void main(String[] args) {
	        int i, j, isPrime, n;
	        System.out.println("Enter value of n: ");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        System.out.println("Prime number from 1 to "+n);
	        
	        for (i = 2; i <= n; i++) {	 
	            if (isPrime(i))
	                System.out.print(i + " ");
	        }
	 
	    }
	}
