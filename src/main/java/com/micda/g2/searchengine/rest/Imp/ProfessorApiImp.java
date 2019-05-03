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
import com.micda.g2.searchengine.model.Professor;
import com.micda.g2.searchengine.rest.IProfessorApi;
import com.micda.g2.searchengine.service.imp.ProfessorServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/professor")
class ProfessorApiImp implements IProfessorApi{

	@Autowired
	ProfessorServiceImp professorServiceImp;


	@GetMapping(value = "/{id}")
	public Professor get(@PathVariable("id") int id) {

		return professorServiceImp.getProfessor(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Professor add(@RequestParam(value = "name") String name) {
		Professor professor = new Professor();
		//todo set attribute
		professorServiceImp.addProfessor(professor);
		return professor;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Professor professor) {
		Preconditions.checkNotNull(professor);
		try {
			RestPreconditions.checkFound(professorServiceImp.getProfessor(id));
			professorServiceImp.updateProfessor(professor);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		professorServiceImp.removeProfessor(id);
	}

}
