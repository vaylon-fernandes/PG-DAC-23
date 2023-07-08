package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Department;
import com.app.services.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService deptService; 
	
	public DepartmentController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping
	public ResponseEntity<?> addDepartments(@RequestBody Department dept){
		return ResponseEntity.status(HttpStatus.CREATED).body(deptService.addDepartment(dept));
	}
	
	@GetMapping("/{deptId}")
	public ResponseEntity<?> getDepartment(@PathVariable Long deptId){
		return ResponseEntity.status(HttpStatus.OK).body(deptService.getDeptById(deptId));
	}
}
