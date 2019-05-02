package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee employee);

	public Employee removeEmployee(int id);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();
}
