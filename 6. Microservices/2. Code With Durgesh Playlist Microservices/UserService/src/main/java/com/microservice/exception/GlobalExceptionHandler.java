package com.microservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservice.payload.ExceptionResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException exception)
	{
		ExceptionResponse response = ExceptionResponse.builder()
												.message(exception.getMessage())
												.success(true)
												.status(HttpStatus.NOT_FOUND)
												.build();
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
}
