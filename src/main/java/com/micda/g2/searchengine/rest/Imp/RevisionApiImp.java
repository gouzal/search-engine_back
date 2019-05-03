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
import com.micda.g2.searchengine.model.Revision;
import com.micda.g2.searchengine.rest.IRevisionApi;
import com.micda.g2.searchengine.service.imp.RevisionServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/revision")
class RevisionApiImp implements IRevisionApi{

	@Autowired
	RevisionServiceImp revisionServiceImp;


	@GetMapping(value = "/{id}")
	public Revision get(@PathVariable("id") int id) {

		return revisionServiceImp.getRevision(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Revision add(@RequestParam(value = "name") String name) {
		Revision revision = new Revision();
		//todo :
		revisionServiceImp.addRevision(revision);
		return revision;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Revision revision) {
		Preconditions.checkNotNull(revision);
		try {
			RestPreconditions.checkFound(revisionServiceImp.getRevision(id));
			revisionServiceImp.updateRevision(revision);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		revisionServiceImp.removeRevision(id);
	}


	

}
