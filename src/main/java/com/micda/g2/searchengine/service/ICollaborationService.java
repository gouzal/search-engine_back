package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Collaboration;

public interface ICollaborationService {
	public Collaboration addCollaboration(Collaboration collaboration);

	public Collaboration removeCollaboration(int id);

	public Collaboration updateCollaboration(Collaboration collaboration);

	public Collaboration getCollaboration(int id);

	public List<Collaboration> getAllCollaborations();
}
