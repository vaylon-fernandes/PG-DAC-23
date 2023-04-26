import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int m,n,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number and Power: ");
		m = sc.nextInt();
		n = sc.nextInt();
		c=1;
		for(int i=0;i<n;i++) {
		c=m*c;
		}
		System.out.println("Result:"+c);
		sc.close();
		
	}

}
