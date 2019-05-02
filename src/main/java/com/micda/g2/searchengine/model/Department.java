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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Department extends Auditable<Integer> implements Serializable {

    private static final long serialVersionUID = 8523846849113972991L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Getter
    @Setter
    private int id;
   
    private String name;
   
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "department")
    //@JoinColumn(name = "department_id")
    private List<Person> persons = new ArrayList<>();

    @Setter
    @Getter
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, mappedBy = "department", fetch = FetchType.LAZY)
    private List<OrganisationDepartment> organisationDepartments = new ArrayList<>();

}
