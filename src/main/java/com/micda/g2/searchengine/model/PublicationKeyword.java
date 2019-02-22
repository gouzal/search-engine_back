package com.micda.g2.searchengine.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
public class PublicationKeyword {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true,fetch=FetchType.LAZY	)
	@JoinColumn(name="publication_id")
	private Publication publication;
	@Getter
	@Setter
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true,fetch=FetchType.LAZY	)
	@JoinColumn(name="keyword_id")
	private Keyword keyword;
}
