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
import com.micda.g2.searchengine.model.PublicationState;
import com.micda.g2.searchengine.rest.IPublicationStateApi;
import com.micda.g2.searchengine.service.imp.PublicationStateServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/publicationState")
class PublicationStateApiImp implements IPublicationStateApi{

	@Autowired
	PublicationStateServiceImp publicationStateServiceImp;


	@GetMapping(value = "/{id}")
	public PublicationState get(@PathVariable("id") int id) {

		return publicationStateServiceImp.getPublicationState(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PublicationState add(@RequestParam(value = "name") String name) {
		PublicationState publicationState = new PublicationState();
		//todo set attribute
		publicationStateServiceImp.addPublicationState(publicationState);
		return publicationState;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody PublicationState publicationState) {
		Preconditions.checkNotNull(publicationState);
		try {
			RestPreconditions.checkFound(publicationStateServiceImp.getPublicationState(id));
			publicationStateServiceImp.updatePublicationState(publicationState);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		publicationStateServiceImp.removePublicationState(id);
	}

}
