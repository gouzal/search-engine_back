package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrganisationDepartment  extends Auditable<Integer> {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Setter
    @Getter
    private int id;
    @Setter
    @Getter
    @ManyToOne(targetEntity = Organisation.class)
    private Organisation organisation;
    @Setter
    @Getter
    @ManyToOne(targetEntity = Department.class)
    private Department department;
}
