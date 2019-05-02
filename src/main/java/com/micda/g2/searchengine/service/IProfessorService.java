package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Professor;

public interface IProfessorService {
	public Professor addProfessor(Professor professor);

	public Professor removeProfessor(int id);

	public Professor updateProfessor(Professor professor);

	public Professor getProfessor(int id);

	public List<Professor> getAllProfessors();
}
