import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int n,reverse=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		while(n>0) { 
			reverse = reverse*10 + n%10;
			n = n/10;
		}
		System.out.print("Reversed: "+reverse);
	}
}
