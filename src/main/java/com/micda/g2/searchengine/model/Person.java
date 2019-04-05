package com.micda.g2.searchengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public  class Person extends Auditable<Integer>implements Serializable {

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
    
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles =new ArrayList<>();

	public Person(int id, String firstName, String lastName, char gendre, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gendre = gendre;
		this.email = email;
		this.password = password;
	}
    
    
    
    
    

}
