package com.psl.alp.ordermanagement.response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class LicenseStatusException extends RuntimeException {

	public LicenseStatusException(String message) {
		super(message);
	}
     
}
