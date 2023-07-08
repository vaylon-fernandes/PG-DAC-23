package com.app.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.AuthEmpReq;
import com.app.entities.Employees;
import com.app.services.EmployeeService;



@RestController 
@RequestMapping("/employees")
@Validated
public class EmployeeController {
	@Autowired 
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in "+getClass()+" ctr");
	}
	
	// req handling method to return a list of all emps
	// http://locahost://8080/employees
	@GetMapping
	public List<Employees> listEmps(){
		System.out.println("in list emps");
		return empService.getAllEmployees();
	}
	
	// req method to find Emp Details by Id 
	@GetMapping("/{empId}")
	public Employees getEmpById(@Valid @PathVariable @Min(value = 1, message = "emp id > 1") @Max(value = 100, message = "emp id must be < 100")Long empId) {
		return empService.getEmpDetailsById(empId);
	}
	
	// req handling method to add a employee
	@PostMapping 
	public ResponseEntity<?> saveEmpDetails(@Valid @RequestBody Employees newEmp){
		return new ResponseEntity<>(empService.addEmpDetails(newEmp), HttpStatus.CREATED);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenthicateResponse(@RequestBody @Valid AuthEmpReq req){
		return ResponseEntity.status(HttpStatus.OK).body(empService.authenticateEmp(req));
	}
	
	@DeleteMapping("/{id}")
	public ApiResponse deleteEmp(@PathVariable @Valid Long id) {
		return new ApiResponse(empService.deletEmp(id));
	}
	
	@PutMapping
	public Employees updateEmp(@RequestBody Employees emp) {
		return empService.updateEmp(emp);
	}
}
