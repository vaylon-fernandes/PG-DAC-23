package com.app.services;

import java.util.List;

import com.app.dto.AuthEmpReq;
import com.app.dto.AuthRespDTO;
import com.app.entities.Employees;

public interface EmployeeService{
	// add a method to get all emps 
	List<Employees> getAllEmployees();
	
	Employees addEmpDetails(Employees transientEmp);  
	
	Employees getEmpDetailsById(Long employeeId);
	
	AuthRespDTO authenticateEmp(AuthEmpReq request);
	
	String deletEmp(Long empId);
	Employees updateEmp(Employees emp);
	
}
