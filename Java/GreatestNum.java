
public class GreatestNum {

	public static void main(String[] args) {
		int a=10,b=12,c=11;
		
		if (a>b) {
			if(a>c) {
				System.out.println(a+" is greatest number");
			}
			else {
				System.out.println(c+" is greatest number");
			}
		}
		else if (b>a) {
			if (b>c) {
			System.out.println(b+" is greatest number");
			}
			else {
				System.out.println(c+" is greatest number");
			}
		}
	}
}
