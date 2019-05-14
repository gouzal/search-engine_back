package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Officer;
import com.micda.g2.searchengine.rest.IOfficerApi;
import com.micda.g2.searchengine.service.imp.OfficerServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;


class OfficerApiImp implements IOfficerApi{

	@Autowired
	OfficerServiceImp officerServiceImp;



	@Override
	public List<Officer> all() {
		return this.officerServiceImp.getAllOfficers();
	}

	@Override
	public Officer one(int id) {
		return this.officerServiceImp.getOfficer(id);
	}
	
	@Override
	public void update(@PathVariable("id") int id, @RequestBody Officer officer) {
		Preconditions.checkNotNull(officer);
		try {
			RestPreconditions.checkFound(officerServiceImp.getOfficer(id));
			officerServiceImp.updateOfficer(officer);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(@PathVariable("id") int id) {
			officerServiceImp.removeOfficer(id);
	}


	@Override
	public Officer add(Officer officer) {
		return this.officerServiceImp.addOfficer(officer);
	}
}

