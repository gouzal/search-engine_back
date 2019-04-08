package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Officer;

public interface IOfficerService {
	public void addOfficer(Officer officer);

	public void removeOfficer(int id);

	public void updateOfficer(Officer officer);

	public Officer getOfficer(int id);

	public List<Officer> getAllOfficers();
}
