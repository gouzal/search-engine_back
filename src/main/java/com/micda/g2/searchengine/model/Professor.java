package com.micda.g2.searchengine.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Professor extends Person {

    private String grade;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "professor")
//    private List<Publication> publications = new ArrayList<>();

//	public String getGrade() {
//		return grade;
//	}
//
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//
//	public List<Publication> getPublications() {
//		return publications;
//	}
//
//	public void setPublications(List<Publication> publications) {
//		this.publications = publications;
//	}

}
