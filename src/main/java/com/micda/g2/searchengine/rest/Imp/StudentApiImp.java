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
import com.micda.g2.searchengine.model.Student;
import com.micda.g2.searchengine.rest.IStudentApi;
import com.micda.g2.searchengine.service.imp.StudentServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
class StudentApiImp implements IStudentApi{

	@Autowired
	StudentServiceImp studentServiceImp;

	@Override
	@ResponseBody
	@GetMapping("/student")
	public List<Student> all() {
		return this.studentServiceImp.getAllStudents();
	}

	@Override
	@ResponseBody
	@GetMapping("/student/{id}")
	public Student one(int id) {
		return this.studentServiceImp.getStudent(id);
	}
	
	@Override
	@PutMapping("/student/{id}")
	public void update(@PathVariable("id") int id, @RequestBody Student student) {
		Preconditions.checkNotNull(student);
		try {
			RestPreconditions.checkFound(studentServiceImp.getStudent(id));
			studentServiceImp.updateStudent(student);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	@ResponseBody
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable("id") int id) {
		studentServiceImp.removeStudent(id);
	}

	@Override
	@ResponseBody
	@PostMapping("/student")
	public Student add(Student student) {
		return this.studentServiceImp.addStudent(student);
	}

}
