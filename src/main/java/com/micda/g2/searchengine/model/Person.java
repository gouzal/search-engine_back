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
public abstract class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    protected int id;
    @Getter
    @Setter
    protected String firstName;
    @Getter
    @Setter
    protected String lastName;
    @Getter
    @Setter
    protected char gendre;
    @Getter
    @Setter
    protected String email;
    @Getter
    @Setter
    protected String password;
    @Getter
    @Setter
    protected Date birthDate;
    @Getter
    @Setter
    protected boolean isValide = false;
    @Getter
    @Setter
    protected boolean isActive = false;
    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected Department department;

}
