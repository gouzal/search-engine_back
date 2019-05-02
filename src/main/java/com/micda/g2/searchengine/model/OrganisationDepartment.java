package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class OrganisationDepartment  extends Auditable<Integer> {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    @ManyToOne(targetEntity = Organisation.class)
    private Organisation organisation;
    @ManyToOne(targetEntity = Department.class)
    private Department department;
}
