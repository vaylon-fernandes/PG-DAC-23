package com.app.service;

import java.util.List;

import com.app.entities.Employee;




public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee addEmployee(Employee newEmp);
}
