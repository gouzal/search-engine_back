package com.micda.g2.searchengine.model;


import java.util.Date;

import javax.persistence.Column;
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
}
