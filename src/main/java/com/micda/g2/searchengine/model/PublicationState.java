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
public class PublicationState {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String value;
}
