package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.PublicationState;
import com.micda.g2.searchengine.repository.IPublicationStateRepository;
import com.micda.g2.searchengine.service.IPublicationStateService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.PublicationStateServiceImp")
public class PublicationStateServiceImp implements IPublicationStateService {
	@Autowired
	private IPublicationStateRepository iPublicationStateRepository;

	@Override
	public PublicationState addPublicationState(PublicationState publicationState) {
		return this.iPublicationStateRepository.save(publicationState);
	}

	@Override
	public PublicationState removePublicationState(int id) {
		PublicationState publicationState = this.getPublicationState(id);
		this.iPublicationStateRepository.delete(publicationState);
		return publicationState;
	}

	@Override
	public PublicationState updatePublicationState(PublicationState publicationState) {
		return this.iPublicationStateRepository.save(publicationState);
	}

	@Override
	public PublicationState getPublicationState(int id) {
		return this.iPublicationStateRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("PublicationState with Id:" + id + " Not Found"));

	}

	@Override
	public List<PublicationState> getAllPublicationStates() {
		List<PublicationState> publicationStates = new ArrayList<>();
		iPublicationStateRepository.findAll().forEach(e -> publicationStates.add(e));
		return publicationStates;
	}

}
