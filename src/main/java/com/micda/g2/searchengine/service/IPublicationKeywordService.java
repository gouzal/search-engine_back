package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.PublicationKeyword;

public interface IPublicationKeywordService {
	public PublicationKeyword addPublicationKeyword(PublicationKeyword publicationKeyword);

	public PublicationKeyword removePublicationKeyword(int id);

	public PublicationKeyword updatePublicationKeyword(PublicationKeyword publicationKeyword);

	public PublicationKeyword getPublicationKeyword(int id);

	public List<PublicationKeyword> getAllPublicationKeywords();
}
