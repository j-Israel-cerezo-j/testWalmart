package com.walmart.test.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ErrorHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException exc) {
		return ResponseEntity.badRequest().body("Error: "+exc.getMessage());
	}
	
	
}
