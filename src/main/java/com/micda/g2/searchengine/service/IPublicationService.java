package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Publication;

public interface IPublicationService {
	public Publication addPublication(Publication publication);

	public Publication removePublication(int id);

	public Publication updatePublication(Publication publication);

	public Publication getPublication(int id);

	public List<Publication> getAllPublications();
}
