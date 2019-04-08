package com.micda.g2.searchengine.util;

import com.micda.g2.searchengine.exception.ResourceNotFoundException;

public class RestPreconditions {
	public static <T> T checkFound(T resource) throws ResourceNotFoundException {
		if (resource == null) {
			throw new ResourceNotFoundException();
		}
		return resource;
	}
}
