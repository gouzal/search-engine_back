package com.micda.g2.searchengine.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Larbi
 */

@NoArgsConstructor
@Entity
@Data
public class Officer extends Employee {

	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
}
