package com.micda.g2.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micda.g2.searchengine.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
