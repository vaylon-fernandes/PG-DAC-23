package com.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long>{
	Optional<Employees> findByEmailIdAndPassword(String em, String pass);
	
}
