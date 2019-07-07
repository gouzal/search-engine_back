package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Organisation;
import com.micda.g2.searchengine.rest.IOrganisationApi;
import com.micda.g2.searchengine.service.imp.OrganisationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
class OrganisationApiImp implements IOrganisationApi {

	@Autowired
	OrganisationServiceImp organisationServiceImp;

	@Override
	@ResponseBody
	@GetMapping("/organisation")
	public List<Organisation> all() {
		return this.organisationServiceImp.getAllOrganisations();
	}

	@Override
	@ResponseBody
	@GetMapping("dssfcd")
	public Organisation one(@PathVariable int id) {
		System.out.println(this.organisationServiceImp.getOrganisation(id));
		return this.organisationServiceImp.getOrganisation(id);
	}

	@Override
	@PutMapping("/")
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
