package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Employee;
import com.micda.g2.searchengine.rest.IEmployeeApi;
import com.micda.g2.searchengine.service.imp.EmployeeServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/employee")
class EmployeeApiImp implements IEmployeeApi{

	@Autowired	
	EmployeeServiceImp employeeServiceImp;


	@Override
	public List<Employee> all() {
		return this.employeeServiceImp.getAllEmployees();
	}

	@Override
	public Employee one(int id) {
		return this.employeeServiceImp.getEmployee(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody Employee employee) {
		Preconditions.checkNotNull(employee);
		try {
			RestPreconditions.checkFound(employeeServiceImp.getEmployee(id));
			employeeServiceImp.updateEmployee(employee);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		employeeServiceImp.removeEmployee(id);
	}


	@Override
	public Employee add(Employee employee) {
		return this.employeeServiceImp.addEmployee(employee);
	}
}