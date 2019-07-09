package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.validation.constraints.Null;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Data
public class Employee extends Person {
   
    @Null
    private float salary;
}
