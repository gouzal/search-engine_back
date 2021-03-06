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
import com.micda.g2.searchengine.model.Collaboration;
import com.micda.g2.searchengine.rest.ICollaborationApi;
import com.micda.g2.searchengine.service.imp.CollaborationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
class CollaborationApiImp implements ICollaborationApi{

	@Autowired
	CollaborationServiceImp collaborationServiceImp;

	@Override
	@ResponseBody
	@GetMapping("/collaboration")
	public List<Collaboration> all() {
		return this.collaborationServiceImp.getAllCollaborations();
	}

	@Override
	@ResponseBody
	@GetMapping("/collaboration/{id}")
	public Collaboration one(@PathVariable int id) {
		return this.collaborationServiceImp.getCollaboration(id);
	}
	
	@Override
	@ResponseBody
	@PutMapping("/collaboration/{id}")
	public void update(@PathVariable("id") int id, @RequestBody Collaboration collaboration) {
		Preconditions.checkNotNull(collaboration);
		try {
			RestPreconditions.checkFound(collaborationServiceImp.getCollaboration(id));
			collaborationServiceImp.updateCollaboration(collaboration);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	@ResponseBody
	@DeleteMapping("/collaboration/{id}")
	public void delete(@PathVariable("id") int id) {
		collaborationServiceImp.removeCollaboration(id);
	}


	@Override
	@ResponseBody
	@PostMapping("/collaboration")
	public Collaboration add(@RequestBody Collaboration collaboration) {
		return this.collaborationServiceImp.addCollaboration(collaboration);
	}

}
