package com.yusufcs.restTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class TestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TestException(String message) {
		
		super(message);
	}
}
