package com.micda.g2.searchengine.rest.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Organisation;
import com.micda.g2.searchengine.rest.IOrganisationApi;
import com.micda.g2.searchengine.service.imp.OrganisationServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/organisation")
class IOrganisationApiImp implements IOrganisationApi{

	@Autowired
	OrganisationServiceImp organisationServiceImp;


	@GetMapping(value = "/{id}")
	public Organisation get(@PathVariable("id") int id) {

		return organisationServiceImp.getOrganisation(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Organisation add(@RequestParam(value = "name") String name, @RequestParam(value = "adress") String adress,
			@RequestParam(value = "tel") String tel, @RequestParam(value = "website") String website,
			@RequestParam(value = "email") String email) {
		Organisation organisation = new Organisation();
		organisation.setName(name);
		organisation.setAdress(adress);
		organisation.setTel(tel);
		organisation.setWebsite(website);
		organisation.setEmail(email);
		organisationServiceImp.addOrganisation(organisation);
		return organisation;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Organisation organisation) {
		Preconditions.checkNotNull(organisation);
		try {
			RestPreconditions.checkFound(organisationServiceImp.getOrganisation(id));
			organisationServiceImp.updateOrganisation(organisation);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		organisationServiceImp.removeOrganisation(id);
	}

}
