package com.app.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.AuthEmpReq;
import com.app.dto.AuthRespDTO;
import com.app.entities.Employees;
import com.app.repositories.EmployeeRepository;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Autowired
	ModelMapper mapper;

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

		return empRepo.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Invalid employee id"));
	}

	@Override
	public AuthRespDTO authenticateEmp(AuthEmpReq request) {
		// TODO Auto-generated method stub
		System.out.println(request.getEmailId()+" "+request.getPassword());
		Employees emp = empRepo.findByEmailIdAndPassword(request.getEmailId(), request.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Emp not found: invalid Emaill or password"));
		
		AuthRespDTO authEmpResp = mapper.map(emp, AuthRespDTO.class);
		return authEmpResp;
	}

	@Override
	public String deletEmp(Long empId) {
		// TODO Auto-generated method stub
		String mesg = "Invalid empid";
		if(empRepo.existsById(empId)) {
			empRepo.deleteById(empId);
			mesg= "deleted";
		}
		return mesg;
	}

	@Override
	public Employees updateEmp(Employees emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

}
