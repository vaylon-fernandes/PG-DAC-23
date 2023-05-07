package com.tester;

import static utils.CustomerValidationRules.userLogin;
import static utils.CustomerValidationRules.validateInputs;
import static utils.CustomerUtils.populateSampleCustomerData;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.code.Customer;


public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customerList = populateSampleCustomerData();
			
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all 4. Change Password 5.Unsubscribe customer");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1: // customer registration
						System.out.println("Enter customer details: First Name, String Last Name, String email, String password, Dob(yyyy-mm-dd),"
								+ "registrationAmount, Service Plan");
						Customer validCustomer = validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), customerList);
						customerList.add(validCustomer);
						System.out.println("Customer Registered!!!!!!!");
						break;
					case 2:// sign in
						System.out.println("Enter Email: ");
						String email = sc.next();
						System.out.println("Enter password: ");
						String password = sc.next();
						validCustomer=userLogin(email, password, customerList);
						System.out.println("Welcome "+validCustomer.getFirstName()+" !!");
						break;
					case 3: // display all 
						Iterator<Customer> itrCxList= customerList.iterator();
						while(itrCxList.hasNext()) {
							System.out.println(itrCxList.next());
						}
						break;
					case 4: // Change password 
						System.out.println("You must Login first!"); // user can update password only once logged in 
						validCustomer = userLogin(sc.next(),sc.next(), customerList);
						System.out.println("Enter new password");
						password = sc.next();
						validCustomer.setPassword(password);
						System.out.println("Password updated");
						break;
					case 5: // Unsubscribe customer
						System.out.println("Enter email and password to remove your subscription");
						validCustomer = userLogin(sc.next(), sc.next(), customerList); 
						int index = customerList.indexOf(validCustomer);
						customerList.remove(index);
						System.out.println("You have been unbscribed");
						break;
					case 0: 
						exit = true;
						break;

//					default:
//						break;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
