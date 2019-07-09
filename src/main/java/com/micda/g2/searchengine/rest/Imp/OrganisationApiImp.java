package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/organisation/{id}")
	public Organisation one(@PathVariable int id) {
		return this.organisationServiceImp.getOrganisation(id);
	}

	@Override
	@PutMapping("/organisation/{id}")
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
	@ResponseBody
	@DeleteMapping("/organisation/{id}")
	public void delete(@PathVariable("id") int id) {
		organisationServiceImp.removeOrganisation(id);
	}

	@Override
	@ResponseBody
	@PostMapping("/organisation")
	public Organisation add(@RequestBody Organisation organisation) {
		return this.organisationServiceImp.addOrganisation(organisation);
	}

}
