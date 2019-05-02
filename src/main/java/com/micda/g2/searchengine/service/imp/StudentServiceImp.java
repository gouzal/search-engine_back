package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Student;
import com.micda.g2.searchengine.repository.IStudentRepository;
import com.micda.g2.searchengine.service.IStudentService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.StudentServiceImp")
public class StudentServiceImp implements IStudentService{
	@Autowired
	private IStudentRepository iStudentRepository;

	@Override
	public Student addStudent(Student student) {
	return	this.iStudentRepository.save(student);
	}

	@Override
	public Student removeStudent(int id) {
		Student student = this.getStudent(id);
		this.iStudentRepository.delete(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		return this.iStudentRepository.save(student);
	}

	@Override
	public Student getStudent(int id) {
		boolean existe = this.iStudentRepository.findById(id).isPresent();
		if (existe) {
			return this.getStudent(id);
		}
		throw new EntityNotFoundException("Student with Id:" + id + " Not Found");
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students=new ArrayList<>();
		iStudentRepository.findAll().forEach(e->students.add(e));
		return students;
	}

	
}
