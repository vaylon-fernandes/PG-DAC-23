package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long>{
	
}
