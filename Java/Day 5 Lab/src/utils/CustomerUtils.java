package utils;

import static utils.CustomerValidationRules.validateInputs;

import java.util.ArrayList;
import java.util.List;

import com.code.Customer;
	
import custom_exceptions.CustomerHandlingException;

public class CustomerUtils {
	// Sample Data Array List 
	//  Customer(String firstName, String lastName, String email, String password, LocalDate dob, double registrationAmount, ServicePlan plan)
	//String firstName, String lastName, String email, String password, String dob,
//	double registrationAmount, String planName, List<Customer> customerList
	// 	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	public static List<Customer> populateSampleCustomerData() throws CustomerHandlingException{
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(validateInputs("Harry","Maguire","hm@united.com","harry","1980-12-01",1000,"SILVER",customers));
		customers.add(validateInputs("Jadon","Sancho","sm@united.com","jdon","1995-11-09",2000,"GOLD",customers));
		customers.add(validateInputs("Lionel", "Messi", "lm@psg.com", "lionel", "1987-06-24", 10000, "PLATINUM", customers));
		customers.add(validateInputs("Cristiano", "Ronaldo", "cr7@manutd.com", "ronaldo", "1985-02-05", 10000, "PLATINUM", customers));
		customers.add(validateInputs("Neymar", "Jr.", "njr@psg.com", "neymar", "1992-02-05", 5000, "DIAMOND", customers));

		return customers;
	}
	
}
