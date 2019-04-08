package com.micda.g2.searchengine.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public abstract class Person extends Auditable<Integer>implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
    protected String firstName;
    protected String lastName;
    protected char gendre;
    protected String email;
    protected String password;
    protected Date birthDate;
    protected boolean isValide = false;
    protected boolean isActive = false;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected Department department;

}
