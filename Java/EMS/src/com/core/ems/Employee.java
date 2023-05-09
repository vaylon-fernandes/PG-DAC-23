package com.core.ems;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable{
// 2.2 Emp details : id(string), first name , last name , salary(double), 
	private String id, first_name, last_name;
	private double salary;
	private Department dept;
	private LocalDate joiningDate; 
	
	
	public Employee(String id, String first_name, String last_name, double salary, Department dept, LocalDate joiningDate) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
		this.dept = dept;
		this.joiningDate = joiningDate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
		public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", salary="
					+ salary + ", dept=" + dept + ", joiningDate=" + joiningDate + "]";
		} 
	
	
	
	
}
