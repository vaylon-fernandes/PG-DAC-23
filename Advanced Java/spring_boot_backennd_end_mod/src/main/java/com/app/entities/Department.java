package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="department")
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "empList")
public class Department extends BaseEntity {
	@OneToMany(mappedBy = "deptId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employees> empList = new ArrayList<Employees>();
	@Enumerated(EnumType.STRING)
	@Column(name = "dept_name", length = 20)
	private DepartmentName deptName; 
	@Column(length = 20)
	private  String location;
	public Department(DepartmentName deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	} 
	
}
