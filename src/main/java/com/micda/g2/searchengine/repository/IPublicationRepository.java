package com.micda.g2.searchengine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micda.g2.searchengine.model.Publication;

public interface IPublicationRepository extends JpaRepository<Publication, Integer> {
	
	@Query("SELECT p FROM Publication p WHERE p.mainAuthor.id = :studentId")
	public List<Publication> findAllByStudentId(@Param("studentId") int studentId);

	@Query("SELECT p FROM Publication p WHERE p.supervisor.id = :personId")
	public List<Publication> findAllBySupervisorId(@Param("personId") int personId);	
	
}
