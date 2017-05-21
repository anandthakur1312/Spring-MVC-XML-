package com.anand.web.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointer(Exception e) {
		System.out.println("Null Pointer Exception" + e);
		
		return "NullPointerException";
	
	}
	
	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {
		System.out.println("IO Exception" + e);
		
		return "IOException";
	
	}
	
	//This is the status code that the server will send along with the Exception page
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String genericException(Exception e) {
		System.out.println("All The Exceptions" + e);
		
		return "GenericException";
	
	}

}
