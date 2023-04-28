package tester;

import java.util.Scanner;
import static utils.ValidationRules.validateSpeed;
import static utils.ValidationRules.validateLicenseDate;

public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Speed: ");
			validateSpeed(sc.nextInt());
			System.out.println("Enter License Expiry date: ");
			validateLicenseDate(sc.next());

		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
