package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Revision;
import com.micda.g2.searchengine.repository.IRevisionRepository;
import com.micda.g2.searchengine.service.IRevisionService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.RevisionServiceImp")
public class RevisionServiceImp implements IRevisionService {
	@Autowired
	private IRevisionRepository iRevisionRepository;

	@Override
	public Revision addRevision(Revision revision) {
		return this.iRevisionRepository.save(revision);
	}

	@Override
	public Revision removeRevision(int id) {
		Revision revision = this.getRevision(id);
		this.iRevisionRepository.delete(revision);
		return revision;
	}

	@Override
	public Revision updateRevision(Revision revision) {
		return this.iRevisionRepository.save(revision);
	}

	@Override
	public Revision getRevision(int id) {
		return this.iRevisionRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Revision with Id:" + id + " Not Found"));

	}

	@Override
	public List<Revision> getAllRevisions() {
		List<Revision> revisions = new ArrayList<>();
		iRevisionRepository.findAll().forEach(e -> revisions.add(e));
		return revisions;
	}

}
