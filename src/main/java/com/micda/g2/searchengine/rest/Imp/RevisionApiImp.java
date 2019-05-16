package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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


	@Override
	public List<Revision> all() {
		return this.revisionServiceImp.getAllRevisions();
	}

	@Override
	public Revision one(int id) {
		return this.revisionServiceImp.getRevision(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody Revision revision) {
		Preconditions.checkNotNull(revision);
		try {
			RestPreconditions.checkFound(revisionServiceImp.getRevision(id));
			revisionServiceImp.updateRevision(revision);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		revisionServiceImp.removeRevision(id);
	}


	@Override
	public Revision add(Revision revision) {
		return this.revisionServiceImp.addRevision(revision);
	}

}
