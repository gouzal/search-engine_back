package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Department;

public interface IDepartmentService {
	public Department addDepartment(Department department);

	public Department removeDepartment(int id);

	public Department updateDepartment(Department department);

	public Department getDepartment(int id);

	public List<Department> getAllDepartments();
}
