package com.spring.todoapp.exceptions;

import org.springframework.http.HttpStatus;
import lombok.Data;

@Data
public class ToDoExceptions extends RuntimeException{
	private String message;
	private HttpStatus httpStatus;
	
	public ToDoExceptions(String message, HttpStatus httpStatus) {
		super(message);
		this.setMessage(message);
		this.setHttpStatus(httpStatus);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
}
