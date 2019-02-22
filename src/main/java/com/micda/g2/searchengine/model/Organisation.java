package com.micda.g2.searchengine.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Organisation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Setter
	@Getter
	private int id;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private String adress;
	@Setter
	@Getter
	private String tel;
	@Setter
	@Getter
	private String website;
	@Setter
	@Getter
	private String email;
	
	
}
