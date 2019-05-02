package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.PublicationState;

public interface IPublicationStateService {
	public PublicationState addPublicationState(PublicationState publicationState);

	public PublicationState removePublicationState(int id);

	public PublicationState updatePublicationState(PublicationState publicationState);

	public PublicationState getPublicationState(int id);

	public List<PublicationState> getAllPublicationStates();
}