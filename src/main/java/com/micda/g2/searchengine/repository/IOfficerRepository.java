/**
 * 
 */
package com.micda.g2.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micda.g2.searchengine.model.Officer;

/**
 * @author Larbi
 *
 */
public interface IOfficerRepository extends JpaRepository<Officer, Integer> {

}
