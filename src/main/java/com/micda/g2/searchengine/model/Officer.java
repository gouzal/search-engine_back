package com.micda.g2.searchengine.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Larbi
 */

@NoArgsConstructor
@Entity
@Data
public class Officer extends Employee {

    private static final long serialVersionUID = 1L;

    private String role;
}
