package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Employee;
import com.micda.g2.searchengine.repository.IEmployeeRepository;
import com.micda.g2.searchengine.service.IEmployeeService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.EmployeeServiceImp")
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	private IEmployeeRepository iEmployeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
	return	this.iEmployeeRepository.save(employee);
	}

	@Override
	public Employee removeEmployee(int id) {
		Employee employee = this.getEmployee(id);
		this.iEmployeeRepository.delete(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return this.iEmployeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		boolean existe = this.iEmployeeRepository.findById(id).isPresent();
		if (existe) {
			return this.getEmployee(id);
		}
		throw new EntityNotFoundException("Employee with Id:" + id + " Not Found");
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<>();
		iEmployeeRepository.findAll().forEach(e->employees.add(e));
		return employees;
	}

	
}
