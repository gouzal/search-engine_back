package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee extends Person {

    private static final long serialVersionUID = 1L;
    @Setter
    @Getter
    @Null
    private float salary;
}
