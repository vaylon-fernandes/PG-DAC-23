package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.entities.Department;
import com.app.entities.Employees;
import com.app.repositories.DepartmentRepository;
import com.app.services.EmployeeService;



@RestController 
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired 
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in "+getClass()+" ctr");
	}
	@Autowired
	private DepartmentRepository deptRepo;
	// req handling method to return a list of all emps
	// http://locahost://8080/employees
	@GetMapping
	public List<Employees> listEmps(){
		System.out.println("in list emps");
		return empService.getAllEmployees();
	}
	
	// req method to find Emp Details by Id 
	@GetMapping("/{empId}")
	public Employees getEmpById(@Valid @PathVariable Long empId) {
		return empService.getEmpDetailsById(empId);
	}
	
	// req handling method to add a employee
	@PostMapping 
	public ResponseEntity<?> saveEmpDetails(@Valid @RequestParam Long courseId,@Valid @RequestBody Employees newEmp){
		System.out.println(newEmp);
		Department newDept=deptRepo.findById(courseId).orElseThrow(()->new ResourceNotFoundException("no dept found"));
		newEmp.setDeptId(newDept);
		return new ResponseEntity<>(empService.addEmpDetails(newEmp), HttpStatus.CREATED);
	}
}
