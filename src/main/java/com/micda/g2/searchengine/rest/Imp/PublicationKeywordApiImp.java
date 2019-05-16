package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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


	@Override
	public List<PublicationKeyword> all() {
		return this.publicationKeywordServiceImp.getAllPublicationKeywords();
	}

	@Override
	public PublicationKeyword one(int id) {
		return this.publicationKeywordServiceImp.getPublicationKeyword(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody PublicationKeyword publicationKeyword) {
		Preconditions.checkNotNull(publicationKeyword);
		try {
			RestPreconditions.checkFound(publicationKeywordServiceImp.getPublicationKeyword(id));
			publicationKeywordServiceImp.updatePublicationKeyword(publicationKeyword);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		publicationKeywordServiceImp.removePublicationKeyword(id);
	}


	@Override
	public PublicationKeyword add(PublicationKeyword publicationKeyword) {
		return this.publicationKeywordServiceImp.addPublicationKeyword(publicationKeyword);
	}

}
