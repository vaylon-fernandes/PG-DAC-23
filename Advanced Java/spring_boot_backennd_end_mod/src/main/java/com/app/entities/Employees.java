package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="employees")
@Entity
@NoArgsConstructor
@AllArgsConstructor()
@Getter
@Setter
@ToString(exclude = "password")
public class Employees extends BaseEntity{
	@Column(name="emp_name", length = 20)
	private String empName; 
	@Column(name="email_id", length = 30, unique = true, nullable = false)
	private String emailId;
	@Column(length=20, nullable = false)
	private String password;
	@Column(length = 40)
	private String address;
	@Column(name="join_date")
	private LocalDate joinDate;
	private int age;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="dept_id")
	private Department deptId;
	
	
//	public Employees() {
//		// TODO Auto-generated constructor stub
//	}
//	public Employees(String empName, String emailId, String password, String address, int age, String department) {
//		super();
//		this.empName = empName;
//		this.emailId = emailId;
//		this.password = password;
//		this.address = address;
//		this.age = age;
//		this.department = department;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	@Override
//	public String toString() {
//		return "Employees [empName=" + empName + ", emailId=" + emailId + ", address=" + address + ", age=" + age
//				+ ", department=" + department + "]";
//	}
//	
	
	
}
