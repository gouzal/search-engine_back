package com.micda.g2.searchengine.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Larbi
 */
@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Officer extends Employee {

    private static final long serialVersionUID = 1L;
    @Getter
    @Setter
    private String role;
}
