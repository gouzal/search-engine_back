package com.micda.g2.searchengine.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class Department implements Serializable{
	private static final long serialVersionUID = 8523846849113972991L;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String name;
	

}
