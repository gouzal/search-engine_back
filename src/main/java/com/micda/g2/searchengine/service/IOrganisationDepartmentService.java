package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.OrganisationDepartment;

public interface IOrganisationDepartmentService {
	public OrganisationDepartment addOrganisationDepartment(OrganisationDepartment organisationDepartment);

	public OrganisationDepartment removeOrganisationDepartment(int id);

	public OrganisationDepartment updateOrganisationDepartment(OrganisationDepartment organisationDepartment);

	public OrganisationDepartment getOrganisationDepartment(int id);

	public List<OrganisationDepartment> getAllOrganisationDepartments();
}
