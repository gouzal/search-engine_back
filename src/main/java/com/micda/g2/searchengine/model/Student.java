package com.micda.g2.searchengine.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Student extends Person {

	private static final long serialVersionUID = 4584595397027699062L;
	private String level;
	private String diploma;

}
