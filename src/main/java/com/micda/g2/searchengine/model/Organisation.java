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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Builder(toBuilder=true)
@RequiredArgsConstructor
@Data
@Entity
public class Organisation  extends Auditable<Integer>  implements Serializable {

  
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private int id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String adress;
    @Setter
    @Getter
    private String tel;
    @Setter
    @Getter
    private String website;
    @Setter
    @Getter
    private String email;
    @Setter
    @Getter
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, mappedBy = "organisation", fetch = FetchType.EAGER)
    private List<OrganisationDepartment> organisationDepartments = new ArrayList<>();

}
