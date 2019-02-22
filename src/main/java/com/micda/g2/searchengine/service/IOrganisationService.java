package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Organisation;

public interface IOrganisationService {
	public void addOrganisation(Organisation organisation);

	public void removeOrganisation(int id);

	public void updateOrganisation(Organisation organisation);

	public Organisation getOrganisation(int id);

	public List<Organisation> getAllOrganisations();
}
