package com.micda.g2.searchengine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Publication extends Auditable<Integer>{

	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String title;
    
    @Column(name = "abstract")
    private String resume;
    
    private Date start;
    private Date end;
    private String finalVersion;
    private boolean isPublished = false;
    
    @ManyToOne(targetEntity = PublicationState.class)
    private PublicationState state;
    
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Person supervisor;
    
    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "student_id")
    private Person mainAuthor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getFinalVersion() {
		return finalVersion;
	}

	public void setFinalVersion(String finalVersion) {
		this.finalVersion = finalVersion;
	}

	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	public PublicationState getState() {
		return state;
	}

	public void setState(PublicationState state) {
		this.state = state;
	}

	public Person getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Person supervisor) {
		this.supervisor = supervisor;
	}

	public Person getMainAuthor() {
		return mainAuthor;
	}

	public void setMainAuthor(Person mainAuthor) {
		this.mainAuthor = mainAuthor;
	}



}
