package com.micda.g2.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micda.g2.searchengine.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

	Person findByEmail(String email);

}
