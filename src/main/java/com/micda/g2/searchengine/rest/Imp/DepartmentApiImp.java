package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Department;
import com.micda.g2.searchengine.rest.IDepartmentApi;
import com.micda.g2.searchengine.service.imp.DepartmentServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
class DepartmentApiImp implements IDepartmentApi {

	@Autowired
	DepartmentServiceImp departmentServiceImp;

	@Override
	@ResponseBody
	@GetMapping("/department")
	public List<Department> all() {
		return this.departmentServiceImp.getAllDepartments();
	}

	@Override
	@ResponseBody
	@GetMapping("/department/{id}")
	public Department one(@PathVariable int id) {
		return this.departmentServiceImp.getDepartment(id);
	}

	@Override
	@ResponseBody
	@PutMapping("/department")
	public void update(@PathVariable("id") int id, @RequestBody Department department) {
		Preconditions.checkNotNull(department);
		try {
			RestPreconditions.checkFound(departmentServiceImp.getDepartment(id));
			departmentServiceImp.updateDepartment(department);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	@DeleteMapping("/department/{id}")
	public void delete(@PathVariable("id") int id) {
		departmentServiceImp.removeDepartment(id);
	}

	@Override
	@PostMapping("/department")
	@ResponseBody
	public Department add(@RequestBody Department department) {
		return this.departmentServiceImp.addDepartment(department);
	}

}
