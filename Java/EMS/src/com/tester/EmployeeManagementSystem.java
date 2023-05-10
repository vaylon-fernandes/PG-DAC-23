package com.tester;

import static utils.IOUtilis.restoreEmployeeDetails;
import static utils.IOUtilis.storeEmployeeDetails;
import static utils.EmployeeValidationRules.validateAllInputs;
import static utils.EmployeeValidationRules.validateEmpId;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.ems.Employee;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter File Name: ");
			String fileName = sc.next();
			Map<String, Employee> emps = restoreEmployeeDetails(fileName);
			boolean exit = false;
			while (!exit) {
				System.out.println("Menu 1. Hire new emp\r\n" + "2. List all emp details\r\n" + "3. Promote an emp\r\n"
						+ "4. Delete emp details\r\n" + "5. Sort emps as per join date n display the same.\r\n"
						+ "6. We can add many more options here.....\r\n" + "0. Exit");
				try {
					switch (sc.nextInt()) {
					case 0:
						storeEmployeeDetails("Employees.ser", emps);
						System.out.println("Exiting....");
						exit = true;
						break;
					case 1:
//					(String id, String first_name, String last_name, double salary, String dept,
//							String joiningDate, Map<String, Employee> emps)
						System.out.println(
								"Enter Details: First name, Last name, Salary, Department, Join Date(yyyy-mm-dd)");
						Employee emp = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), emps);
						System.out.println("Record for new employee created scuccesfully");
						emps.put(emp.getId(), emp);
						break;
					case 2:
						emps.forEach((k, v) -> System.out.println(v));
						break;
					case 3: // Promote and employee
						System.out.println("Enter Employee id: ");
						Employee empToPromote = emps.get(validateEmpId(sc.next(), emps));
						double incrementedSalary = empToPromote.getSalary() * 1.1; // 10% increment
						empToPromote.setSalary(incrementedSalary);
						break;
//					4. Delete emp details
					case 4:
						System.out.println("Enter Employee id: ");
						emps.remove(validateEmpId(sc.next(), emps));
						System.out.println("Employee record deleted");
						break;
//					5. Sort emps as per join date n display the same.
					case 5:
						break;
					default:
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
