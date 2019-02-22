package com.micda.g2.searchengine.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Publication {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String title;
	@Getter
	@Setter
	@Column(name="abstract")
	private String resume;
	@Getter
	@Setter
	private Date start;
	@Getter
	@Setter
	private Date end;
	@Getter
	@Setter
	private String  finalVersion;
	@Getter
	@Setter
	private boolean isPublished=false;
	@Getter
	@Setter
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="state_id")
	private PublicationState state;
	
}
