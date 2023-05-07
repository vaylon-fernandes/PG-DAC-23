package com.code;

import java.time.LocalDate;

public class Customer {

	private int custId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate dob;
	private double registrationAmount;
	private ServicePlan plan;
	private static int idGenerator = 100;

	public Customer(String firstName, String lastName, String email, String password, LocalDate dob,
			double registrationAmount, ServicePlan plan
			) {
		super();
		this.custId = idGenerator++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.registrationAmount = registrationAmount;
		this.plan = plan;
		this.email = email;
		this.password = password;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	// Override toString method
	@Override
	public String toString() {
		return "custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", registrationAmount=" + registrationAmount + ", plan=" + plan + "Customer mail=" + email;
	}

	// Override equals method to replace reference type matching by content matching
	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer) {
			return this.email.equals(((Customer) o).email);
		}
		return false;
	}

	// Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
