package com.micda.g2.searchengine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Data
public class Organisation  extends Auditable<Integer> {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String adress;
    private String tel;
    private String website;
    private String email;

    @OneToMany(mappedBy = "organisation")
    private List<OrganisationDepartment> organisationDepartments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<OrganisationDepartment> getOrganisationDepartments() {
		return organisationDepartments;
	}

	public void setOrganisationDepartments(List<OrganisationDepartment> organisationDepartments) {
		this.organisationDepartments = organisationDepartments;
	}
    
}
