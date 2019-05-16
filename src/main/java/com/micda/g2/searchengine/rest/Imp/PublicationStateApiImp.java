package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.PublicationState;
import com.micda.g2.searchengine.rest.IPublicationStateApi;
import com.micda.g2.searchengine.service.imp.PublicationStateServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/publicationState")
class PublicationStateApiImp implements IPublicationStateApi{

	@Autowired
	PublicationStateServiceImp publicationStateServiceImp;


	@Override
	public List<PublicationState> all() {
		return this.publicationStateServiceImp.getAllPublicationStates();
	}

	@Override
	public PublicationState one(int id) {
		return this.publicationStateServiceImp.getPublicationState(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody PublicationState publicationState) {
		Preconditions.checkNotNull(publicationState);
		try {
			RestPreconditions.checkFound(publicationStateServiceImp.getPublicationState(id));
			publicationStateServiceImp.updatePublicationState(publicationState);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		publicationStateServiceImp.removePublicationState(id);
	}


	@Override
	public PublicationState add(PublicationState publicationState) {
		return this.publicationStateServiceImp.addPublicationState(publicationState);
	}

}

