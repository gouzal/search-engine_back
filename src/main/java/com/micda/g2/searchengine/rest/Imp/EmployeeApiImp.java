package com.micda.g2.searchengine.rest.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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


	@GetMapping(value = "/{id}")
	public Employee get(@PathVariable("id") int id) {

		return employeeServiceImp.getEmployee(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee add(@RequestParam(value = "name") String name) {
		Employee employee = new Employee();
		//todo set attribute
		employeeServiceImp.addEmployee(employee);
		return employee;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Employee employee) {
		Preconditions.checkNotNull(employee);
		try {
			RestPreconditions.checkFound(employeeServiceImp.getEmployee(id));
			employeeServiceImp.updateEmployee(employee);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		employeeServiceImp.removeEmployee(id);
	}


	

}
