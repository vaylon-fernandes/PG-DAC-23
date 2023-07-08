package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.entities.Employees;
import com.app.repositories.EmployeeRepository;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired 
	private EmployeeRepository empRepo; 
	
	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employees addEmpDetails(Employees transientEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(transientEmp);
	}

	@Override
	public Employees getEmpDetailsById(Long employeeId) {
		
		return empRepo.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Invalid employee id"));
	}

}
