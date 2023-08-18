package com.microservice.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException()
	{
		super("Resource is not found on server!!");
	}
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}

}
