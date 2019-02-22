package com.micda.g2.searchengine.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	@NotEmpty
	@NotNull
	protected String firstName;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected String lastName;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected char gendre;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected String email;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected String password;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected Date birthDate;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected boolean isValide = false;
	@Getter
	@Setter
	@NotEmpty
	@NotNull
	protected boolean isActive = false;

}
