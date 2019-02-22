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
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Publication extends Auditable<Integer> implements Serializable {

 
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    @Column(name = "abstract")
    private String resume;
    @Getter
    @Setter
    private Date start;
    @Getter
    @Setter
    private Date end;
    @Getter
    @Setter
    private String finalVersion;
    @Getter
    @Setter
    private boolean isPublished = false;
    @Getter
    @Setter
    @ManyToOne(targetEntity = PublicationState.class)
    private PublicationState state;
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    @Getter
    @Setter
    private Person supervisor;
    @Getter
    @Setter
    @ManyToOne(targetEntity = Student.class)
    @JoinColumn(name = "student_id")
    private Student mainAuthor;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "publication")
    private List<Revision> revisions = new ArrayList<>();

}
