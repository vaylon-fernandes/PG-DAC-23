package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.code.Customer;
import com.code.ServicePlan;
import static java.time.Period.between;

import custom_exceptions.CustomerHandlingException;

public class CustomerValidationRules {

	// Add centralized exception method
	public static Customer validateInputs(String firstName, String lastName, String email, String password, String dob,
			double registrationAmount, String planName, List<Customer> customerList) throws CustomerHandlingException {
		checkForDuplicateUser(customerList, email);
		ServicePlan servicePlan = parseAndValidatePlanAndRegAmount(planName, registrationAmount);
		LocalDate validDob = validateAge(dob);

		return new Customer(firstName, lastName, email, password, validDob, registrationAmount, servicePlan);
	}

	// add static method to check for duplication
	public static void checkForDuplicateUser(List<Customer> customersList, String newEmail)
			throws CustomerHandlingException {
		// w. wrap email in customer ref
		Customer newCustomer = new Customer(newEmail);

		if (customersList.contains(newCustomer))
			throw new CustomerHandlingException("Email Id already exits!! Please choose new email Id.");
	}

	// add static method for user login
	public static Customer userLogin(String email, String password, List<Customer> customerList)
			throws CustomerHandlingException {
		// check if email exits 
		int index=customerList.indexOf(new Customer(email)); // ArrayList.indexOf method returns -1 if matching element is not found
		// raise exception if email doesn't exist 
		if (index == -1)
			throw new CustomerHandlingException("Email not registered");
		Customer validCustomer = customerList.get(index); // email exists, get user object 
		// validate password 
		if (!validCustomer.getPassword().equals(password))
			throw new CustomerHandlingException("Invalid password!!!");
		// user successfully logged in. Return valid customer details 
		return validCustomer;
	}

//	// add static method to validate plan
//	public static ServicePlan parseAndValidatePlan(String planName)
//			throws IllegalArgumentException, CustomerHandlingException {
//		// reg amount must match with the planCost
//		return ServicePlan.valueOf(planName.toUpperCase());
//	}
//
//	// Validate Registration Amount
//	public static double validateRegistrationAmount(ServicePlan chosenPlan, double registrationAmount)
//			throws CustomerHandlingException {
//		if (registrationAmount != chosenPlan.getPlanCost()) {
//			throw new CustomerHandlingException("Incorrect registration amount paid!!!");
//		}
//		return registrationAmount;
//	}

	// combining above 2 methods into one for better efficiency as both methods are
	// tightly coupled
	// add static method to validate plan and registration amount
	public static ServicePlan parseAndValidatePlanAndRegAmount(String planName, double registrationAmount)
			throws IllegalArgumentException, CustomerHandlingException {
		ServicePlan servicePlan = ServicePlan.valueOf(planName);
		if (registrationAmount != servicePlan.getPlanCost()) {
			throw new CustomerHandlingException("Incorrect registration amount paid!!!");
		}
		return servicePlan;
	}

	// validate age: user must be at least 21 years old
	public static LocalDate validateAge(String dob) throws DateTimeParseException, CustomerHandlingException {
		// parsing
		LocalDate dateOfBirth = LocalDate.parse(dob);
		int ageInYears = between(LocalDate.parse(dob), LocalDate.now()).getYears(); // static import Period.between(sta
		if (ageInYears < 21)
			throw new CustomerHandlingException("You must be at least 21 years of age to register!!");
		return dateOfBirth;
	}

}
