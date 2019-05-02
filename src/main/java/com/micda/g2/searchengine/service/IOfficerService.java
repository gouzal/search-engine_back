package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Officer;

public interface IOfficerService {
	public Officer addOfficer(Officer officer);

	public Officer removeOfficer(int id);

	public Officer updateOfficer(Officer officer);

	public Officer getOfficer(int id);

	public List<Officer> getAllOfficers();
}
