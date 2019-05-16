package com.micda.g2.searchengine.exception;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String resource) {
		super("This resource ["+resource+"] Not Found");
	}
}
