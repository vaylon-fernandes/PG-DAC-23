import java.util.Scanner;

public class ArmstronNum {

	public static void main(String[] args) {
		int num, armstrongNum=0,n,temp, power,m; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		temp=num;
		
		while(num!=0) {
			n=num%10;
			power=1;
			m=temp;
			while(m!=0) {
			power=power*n;
			m=m/10;
			}
			armstrongNum = armstrongNum + power; 
			num=num/10;
		}
		System.out.println(armstrongNum);
		if(temp==armstrongNum) {
			System.out.println(temp+" is a Armstrong number");
		}
		else {
			System.out.println(temp+" is not a Armstrong number");
		}
	}
}
