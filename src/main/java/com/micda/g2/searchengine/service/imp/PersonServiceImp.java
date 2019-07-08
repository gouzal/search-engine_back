package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Person;
import com.micda.g2.searchengine.repository.IPersonRepository;
import com.micda.g2.searchengine.service.IPersonService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.PersonServiceImp")
public class PersonServiceImp implements IPersonService{
	@Autowired
	private IPersonRepository iPersonRepository;

	@Override
	public Person addPerson(Person person) {
	return	this.iPersonRepository.save(person);
	}

	@Override
	public Person removePerson(int id) {
		Person person = this.getPerson(id);
		this.iPersonRepository.delete(person);
		return person;
	}

	@Override
	public Person updatePerson(Person person) {
		return this.iPersonRepository.save(person);
	}

	@Override
	public Person getPerson(int id) {
		return this.iPersonRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Person with Id:" + id + " Not Found"));

	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> persons=new ArrayList<>();
		iPersonRepository.findAll().forEach(e->persons.add(e));
		return persons;
	}

	
}
