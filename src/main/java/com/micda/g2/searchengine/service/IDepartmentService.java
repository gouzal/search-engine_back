package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Department;

public interface IDepartmentService {
	public void addDepartment(Department department);

	public void removeDepartment(int id);

	public void updateDepartment(Department department);

	public Department getDepartment(int id);

	public List<Department> getAllDepartments();
}
