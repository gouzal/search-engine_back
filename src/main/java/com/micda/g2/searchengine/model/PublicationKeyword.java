package com.micda.g2.searchengine.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class PublicationKeyword extends Auditable<Integer>{

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publication_id")
	private Publication publication;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "keyword_id")
	private Keyword keyword;

}
