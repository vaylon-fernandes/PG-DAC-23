//package com.app.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.app.custom_exceptions.ResourceNotFoundException;
//import com.app.entities.Department;
//import com.app.repositories.DepartmentRepository;
//
//@Service
//@Transactional
//public class DepartmentServiceImpl implements DepartmentService {
//	@Autowired 
//	private DepartmentRepository deptRepo;
//	
//	@Override
//	public Department addDepartment(Department dept) {
//		// TODO Auto-generated method stub
//		return deptRepo.save(dept);
//	}
//
//	@Override
//	public Department getDeptById(Long deptId) {
//		// TODO Auto-generated method stub
//		return deptRepo.findById(deptId).orElseThrow(()->new ResourceNotFoundException("Invalid Dept Id"));
//	}
//	
//	
//
//}
