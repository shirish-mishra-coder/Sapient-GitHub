package com.publicis.sapient.microservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RefDataNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6702086526042402049L;

	public RefDataNotFoundException(String message) {
		super(message);
	}
}
