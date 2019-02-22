package com.micda.g2.searchengine.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

public class Revision {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String file;
	@Getter
	@Setter
	private String supervisorFeedback;
	@Getter
	@Setter
	private Date feedbackTime;
	@Getter
	@Setter
	private String studentAnwser;
	@Getter
	@Setter
	private Date answerTime;
	@Getter
	@Setter
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="publication_id")
	private Publication publication;
}
