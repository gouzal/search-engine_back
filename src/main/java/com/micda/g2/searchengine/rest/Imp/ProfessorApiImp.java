package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Professor;
import com.micda.g2.searchengine.rest.IProfessorApi;
import com.micda.g2.searchengine.service.imp.ProfessorServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;


class ProfessorApiImp implements IProfessorApi{


	@Autowired
	ProfessorServiceImp professorServiceImp;

	@Override
	public List<Professor> all() {
		return this.professorServiceImp.getAllProfessors();
	}

	@Override
	public Professor one(int id) {
		return this.professorServiceImp.getProfessor(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody Professor professor) {
		Preconditions.checkNotNull(professor);
		try {
			RestPreconditions.checkFound(professorServiceImp.getProfessor(id));
			professorServiceImp.updateProfessor(professor);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		professorServiceImp.removeProfessor(id);
	}


	@Override
	public Professor add(Professor professor) {
		return this.professorServiceImp.addProfessor(professor);
	}

}

