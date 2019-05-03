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
import com.micda.g2.searchengine.model.PublicationKeyword;
import com.micda.g2.searchengine.rest.IPublicationKeywordApi;
import com.micda.g2.searchengine.service.imp.PublicationKeywordServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/publicationKeyword")
class PublicationKeywordApiImp implements IPublicationKeywordApi{

	@Autowired
	PublicationKeywordServiceImp publicationKeywordServiceImp;


	@GetMapping(value = "/{id}")
	public PublicationKeyword get(@PathVariable("id") int id) {

		return publicationKeywordServiceImp.getPublicationKeyword(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PublicationKeyword add(@RequestParam(value = "name") String name) {
		PublicationKeyword publicationKeyword = new PublicationKeyword();
		//todo set attribute
		publicationKeywordServiceImp.addPublicationKeyword(publicationKeyword);
		return publicationKeyword;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody PublicationKeyword publicationKeyword) {
		Preconditions.checkNotNull(publicationKeyword);
		try {
			RestPreconditions.checkFound(publicationKeywordServiceImp.getPublicationKeyword(id));
			publicationKeywordServiceImp.updatePublicationKeyword(publicationKeyword);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		publicationKeywordServiceImp.removePublicationKeyword(id);
	}

}
