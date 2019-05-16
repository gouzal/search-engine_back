package com.micda.g2.searchengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Entity
@Data
public class Organisation  extends Auditable<Integer>  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String adress;
    private String tel;
    private String website;
    @Setter
    @Getter
    private String email;
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, mappedBy = "organisation", fetch = FetchType.EAGER)
    private List<OrganisationDepartment> organisationDepartments = new ArrayList<>();
	public String getAdress() {
		// TODO Auto-generated method stub
		return this.adress;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
