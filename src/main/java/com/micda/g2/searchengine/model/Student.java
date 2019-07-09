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
public class Student extends Person {

	private String level;
	private String diploma;
	
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "mainAuthor", orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Publication> publications = new ArrayList<>();
//	public String getLevel() {
//		return level;
//	}
//	public void setLevel(String level) {
//		this.level = level;
//	}
//	public String getDiploma() {
//		return diploma;
//	}
//	public void setDiploma(String diploma) {
//		this.diploma = diploma;
//	}

}
