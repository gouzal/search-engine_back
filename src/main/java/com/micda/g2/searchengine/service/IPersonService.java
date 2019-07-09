package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Person;

public interface IPersonService {
	public Person addPerson(Person person);

	public Person removePerson(int id);

	public Person updatePerson(Person person);

	public Person getPerson(int id);

	public List<Person> getAllPersons();
}