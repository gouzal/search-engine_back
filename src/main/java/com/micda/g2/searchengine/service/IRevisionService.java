package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Revision;

public interface IRevisionService {
	public Revision addRevision(Revision revision);

	public Revision removeRevision(int id);

	public Revision updateRevision(Revision revision);

	public Revision getRevision(int id);

	public List<Revision> getAllRevisions();
}
