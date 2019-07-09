package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class OrganisationDepartment extends Auditable<Integer> {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	@ManyToOne
	@JoinColumn(name = "organisation_id")
	private Organisation organisation;

	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Organisation getOrganisation() {
		return organisation;
	}


	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
