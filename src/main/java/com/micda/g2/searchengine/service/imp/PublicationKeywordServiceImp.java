package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.PublicationKeyword;
import com.micda.g2.searchengine.repository.IPublicationKeywordRepository;
import com.micda.g2.searchengine.service.IPublicationKeywordService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.PublicationKeywordServiceImp")
public class PublicationKeywordServiceImp implements IPublicationKeywordService {
	@Autowired
	private IPublicationKeywordRepository iPublicationKeywordRepository;

	@Override
	public PublicationKeyword addPublicationKeyword(PublicationKeyword publicationKeyword) {
		return this.iPublicationKeywordRepository.save(publicationKeyword);
	}

	@Override
	public PublicationKeyword removePublicationKeyword(int id) {
		PublicationKeyword publicationKeyword = this.getPublicationKeyword(id);
		this.iPublicationKeywordRepository.delete(publicationKeyword);
		return publicationKeyword;
	}

	@Override
	public PublicationKeyword updatePublicationKeyword(PublicationKeyword publicationKeyword) {
		return this.iPublicationKeywordRepository.save(publicationKeyword);
	}

	@Override
	public PublicationKeyword getPublicationKeyword(int id) {
		return this.iPublicationKeywordRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("PublicationKeyword with Id:" + id + " Not Found"));
	}

	@Override
	public List<PublicationKeyword> getAllPublicationKeywords() {
		List<PublicationKeyword> publicationKeywords = new ArrayList<>();
		iPublicationKeywordRepository.findAll().forEach(e -> publicationKeywords.add(e));
		return publicationKeywords;
	}

}
