
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "racecar";
		String s2 = "aafadfafd"; 
		String s3 = "pqst"; //pqrst
		String p="";
	
		for(int i=s1.length()-1;i>=0;i--) {
			p+=s1.charAt(i);
		}
		
	System.out.println(s1);
	System.out.println(p);
	
	
	if (s1.equals(p)) {
		System.out.println("pallindrome");
	}
	else {
		System.out.println("Not pallindrome");
	}
		
}
}