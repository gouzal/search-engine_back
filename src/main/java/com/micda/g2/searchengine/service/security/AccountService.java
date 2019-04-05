package com.micda.g2.searchengine.service.security;

import com.micda.g2.searchengine.model.Person;
import com.micda.g2.searchengine.model.Role;

public interface AccountService {

        public Person saveUser(Person user);
        public Role saveRole(Role role);
        public void AddRoleToUser(String user , String role);
        public  Person findUserByUsername(String username);



}
