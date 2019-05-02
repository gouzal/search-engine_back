package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Officer;
import com.micda.g2.searchengine.repository.IOfficerRepository;
import com.micda.g2.searchengine.service.IOfficerService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.OfficerServiceImp")
public class OfficerServiceImp implements IOfficerService{
	@Autowired
	private IOfficerRepository iOfficerRepository;

	@Override
	public Officer addOfficer(Officer officer) {
	return	this.iOfficerRepository.save(officer);
	}

	@Override
	public Officer removeOfficer(int id) {
		Officer officer = this.getOfficer(id);
		this.iOfficerRepository.delete(officer);
		return officer;
	}

	@Override
	public Officer updateOfficer(Officer officer) {
		return this.iOfficerRepository.save(officer);
	}

	@Override
	public Officer getOfficer(int id) {
		boolean existe = this.iOfficerRepository.findById(id).isPresent();
		if (existe) {
			return this.getOfficer(id);
		}
		throw new EntityNotFoundException("Officer with Id:" + id + " Not Found");
	}

	@Override
	public List<Officer> getAllOfficers() {
		List<Officer> officers=new ArrayList<>();
		iOfficerRepository.findAll().forEach(e->officers.add(e));
		return officers;
	}

	
}
