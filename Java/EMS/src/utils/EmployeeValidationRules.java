package utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.core.ems.Department;
import com.core.ems.Employee;
import com.custom_exception.EmployeeHandlingException;

public interface EmployeeValidationRules {
	// validate all input
	static Employee validateAllInputs(String id, String first_name, String last_name, double salary, String dept,
			String joiningDate, Map<String, Employee> emps) throws EmployeeHandlingException{
		checkDuplicateEmpid(id, emps);
		LocalDate validJoindate = parseAndValidateHireDate(joiningDate);
		Department validDept = parseandValidateDepartment(dept);
		
		return new Employee(id, first_name, last_name, salary, validDept, validJoindate);
	}

	// add static method to parse and validate dept
	static Department parseandValidateDepartment(String deptName) {
		return Department.valueOf(deptName);
	}

	// add static method to parse and validate hire date
	static LocalDate parseAndValidateHireDate(String date) throws DateTimeParseException, EmployeeHandlingException {

		// Parse Date
		LocalDate joinDate = LocalDate.parse(date);
		// Validate Date: Assume company started 3 years ago
		int differenceInYears = Period.between(joinDate, LocalDate.now()).getYears();

		if (differenceInYears > 3) {
			throw new EmployeeHandlingException("Invalid joining date! Date should be within last 3 years");
		}
		return joinDate;
	}

	static void checkDuplicateEmpid(String empId, Map<String, Employee> emps) throws EmployeeHandlingException {
		if (emps.containsKey(empId)) { // calls key classes equals method to check
			throw new EmployeeHandlingException("Employee with ID: " + empId + " already exists!!");
		}
	}

}
