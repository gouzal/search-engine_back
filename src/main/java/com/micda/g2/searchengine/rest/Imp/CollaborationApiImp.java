package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Collaboration;
import com.micda.g2.searchengine.rest.ICollaborationApi;
import com.micda.g2.searchengine.service.imp.CollaborationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;


class CollaborationApiImp implements ICollaborationApi{

	@Autowired
	CollaborationServiceImp collaborationServiceImp;

	@Override
	public List<Collaboration> all() {
		return this.collaborationServiceImp.getAllCollaborations();
	}

	@Override
	public Collaboration one(int id) {
		return this.collaborationServiceImp.getCollaboration(id);
	}
	
	@Override
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
	public void delete(@PathVariable("id") int id) {
		collaborationServiceImp.removeCollaboration(id);
	}


	@Override
	public Collaboration add(Collaboration collaboration) {
		return this.collaborationServiceImp.addCollaboration(collaboration);
	}

}
