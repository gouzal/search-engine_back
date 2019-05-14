package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Organisation;
import com.micda.g2.searchengine.repository.IOrganisationRepository;
import com.micda.g2.searchengine.service.IOrganisationService;
@Service
@Qualifier("com.micda.g2.searchengine.service.imp.OrganisationServiceImp")
public class OrganisationServiceImp implements IOrganisationService {
	@Autowired
	private IOrganisationRepository iOrganisationRepository;

	@Override
	public Organisation addOrganisation(Organisation organisation) {
	return	this.iOrganisationRepository.save(organisation);
	}

	@Override
	public Organisation removeOrganisation(int id) {
		Organisation organisation = this.getOrganisation(id);
		this.iOrganisationRepository.delete(organisation);
		return organisation;
	}

	@Override
	public Organisation updateOrganisation(Organisation organisation) {
		return this.iOrganisationRepository.save(organisation);
	}

	@Override
	public Organisation getOrganisation(int id) {
		return this.iOrganisationRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Organisation with Id:" + id + " Not Found"));
	}

	@Override
	public List<Organisation> getAllOrganisations() {
		List<Organisation> organisations=new ArrayList<>();
		iOrganisationRepository.findAll().forEach(e->organisations.add(e));
		return organisations;
	}

}
