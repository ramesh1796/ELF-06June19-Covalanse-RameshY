package com.covalanse.java.exception;

public class UnderAgeException extends RuntimeException {
	private String message;
	public UnderAgeException(String message) {
		this.message=message;
		
	}
	@Override
	public String getMessage() {
		
		return message;
	}
	@Override
	public String toString() {
		return message;
	}
}
