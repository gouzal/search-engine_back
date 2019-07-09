package com.micda.g2.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micda.g2.searchengine.model.PublicationState;

public interface IPublicationStateRepository extends JpaRepository<PublicationState, Integer> {

}
