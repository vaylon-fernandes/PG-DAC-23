package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping
	List<Employee> listEmps(){
		System.out.println("in list emps");
		return employeeService.getAllEmployees();
	}
}
