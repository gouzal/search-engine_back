package com.micda.g2.searchengine.model;

import java.io.Serializable;
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
public class Publication extends Auditable<Integer> implements Serializable {

 
	private static final long serialVersionUID = 1L;
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
    @ManyToOne(targetEntity = Student.class)
    @JoinColumn(name = "student_id")
    private Student mainAuthor;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "publication")
    private List<Revision> revisions = new ArrayList<>();

}
