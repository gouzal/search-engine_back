package com.micda.g2.searchengine.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.micda.g2.searchengine.model.Organisation;
import com.micda.g2.searchengine.repository.IOrganisationRepository;
import com.micda.g2.searchengine.service.IOrganisationService;

public class OrganisationServiceImp implements IOrganisationService {
	@Autowired
	private IOrganisationRepository iOrganisationRepository;

	@Override
	public void addOrganisation(Organisation organisation) {
		this.iOrganisationRepository.save(organisation);
	}

	@Override
	public void removeOrganisation(int id) {
		Organisation organisation = this.getOrganisation(id);
		this.iOrganisationRepository.delete(organisation);

	}

	@Override
	public void updateOrganisation(Organisation organisation) {
		this.iOrganisationRepository.save(organisation);

	}

	@Override
	public Organisation getOrganisation(int id) {
		boolean existe = this.iOrganisationRepository.findById(id).isPresent();
		if (existe) {
			return this.getOrganisation(id);
		}
		throw new EntityNotFoundException("Organisation with Id:" + id + " Not Found");
	}

	@Override
	public List<Organisation> getAllOrganisations() {
		// TODO Auto-generated method stub
		return null;
	}

}
