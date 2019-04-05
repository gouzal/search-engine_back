package com.micda.g2.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micda.g2.searchengine.model.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {

       Role findByRolename(String name);

}
