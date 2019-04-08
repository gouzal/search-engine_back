package com.micda.g2.searchengine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.micda.g2.searchengine.model.Person;
import com.micda.g2.searchengine.model.Role;
import com.micda.g2.searchengine.repository.IPersonRepository;
import com.micda.g2.searchengine.repository.IRoleRepository;
import com.micda.g2.searchengine.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private IPersonRepository personRepository;

	@Autowired
	private IRoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public Person saveUser(Person user) {

		System.out.println("user password : " + user.getPassword());
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		System.out.println("User password after encrypting : " + user.getPassword());

		return personRepository.save(user);
	}

	@Override
	public Role saveRole(Role role) {

		return roleRepository.save(role);

	}

	@Override
	public void AddRoleToUser(String Email, String roleName) {

		roleRepository.findAll().stream().forEach(role -> System.out.println(role.getRolename()));

		personRepository.findAll().stream().forEach(person -> System.out.println(person.getEmail()));

		Role role = roleRepository.findByRolename(roleName);
		Person user = personRepository.findByEmail(Email);

		System.out.println(role);

		System.out.println(user);

		user.getRoles().add(role);

	}

	@Override
	public Person findUserByUsername(String Email) {

		return personRepository.findByEmail(Email);
	}
}
