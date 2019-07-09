package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Department;
import com.micda.g2.searchengine.repository.IDepartmentRepository;
import com.micda.g2.searchengine.service.IDepartmentService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.DepartmentServiceImp")
public class DepartmentServiceImp implements IDepartmentService {

	@Autowired
	private IDepartmentRepository iDepartmentRepository;

	@Override
	public Department addDepartment(Department department) {
	return	this.iDepartmentRepository.save(department);
	}

	@Override
	public Department removeDepartment(int id) {
		Department department = this.getDepartment(id);
		this.iDepartmentRepository.delete(department);
		return department;
	}

	@Override
	public Department updateDepartment(Department department) {
		return this.iDepartmentRepository.save(department);
	}

	@Override
	public Department getDepartment(int id) {
		return this.iDepartmentRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Department with Id:" + id + " Not Found"));

	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> departments=new ArrayList<>();
		iDepartmentRepository.findAll().forEach(e->departments.add(e));
		return departments;
	}

	
}
