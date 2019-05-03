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
import com.micda.g2.searchengine.model.Publication;
import com.micda.g2.searchengine.rest.IPublicationApi;
import com.micda.g2.searchengine.service.imp.PublicationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/publication")
class PublicationApiImp implements IPublicationApi{

	@Autowired
	PublicationServiceImp publicationServiceImp;


	@GetMapping(value = "/{id}")
	public Publication get(@PathVariable("id") int id) {

		return publicationServiceImp.getPublication(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Publication add(@RequestParam(value = "name") String name) {
		Publication publication = new Publication();
		//todo set attribute
		publicationServiceImp.addPublication(publication);
		return publication;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Publication publication) {
		Preconditions.checkNotNull(publication);
		try {
			RestPreconditions.checkFound(publicationServiceImp.getPublication(id));
			publicationServiceImp.updatePublication(publication);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		publicationServiceImp.removePublication(id);
	}

}
