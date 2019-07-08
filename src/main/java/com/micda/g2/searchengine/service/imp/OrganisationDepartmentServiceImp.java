package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.OrganisationDepartment;
import com.micda.g2.searchengine.repository.IOrganisationDepartmentRepository;
import com.micda.g2.searchengine.service.IOrganisationDepartmentService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.OrganisationDepartmentServiceImp")
public class OrganisationDepartmentServiceImp implements IOrganisationDepartmentService{
	@Autowired
	private IOrganisationDepartmentRepository iOrganisationDepartmentRepository;

	@Override
	public OrganisationDepartment addOrganisationDepartment(OrganisationDepartment organisationDepartment) {
		return this.iOrganisationDepartmentRepository.save(organisationDepartment);
	}

	@Override
	public OrganisationDepartment removeOrganisationDepartment(int id) {
		OrganisationDepartment organisationDepartment = this.getOrganisationDepartment(id);
		this.iOrganisationDepartmentRepository.delete(organisationDepartment);
		return organisationDepartment;
	}

	@Override
	public OrganisationDepartment updateOrganisationDepartment(OrganisationDepartment organisationDepartment) {
		return this.iOrganisationDepartmentRepository.save(organisationDepartment);
	}

	@Override
	public OrganisationDepartment getOrganisationDepartment(int id) {
		return this.iOrganisationDepartmentRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("OrganisationDepartment with Id:" + id + " Not Found"));


	}

	@Override
	public List<OrganisationDepartment> getAllOrganisationDepartments() {
		List<OrganisationDepartment> organisationDepartments=new ArrayList<>();
		iOrganisationDepartmentRepository.findAll().forEach(e->organisationDepartments.add(e));
		return organisationDepartments;
	}

	
}
