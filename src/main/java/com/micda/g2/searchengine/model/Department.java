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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Data
public class Department extends Auditable<Integer> implements Serializable {

	private static final long serialVersionUID = 8523846849113972991L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	private String name;

//	@OneToMany
//	@JoinColumn(name = "department_id")
//	 @OneToMany(mappedBy = "department")
//	private List<Person> persons ;
	 
//	@OneToMany
//	@JoinColumn(name = "department_id")
	 @OneToMany(mappedBy = "department")
	private List<OrganisationDepartment> organisationDepartments ;
	 

}
