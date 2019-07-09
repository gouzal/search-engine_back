package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Organisation;

public interface IOrganisationService {
	public Organisation addOrganisation(Organisation organisation);

	public Organisation removeOrganisation(int id);

	public Organisation updateOrganisation(Organisation organisation);

	public Organisation getOrganisation(int id);

	public List<Organisation> getAllOrganisations();
}
