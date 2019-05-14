package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Department;
import com.micda.g2.searchengine.rest.IDepartmentApi;
import com.micda.g2.searchengine.service.imp.DepartmentServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

class DepartmentApiImp implements IDepartmentApi{

	@Autowired
	DepartmentServiceImp departmentServiceImp;

	@Override
	public List<Department> all() {
		return this.departmentServiceImp.getAllDepartments();
	}

	@Override
	public Department one(int id) {
		return this.departmentServiceImp.getDepartment(id);
	}
	
	@Override
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
	public void delete(@PathVariable("id") int id) {
		departmentServiceImp.removeDepartment(id);
	}


	@Override
	public Department add(Department department) {
		return this.departmentServiceImp.addDepartment(department);
	}

}
