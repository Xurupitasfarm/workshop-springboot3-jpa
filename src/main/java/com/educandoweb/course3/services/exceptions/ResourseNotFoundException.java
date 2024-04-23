package com.educandoweb.course3.services.exceptions;

public class ResourseNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourseNotFoundException(Object id) {
		super("Resource not found. id " + id);
	}

}
