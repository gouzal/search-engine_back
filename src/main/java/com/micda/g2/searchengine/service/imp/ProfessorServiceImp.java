package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Professor;
import com.micda.g2.searchengine.repository.IProfessorRepository;
import com.micda.g2.searchengine.service.IProfessorService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.ProfessorServiceImp")
public class ProfessorServiceImp implements IProfessorService{
	@Autowired
	private IProfessorRepository iProfessorRepository;

	@Override
	public Professor addProfessor(Professor professor) {
	return	this.iProfessorRepository.save(professor);
	}

	@Override
	public Professor removeProfessor(int id) {
		Professor professor = this.getProfessor(id);
		this.iProfessorRepository.delete(professor);
		return professor;
	}

	@Override
	public Professor updateProfessor(Professor professor) {
		return this.iProfessorRepository.save(professor);
	}

	@Override
	public Professor getProfessor(int id) {
		boolean existe = this.iProfessorRepository.findById(id).isPresent();
		if (existe) {
			return this.getProfessor(id);
		}
		throw new EntityNotFoundException("Professor with Id:" + id + " Not Found");
	}

	@Override
	public List<Professor> getAllProfessors() {
		List<Professor> professors=new ArrayList<>();
		iProfessorRepository.findAll().forEach(e->professors.add(e));
		return professors;
	}

	
}
