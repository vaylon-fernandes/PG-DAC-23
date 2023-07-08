package com.app.services;

import com.app.entities.Department;

public interface DepartmentService {
	Department addDepartment(Department dept);

	Department getDeptById(Long deptId);
}
