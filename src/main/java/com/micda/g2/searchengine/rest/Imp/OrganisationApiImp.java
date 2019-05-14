package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Organisation;
import com.micda.g2.searchengine.rest.IOrganisationApi;
import com.micda.g2.searchengine.service.imp.OrganisationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RequestMapping("/organisation")
class OrganisationApiImp implements IOrganisationApi {

	@Autowired
	OrganisationServiceImp organisationServiceImp;

	@Override
	public List<Organisation> all() {
		return this.organisationServiceImp.getAllOrganisations();
	}

	@Override
	public Organisation one(int id) {
		return this.organisationServiceImp.getOrganisation(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody Organisation organisation) {
		Preconditions.checkNotNull(organisation);
		try {
			RestPreconditions.checkFound(organisationServiceImp.getOrganisation(id));
			organisationServiceImp.updateOrganisation(organisation);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		organisationServiceImp.removeOrganisation(id);
	}


	@Override
	public Organisation add(Organisation organisation) {
		return this.organisationServiceImp.addOrganisation(organisation);
	}

}
