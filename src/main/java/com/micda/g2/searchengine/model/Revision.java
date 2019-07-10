package com.micda.g2.searchengine.model;

import java.util.Date;

import javax.persistence.Entity;
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
public class Revision extends Auditable<Integer> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	private String file;
	private String supervisorFeedback;
	private Date feedbackTime;
	private String studentAnwser;
	private Date answerTime;
	
	@ManyToOne
	@JoinColumn(name = "publication_id")
	private Publication publication;
	
}
