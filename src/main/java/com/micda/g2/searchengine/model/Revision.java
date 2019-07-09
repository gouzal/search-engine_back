package com.micda.g2.searchengine.model;

import java.util.Date;

import javax.persistence.CascadeType;
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
public class Revision extends Auditable<Integer> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String file;
	private String supervisorFeedback;
	private Date feedbackTime;
	private String studentAnwser;
	private Date answerTime;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "publication_id")
	
	private Publication publication;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getSupervisorFeedback() {
		return supervisorFeedback;
	}
	public void setSupervisorFeedback(String supervisorFeedback) {
		this.supervisorFeedback = supervisorFeedback;
	}
	public Date getFeedbackTime() {
		return feedbackTime;
	}
	public void setFeedbackTime(Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}
	public String getStudentAnwser() {
		return studentAnwser;
	}
	public void setStudentAnwser(String studentAnwser) {
		this.studentAnwser = studentAnwser;
	}
	public Date getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(Date answerTime) {
		this.answerTime = answerTime;
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	
}
