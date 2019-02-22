package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Employee;

public interface IEmployeeService {
	public void addEmployee(Employee employee);

	public void removeEmployee(int id);

	public void updateEmployee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();
}
