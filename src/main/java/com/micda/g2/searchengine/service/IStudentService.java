package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Student;

public interface IStudentService {
	public Student addStudent(Student student);

	public Student removeStudent(int id);

	public Student updateStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getAllStudents();
}
