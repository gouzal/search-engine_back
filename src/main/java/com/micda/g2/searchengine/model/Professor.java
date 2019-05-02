package com.micda.g2.searchengine.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Entity
@Data
public class Professor extends Person {

    private static final long serialVersionUID = 4097270904386507290L;

    private String grade;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "supervisor", orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Publication> publications = new ArrayList<>();

}
