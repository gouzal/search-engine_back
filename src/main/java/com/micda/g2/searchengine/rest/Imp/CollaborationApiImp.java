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
import com.micda.g2.searchengine.model.Collaboration;
import com.micda.g2.searchengine.rest.ICollaborationApi;
import com.micda.g2.searchengine.service.imp.CollaborationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/collaboration")
class CollaborationApiImp implements ICollaborationApi{

	@Autowired
	CollaborationServiceImp collaborationServiceImp;


	@GetMapping(value = "/{id}")
	public Collaboration get(@PathVariable("id") int id) {

		return collaborationServiceImp.getCollaboration(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Collaboration add(@RequestParam(value = "name") String name) {
		Collaboration collaboration = new Collaboration();
		//todo set attribute
		collaborationServiceImp.addCollaboration(collaboration);
		return collaboration;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Collaboration collaboration) {
		Preconditions.checkNotNull(collaboration);
		try {
			RestPreconditions.checkFound(collaborationServiceImp.getCollaboration(id));
			collaborationServiceImp.updateCollaboration(collaboration);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		collaborationServiceImp.removeCollaboration(id);
	}


	

}
