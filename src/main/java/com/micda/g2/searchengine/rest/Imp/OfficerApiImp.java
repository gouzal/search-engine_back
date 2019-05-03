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
import com.micda.g2.searchengine.model.Officer;
import com.micda.g2.searchengine.rest.IOfficerApi;
import com.micda.g2.searchengine.service.imp.OfficerServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/officer")
class OfficerApiImp implements IOfficerApi{

	@Autowired
	OfficerServiceImp officerServiceImp;


	@GetMapping(value = "/{id}")
	public Officer get(@PathVariable("id") int id) {

		return officerServiceImp.getOfficer(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Officer add(@RequestParam(value = "name") String name) {
		Officer officer = new Officer();
		//todo set attribute
		officerServiceImp.addOfficer(officer);
		return officer;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Officer officer) {
		Preconditions.checkNotNull(officer);
		try {
			RestPreconditions.checkFound(officerServiceImp.getOfficer(id));
			officerServiceImp.updateOfficer(officer);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		officerServiceImp.removeOfficer(id);
	}

}
