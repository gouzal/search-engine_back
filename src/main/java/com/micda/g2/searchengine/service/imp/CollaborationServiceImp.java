package com.micda.g2.searchengine.service.imp;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Collaboration;
import com.micda.g2.searchengine.repository.ICollaborationRepository;
import com.micda.g2.searchengine.service.ICollaborationService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.CollaborationServiceImp")
public class CollaborationServiceImp implements ICollaborationService {
	@Autowired
	private ICollaborationRepository iCollaborationRepository;

	@Override
	public Collaboration addCollaboration(Collaboration collaboration) {
		return this.iCollaborationRepository.save(collaboration);
	}

	@Override
	public Collaboration removeCollaboration(int id) {
		Collaboration collaboration = this.getCollaboration(id);
		this.iCollaborationRepository.delete(collaboration);
		return collaboration;
	}

	@Override
	public Collaboration updateCollaboration(Collaboration collaboration) {
		return this.iCollaborationRepository.save(collaboration);
	}

	@Override
	public Collaboration getCollaboration(int id) {
		return this.iCollaborationRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Collaboration with Id:" + id + " Not Found"));

	}

	@Override
	public List<Collaboration> getAllCollaborations() {
		return iCollaborationRepository.findAll();
	}

}
