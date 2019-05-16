package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Publication;
import com.micda.g2.searchengine.rest.IPublicationApi;
import com.micda.g2.searchengine.service.imp.PublicationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/publication")
class PublicationApiImp implements IPublicationApi{

	@Autowired
	PublicationServiceImp publicationServiceImp;


	@Override
	public List<Publication> all() {
		return this.publicationServiceImp.getAllPublications();
	}

	@Override
	public Publication one(int id) {
		return this.publicationServiceImp.getPublication(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody Publication publication) {
		Preconditions.checkNotNull(publication);
		try {
			RestPreconditions.checkFound(publicationServiceImp.getPublication(id));
			publicationServiceImp.updatePublication(publication);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		publicationServiceImp.removePublication(id);
	}


	@Override
	public Publication add(Publication publication) {
		return this.publicationServiceImp.addPublication(publication);
	}

}
