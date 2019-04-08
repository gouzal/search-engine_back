package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@Entity
@Data
public class Employee extends Person {

    private static final long serialVersionUID = 1L;
   
    @Null
    private float salary;
}
