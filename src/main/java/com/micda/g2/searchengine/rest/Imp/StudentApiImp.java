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
import com.micda.g2.searchengine.model.Student;
import com.micda.g2.searchengine.rest.IStudentApi;
import com.micda.g2.searchengine.service.imp.StudentServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/student")
class StudentApiImp implements IStudentApi{

	@Autowired
	StudentServiceImp studentServiceImp;


	@GetMapping(value = "/{id}")
	public Student get(@PathVariable("id") int id) {

		return studentServiceImp.getStudent(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student add(@RequestParam(value = "name") String name) {
		Student student = new Student();
		//todo :
		studentServiceImp.addStudent(student);
		return student;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Student student) {
		Preconditions.checkNotNull(student);
		try {
			RestPreconditions.checkFound(studentServiceImp.getStudent(id));
			studentServiceImp.updateStudent(student);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		studentServiceImp.removeStudent(id);
	}

}
