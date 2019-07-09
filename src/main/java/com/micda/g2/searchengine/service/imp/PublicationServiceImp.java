package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Publication;
import com.micda.g2.searchengine.repository.IPublicationRepository;
import com.micda.g2.searchengine.service.IPublicationService;


@Service
@Qualifier("com.micda.g2.searchengine.service.imp.PublicationServiceImp")
public class PublicationServiceImp implements IPublicationService{
	@Autowired
	private IPublicationRepository iPublicationRepository;

	@Override
	public Publication addPublication(Publication publication) {
	return	this.iPublicationRepository.save(publication);
	}

	@Override
	public Publication removePublication(int id) {
		Publication publication = this.getPublication(id);
		this.iPublicationRepository.delete(publication);
		return publication;
	}

	@Override
	public Publication updatePublication(Publication publication) {
		return this.iPublicationRepository.save(publication);
	}

	@Override
	public Publication getPublication(int id) {
		return this.iPublicationRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Publication with Id:" + id + " Not Found"));

	}
	
	public List<Publication> getAllByStudentId(int id) {
		List<Publication> publications=new ArrayList<>();
		iPublicationRepository.findAllByStudentId(id).forEach(e->publications.add(e));
		return publications;
	}
	
	public List<Publication> getAllBySupervisorId(int id) {
		List<Publication> publications=new ArrayList<>();
		iPublicationRepository.findAllBySupervisorId(id).forEach(e->publications.add(e));
		return publications;
	}
	
	@Override
	public List<Publication> getAllPublications() {
		List<Publication> publications=new ArrayList<>();
		iPublicationRepository.findAll().forEach(e->publications.add(e));
		return publications;
	}

	
}
